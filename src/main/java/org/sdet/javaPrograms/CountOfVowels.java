package org.sdet.javaPrograms;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CountOfVowels {
    public static void main(String[] args){
        String str = "Tech Mahindra@1234";
        System.out.println(countOfVowels(str.toLowerCase()));
    }

    static HashMap<Character, Integer> countOfVowels(String str){
        HashMap<Character, Integer> vowelsMap = new HashMap<>();
        List<Character> vowels = Arrays.asList(new Character[]{'a', 'e', 'i', 'o', 'u'});

        for (int i=0; i< str.length(); i++) {
            if (vowels.contains(str.charAt(i))) {
                if (vowelsMap.containsKey(str.charAt(i))) {
                    vowelsMap.put(str.charAt(i), vowelsMap.get(str.charAt(i)) + 1);
                } else {
                    vowelsMap.put(str.charAt(i), 1);
                }
            }
        }

        return vowelsMap;
    }
}
