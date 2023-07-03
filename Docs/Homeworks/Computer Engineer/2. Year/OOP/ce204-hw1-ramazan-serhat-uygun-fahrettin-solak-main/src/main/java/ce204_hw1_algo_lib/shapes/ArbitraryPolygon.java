package ce204_hw1_algo_lib.shapes;

import java.util.ArrayList;
import java.util.List;

import ce204_hw1_algo_lib.Point;
import ce204_hw1_algo_lib.shapes.abstracts.Polygon;


/**
 * A polygon with arbitrary number of vertices.
 * @author Fahrettin Solak
 * @see Polygon
 * <p>
 *     After the vertices are stored in a list, the last vertex is connected to the first vertex.
 * </p>
 */
public class ArbitraryPolygon extends Polygon {

    /**
     * The vertices of the polygon.
     */
    protected List<Point> vertices;

    public ArbitraryPolygon() {
        this.vertices = new ArrayList();
    }

    public ArbitraryPolygon(List<Point> vertices) {
        this.vertices = vertices;
    }

    public void addPoint(Point point) {
        vertices.add(point);
    }

    public void addPoint(double x, double y) {
        vertices.add(new Point(x, y));
    }
    
    /**
     * This code defines a method named "rotate" that takes in a degree value as a parameter. 
     * It then iterates through all the vertices of a shape and calls the "rotate" method of each vertex, 
     * passing in the degree value and the center of the shape as parameters. 
     * This effectively rotates the entire shape by the given degree value around its center.
     */
    public void rotate(double degree) {
        for (Point point : vertices) {
            point.rotate(degree, getCenter());
        }
    }

    @Override
    public void changeScale(double scale) {
        Point center = getCenter();
        for (Point point : vertices) {
            point.setX(point.getX() + (point.getX() - center.getX()) * scale);
            point.setY(point.getY() + (point.getY() - center.getY()) * scale);
        }
    }

    @Override
    public double getArea() {
        int n = vertices.size();
        double area = 0;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            Point p1 = vertices.get(i);
            Point p2 = vertices.get(j);
            area += p1.getX() * p2.getY();
            area -= p1.getY() * p2.getX();
        }
        area /= 2;
        return Math.abs(area);
    }

    @Override
    public double getPerimeterLength() {
        int n = vertices.size();
        double perimeter = 0;
        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;
            Point p1 = vertices.get(i);
            Point p2 = vertices.get(j);
            double dx = p2.getX() - p1.getX();
            double dy = p2.getY() - p1.getY();
            perimeter += Math.sqrt(dx * dx + dy * dy);
        }
        return perimeter;
    }
}