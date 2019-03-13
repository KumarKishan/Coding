package com.kishan;

public class ComplementaryDNA{
    public static void main(String args[]){
        System.out.println(DnaStrand.makeComplement("ATTGC"));
    }
}


class DnaStrand {
    public static String makeComplement(String dna) {

//        Way1
        char[] data = dna.toCharArray();
        StringBuilder sbt = new StringBuilder();
        for(char character:data){
            if(character=='A'){
                sbt.append('T');
            }else if(character=='T'){
                sbt.append('A');
            }else if(character=='C'){
                sbt.append('G');
            }else if(character=='G'){
                sbt.append('C');
            }else{
                sbt.append(character);
            }
        }
        return sbt.toString();

//        Way2
//        static java.util.Map<Character, String> DNAMap = new java.util.HashMap<>();
//
//        static {
//            DNAMap.put('A', "T");
//            DNAMap.put('T', "A");
//            DNAMap.put('C', "G");
//            DNAMap.put('G', "C");
//        }
//
//        public static String makeComplement(String dna) {
//            return dna
//                    .chars()
//                    .mapToObj(val -> DNAMap.get((char)val))
//                    .collect(Collectors.joining(""));
//        }
    }
}