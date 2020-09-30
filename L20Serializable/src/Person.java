import java.io.Serializable;

public class Person implements Serializable {
    public String name;
    public int score;
    public int health;
    public int exp;
    public int exp1;
    static final long SerialVersionUID = 0;

    Person(String name,int score ,int health){
        this.name= name;
        this.score=score;
        this.health=health;
    }


    @Override
    public boolean equals(Object o){
        if (o==null){
            return false;
        }
        if (o instanceof Person) {
            Person p = (Person) o;
            return
                    this.name.equals(p.name)  &&
                            this.score == p.score &&
                            this.health == p.health;
        }
        return false;

    }

}
