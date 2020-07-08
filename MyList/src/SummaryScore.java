import java.util.ArrayList;
import java.util.Collection;

class Student extends SummaryScore{
    String name;
    double scoreMathAnalyz;
    double scorePhysics;
    double scoreEngineering;
    double scoreAvarage;

    double Avarage(){
        scoreAvarage = (scoreMathAnalyz+scorePhysics+scoreEngineering)/3;
        return scoreAvarage;
    }

    @Override
    public boolean equals(Object o){
        if (o==null){
            return false;
        }
        if (o instanceof Student) {
            Student s = (Student) o;
            return this.name.equals(s.name) &&
             this.scoreMathAnalyz == s.scoreMathAnalyz &&
             this.scoreEngineering ==s.scoreEngineering &&
             this.scorePhysics == s.scorePhysics;
        }
        return false;
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.scoreMathAnalyz=4;
        s1.scorePhysics=4;
        s1.scoreEngineering=4;
        s1.Avarage();
        s1.name = "One";
  //      System.out.println(s1.name + s1.scoreAvarage);

        Student s2 = new Student();
        s2.scoreMathAnalyz=5;
        s2.scorePhysics=5;
        s2.scoreEngineering=5;
        s2.Avarage();
        s2.name = "Kip";
 //       System.out.println(s2.name + s2.scoreAvarage);

        Student s3 = new Student();
        s3.scoreMathAnalyz=5;
        s3.scorePhysics=5;
        s3.scoreEngineering=5;
        s3.Avarage();
        s3.name = "Gudron";
  //      System.out.println(s3.name + s3.scoreAvarage);

        Student s4 = new Student();
        s4.scoreMathAnalyz=5;
        s4.scorePhysics=5;
        s4.scoreEngineering=5;
        s4.Avarage();
        s4.name = "Ivan";
  //      System.out.println(s4.name + s4.scoreAvarage);

        Student s5 = new Student();
        s5.scoreMathAnalyz=5;
        s5.scorePhysics=5;
        s5.scoreEngineering=5;
        s5.Avarage();
        s5.name = "Ivan";
 //       System.out.println(s5.name + s5.scoreAvarage);

        SummaryScore s = new SummaryScore();
        s.addStudent(s1);
        s.addStudent(s2);
        s.addStudent(s3);
        s.addStudent(s4);
        s.addStudent(s4);
        System.out.println(s.containsStudent(s5));
   //     s.group((Collection<Student>) s);
        s.addAllStudents((Collection<Student>) s);
    }
}

public class SummaryScore {
    ArrayList<Student> array = new ArrayList<>();

    void addStudent(Student st){
        array.add(st);
    }
    void addAllStudents(Collection<Student> ss){
        array.addAll(ss);
    }
    void removeStudents(Collection<Student> ss){
        for (int i=0 ; i<array.size(); i++){
            //надо перебрать обьекта колеекции
        }
        array.remove(ss);
    }
    boolean containsStudent(Student student){
        boolean r;
        r = array.contains(student);
        return r;
    }
    void group(Collection<Student> gr){

        int first= array.size()/3;
        int second=first+first-1;

        //как обозначить новый массив ?
        System.out.println( "Group1" + array.subList(0,first));
        System.out.println( "Group2" + array.subList(first, second));
        System.out.println( "Group3" + array.subList(second, array.size()));
    }
}
