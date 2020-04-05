public class MainApp {
    public static void main(String[] args) {
        int count = (int) (Math.random() * 20);
        Shape[] shapes = new Shape[count];

        for (Shape shape : shapes) {
            int i = (int) (Math.random() * 4);
            if (i == 0) {
                shape = new Triangle();
            } else if (i == 1) {
                shape = new Square();
            } else if (i == 2) {
                shape = new Circle();
            } else if (i == 3) {
                shape = new Trapeze();
            }
            System.out.println(shape.toString());
        }
    }
}
