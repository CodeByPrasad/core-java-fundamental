package com.string;

public class StringReverse {
    public static void main(String[] args){

        String str = "Prasad Suryawanshi";
        String rev = "";

        for (int i = str.length()-1; i >=  0; i--){
            rev += str.charAt(i);
        }
        System.out.println("Reverse String is: " +rev);
    }
}
