import java.util.Comparator;

class Phone implements Comparable<Phone> {
    int processor;
    int volumeMem;
    String model;
    double price;

    Phone(int processor,
          int volumeMem,
          String model,
          double price) {
        this.processor = processor;
        this.volumeMem = volumeMem;
        this.model = model;
        this.price = price;
    }

    @Override
    public String toString(){
        return "\n Тактовая частота " + this.processor + " \n Обьем памяти " + this.volumeMem + "\n Модель " + this.model + "\n Цена " + this.price;
    }

    @Override
    public int compareTo(Phone p) {
      return this.model.compareTo(p.model);
    }
}
class PriceSort implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        if(o1.price> o2.price){
            return 1;
        }
        return -1;
    }
}

class ProcessorSort implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        if(o1.processor> o2.processor){
            return 1;
        }
        return -1;
    }
}

class VolumeMemSort implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        if(o1.volumeMem<o2.volumeMem){
            return 1;
        }
        return -1;
    }
}

