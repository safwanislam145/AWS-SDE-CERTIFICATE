public class Rectangle {
    // member variables to store length and width of the rectangle
    double length;
    double width;

    public Rectangle() {
        // no argument or default constructer
        this.length = 1.0;
        this.width = 1.0;
    }

    public Rectangle(double length, double width) {
        // parameterized constructor
        this.length = length;
        this.width = width;
    }
}
