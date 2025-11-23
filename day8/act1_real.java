package PR1_Ver2.day8;
import java.util.HashMap;
import java.util.Scanner;

public class act1_real {
    public static void main(String[] args) {
        // Khởi tạo hashmap
        HashMap<String, String> a = new HashMap<String, String>();
        a.put("apple", "Quả táo");
        a.put("banana", "Quả chuối");
        a.put("coconut", "Quả dừa");
        a.put("pepper", "Quả ớt");
        a.put("cucumber", "Quả dưa chuột");

        Scanner sc = new Scanner(System.in);
        int choice;
         do {
             System.out.print("Nhap me m tu vao: ");
             String word = sc.nextLine().toLowerCase();

             String khoa = a.get(word);
             if (khoa != null) {
                 System.out.print("Nghia la: " + khoa);
             } else {
                 System.out.print("Meaning not found");
             }
             System.out.println(" ban co muon tim tiep ko (1 = co, 2 = thoi)");
             choice = Integer.parseInt(sc.nextLine());

         }  while (choice ==1);
        if (choice == 2) {
            System.out.println("Thoi");
        }
        sc.close();
    }
}
