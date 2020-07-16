import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Shop {


    public static void main(String[] args) {
        Book b1 = new Book("Bulgakov", "Master and Margarita");
        Book b2 = new Book("Cervantes", "Don Quixote");
        Book b3 = new Book("Gorkiy", "Na dne");

        Book c1 = new Book("Gogol", "Taras Bulba");
        Book c2 = new Book("Bulgakov", "Master and Margarita");
        Book c3 = new Book("Sholokhov", "Tihiy Don");
        Book c4 = new Book("Sholokhov", "Tihiy Don");


        Set<Book> setA = new HashSet<>();
        setA.add(b1);
        setA.add(b2);
        setA.add(b3);
        Set<Book> setB = new HashSet<>();
        setB.add(c1);
        setB.add(b1);
        setB.add(c3);
        setB.add(c4);

        //Создать множество В, являющееся объединением А и Б (А ∩Б, все элементы  А + все элементы Б)
        Set<Book> setC = new HashSet<>();
        setC.addAll(setA);
        setC.addAll(setB);


        //Создать множество Г, являющейся пересечением А и Б (А ꓴ Б, только то, что есть и А, и в Б)

        Set<Book> setG = new HashSet<>();
        setG.addAll(setA);
        setG.retainAll(setB);

        // Создать множество Д, являющееся симметрической разностью А и Б (А Δ Б, все элементы, кроме общих)
        Set<Book> setD = new HashSet<>();
        setD.addAll(setA);
        setD.addAll(setB);
        setD.removeAll(setG);

        System.out.println(setA);
        System.out.println(setB);
        System.out.println("А ∩Б, все элементы  А + все элементы Б " + setC);
        System.out.println("А ꓴ Б, только то, что есть и А, и в Б " + setG);
        System.out.println("А Δ Б, все элементы, кроме общих "+setD);

        Iterator<Book> iteratorA = setA.iterator();
        while (iteratorA.hasNext())
        {
            System.out.println(iteratorA.next());
        }

    }
}



class Book{
    String title;
    String author;

    Book(String title, String author){
        this.title=title;
        this.author=author;
    }

    @Override
    public boolean equals(Object o){
        if (o==null){
            return false;
        }
        if (o instanceof Book) {
            Book s = (Book) o;
            return
                    this.title.equals(s.title) &&
                    this.author.equals(s.author);
        }
        return false;
    }

}