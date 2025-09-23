package PR1_Ver2.day1;
import java.util.Scanner;
public class act22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter speed and acceleration:  ");
        int a = sc.nextInt();
        double b = sc.nextDouble();
        double length = (a*a) /(2*b);
        System.out.print("The minimum runway length for this airplain is " + length);
    }
}
