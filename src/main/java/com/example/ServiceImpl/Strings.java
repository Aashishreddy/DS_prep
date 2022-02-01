package com.example.ServiceImpl;

import org.springframework.beans.factory.annotation.Autowired;

public class Strings {

    public static void main(String args[]){

        StringsImpl stringsImpl = new StringsImpl();

        System.out.println("****GET THE UNIQUE CHARACTERS****");
        System.out.println("****DUPLICATE CHARACTERS IN A STRING****");
        String input = "Aashish Reddy";
        stringsImpl.getUniqueDuplicate(input);

        System.out.println("\n****REMOVE DUPLICATES IN A STRING****");
        String inputString = "ahsihsaa";
        stringsImpl.removeDuplicates(inputString);

        System.out.println("\n****How SubString works****");
        String pract ="Aashish";
        System.out.println(pract.substring(2));

        System.out.println("\n****PERMUTATIONS OF A GIVEN STRING****");
        //USING RECURSIVE CALL
        String input1 = "abc";
        stringsImpl.permutationsOfString(input1, "");

        System.out.println("\n****REMOVE A GIVEN CHARACTER FROM STRING");
        String input2 = "Aashish";
        Character ch = 'h';
        System.out.println(stringsImpl.removeCharacter(input2, ch));

        System.out.println("\n****REVERSE A STRING****");
        System.out.println(stringsImpl.reverseString(pract));
    }

}
