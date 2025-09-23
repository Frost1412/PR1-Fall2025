package PR1_Ver2.day1;

public class test {
    public static void main(String[] args) {
        long a = 312032486;
        long giay = 60*60*24*365;
        long birth = giay / 7;
        long death = giay / 13;
        long imi = giay /45;
        long dan = a + birth + imi - death;
        long dan2 = dan + birth + imi - death;
        long dan3 = dan2 + birth + imi - death;
        long dan4 = dan3 + birth + imi - death;
        long dan5 = dan4 + birth + imi - death;
    }
}
