import java.util.ArrayDeque;


public class QueueDequeue {

    ArrayDeque<Man> elevator = new ArrayDeque<>();


}

class Man {
    String name;
    int age;

        public static void main(String[] args) {
            Man m1 = new Man();
            m1.name= "Man1";
            m1.age = 7;

            Man m2 = new Man();
            m2.name= "Man2";
            m2.age = 15;

            Man m3 = new Man();
            m3.name= "Man3";
            m3.age = 25;

            Man m4 = new Man();
            m4.name= "man4";
            m4.age = 30;

            QueueDequeue q = new QueueDequeue();

            q.elevator.add(m1);//добавление в конец массива
            q.elevator.add(m2);
            q.elevator.add(m3);
            q.elevator.add(m4);

            int n=q.elevator.size();
            q.elevator.getFirst();
            q.elevator.getLast();
            System.out.println(n);

        }
}
