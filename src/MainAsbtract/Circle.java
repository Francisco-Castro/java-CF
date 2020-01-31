package MainAsbtract;

public class Circle extends Shape {

    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public float area() {
        return (float) (Math.PI * radius * radius);
    }
}
