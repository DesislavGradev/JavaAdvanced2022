package OOP.Lec3_Inheritance.LAB.Task4_RandomArrayList;

public class Main {
    public static void main(String[] args) {

        RandomArrayList list = new RandomArrayList();
        list.add(13);
        list.add(50);
        list.add(48);
        System.out.println(list.getRandomElement());
    }
}
