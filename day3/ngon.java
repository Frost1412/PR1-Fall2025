package PR1_Ver2.day3;
import  java.util.Scanner;
public class ngon {
public static int max(int i1, int i2) {
    int result;
    if (i1>i2) {
        result = i1;
    }
    else {
        result = i2;
    }
    return  result;
}

    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = max(a,b);
        System.out.println("So lon nhat la: " + c);
    }







}
