abstract class Shape {

    public abstract double getArea();

    public abstract String draw();

    public String getColor() {
        String[] colorArray = {"green", "blue", "yellow", "red", "orange"};
        int i = (int) (Math.random() * 5);
        return colorArray[i];
    }
}
