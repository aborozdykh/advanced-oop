public class Triangle extends Shape {
    double firstSide;
    double secondSide;
    double thirdSide;
    double alfa;
    double beta;
    double gamma;
    double alfaGrad;

    public Triangle() {
        this.secondSide = (int) (Math.random() * 90);
        this.thirdSide = (int) (Math.random() * 90);
        this.alfaGrad = (int) (Math.random() * 90);
        this.alfa = Math.PI * alfaGrad / 180;
        this.firstSide = Math.sqrt(Math.pow(secondSide, 2) + thirdSide * thirdSide
                + 2 * secondSide * thirdSide * Math.cos(alfa));
        this.beta = Math.asin(secondSide / firstSide * Math.sin(alfa));
        this.gamma = Math.PI - alfa - beta;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Figure: ").append(this.draw()).append("; ")
                .append("Area: ").append(this.getArea()).append("; ")
                .append("Color: ").append(this.getColor()).append("; ")
                .append("Mediana: ").append(getMediana()).append(".");
        return sb.toString();
    }

    @Override
    public double getArea() {
        return (double) Math.round(firstSide * secondSide * Math.sin(gamma) / 2 * 100) / 100;
    }

    public String draw() {
        return "Triangle";
    }

    public double getMediana() {
        return (double) Math.round(Math.sqrt(2 * Math.pow(secondSide, 2)
                + 2 * Math.pow(thirdSide, 2) + Math.pow(firstSide, 2)) / 2 * 100) / 100;
    }
}
