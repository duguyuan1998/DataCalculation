package com.duguyuan;

public class DataCalculation {

    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 1000; i += 2) {
            if (i == 40 || i == 48) { // 40,48跳过
                continue;
            }
            sum += i;
            if (sum >= 25000) { // 大于等于25000跳出
                // System.out.println("i = " + i);
                break;
            }
        }
        System.out.println("0到1000之间(40,48跳过，大于等于25000跳出)偶数的和为：" + sum);
    }

}
