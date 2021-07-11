package com.hp.bean;

public class Phone {
    //2.在对象本身new自己
    /**
     *
     */
    private static Phone ourInstance = new Phone();
 public static Phone getInstance() {
        return ourInstance;
    }
        //1.无参构造方法私有化
    private Phone() {
    }
}
