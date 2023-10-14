package homework;

import java.util.ArrayList;
import java.util.Random;

public class Box <T extends Fruit> {

    private ArrayList<T> fructs;

    private int number;

    private static int counter = 100;

    public Box() {
        this.fructs = new ArrayList<T>();
        this.number = counter++;
    }

    public void add(T fruit) {
        fructs.add((T) fruit);
    }

    @Override
    public String toString() {
        return "Box{" +
                "fructs=" + fructs +
                ", number=" + number +
                '}';
    }

    public float getBoxWeight() {
        if (fructs.size() == 0) return 0;
        float weight = 0;
        for (T fruct : fructs){
            weight += fruct.getWeight();
        }
        return weight;
    }

    public boolean compare(Box box) {
        return this.getBoxWeight() == box.getBoxWeight();
    }

    public void  moveFruit(Box<T> box) {
        box.fructs.addAll(this.fructs);
        this.fructs.clear();
        System.out.printf("Фрукты перемещаются из коробки с номером %d в коробку с номером %d\n", this.number, box.number);
    }

}
