public class Square extends Shape {
    int sizeLine;

    public Square() {
        this.sizeLine = (int) (Math.random() * 90);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.draw()).append("; ")
                .append("Area: ").append(this.getArea()).append("; ")
                .append("Color: ").append(this.getColor()).append("; ")
                .append("Line: ").append(getSizeLine()).append(".");
        return sb.toString();
    }

    @Override
    public double getArea() {
        return (double) sizeLine * sizeLine;
    }

    @Override
    public String draw() {
        return "Square";
    }

    public int getSizeLine() {
        return sizeLine;
    }
}
