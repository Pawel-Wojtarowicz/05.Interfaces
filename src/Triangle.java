public class Triangle implements Figure {

    private String type;
    private double a, b;

    public Triangle(String type, double a, double b) {
        this.type = type;
        this.a = a;
        this.b = b;
    }

    @Override
    public double getPerimeter() {
        double c = (a*a) + (b*b);
        c = Math.sqrt(c);
        return (a + b + c);
    }

    @Override
    public double getArea() {
        return (a*b/2);
    }

    @Override
    public String type() {
        return type;
    }
}
