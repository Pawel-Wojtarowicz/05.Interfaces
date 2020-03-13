public class Circle implements Figure {

    private String type;
    private double radius;


    public Circle(String type, double radius) {
        this.type = type;
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return (2 * Math.PI * radius);
    }

    @Override
    public double getArea() {
        return (Math.PI * radius * radius);
    }

    @Override
    public String type() {
        return type;
    }

}
