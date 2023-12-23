public class AirCraft extends Vehicle implements Flyable {
    private int maxAltitude;
    private boolean isFlying;


    public AirCraft(int id, String brand, String model, int year, int maxAltitude,boolean isFlying) {
        super(id, brand, model, year);
        this.maxAltitude = maxAltitude;
        this.isFlying = isFlying;
    }
    private String isFly(boolean isFlying){
        String status = "На земле";
        if(isFlying){
            status = "В полёте";
        }
        return status;
    }

    @Override
    public void takeOff() {
        System.out.println("Взлёт");
    }

    @Override
    public void land() {
        System.out.println("Посадка");
    }


    @Override
    void displayInfo()
        {System.out.println("id - " + id + "\n" +
            "Марка - " + brand + "\n" +
            "Модель - " + model + "\n" +
            "Год выпуска - " + year + "\n" +
            "Максимальная высота полёта - " + maxAltitude + "метров" + "\n" +
            "Статус полёта - " + isFly(isFlying));

    }
}

