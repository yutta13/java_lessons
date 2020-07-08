/*3.	Вводится шесть переменных, описывающих двух человек:
a.	Фамилия 1-ого человека
b.	Имя 1-го человека
c.	Отчество 1-го человека
d.	То же для 2-го
Если совпадают только имена, вывести надпись «тезки»
Если совпадают ФИО вывести «полные тезки»
Если совпадают только фамилии, вывести «однофамильцы»
*/
public class Home2n3 {
    public static void main(String[] args) {
        String a1 = "Иванов";
        String b1 = "Иван";
        String c1 = "Иванович";
        String a2 = "Ивацнов";
        String b2 = "Иqван";
        String c2 = "Иванович";
        char s = ' ';

 //       if ((a1+b1+c1)==(a2+b2+c2))
        if ((a1 + b1 + c1).equals(a2 + b2 + c2))
            System.out.println("Полные тезки: " + (a1 + s + b1 +s+ c1));
        else if ((a1==a2)&((b1!=b2)||(c1!=c2)))
            System.out.println("Однофамильцы: " + a1);
        else if ((b1==b2)&((a1!=a2)||(c1!=c2)))
            System.out.println("Тезки: " + b1);
        else if ((a1!=a2)&(b1!=b2))
            System.out.println("неизвестно");

    }
}
