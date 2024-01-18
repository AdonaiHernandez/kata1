public class main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(0, 0, 100, 50);

        System.out.printf(rectangle.toString()+"\n");

        System.out.printf(String.valueOf(rectangle.getArea()));
    }
}
