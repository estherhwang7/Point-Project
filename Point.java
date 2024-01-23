public class Point {
    private int x;
    private int y;


    public Point() {
        x = 0;
        y = 0;
    }

    public Point(int x, int y) {
        setX(x);
        setY(y);
    }

    
    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    
    public void setX(int newX) {
        x = newX;
    }

    public void setY(int newY) {
        y = newY;
    }

    public int manhattanDistance(Point other) {
        return Math.abs(x - other.getX()) + Math.abs(y - other.getY());
    }

    public boolean isCollinear(Point p1, Point p2) {
        if (x == p1.getX() && x == p2.getX()) {
            return true;
        }

        double slope1 = (double) (y - p1.getY()) / (x - p1.getX());
        double slope2 = (double) (y - p2.getY()) / (x - p2.getX());

        return Math.abs(slope1 - slope2) < 0.01;
    }
}