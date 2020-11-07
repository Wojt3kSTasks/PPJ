package com.lesson1;

public class NumberConverter {

    public static void main(String[] args) {
        int studentNumber = 36;
        System.out.println(String.format("Decimal: %s", studentNumber));
        System.out.println(String.format("Binary: %s", Integer.toBinaryString(studentNumber)));
        System.out.println(String.format("Octal: %s", Integer.toOctalString(studentNumber)));
        System.out.println(String.format("Hexadecimal: %s", Integer.toHexString(studentNumber)));
    }
}
