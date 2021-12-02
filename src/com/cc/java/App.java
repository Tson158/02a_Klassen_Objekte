package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat = new Cat(); // Was erzeugen wir hier eigentlich??
        System.out.println("Blick von aussen" + cat);
    
        cat.tellYourAddress();
    }

}
