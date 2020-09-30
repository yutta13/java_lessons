import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SavedGames implements Serializable {

        List<Person> list = new ArrayList<>();


        public void getPerson () {
            Iterator<Person> iter = list.iterator();
            while (iter.hasNext()) {
                Person p = iter.next();
                System.out.println(p.name + " " + p.score + " " + p.health);
            }

        }

        public void setPerson (Person addedPerson){
            list.add(addedPerson);
        }

        public void removePerson (Person removedPerson){
            list.remove(removedPerson);
        }

}
