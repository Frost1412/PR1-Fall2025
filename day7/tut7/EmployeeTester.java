package PR1_Ver2.day7.tut7;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee a = new Employee("Tu ve so", 1000);
        a.raiseSalary(30);

        System.out.print(a.getName() + " duoc tra so tien la: " + a.getSalary() + " /thang");

    }
}
