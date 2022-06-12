package Lec7_Generics.LAB.GenericArrayCreator;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = ArrayCreator.create(5, 8);

        for (Integer i : arr) {
            System.out.println(i);
        }

        Integer[] arr2 = ArrayCreator.create(Integer.class, 4, 6);
        for (Integer i : arr2) {
            System.out.println(i);
        }
    }
}
