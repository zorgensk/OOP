public class test {
    public static void main(String[] args) {
        Square square = new Square(5);
        Circle circle = new Circle(15);
        Rectangle rectangle = new Rectangle(5,6);
        rectangle.calculateArea();
        rectangle.calculatePerimeter();

        circle.calculateArea();
        circle.calculatePerimeter();

        square.calculateArea();
        square.calculatePerimeter();

        System.out.println("Площадь квадрата: " + square.calculateArea() + "\n"
                            + "Перриметр квадрата: " + square.calculatePerimeter());

        System.out.println("Площадь прямоугольника: " + rectangle.calculateArea() + "\n"
                            + "Перриметр прямоугольника: " + rectangle.calculatePerimeter());

        System.out.println("Площадь круга: " + circle.calculateArea() + "\n"
                            + "Перриметр круга: " + circle.calculatePerimeter());


    }
}
