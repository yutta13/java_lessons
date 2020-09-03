import java.io.*;
import java.util.ArrayList;
import java.util.Iterator;

public class A{
    String s;
    public static void main(String[] args) {
        Country country0 = new Country("Greece", "Athens", "EUR");
        Country country1 = new Country("Ukraine", "Kiev", "UAH");
        Country country2 = new Country("Russia", "Moscow", "RUR");
        Country country3 = new Country("Germany", "Berlin", "EUR");

        ArrayList<Country> s = new ArrayList<>();
        s.add(country0);
        s.add(country1);
        s.add(country2);
        s.add(country3);


    Iterator<Country> iter = s.iterator();

        try {
            FileWriter fw = new FileWriter("D:\\out.txt");
            BufferedWriter out = new BufferedWriter(fw);
            while (iter.hasNext()){
                String ss = iter.next().toString();
                System.out.println(ss);
                out.write(ss);
                out.newLine();
            }
            out.close();

            }catch (IOException e){
                System.out.println("Error 1");
            }

        try {
                FileReader fr = new FileReader("D:\\out.txt");
                BufferedReader read = new BufferedReader(fr);

                String str = null;
                do {
                    str = read.readLine();
                    System.out.println("READ : "+str);
                }while (str!=null);

        }catch (IOException e){
            System.out.println("Error 2");
        }

    }
}

class Country {
    String name;
    String capital;
    String currency;

    public Country (String name, String capital,String currency){
        this.name = name;
        this.capital = capital;
        this.currency = currency;
    }

    public String toString(){
        return "COUNTRY : " + name +", CAPITAL : " + capital +", CURRENCY : " +currency;
    }

}
