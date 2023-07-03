package ce204_hw1_algo_lib.shapes.abstracts;

import ce204_hw1_algo_lib.Point;

/**
 * Abstract class for 2D shapes
 * @author Ramazan Serhat Uygun
 */
public abstract class Shape2D {

    protected Point center;

    public Shape2D() {
        center = new Point();
    }

    public void translate(double dx, double dy) {
        center.setX(center.getX() + dx);
        center.setY(center.getY() + dy);
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public abstract void rotate(double degree);

    public abstract void changeScale(double scale);

    public abstract double getArea();

    public abstract double getPerimeterLength();

    public abstract Shape2D getBoundingRect();

}
