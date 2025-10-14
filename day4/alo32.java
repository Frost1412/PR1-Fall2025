package PR1_Ver2.day4;
import java.util.Scanner;
public class alo32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào 2 toạ độ mong muốn (x,y): ");
        int x = sc.nextInt();
        int y = sc.nextInt();
        double c = Math.sqrt(Math.pow(x,2) + Math.pow(y,2));
        if (c <= 10) {
            System.out.print("Toa do (" + x + "," + y +") nam trong hinh tron");
        }
        else {
            System.out.print("Toa do (" + x + "," + y +") khong nam trong hinh tron");

        }
    }

}
