package com.kishan;

/*
You are given an array strarr of strings and an integer k. Your task is to return the first longest string consisting of k consecutive strings taken in the array.
Example:
longest_consec(["zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"], 2) --> "abigailtheta"
n being the length of the string array, if n = 0 or k > n or k <= 0 return "".
Note
consecutive strings : follow one after another without an interruption
*
* */
public class ConsecutiveString {
    public static void main(String[] args){
        System.out.println(LongestConsec.longestConsec(new String[] {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));

    }
}
class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        java.util.HashMap<String,Integer> collection = new java.util.HashMap<>();
        StringBuilder sbt = new StringBuilder();
        for(String value:strarr ){
            Integer checkCount = collection.get(value);
            if(null == checkCount){
                collection.put(value,1);
            }else{
                collection.put(value,checkCount+1);
            }

            System.out.println("Collection is "+collection);

//            for (java.util.Map.Entry<String,Integer> entry : collection.entrySet())
//               if( entry.getValue() == k){
//                   sbt.append(entry.getKey());
//        }
        }
        return sbt.toString();
    }
}