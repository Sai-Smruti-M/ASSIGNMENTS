import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Qn2 {
    public static void main(String[] args) {
        String input = "a1b2c3d4e5"; // Example input string
        try {
            String result = displayNumericChars(input);
            System.out.println(result);
        } catch (NullPointerException e) {
            System.err.println("Error: Input string is null or empty.");
        }
    }

    public static String displayNumericChars(String input) {
        if (input == null || input.isEmpty()) {
            throw new NullPointerException();
        }

        StringBuilder output = new StringBuilder();
        Pattern pattern = Pattern.compile("(?<=[aeiouAEIOU])(?=[a-zA-Z])(\\d)");
        Matcher matcher = pattern.matcher(input);

        while (matcher.find()) {
            output.append(matcher.group());
        }

        if (output.length() > 0) {
            return "Numeric characters preceded by a vowel and consonant: " + output.toString();
        } else {
            return "No numeric characters preceded by a vowel and consonant found.";
        }
    }
}
