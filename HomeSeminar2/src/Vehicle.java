abstract class Vehicle {
    protected int id;
    protected String brand;
    protected String model;
    protected int year;

    public Vehicle(int id, String brand, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    void startEngine() {
        System.out.println("Старт двигателя!");
    }

    void stopEngine() {
        System.out.println("Двигатель остановлен");
    }

    void accelerate(int speed) {
        System.out.println("Увеличение скорости на " + speed + "км/ч");

    }

    void brake() {
        System.out.println("Остановка движения");
    }

    abstract void displayInfo();

}

