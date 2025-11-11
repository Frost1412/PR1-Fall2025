package PR1_Ver2.day7.tut6;

public class BankAccountDemo {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount("Tu beo", 1400, 5);
        BankAccount b2 = new BankAccount("Ngoc", 1000, 15);

        b1.transfer(b2,1400);

        System.out.println(b1);
        System.out.println(b2);

    }
}
