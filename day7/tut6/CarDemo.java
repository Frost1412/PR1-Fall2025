package PR1_Ver2.day7.tut6;

public class CarDemo {
    public static void main(String[] args) {
        Car Lam = new Car(100);
        Lam.addGas(50);
        Lam.drive(70);
        System.out.println("Xang con lai la: " + Lam.getGasInTank());
    }
}
