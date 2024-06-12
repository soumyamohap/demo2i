package org.comp;

import java.util.List;

public class MaxSum {

    public int findMaxNum(List<String> listOfInput) {
        if (listOfInput.size() > 10) {
            throw new RuntimeException("Max Input array size should 10");
        }
        int maxSum = 0;
        for (String individualInput : listOfInput) {
            int sum = findSum(individualInput);
            if (sum > maxSum) {
                maxSum = sum;
            }

        }
        return maxSum;
    }

    private int findSum(String individualInput) {
        if (individualInput.length() > 12) {
            throw new RuntimeException("Input string should not be larger than 12 characters");
        }
        int sum = 0;
        for (char ch : individualInput.toCharArray()) {
            if (Character.isDigit(ch)) {
                sum = sum + Character.getNumericValue(ch);
            }
        }
        return sum;
    }

}
