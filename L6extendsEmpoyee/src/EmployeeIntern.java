class EmployeeIntern extends Employee {
    double k; // понижающий коэф

    EmployeeIntern(double k, int day) {
        this.day = day;
        this.k = k;
        if (k > 1) {
            System.out.println("for Intern need k<=1");
        }
        else
        this.getSalary();
    }

    void getSalary() {
        salary = k * day *rate;
        System.out.println(salary + " Intern = 162");
    }
}