package ce204_hw1_algo_lib.shapes.abstracts;

/**
 * Abstract class for Elliptical shapes
 * @author Ramazan Serhat Uygun
 */
public abstract class EllipticalShape extends Shape2D {

    protected double semiMajorAxis;

    public EllipticalShape() {
        super();
        semiMajorAxis = 1;
    }


}
