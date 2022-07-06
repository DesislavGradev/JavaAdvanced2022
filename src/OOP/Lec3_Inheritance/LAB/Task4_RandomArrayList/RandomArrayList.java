package OOP.Lec3_Inheritance.LAB.Task4_RandomArrayList;

import java.util.ArrayList;
import java.util.Random;

public class RandomArrayList extends ArrayList {
    public Object getRandomElement() {
        Random random = new Random();
        int index = random.nextInt(super.size());
        return remove(index);
    }
}
