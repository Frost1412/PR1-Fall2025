package PR1_Ver2.day7.tut7;

import java.util.Scanner;

public class latnguocstring {
    public static String reverse(String a) {
        if(a.isEmpty()) return a;
        return reverse(a.substring(1))+a.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap vao 1 string di: ");
        String b = sc.nextLine();
        System.out.println("dao nguoc: " + reverse(b));
    }

}
