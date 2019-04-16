package com.atguigu.java;

import com.atguigu.bean.Customer;

/**
 *
 */
public class HelloWorld {
    private static final Customer customer = new Customer();

    public static void main(String[] args) {
        Season spring = Season.AUTUMN;
        System.out.println(spring.getSeasonName());
        String[] str = new String[]{"Tom", "lisi", "zhangsan"};
        for (String s : str) {
            System.out.println(s);
        }

    }
}

