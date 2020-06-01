public class MainEmployee {
    public static void main(String[] args) {
/*      Employee employee = new Employee(20);
        EmployeeHarmfull harmfull = new EmployeeHarmfull(34, 10);
        EmployeeIntern intern = new EmployeeIntern(0.9, 10);


 */
        Employee[] arrayEmployee = new Employee[4];
        arrayEmployee[0] = new Employee(20);
        arrayEmployee[1] = new EmployeeHarmfull(34, 10);
        arrayEmployee[2] = new EmployeeIntern(0.9, 10);
        arrayEmployee[3] = new EmployeeIntern(1.9, 10);

    }
}