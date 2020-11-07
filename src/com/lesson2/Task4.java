package com.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Task4 {

    public static void main(String[] args) {
        int firstNumber = 4;
        int result = 5;
        System.out.println(String.format("%s | %s = %s", firstNumber, findSecondNumberForSpecifiedOrResult(firstNumber, result), result));
        result = 6;
        System.out.println(String.format("%s | %s = %s", firstNumber, findSecondNumberForSpecifiedOrResult(firstNumber, result), result));
        result = 7;
        System.out.println(String.format("%s | %s = %s", firstNumber, findSecondNumberForSpecifiedOrResult(firstNumber, result), result));
        result = 12;
        System.out.println(String.format("%s | %s = %s", firstNumber, findSecondNumberForSpecifiedOrResult(firstNumber, result), result));
        result = 4;
        System.out.println(String.format("%s | %s = %s", firstNumber, findSecondNumberForSpecifiedOrResult(firstNumber, result), result));
        result = 13;
        System.out.println(String.format("%s | %s = %s", firstNumber, findSecondNumberForSpecifiedOrResult(firstNumber, result), result));
    }

    private static List<Integer> findSecondNumberForSpecifiedOrResult(int firstNumber, int result) {
        List<Integer> availableAnswers = new ArrayList<>();
        for (int i = 0; i <= result; i++) {
            if ((i | firstNumber) == result) {
                availableAnswers.add(i);
            }
        }
        return availableAnswers;
    }
}
