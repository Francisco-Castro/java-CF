package MainAsbtract;

public class Triangle extends Shape {

    private float base;
    private float height;

    public Triangle(float base, float height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public float area() {
        return (base * height) / 2;
    }

}
