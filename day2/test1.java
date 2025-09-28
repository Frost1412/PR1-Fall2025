package PR1_Ver2.day2;


import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Xin moi nhap so thang mat cho m muon vao: ");
        int a = sc.nextInt();
        if (a > 100) {
            System.out.println("Alo 123");
        } else if (a > 6 && a <= 80) {
            System.out.println("Tu beo");
        }
        else {
            System.out.println("non");
        }



    }
}
