package lesson.record;

public class Classic implements Plate, Playing {
    @Override
    public void play() {
        System.out.println("Проигрывается классическая музыка");
    }


}
