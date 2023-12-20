
public class Square extends Rectangle {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    double calculateArea() {
        super.area = Math.pow(side, 2);
        return area;
    }

    @Override
    double calculatePerimeter() {
        perimeter = 4 * side;
        return perimeter;
    }


}
