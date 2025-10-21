package PR1_Ver2.day4;

import java.util.Scanner;

public class loi {
    public static int thuong(int a, int b) {
        if (b == 0) {
            throw  new ArithmeticException("Divisor cant not be zero");
        }
        return a/b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 2 so: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            int c = thuong(a,b);
            System.out.println(a+ ", " + b + "thuong: " + c);
        } catch (ArithmeticException ex) {
            System.out.println("Nhap ngu vl so nao chia duoc cho 0");
        }
        System.out.println("Execution continues.....");
    }
}
