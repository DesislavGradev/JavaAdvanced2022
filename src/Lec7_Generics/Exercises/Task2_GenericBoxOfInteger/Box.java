package Lec7_Generics.Exercises.Task2_GenericBoxOfInteger;

import java.util.ArrayList;
import java.util.List;

public class Box <T>{
    private List<T> list;

    public Box() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (T t : list) {
            stringBuilder.append(String.format("%s: %s%n", t.getClass().getName(), t.toString()));
        }
        return stringBuilder.toString();
    }
}
