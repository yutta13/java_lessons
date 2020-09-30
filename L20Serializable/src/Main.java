import java.io.*;

public class Main implements Serializable {
    public static void main(String[] args) {

        Person p1 = new Person("Guf", 70, 7);
        Person p2 = new Person("Mickey", 10, 1);
        Person p3 = new Person("Donald", 30, 3);

        SavedGames SGames = new SavedGames();
        SGames.setPerson(p1);
        SGames.setPerson(p2);
        SGames.setPerson(p3);

        SGames.getPerson();

 /*
        //создаем 2 потока для сериализации объекта и сохранения его в файл
     try {
            FileOutputStream outputStream = new FileOutputStream("D:\\save.ser");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(outputStream);
            // сохраняем игру в файл
            objectOutputStream.writeObject(SGames);
            //закрываем поток и освобождаем ресурсы
            objectOutputStream.close();
        }catch (IOException e){
            System.out.println("Error 1");
        }

 */
        try {
            FileInputStream inputStream = new FileInputStream("D:\\save.ser");
            ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);

          // objectInputStream.readObject(SGames);

            SavedGames SG  = (SavedGames) objectInputStream.readObject();

            System.out.println(SG);

        }catch (IOException e){
            System.out.println(e);
        }
        catch (ClassNotFoundException ce){
            System.out.println(ce);
        }

    }
}
