package PR1_Ver2.day3;
import java.util.Scanner;

public class Bai4 {

        public static int minOfThree(int a, int b, int c) {
            int min = a;
            if (b < min) min = b;
            if (c < min) min = c;
            return min;
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Nhập số thứ nhất: ");
            int x = sc.nextInt();

            System.out.print("Nhập số thứ hai: ");
            int y = sc.nextInt();

            System.out.print("Nhập số thứ ba: ");
            int z = sc.nextInt();

            int min = minOfThree(x, y, z);
            System.out.println("Số nhỏ nhất là: " + min);

            sc.close();
        }
    }

