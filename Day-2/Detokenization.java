package com.Day2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Detokenization {

    public static void main(String[] args) {
        String input = "java, is! a programming* Language, used for developing* platform@independent Application.";
        String detokenizedString = detokenize(input);
        String[] token = detokenize(input).split(" ");
        
        System.out.println("no of words: "+ token.length);
        for(int i=0; i<token.length;i++) {
        	System.out.println(token[i]);
        }
              
    }

    private static String detokenize(String input) {
  
        Pattern pattern = Pattern.compile("[a-zA-Z]+");
        Matcher matcher = pattern.matcher(input);
        StringBuilder detokenizedStringBuilder = new StringBuilder();
        while (matcher.find()) {
            detokenizedStringBuilder.append(matcher.group()).append(" ");
        }

        return detokenizedStringBuilder.toString().trim();
        
        
        
}
}