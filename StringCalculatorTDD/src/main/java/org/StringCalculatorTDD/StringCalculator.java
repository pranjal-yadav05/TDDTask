package org.StringCalculatorTDD;

import java.util.regex.Pattern;

public class StringCalculator {
    public int add(String numbers) {
        if (numbers.isEmpty()) return 0;

        String delimiter = "[,\n]+"; // default delimiters

        if (numbers.startsWith("//")) {
            int newlineIndex = numbers.indexOf('\n');
            String customDelimiter = numbers.substring(2, newlineIndex);
            delimiter = Pattern.quote(customDelimiter); // escape any special char
            numbers = numbers.substring(newlineIndex + 1);
        }

        String[] parts = numbers.split(delimiter);

        int sum = 0;
        for (String part : parts) {
            sum += Integer.parseInt(part);
        }

        return sum;
    }

}
