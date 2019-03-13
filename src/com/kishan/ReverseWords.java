package com.kishan;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWords {
    public static void main(String args[]){
        System.out.println(Kata1.reverseWords("    "));
    }
}


class Kata1
{
    public static String reverseWords(final String original)
    {

//        Way1
//       String values = original;
//        if(values.trim().isEmpty())
//            return original;
//        else{
//            String[] words = original.split(Pattern.quote(" "));
//            StringBuilder sbt = new StringBuilder();
//            for(String word : words){
//                StringBuilder sb1 = new StringBuilder();
//                sb1.append(word).reverse();
//                sbt.append(" ").append(sb1);
//            }
//            String value = sbt.toString();
//            return sbt.toString().trim().isEmpty()?value:value.trim();
//        }

//        Way2:
        return Arrays.stream(original.split("(?<=\\s)|(?=\\s+)"))
                .map(str -> new StringBuilder(str).reverse().toString())
                .collect(Collectors.joining());

//        Way3
//        if (original.matches(" *")) {
//            return original;
//        } else {
//            return Stream.of(original.split(" "))
//                    .map(s -> new StringBuilder(s).reverse().toString())
//                    .collect(Collectors.joining(" "));
//        }
    }
}