package q10;

import java.util.HashMap;

import java.util.HashMap;
import java.util.Map;

public class q10{
    public static void main(String[] args) {
        String text = "this is the worlds of humans and is full of ladies and is also more ladies ";

        HashMap<String, Integer> wF = new HashMap<>();

        
        String[] words = text.split("\\s+");
         
        
        for (String word : words)  
        {
           
            if (wF.containsKey(word)) {
                wF.put(word, wF.get(word) + 1); // Increment frequency
            } else {
                wF.put(word, 1); // First occurrence of the word
            }
        }

        // Find the most occurring words
        int maxFrequency = 0;
        for (int frequency : wF.values()) {
            if (frequency > maxFrequency) {
                maxFrequency = frequency;
            }
        }

        // Print the most occurring words
        System.out.println("Most occurring words in the string:");
        for (Map.Entry<String, Integer> entry : wF.entrySet()) {
            if (entry.getValue() == maxFrequency) {
                System.out.println(entry.getKey() + " - " + entry.getValue() + " times");
            }
        }
    }
}