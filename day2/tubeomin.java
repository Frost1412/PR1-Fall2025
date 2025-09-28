package PR1_Ver2.day2;

public class tubeomin {
    public static void main(String[] args) {
        double[] myList = new double[100];
        double min = myList[0];
        for (int i = 0; i < myList.length; i++) {
            myList[i] = Math.random() * 10;
            if (myList[i] < min)
                min = myList[i];
        }
        System.out.println("so lon nhat cua m la: " +min);
    }
}


