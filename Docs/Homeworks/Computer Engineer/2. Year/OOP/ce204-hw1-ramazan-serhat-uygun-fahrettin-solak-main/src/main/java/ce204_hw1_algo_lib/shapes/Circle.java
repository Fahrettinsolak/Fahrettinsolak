package ce204_hw1_algo_lib.shapes;

import ce204_hw1_algo_lib.shapes.abstracts.EllipticalShape;

/**
 * Circle class
 * @author Ramazan Serhat Uygun
 * @see EllipticalShape
 */
public class Circle extends EllipticalShape {

    public Circle() {
        super();
    }

    @Override
    public void rotate(double degree) {}

    /**
     * change the scale of the shape
     * multiply the semi-major axis by the scale
     * It is effectless if the semi-major axis is zero
     * @param scale
     */
    @Override
    public void changeScale(double scale) {
        semiMajorAxis *= scale;
    }

    @Override
    public double getArea() {
        return Math.PI * semiMajorAxis * semiMajorAxis;
    }

    @Override
    public double getPerimeterLength() {
        return 2 * Math.PI * semiMajorAxis;
    }

    /**
     * This code defines a method named "getBoundingRect" that calculates and returns the bounding rectangle of an ellipse.
     * It creates a new instance of the Rectangle class and sets its center to the center of the ellipse. 
     * It then sets the width and height of the bounding rectangle to be twice the length of the semi-major axis of the ellipse. 
     * Finally, it returns the newly created bounding rectangle.
     * @return bounding rectangle
     */
    @Override
    public Rectangle getBoundingRect() {
        Rectangle boundingRect = new Rectangle();
        boundingRect.setCenter(center);
        boundingRect.setWidth(semiMajorAxis * 2);
        boundingRect.setHeight(semiMajorAxis * 2);
        return boundingRect;
    }
}
