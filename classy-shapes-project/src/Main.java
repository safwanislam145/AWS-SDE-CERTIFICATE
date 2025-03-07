public class Main {
    public static void main(String[] args) {
        // create new rectangle object
        Rectangle rectangle = new Rectangle(5.0,3.0);
        // create new circle object
        Circle circle = new Circle(5.0);

        // calculate area of rectangle
        double rectangleArea = ShapeMetricCalculator.calculateRectangleArea(rectangle);
        // calculate area of circle
        double circleArea = ShapeMetricCalculator.calculateCircleArea(circle);

        // print the area of rectangle
        System.out.println("Area of rectangle: " + rectangleArea);
        // print the area of circle
        System.out.println("Area of circle: " + circleArea);
        }
}

