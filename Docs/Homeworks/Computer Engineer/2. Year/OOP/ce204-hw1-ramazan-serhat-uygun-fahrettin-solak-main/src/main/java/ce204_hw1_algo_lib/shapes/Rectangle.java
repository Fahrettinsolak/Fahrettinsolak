package ce204_hw1_algo_lib.shapes;

import ce204_hw1_algo_lib.Point;
import ce204_hw1_algo_lib.shapes.abstracts.SimplePolygon;

/**
 * Rectangle class
 * @author Fahrettin Solak
 * @see SimplePolygon
 */
public class Rectangle extends SimplePolygon {

    protected double height;

    protected double width;

    public Rectangle() {
        super();
        width = 0;
        height = 0;
    }

    @Override
    public void changeScale(double scale) {
        width *= scale;
        height *= scale;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeterLength() {
        return 2 * (width + height);
    }

    /**
     * This code defines a method named "getVertices" that calculates and returns the four vertices of a rectangle that encloses an object with the given width, height, and orientation. 
     * It first creates an array of four Point objects. It then calculates the x and y coordinates of each vertex based on the center of the rectangle, its width and height, 
     * and its orientation using trigonometric functions. Finally, it creates a new Point object for each vertex and assigns its x and y coordinates before returning the array of vertices.
     * @return vertices
     */
    public Point[] getVertices() {
        Point[] vertices = new Point[4];
        Point center = getCenter();

        vertices[0] = new Point(center.getX() - width / 2 * Math.cos(orientation) - height / 2 * Math.sin(orientation),
                center.getY() - width / 2 * Math.sin(orientation) + height / 2 * Math.cos(orientation));
        vertices[1] = new Point(center.getX() + width / 2 * Math.cos(orientation) - height / 2 * Math.sin(orientation),
                center.getY() + width / 2 * Math.sin(orientation) + height / 2 * Math.cos(orientation));
        vertices[2] = new Point(center.getX() + width / 2 * Math.cos(orientation) + height / 2 * Math.sin(orientation),
                center.getY() + width / 2 * Math.sin(orientation) - height / 2 * Math.cos(orientation));
        vertices[3] = new Point(center.getX() - width / 2 * Math.cos(orientation) + height / 2 * Math.sin(orientation),
                center.getY() - width / 2 * Math.sin(orientation) - height / 2 * Math.cos(orientation));
        return vertices;
    }

    
    /**
     * get the bounding rectangle of the rectangle
     * Returns the smallest rectangle that contains the rectangle
     * While the rectangle is not rotated, the bounding rectangle is the rectangle itself
     * When the rectangle is rotated, the bounding rectangle is the smallest rectangle that contains the rectangle
     * @return bounding rectangle
     */
    public Rectangle getBoundingRect() {
        Point[] vertices = getVertices();
        double minX = vertices[0].getX();
        double maxX = vertices[0].getX();
        double minY = vertices[0].getY();
        double maxY = vertices[0].getY();
        for (int i = 1; i < vertices.length; i++) {
            if (vertices[i].getX() < minX) {
                minX = vertices[i].getX();
            }
            if (vertices[i].getX() > maxX) {
                maxX = vertices[i].getX();
            }
            if (vertices[i].getY() < minY) {
                minY = vertices[i].getY();
            }
            if (vertices[i].getY() > maxY) {
                maxY = vertices[i].getY();
            }
        }
        Rectangle boundingRect = new Rectangle();
        boundingRect.setCenter(center);
        boundingRect.setWidth(maxX - minX);
        boundingRect.setHeight(maxY - minY);
        return boundingRect;
    }
    
    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
