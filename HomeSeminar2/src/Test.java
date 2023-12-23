import java.time.Year;

public class Test {
    public static void main(String[] args) {
        Car car = new Car(1, "BMW", "X5", 2015, 80, 43);
        AirCraft airCraft = new AirCraft(2, "Suhoy", "SiperJet100", 2020, 12000, true);
        Boat boat = new Boat(3, "Yamaha", "Yamaha 190", 2018, 50, false);

        System.out.println("Автомобиль" + "\n" + "--------");
        car.startEngine();
        car.displayInfo();
        System.out.println("--------------------");

        System.out.println("Самолёт" + "\n" + "--------");
        airCraft.takeOff();
        airCraft.land();
        airCraft.displayInfo();
        System.out.println("--------------------");

        System.out.println("Лодка" + "\n" + "--------");
        boat.startSwimming();
        boat.displayInfo();


    }
}
