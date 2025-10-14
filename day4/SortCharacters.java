package PR1_Ver2.day4;
import java.util.Arrays;
import java.util.Scanner;

public class SortCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = input.nextLine();
        String sorted = sortCharacters(s);
        System.out.println("Sorted string: " + sorted);
        input.close();
    }

    public static String sortCharacters(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new String(chars);
    }
}
