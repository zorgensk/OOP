public class Circle extends Figure {
    double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    double calculateArea() {
        super.area = Math.PI * Math.pow(radius, 2);
        return area;
    }

    double calculatePerimeter() {
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
