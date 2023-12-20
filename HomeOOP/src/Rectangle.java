public class Rectangle extends Figure {

    private double lenght;
    private double widht;

    public Rectangle() {
    }

    public Rectangle(double lenght, double widht) {
        this.lenght = lenght;
        this.widht = widht;
    }


    public double getLenght() {
        return lenght;
    }

    public void setLenght(double lenght) {
        this.lenght = lenght;
    }


    public double getWidht() {
        return widht;
    }

    public void setWidht(double widht) {
        this.widht = widht;
    }

    double calculateArea() {
        super.area = lenght * widht;
        return area;
    }

    double calculatePerimeter() {
        perimeter = 2 * (lenght + widht);
        return perimeter;
    }

}
