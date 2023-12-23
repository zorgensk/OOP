public class Car  extends Vehicle  {
    private int fuelCapacity;
    private int currentFuelLevel;

    public Car(int id, String brand, String model, int year, int fuelCapacity, int currentFuelLevel) {
        super(id, brand, model, year);
        this.fuelCapacity = fuelCapacity;
        this.currentFuelLevel = currentFuelLevel;
    }


    @Override
    void displayInfo() {
        System.out.println("id - " + id + "\n" +
                            "Марка - " + brand + "\n" +
                            "Модель - " + model + "\n" +
                            "Год выпуска - " + year + "\n" +
                            "Ёмкость бака - " + fuelCapacity + "\n" +
                            "Уровень топлива - " + currentFuelLevel);
    }
}
