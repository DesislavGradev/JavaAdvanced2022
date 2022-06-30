package JavaAdvanced.Lec6_DefiningClasses.LAB.Task1_CarInfo;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Car> cars = new ArrayList<>();
        while (n-- > 0) {
            String[] arrInput = scanner.nextLine().split("\\s+");
            String brand = arrInput[0];
            String model = arrInput[1];
            int horsePower = Integer.parseInt(arrInput[2]);

            Car car = new Car();
            car.setBrand(brand);
            car.setModel(model);
            car.setHorsePower(horsePower);
            cars.add(car);
            System.out.println(car.carInfo());
        }
    }
}
