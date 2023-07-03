

/**
 * Point class
 * @author Ramazan Serhat Uygun
 */
public class Point {

    /**
     *This code defines two private instance variables of type double named "x" and "y". 
     *These variables are intended to hold numerical values with decimal points. 
     *Since they are marked as "private", they can only be accessed directly within the class in which they are declared.  
     */
    private double x;
    private double y;

    /**
     *This code defines a constructor for a class named "Point". 
     *The constructor takes no arguments and initializes two instance variables of type double named "x" and "y" to 0.
     */
    public Point() {
        x = 0;
        y = 0;
    }

    /**
     * Constructor
     * This code defines another constructor for the "Point" class. 
     * This constructor takes two double parameters named "x" and "y", which represent the initial x and y coordinates of the Point object being created
     */
    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    /**
     * This code defines a method named "rotate" that takes in a degree value and a center point as parameters. 
     * It then calculates the new coordinates of the current point based on the rotation around the center point by the given degree value using trigonometric functions. 
     * The updated coordinates are then assigned to the current point.
     * @param degree degree to rotate
     * @param center center of rotation
     */
    public void rotate(double degree, Point center) {
        double x = this.x - center.x;
        double y = this.y - center.y;

        double rad = Math.toRadians(degree);
        this.x = x * Math.cos(rad) - y * Math.sin(rad) + center.x;
        this.y = x * Math.sin(rad) + y * Math.cos(rad) + center.y;
    }

    /**
     * translate the point
     * @return string representation of the point
     */
    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        Point other = (Point) obj;
        if (this.x != other.x) {
            return false;
        }
        if (this.y != other.y) {
            return false;
        }
        return true;
    }
}


