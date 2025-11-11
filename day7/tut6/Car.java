package PR1_Ver2.day7.tut6;

public class Car {
    double fuelefficiency;
    double fuelintank;

    public Car(double fuelefficiency) {
        this.fuelefficiency = fuelefficiency;
        this.fuelintank = 0;
    }
    public void addGas(double ammount) {
        fuelintank += ammount;
    }
    public void drive (double distance) {
        double used = distance/fuelefficiency;
        fuelintank -= used;
    }
    public double getGasInTank() {
        return fuelintank;
    }

}
