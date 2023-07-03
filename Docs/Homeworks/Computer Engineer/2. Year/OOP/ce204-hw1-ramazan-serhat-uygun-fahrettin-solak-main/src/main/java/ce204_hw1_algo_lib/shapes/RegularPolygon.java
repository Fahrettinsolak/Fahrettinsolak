package ce204_hw1_algo_lib.shapes;

import ce204_hw1_algo_lib.Point;
import ce204_hw1_algo_lib.shapes.abstracts.SimplePolygon;

/**
 * RegularPolygon class
 * @author Fahrettin Solak
 * @see SimplePolygon
 */
public class RegularPolygon extends SimplePolygon {

    protected int numPoints;

    protected double radius;

    public RegularPolygon() {
        this(0, 1);
    }

    public RegularPolygon(int numPoints, double radius) {
        super();
        this.numPoints = numPoints;
        this.radius = radius;
    }


    public void changeNumPoints(int numPoints) {
        this.numPoints = numPoints;
    }

    /**
     * multiplies the radius of the polygon with the scale
     * Its not effective if radius is set to 0
     * @param scale
     */
    @Override
    public void changeScale(double scale) {
        radius *= scale;
    }

    @Override
    public double getArea() {
        double sideLength = getSideLength();
        return numPoints * sideLength * sideLength * Math.pow(Math.tan(Math.PI / numPoints), -1) / 4;
    }


    @Override
    public double getPerimeterLength() {
        return numPoints * getSideLength();
    }

    public double getSideLength() {
        return 2 * radius * Math.sin(Math.PI / numPoints);
    }

    /**
     * Calculates the vertices of the polygon
     * It also adds orientation to calculates the vertices
     */
    public Point[] getVertices() {
        Point[] vertices = new Point[numPoints];
        Point center = getCenter();
        for (int i = 0; i < numPoints; i++) {
            vertices[i] = new Point(center.getX() + radius * Math.cos(2 * Math.PI * i / numPoints + orientation),
                    center.getY() + radius * Math.sin(2 * Math.PI * i / numPoints + orientation));
        }
        return vertices;
    }
}
