package PR1_Ver2.day2;
import java.util.Scanner;

public class wai {
    public static void main(String[] args) {
        double[] myList = new double[100];
        double total = 0;
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 10;

                total += myList[i];
        }
        System.out.println("tong cua m la: " +total);
    }
}


