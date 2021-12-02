package com.cc.java;

public class App {
    
    public static void main(String[] args) {

        Cat cat1 = new Cat("Thomas","White",35); // Was erzeugen wir hier eigentlich?? --> Kalle zu Objekt/instanz

        ausgabe("Blick von aussen " + cat1);
        ausgabe("RAM-Adresse: " + cat1.getAdress());
        ausgabe("Name: " + cat1.getName());
        ausgabe("Fellfarbe: " + cat1.getFurColor());
        ausgabe("Alter: " + cat1.getAge());


        ausgabe("**********************************");

        Cat cat2 = new Cat("Alonso","Black",39); // Was erzeugen wir hier eigentlich?? --> Kalle zu Objekt/instanz

        ausgabe("Blick von aussen " + cat2);
        ausgabe("RAM-Adresse: " + cat2.getAdress());
        ausgabe("Name: " + cat2.getName());
        ausgabe("Fellfarbe: " + cat2.getFurColor());
        ausgabe("Alter: " + cat2.getAge());


    }

    public static void ausgabe(String ausgabeStr){
        System.out.println(ausgabeStr);

        }

}
