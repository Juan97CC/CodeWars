package org.example;

import java.util.Map;
import java.util.TreeMap;

public class Count_characters_in_str {

    /**
     * The main idea is to count all the occurring characters in a string.
     * If you have a string like aba, then the result should be {'a': 2, 'b': 1}.
     * What if the string is empty? Then the result should be empty object literal,
     * {}.
     *
     *
     *
     * Here we'll split the string into an array of its characters
     * create -> a empty map
     * then -> we'll iterate through the array (of characters)
     * then -> check if characters(array)is in map.containsKey()
     * If True then getKey and increment the value
     * false then insert the new character into the map
     *
     */

    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> totalCount =new TreeMap<Character, Integer>();
        if (str.isEmpty())
            return totalCount;


        char[] charArray = str.toCharArray();

        for (char s : charArray) { // n

            //If the character is found, we'll just increment the value.
            if (totalCount.containsKey(s)) {
                int val = totalCount.get(s);
                totalCount.put(s, val + 1);
            } else { // Not Found previously, so we'll add it to our map with a value of 1.
                totalCount.put(s, 1);
            }

        }



        return totalCount;
    }
    public static void main(String[] args) {
        System.out.println(count("appfajjfd a"));
    }
}