package com.company;

public class Main {

    public static void main(String[] args) {


        System.out.println(isEven("lineline"));
        System.out.println(isEven("lineine"));

        System.out.println(isEven("lol"));
        System.out.println(isEven("lolo"));

	// write your code here
    }

    private static boolean isEven(String word) {

        if(word.length() == 0){
            return true;
        }

        char c = word.charAt(0);
        word = word.substring(1);

        if(word.contains(c + ""))
        {
            word = word.replaceFirst(c + "", "");
            return isEven(word);
        }

        return false;
    }

}
