package com.philip.demo;

import static com.philip.demo.Colors.*;

public class Main {

    public static void main(String[] args) {
        Colors col = new Colors();
        Cat kisse = new Cat();
        Dog doggelito = new Dog();
        Tiger tiger = new Tiger(); //SUB CLASS

        tiger.makeSound();  //SUBKLASS TILL CAT
        tiger.eat();
        tiger.poop();

        kisse.makeSound();
        kisse.poop(); //Default metod
        kisse.eat();
        kisse.sleep();

        doggelito.eat();
        doggelito.sleep();
        doggelito.poop(); //Default metod
        doggelito.makeSound();
        String name ="benny";

        System.out.println(RED +"hejhej röd"+ GREEN +" " + "Hejhej grön");
        System.out.println(BLUE + "Im blue" + RESET + " Yeah");
        System.out.printf("I'm %s blue %s and i am %sgreen%s ",BLUE, RESET, GREEN, name);







    }

}
