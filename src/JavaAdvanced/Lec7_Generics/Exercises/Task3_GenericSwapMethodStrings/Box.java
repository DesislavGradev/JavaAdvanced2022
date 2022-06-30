package JavaAdvanced.Lec7_Generics.Exercises.Task3_GenericSwapMethodStrings;

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

    public void swap(int firstIndex, int secondIndex) {
        T temp = list.get(firstIndex);
        list.set(firstIndex, list.get(secondIndex));
        list.set(secondIndex, temp);
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
