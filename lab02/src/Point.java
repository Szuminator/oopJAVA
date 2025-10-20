public class Point {
    public double x;
    public double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point otherPoint){
        return Math.sqrt(Math.pow(otherPoint.x - this.x,2)+Math.pow(otherPoint.y - this.y,2));
    }
}
