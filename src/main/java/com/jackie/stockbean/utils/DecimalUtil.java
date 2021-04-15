package com.jackie.stockbean.utils;

import java.math.BigDecimal;

/**
 * Created with IntelliJ IDEA
 * Description:
 *
 * @author xujj
 * @date 2020-08-11
 */
public class DecimalUtil {
    public static Double getTwoDecimalPlaces(Double number){
        BigDecimal b = new BigDecimal(number);
        number = b.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
        return number;
    }

    public static Double getDecimalPlaces(Double number, int places){
        BigDecimal b = new BigDecimal(number);
        number = b.setScale(places, BigDecimal.ROUND_HALF_UP).doubleValue();
        return number;
    }

    public static Double convertNumber(String string){
        String[] s = new String[string.length()];
        if ("--".equals(string) || " ----".equals(string)){
            return 0.00;
        } else {
            return Double.valueOf(string);
        }
    }

    public static int digitCounts(int k, int n) {
        int divisor = new Double(Math.pow(10, (n + "").length() - 1)).intValue();
        return digitNewCounts(k, n, divisor);
    }
    public static int digitNewCounts(int k, int n, int divisor){
        if (divisor == 1){
            return k <= n ? 1 : 0;
        } else {
            int s = n / divisor;
            int remainder = n % divisor;
            int count = s * digitNewCounts(k, divisor - 1, divisor / 10) + digitCounts(k, remainder);
            if(k != 0){
                count += s > k ? divisor : s == k ? remainder + 1 : 0;
            } else if(remainder == 0){
                count ++;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        /*Double sum = 1000000.00;
        Double price = 88.89;
        Integer count = 200;
        System.out.println(sum - price * count);*/
        /*Double d = -11.14;
        Integer i = (int) Math.floor(d);
        System.out.println(i);*/
        /*String s = "reportTime>=2020-01-01";
        String[] strings = s.split("(%=)|(%=%)|(=%)|(!=)|(>=)|(<=)|>|<|=");
        System.out.println(strings);*/
        long start = System.nanoTime();
        digitCounts(0, 100);
        long end = System.nanoTime();
        System.out.println(end - start);
    }
}
