package PR1_Ver2.day7.tut7;

public class Employee {
    String employeeName;
    double salary;
    public Employee(String employeeName, double currentSalary){
        this.employeeName = employeeName;
        this.salary = currentSalary;
    }
    public String getName() {
        return employeeName;
    }
    public double getSalary(){
        return salary;
    }
    public void raiseSalary(double byPercent) {
        salary += salary * byPercent/100;
    }



}
