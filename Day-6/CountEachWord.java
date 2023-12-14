package com.day6;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class CountEachWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter paragraph:");
        String article = scanner.nextLine();
        String[] words = article.split("[,;:.?!\\s]+");
        int totalWords = words.length;
        Map<String, Integer> wordCountMap = new HashMap<>();
        for (String word : words) {
            if (wordCountMap.containsKey(word)) {
                int count = wordCountMap.get(word);
                wordCountMap.put(word, count + 1);
            } else {
                wordCountMap.put(word, 1);
            }
        }

        TreeMap<String, Integer> sortedWordCountMap = new TreeMap<>(wordCountMap);

        System.out.println("Number of words: " + totalWords);
        System.out.println("Words count");

        for (Map.Entry<String, Integer> entry : sortedWordCountMap.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

    }
}
