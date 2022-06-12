package Lec7_Generics.LAB.GenericArrayCreator;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayCreator {

    public static <T> T[] create(int length, T defValue) {
        T[] arr = (T[])Array.newInstance(defValue.getClass(), length);

        Arrays.fill(arr, defValue);
        return arr;
    }

    public static <T> T[] create(Class<T> cl ,int length, T defValue) {
        T[] arr = (T[]) Array.newInstance(cl, length);
        Arrays.fill(arr, defValue);
        return arr;
    }
}
