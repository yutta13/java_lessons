class EmployeeHarmfull extends Employee {
    double bonus;//бонус

    EmployeeHarmfull(double bonus, int day) {
        this.bonus = bonus;
        this.day= day;
        this.getSalary();
    }

    void getSalary() {
        salary= (this.day*this.rate) + bonus;
        System.out.println(salary+" EmployeeHarmfull  = 214 ");
    }





}

