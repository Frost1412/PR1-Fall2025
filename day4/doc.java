package PR1_Ver2.day4;
import java.io.File;
import java.util.Scanner;
public class doc {
    public static void main(String[] args) throws Exception {
// Create a File instance
        File file = new File("scores.txt");
// Create a Scanner for the file
        Scanner input = new Scanner(file);
// Read data from a file
        while (input.hasNext()) {
            String firstName = input.next();
            String lastName = input.next();
            int score = input.nextInt();
            System.out.println(firstName + " " + lastName + " " + score);
        }
// Close the file
        input.close();
    }
}