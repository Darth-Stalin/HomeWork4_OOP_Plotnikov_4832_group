package homework;

public class Program {

    public static void main(String[] args) {
        Box<Orange> box1 = new Box<Orange>();
        box1.add(new Orange());
        box1.add(new Orange());
        System.out.println(box1.getBoxWeight());

        Box<Apple> box2 = new Box<>();
        box2.add(new Apple());
        box2.add(new Apple());

        Box<Apple> box3 = new Box<>();
        box3.add(new Apple());
        box3.add(new Apple());

        box2.moveFruit(box3);
        System.out.println(box2.getBoxWeight());

        System.out.println(box3.compare(box2));
    }

}

