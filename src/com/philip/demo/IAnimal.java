package com.philip.demo;
import static com.philip.demo.Colors.*;
public interface IAnimal {

    void makeSound();

    default void poop(){
        System.out.println("It's happening again...");
    }
    default void sleep(){
        System.out.println(YELLOW+"zzzZZzzzz"+RESET);
    }

    default void eat(){
        System.out.println("Nom nom");
    }


}
