package MainAsbtract;

public class Main {

    public static void main(String[] args) {

        Shape circle = new Circle(9f);
        Shape triangle = new Triangle(10f, 5f);

        System.out.println(circle.area());
        System.out.println(triangle.area());

    }

}
