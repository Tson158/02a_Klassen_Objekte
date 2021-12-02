package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat1 = new Cat(); // Was erzeugen wir hier eigentlich?? --> Kalle zu Objekt/instanz
        System.out.println("Blick von aussen " + cat1);
        cat1.name = "Thomas";
        cat1.furColor = "White";
        cat1.age = 35;
        cat1.tellYourAddress();
        System.out.println(cat1.tellYourName());
        System.out.println(cat1.furColor);
        System.out.println(cat1.age);


        System.out.println("**********************************");

        Cat cat2 = new Cat(); // Was erzeugen wir hier eigentlich?? --> Kalle zu Objekt/instanz
        System.out.println("Blick von aussen " + cat2);
        cat2.name = "Alonso";
        cat2.furColor = "Black";
        cat2.age = 39;
        cat2.tellYourAddress();
        System.out.println(cat2.tellYourName());
        System.out.println(cat2.furColor);
        System.out.println(cat2.age);

    }

}
