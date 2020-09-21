package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner key = new Scanner(System.in);
        System.out.print("Input your text: ");
        String text = key.nextLine();
        String checktext;

        int alpha = 0;
        int word = 1;
        int sentence = 0;

        for(int i = 0; i<text.length();i++){
            char character = text.charAt(i);
            checktext = "" + text.charAt(i);
            if(Character.isLetter(character)) {
                alpha++;
            }
            if(Character.isWhitespace(character)){
                word++;
            }
            if(checktext.equals(".") || checktext.equals("?") || checktext.equals("!")) {
                sentence++;
            }
        }
        //System.out.println("Letters: " + alpha);
        //System.out.println("Words: " + word);
        //System.out.println("Sentences: " + sentence);

        float L = (float)alpha/word * 100;
        float S = (float)sentence/word * 100;

        double gradelvl = 0.0588 * L - 0.296 * S - 15.8;
        System.out.println("Grade Level: " + gradelvl);
        if (gradelvl >=16) {
            System.out.println("Grade 16+");
        }else if (gradelvl < 1) {
            System.out.println("Before Grade 1");
        } else
            System.out.println("Grade " + Math.round(gradelvl));
    }
}
