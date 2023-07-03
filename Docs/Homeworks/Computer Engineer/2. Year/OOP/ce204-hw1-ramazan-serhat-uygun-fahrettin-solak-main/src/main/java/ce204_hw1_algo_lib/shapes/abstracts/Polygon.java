package ce204_hw1_algo_lib.shapes.abstracts;

import ce204_hw1_algo_lib.Point;

/**
 * Abstract class for Polygon shapes
 * @author Ramazan Serhat Uygun
 */
public abstract class Polygon extends Shape2D {

    public Polygon() {
        super();
    }

    public Shape2D getBoundingRect() {
        return null;
    }

    public Point[] getVertices() {
        return null;
    }
}
