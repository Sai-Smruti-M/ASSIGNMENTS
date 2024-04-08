public class Illegalexc_Logic{
    public static void main(String[] args) {
        String text = "123abc"; // Example text containing non-numeric characters

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("Error converting text to number: " + e.getMessage());
        }
    }
}
// In this example, we attempt to convert a string (text) containing non-numeric characters
// into an integer using Integer.parseInt(). However, since the string "123abc" contains 
// non-numeric characters ('a', 'b', 'c'), a NumberFormatException occurs naturally during 
// the parsing process. This exception is a subclass of IllegalArgumentException.

// In the catch block, we handle the NumberFormatException by printing an error message.
// While we don't explicitly throw an IllegalArgumentException, the NumberFormatException 
// that arises naturally during the conversion process is a subtype of IllegalArgumentException.






