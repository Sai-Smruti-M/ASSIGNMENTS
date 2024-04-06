package q8;
import java.util.HashMap;

public class q8 {
    public static void main(String[] args)
    {
        String str1 = "listen";
        String str2 = "silent";

        if (areAnagrams(str1, str2)) {
            System.out.println("Strings are anagrams.");
        } else {
            System.out.println("Strings are not anagrams.");
        }
    }

    public static boolean areAnagrams(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        HashMap<Character, Integer> charCount1 = new HashMap<>();
        HashMap<Character, Integer> charCount2 = new HashMap<>();

        for (char c : str1.toCharArray()) {
            charCount1.put(c, charCount1.getOrDefault(c, 0) + 1);
        }

        for (char c : str2.toCharArray()) {
            charCount2.put(c, charCount2.getOrDefault(c, 0) + 1);
        }

        for (char c : charCount1.keySet()) {
            if (!charCount2.containsKey(c) || !charCount2.get(c).equals(charCount1.get(c))) {
                return false;
            }
        }

        return true;
    }
}