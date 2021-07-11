package com.hp.bean;

public class MyJava {
    public static void main(String[] args) {
        Phone p1 = Phone.getInstance();
        Phone p2 = Phone.getInstance();
        System.out.println(p1==p2);

    }


}
