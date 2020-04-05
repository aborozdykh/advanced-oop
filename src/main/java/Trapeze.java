public class Trapeze extends Shape {

    public Trapeze() {
    }

    @Override
    public double getArea() {
        return (double) Math.round((Math.random() * 50) * 100) / 100;
    }

    @Override
    public String draw() {
        return "Trapeze";
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.draw()).append("; ")
                .append("Area: ").append(this.getArea()).append("; ")
                .append("Color: ").append(this.getColor()).append("; ")
                .append("Form: ").append(getForm()).append(".");
        return sb.toString();
    }

    public String getForm() {
        int i = (int) Math.random() * 2;
        return i == 1 ? "Right" : "Wrong";
    }
}
