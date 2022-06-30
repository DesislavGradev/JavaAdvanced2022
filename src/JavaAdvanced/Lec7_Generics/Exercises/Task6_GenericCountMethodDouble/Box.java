package JavaAdvanced.Lec7_Generics.Exercises.Task6_GenericCountMethodDouble;

import java.util.ArrayList;
import java.util.List;

public class Box <T extends Comparable<T>>{
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public long countGreaterElements(T element) {
        return list.stream().filter(e -> e.compareTo(element) > 0).count();
    }


    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T s : list) {
            stringBuilder.append(String.format("%s: %s%n", s.getClass().getName(), s.toString()));
        }
        return stringBuilder.toString();
    }
}
