package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat1 = new Cat("Thomas","White",35); // Was erzeugen wir hier eigentlich?? --> Kalle zu Objekt/instanz
        System.out.println("Blick von aussen " + cat1);

        cat1.tellYourAddress();
        System.out.println(cat1.tellYourName());
        System.out.println(cat1.furColor);
        System.out.println(cat1.age);


        System.out.println("**********************************");

        Cat cat2 = new Cat("Alonso","Black",39); // Was erzeugen wir hier eigentlich?? --> Kalle zu Objekt/instanz
        System.out.println("Blick von aussen " + cat2);
        
        cat2.tellYourAddress();
        System.out.println(cat2.tellYourName());
        System.out.println(cat2.furColor);
        System.out.println(cat2.age);

    }

}
