import java.time.LocalDate;
public class syntax_qn 
{
    public static void main(String[] args)
    {
        // Assuming age is given as an integer
        int age = 20; // Example age

        // Get the current year
        int currentYear = LocalDate.now().getYear();

        // Calculate the year of birth
        int yearOfBirth = currentYear - age;
        //if the yob will be 2000-age=logical error


        System.out.println("Year of Birth: " + yearOfBirth);
    }

}
