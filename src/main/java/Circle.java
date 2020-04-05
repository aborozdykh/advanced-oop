public class Circle extends Shape {
    int radius;

    public Circle() {
        this.radius = (int) (Math.random() * 90);
    }

    @Override
    public double getArea() {
        return (double) Math.round(Math.PI * (radius * radius) * 100) / 100;
    }

    @Override
    public String draw() {
        return "Circle";
    }

    public int getRadius() {
        return radius;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.draw()).append("; ")
                .append("Area: ").append(this.getArea()).append("; ")
                .append("Color: ").append(this.getColor()).append("; ")
                .append("Radius: ").append(getRadius()).append(".");
        return sb.toString();
    }
}
