package com.day6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class UniqueWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a paragraph:");
        String article = scanner.nextLine();
        String[] words = article.split("[,;:.?!\\s]+");
        int totalWords = words.length;

        Set<String> uniqueWordsSet = new HashSet<>(Arrays.asList(words));
        int uniqueWordsCount = uniqueWordsSet.size();
        TreeSet<String> sortedUniqueWords = new TreeSet<>(uniqueWordsSet);
        System.out.println("Number of words: " + totalWords);
        System.out.println("Number of unique words: " + uniqueWordsCount);
        System.out.println("The words are");

        for (String word : sortedUniqueWords) {
            System.out.println(word);
        }

    
    }
}

