package PR1_Ver2.day3;
import java.util.Scanner;

public class Bai2 {
        public static boolean isEven(int n) {
            return n % 2 == 0;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int number = sc.nextInt();
            if (isEven(number)) {
                System.out.println(number + " là số chẵn.");
            } else {
                System.out.println(number + " là số lẻ.");
            }
        }
    }


