import java.util.ArrayDeque;


public class QueueDequeue {

    ArrayDeque<Man> elevator = new ArrayDeque<>();

    void addManL(Man m){
        int index = elevator.size() ;//iразмер массива
        elevator.addLast(m);
        System.out.println("в лифт зашел "+ m.name + " даем ему индекс "+ index);
    }
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

            q.addManL(m1);//добавление в конец массива
            q.addManL(m2);
            q.addManL(m3);
            q.addManL(m4);

            int n=q.elevator.size();

            q.elevator.getFirst();
            q.elevator.getLast();

            System.out.println(n);

        }

    }

