package org.sdet.javaPrograms;

import java.util.HashMap;

public class CountOfWordsInSentence {
    public static void main(String[] args) {
        String sentence = "I m string in java class, java class string";
        System.out.println(calculateWords(sentence));
    }

    static HashMap<String, Integer> calculateWords(String sentence) {
        HashMap<String, Integer> wordCount = new HashMap<>();
        String[] arr = sentence.split(" ");

        for (String word : arr) {
            if (wordCount.containsKey(word)) {
                wordCount.put(word, wordCount.get(word) + 1);
            } else {
                wordCount.put(word, 1);
            }
        }

        return wordCount;
    }
}
