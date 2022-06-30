package JavaAdvanced.Lec7_Generics.LAB.ListUnilities;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = List.of(13, 28, -1);
        List<String> names = new ArrayList<>();
        Collections.addAll(names, "Aleksander", "Deso");

        System.out.println(ListUtils.getMin(numbers));
        System.out.println(ListUtils.getMax(numbers));
        System.out.println(ListUtils.getMin(names));
        System.out.println(ListUtils.getMax(names));
        System.out.println(ListUtils.getMax(new ArrayList<Integer>()));
    }
}
