public class Student{
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
