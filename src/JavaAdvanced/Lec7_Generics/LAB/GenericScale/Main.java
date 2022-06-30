package JavaAdvanced.Lec7_Generics.LAB.GenericScale;

public class Main {
    public static void main(String[] args) {
        Scale<String> scale = new Scale<>("Alex", "Adam");

        System.out.println(scale.getHeavier());
    }
}
