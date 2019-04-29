package com.dmytrobilokha.codility;

import java.util.Arrays;

class Solution {

    public int solution(int[] input) {
        int[] sortedNumbers = Arrays.copyOf(input, input.length);
        Arrays.sort(sortedNumbers);
        int previousNumber = -sortedNumbers[0];
        int numberCount = 0;
        for (int currentNumber : sortedNumbers) {
            if (previousNumber == currentNumber) {
                numberCount++;
            } else {
                if ((numberCount & 1) == 0) {
                    numberCount = 1;
                    previousNumber = currentNumber;
                } else {
                    return previousNumber;
                }
            }
        }
        return previousNumber;
    }

}
