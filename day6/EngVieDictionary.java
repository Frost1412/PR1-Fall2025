package PR1_Ver2.day6;
import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;
public class EngVieDictionary {
    public static void main(String[] args) {
        // Khoi tao Scanner
        Scanner sc = new Scanner(System.in);
        // Khoi tao hashmap(dung de tra cuu)
        Map<String, String> dictionary = new HashMap<>();
        dictionary.put("apple","quả táo");
        dictionary.put("banana","qua chuoi");
        dictionary.put("coconut","qua dua");
        dictionary.put("mango","qua xoai");
        dictionary.put("ice","cuc da");

        int choice;
        do {
            System.out.println("Dien vao 1 tu bang tieng anh");
            String tu = sc.nextLine().toLowerCase();
            if (dictionary.containsKey(tu)) {
                System.out.println("Nghia la: " + dictionary.get(tu));
            } else {
                System.out.println("Meaning not found");
            }
            System.out.println("ban co muon tim tiep ko (1 = co, 2 = thoi)");
            choice = Integer.parseInt(sc.nextLine());
        } while (choice ==1);
            System.out.println("Thoi");
            sc.close();

    }

}
