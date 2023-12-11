package Day3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class WordCount {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a sentence:");
        String inputSentence = scanner.nextLine();

        int wordCount = countWords(inputSentence);
        int uniqueWordCount = countUniqueWords(inputSentence);

        System.out.println("Number of words: " + wordCount);
        System.out.println("Number of unique words: " + uniqueWordCount);

        scanner.close();
    }

    private static int countWords(String text) {
        String[] words = text.split("\\s+");
        return words.length;
    }

    private static int countUniqueWords(String text) {
        Set<String> uniqueWords = new HashSet<>();

        // Remove punctuation and split the text into words
        String[] words = text.replaceAll("[^a-zA-Z ]", "").toLowerCase().split("\\s+");

        // Add words to the set to get unique words
        for (String word : words) {
            uniqueWords.add(word);
        }

        return uniqueWords.size();
    }
}
