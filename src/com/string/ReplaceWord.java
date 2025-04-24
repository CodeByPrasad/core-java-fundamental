package com.string;

import java.util.Scanner;

public class ReplaceWord {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String paragraph = "This car is a car";

        String oldword = "car";
        String newWord = "pen";
        String []s = paragraph.split(" ");
        for (int i = 0; i< s.length; i++){
            if (s[i].equals(oldword)){
                s[i] = newWord;
            }
        }
        System.out.println(String.join(" ", s));
    }
}
