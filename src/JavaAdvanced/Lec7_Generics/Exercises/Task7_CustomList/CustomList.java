package JavaAdvanced.Lec7_Generics.Exercises.Task7_CustomList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CustomList<T extends Comparable<T>> {
    private List<T> list;

    public CustomList() {
        this.list = new ArrayList<>();
    }

    public void add(T element) {
        list.add(element);
    }

    public T remove(int index) {
        return list.remove(index);
    }

    public boolean contains(T element) {
        return list.contains(element);
    }

    public void swap(int index1, int index2) {
        T temp = list.get(index1);
        list.set(index1, list.get(index2));
        list.set(index2, temp);
    }

    public long countGreaterThan(T element) {
        return list.stream().filter(e -> e.compareTo(element) > 0).count();
    }

    public T getMax() {
        return list.stream().max(Comparator.naturalOrder()).get();
    }

    public T getMin() {
        return list.stream().min(Comparator.naturalOrder()).get();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (T t : list) {
            sb.append(String.format("%s%n", t.toString()));
        }
        return sb.toString().trim();
    }
}
