package com.example.ServiceImpl;

import java.util.*;

public class StringsImpl {

    public void getUniqueDuplicate(String input) {
        LinkedHashMap<Character, Integer> hm = new LinkedHashMap<>();
        ArrayList<Character> result = new ArrayList<>();
        ArrayList<Character> dupList = new ArrayList<>();

        try {
            input = input.toLowerCase(Locale.ROOT).replaceAll("\\s+", ""); //remove whitespaces using REGEX
            for (Character c : input.toCharArray()) {
//            hm.put(c, hm.getOrDefault(c, 0) + 1);
                if (hm.containsKey(c)) {
                    hm.put(c, hm.get(c) + 1);
                } else {
                    hm.put(c, 1);
                }
            }
            System.out.println(hm);
            
            //USE ENTRYSET() to iterate HashMap.
            for (Map.Entry<Character, Integer> set : hm.entrySet()) {
                if (set.getValue() == 1) {
                    result.add(set.getKey());
                }
                if (set.getValue() > 1) {
                    dupList.add(set.getKey());
                }
            }
            System.out.println("Unique values: " + result);
            System.out.println("Duplicate values: " + dupList);
        }
        catch(Exception e){
            System.out.println("Exception in Method1");
        }
    }

    public void removeDuplicates(String inputString){
        inputString = inputString.toLowerCase(Locale.ROOT);
        StringBuilder finalString = new StringBuilder();

        LinkedHashSet<Character> hs = new LinkedHashSet<>();
        for(Character char1: inputString.toCharArray()){
            hs.add(char1);
        }
        System.out.println("Hash Set: "+hs);

        for(Character c1: hs){
            finalString.append(c1);
        }
        System.out.println("String without duplicates: "+finalString);
    }

    public static void permutationsOfString(String remaining, String candidate){

        if(remaining.length() == 0){
            System.out.println(candidate+ " ");
            return;
        }

        for(int i = 0; i < remaining.length(); i++){
            String newCandidate = candidate + remaining.charAt(i);
            String res = remaining.substring(0, i) + remaining.substring(i + 1);
            permutationsOfString(res, newCandidate);
        }
    }

    public static String removeCharacter(String input, Character ch){
        String oldStr = ch.toString();
        String output = input.replaceAll(oldStr,"");
        return output;
    }

    public static String reverseString(String input){
        StringBuilder sb = new StringBuilder();
        sb.append(input);
        sb.reverse();
        String output = sb.toString();
        return output;
    }
}
