package com.kishan;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;

public class HighestAndLowest {
    public static void main(String[] args){

        System.out.println(Kata.HighAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
    }
}
class Kata {
    public static String HighAndLow(String numbers) {
//        Way1
//        String[] numbers1 = numbers.split(java.util.regex.Pattern.quote(" "));
//        int[] array = Arrays.asList(numbers1).stream().mapToInt(Integer::parseInt).toArray();
//        Arrays.sort(array);
//        return  array[array.length-1]+ " "+ array[0];

//        Way2
        IntSummaryStatistics summary = Arrays
                .stream(numbers.split(" "))
                .collect(Collectors.summarizingInt(n -> Integer.parseInt(n)));
        return String.format("%d %d", summary.getMax(), summary.getMin());
    }
}