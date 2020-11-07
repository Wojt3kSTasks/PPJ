package com.lesson3;

import java.util.Random;

public class Solutions {

    public static void main(String[] args) {
        Random r = new Random();

    }


    //Używając operacji koniunkcji bitowej, dokonaj weryfikacji czy na bicie0 i bicie5 występują wartości 1.
    public static boolean checkIfAthAndBthBitsEquals1(int number, int a, int b) {
        return ((number >> a) & 1) % 2 == 1 && ((number >> b) & 1) % 2 == 1;
    }

}
