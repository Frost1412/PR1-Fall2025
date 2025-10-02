package PR1_Ver2.day3;
import java.util.Scanner;
public class Bai1 {
        public static int sum(int a, int b, int c) {
            return a + b + c;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int result = sum(x,y,z);
            System.out.println("Tổng là: " + result);
        }
    }


