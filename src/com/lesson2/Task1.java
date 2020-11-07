package com.lesson2;

import java.util.Random;

public class Task1 {

    public static void main(String[] args) {
        Random r = new Random();
        int randomNumber = r.nextInt(51) + 50;
        System.out.println(String.format("Decimal: %s", randomNumber));
        System.out.println(String.format("Binary: %s", Integer.toBinaryString(randomNumber)));
        System.out.println(String.format("Octal: %s", Integer.toOctalString(randomNumber)));
        System.out.println(String.format("Hexadecimal: %s", Integer.toHexString(randomNumber)));
    }
}
