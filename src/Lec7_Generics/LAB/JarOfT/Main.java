package Lec7_Generics.LAB.JarOfT;

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        Jar<Integer> jar = new Jar<>();

        jar.add(13);
        jar.add(8);

        System.out.println(jar.remove());
        System.out.println(jar.remove());
    }
}
