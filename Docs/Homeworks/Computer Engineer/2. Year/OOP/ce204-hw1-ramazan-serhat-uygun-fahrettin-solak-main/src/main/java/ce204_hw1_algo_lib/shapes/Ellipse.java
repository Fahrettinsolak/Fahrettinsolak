package ce204_hw1_algo_lib.shapes;

import ce204_hw1_algo_lib.Point;
import ce204_hw1_algo_lib.shapes.abstracts.EllipticalShape;

/**
 * Ellipse class
 * @author Ramazan Serhat Uygun
 * @see EllipticalShape
 */
public class Ellipse extends EllipticalShape {

    protected double semiMinorAxis;

    protected double orientation;

    public Ellipse() {
        super();
        semiMinorAxis = 1;
        orientation = 0;
    }

    @Override
    public void rotate(double degree) {
        orientation += degree;
    }

    /**
     * change the scale of the shape
     * multiply the semi-major axis and semi-minor axis by the scale
     * It is effectless if the semi-major axis is zero
     * @param scale
     */
    @Override
    public void changeScale(double scale) {
        semiMajorAxis *= scale;
        semiMinorAxis *= scale;
    }

    @Override
    public double getArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    @Override
    public double getPerimeterLength() {
        return 2 * Math.PI * Math.sqrt((semiMajorAxis * semiMajorAxis + semiMinorAxis * semiMinorAxis) / 2);
    }

    /**
     * This code defines a method named "getBoundingRect" that calculates and returns the bounding rectangle of a rotated ellipse. 
     * It first calculates the heights and widths of the top, bottom, left, and right sides of the bounding rectangle using trigonometric functions and the semi-major and semi-minor axes of the ellipse. 
     * It then calculates the overall width and height of the bounding rectangle by summing the individual widths and heights. 
     * Finally, it creates a new instance of the Rectangle class, sets its center to the center of the ellipse, 
     * and sets its width and height to the calculated values before returning the newly created bounding rectangle.
     * @return bounding rectangle
     */
    @Override
    public Rectangle getBoundingRect() {
        double topHeight = semiMinorAxis * Math.sqrt(1 - Math.pow(semiMajorAxis / semiMinorAxis, 2) * Math.pow(Math.cos(Math.toRadians(orientation)), 2));
        double bottomHeight = semiMinorAxis * Math.sqrt(1 - Math.pow(semiMajorAxis / semiMinorAxis, 2) * Math.pow(Math.cos(Math.toRadians(orientation + 90)), 2));
        double leftWidth = semiMinorAxis * Math.sqrt(1 - Math.pow(semiMajorAxis / semiMinorAxis, 2) * Math.pow(Math.sin(Math.toRadians(orientation)), 2));
        double rightWidth = semiMinorAxis * Math.sqrt(1 - Math.pow(semiMajorAxis / semiMinorAxis, 2) * Math.pow(Math.sin(Math.toRadians(orientation + 90)), 2));

        double width = leftWidth + rightWidth;
        double height = topHeight + bottomHeight;

        Rectangle boundingRect = new Rectangle();
        boundingRect.setCenter(center);
        boundingRect.setWidth(width);
        boundingRect.setHeight(height);
        return boundingRect;
    }

    public double getSemiMinorAxis() {
        return semiMinorAxis;
    }

    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }


    public Point getFocus1() {
        double c = Math.sqrt(semiMajorAxis * semiMajorAxis - semiMinorAxis * semiMinorAxis);
        double x = center.getX() + c * Math.cos(Math.toRadians(orientation));
        double y = center.getY() + c * Math.sin(Math.toRadians(orientation));
        return new Point(x, y);
    }

    public Point getFocus2() {
        double c = Math.sqrt(semiMajorAxis * semiMajorAxis - semiMinorAxis * semiMinorAxis);
        double x = center.getX() - c * Math.cos(Math.toRadians(orientation));
        double y = center.getY() - c * Math.sin(Math.toRadians(orientation));
        return new Point(x, y);
    }

    public void setSemiMinorAxis(double semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public double getOrientation() {
        return orientation;
    }

    public void setOrientation(double orientation) {
        this.orientation = orientation;
    }
}
