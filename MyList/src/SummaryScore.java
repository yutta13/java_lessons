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

    public void main(String[] args) {

        Student s1 = new Student();
        s1.scoreMathAnalyz=4;
        s1.scorePhysics=4;
        s1.scoreEngineering=4;
        s1.Avarage();
        s1.name = "Ivan";
        System.out.println(s1.name + s1.scoreAvarage);

        Student s2 = new Student();
        s2.scoreMathAnalyz=5;
        s2.scorePhysics=5;
        s2.scoreEngineering=5;
        s2.Avarage();
        s2.name = "Ivan";
        System.out.println(s2.name + s2.scoreAvarage);

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
 /*   void removeStudents(){
        array.addAll(ss);
    }
    
  */
    void containsStudent(Student student){
        array.contains(student);
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
