package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat1 = new Cat("Thomas","White",35); // Was erzeugen wir hier eigentlich?? --> Kalle zu Objekt/instanz
        System.out.println("Blick von aussen " + cat1);

        cat1.tellYourAddress();
        System.out.println(cat1.getName());
        System.out.println(cat1.getFurColor());
        System.out.println(cat1.getAge());


        System.out.println("**********************************");

        Cat cat2 = new Cat("Alonso","Black",39); // Was erzeugen wir hier eigentlich?? --> Kalle zu Objekt/instanz
        System.out.println("Blick von aussen " + cat2);

        cat2.tellYourAddress();
        System.out.println(cat2.getName());
        System.out.println(cat2.getFurColor());
        System.out.println(cat2.getAge());

    }

}
