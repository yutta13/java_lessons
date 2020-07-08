/*
1.	Создать класс Работник, у которого будут следующие характеристики:
a.	ФИО
b.	Почасовая ставка
Внутри класса описать метод, который вычисляет зарплату работника исходя из отработанных им часов и почасовой ставки. Отработанные часы – аргумент данной функции.
Внутри  main  создать нескольких работников, заполнить из поля и вычислить их зарплаты.
 */
public class Employee {
    String surname;
    double rate;  //ставка  $
    int h=0;

    void getSalary(){
        double Salary= rate*h;
        System.out.print(Salary + " р. получает ");
    };

    public static void main(String[] args) {
        Employee employee1 = new Employee();
        employee1.surname = "Сергей Иванович Бирюков";
        employee1.rate=18.5;
        employee1.h=2;
        employee1.getSalary();
        System.out.println(employee1.surname);

        Employee employee2 = new Employee();
        employee2.surname = "Иван Алексеевич Сац";
        employee2.rate=20;
        employee2.h=5;
        employee2.getSalary();
        System.out.println(employee2.surname);

        Employee employee3 = new Employee();
        employee3.surname = "Юлия Михайловна Баранова";
        employee3.rate=34;
        employee3.h=10;
        employee3.getSalary();
        System.out.println(employee3.surname);
    }


}
//salary= hours*Rate