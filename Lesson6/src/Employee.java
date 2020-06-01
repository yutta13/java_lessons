import java.awt.*;
class Employee {
    Employee(){};//дефолтный конструктор, потребовался при создании др класов
    double rate=18; //плата за день
    int day;  //кол-во отработанных дней
    double salary;

    void getSalary(int day) {
        salary = rate * day;
    }

    Employee(double rate){
        this.rate=rate;
        this.getSalary(3);
        System.out.println(salary + "  Employee = 60");
    }


}




