package JavaAdvanced.Lec7_Generics.Exercises.Task1_GenericBox;

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
        StringBuilder stringBuilde = new StringBuilder();
        for (T s : list) {
            stringBuilde.append(String.format("%s: %s%n", s.getClass().getName(), s.toString()));
        }
        return stringBuilde.toString();
    }
}


