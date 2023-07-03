package ce204_hw1_algo_lib.shapes.abstracts;

/**
 * Abstract class for SimplePolygon shapes
 * @author Ramazan Serhat Uygun
 */
public abstract class SimplePolygon extends Polygon {

    protected double orientation;

    /**
     * Constructor
     */
    public SimplePolygon() {
        super();
        orientation = 0;
    }

    @Override
    public void rotate(double degree) {
        this.orientation += degree;
    }

    public double getOrientation() {
        return orientation;
    }
}
