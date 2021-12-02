package com.cc.java;

public class Cat {

    public String name;
    public String furColor;
    public int age;

    

    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }


    public void tellYourAddress(){
        System.out.println("Blick von innen " + this);
    }


    public String tellYourName(){
        return this.name;
    }

}
