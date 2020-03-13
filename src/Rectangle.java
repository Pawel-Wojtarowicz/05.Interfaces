public class Rectangle implements Figure {

    private String type;
    private double a, b;

    public Rectangle(String type, double a, double b) {
        this.type = type;
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        return 2*(a+b);
    }

    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public String type() {
        return type;
    }
}
