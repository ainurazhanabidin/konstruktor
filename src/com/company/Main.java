package com.company;

public class Main {

    public static void main(String[] args) {

        Cat cat = new Cat("Garfield",3);
        System.out.println(cat.getName()+" "+cat.getAge()+" jashta.");

        new Cat();

        Dog dog=new Dog("lada","Ak",2);
        System.out.println(dog.getColor()+" tustogu "+dog.getName()+" "+dog.getAge()+" "+"jashta.");

        new Dog();




    }



}
