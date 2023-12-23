public class Boat extends Vehicle implements Swimmable {
    private int maxSpeed;
    private boolean isSailing;

    public Boat(int id, String brand, String model, int year, int maxSpeed, boolean isSailing) {
        super(id, brand, model, year);
        this.maxSpeed = maxSpeed;
        this.isSailing = isSailing;
    }

    private String isDock(boolean isSailing) {
        String status = "В доке";
        if (isSailing) status = "В море";
        return status;
    }

    @Override
    public void startSwimming() {
        System.out.println("Начало движения лодки по воде");

    }

    @Override
    public void stopSwimming() {
        System.out.println("Прекращение движения лодки по воде");
    }

    @Override
    void displayInfo() {
        {
            System.out.println("id - " + id + "\n" +
                    "Марка - " + brand + "\n" +
                    "Модель - " + model + "\n" +
                    "Год выпуска - " + year + "\n" +
                    "Максимальная скорость на воде - " + maxSpeed + "миль/час" + "\n" +
                    "Статус  - " + isDock(isSailing));
        }
    }
}