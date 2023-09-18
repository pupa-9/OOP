package part_3;

public class Cube implements ThreeDimensionalShape, TwoDimensionalShape {
    private int edge;
    public Cube(int edge) {
        this.edge = edge;
    }

    @Override
    public double area() {
        return 6 * edge * edge;
    }

    @Override
    public double volume() {
        return edge * edge * edge;
    }
}
