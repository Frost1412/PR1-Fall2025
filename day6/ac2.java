package PR1_Ver2.day6;
import java.util.*;
import java.io.*;
public class ac2 {
    public static void main(String[] args) throws FileNotFoundException {
        Set<String> tu = new HashSet<>();
        try{
            File a = new File("input.txt");
            Scanner sc = new Scanner(a);
            while (sc.hasNextLine()) {
                String dong = sc.nextLine().toLowerCase();
                String[] word = dong.split("\\W") ;
                for (String b : word) {
                    if (!b.isEmpty()){
                        tu.add(b);
                    }
                }
            }
            System.out.println("vocab list: " );
            for (String b: tu) {
                System.out.println(b);
            }
        } catch (Exception e) {
            System.out.println("File ko ton tai hoac kh tim thay");
        }
    }
}
