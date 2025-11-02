package PR1_Ver2.day6;
import java.util.*;
public class act3 {
    public static void main(String[] args) {
        Map<String, Double> scores = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        scores.put("ngoc", 9.0);
        scores.put("tien", 9.0);
        scores.put("manh", 9.0);
        scores.put("an", 9.0);
        scores.put("tu", 9.0);
        scores.put("long", 9.0);
        scores.put("lam", 9.0);
        scores.put("ky", 9.0);

        System.out.print("Enter your name: ");
        String name = sc.nextLine().toLowerCase();

        if(scores.containsKey(name)) {
            System.out.print("Diem cua ban la: " + scores.get(name));
        } else {
            System.out.print("Score not found");
        }
        sc.close();
    }
}
