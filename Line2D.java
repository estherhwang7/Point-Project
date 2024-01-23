public class Line2D {
    private Point p1;
    private Point p2;

    public Line2D(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Line2D(int x1, int y1, int x2, int y2) {
        this.p1 = new Point(x1, y1);
        this.p2 = new Point(x2, y2);
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public String toString() {
        return "[" + p1 + ", " + p2 + "]";
    }

    public double getSlope() {
        if (p1.getX() == p2.getX()) {
            throw new IllegalArgumentException("undefined slope");
        }
        return (double) (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());
    }

    public boolean isCollinear(Point p) {
        if (p1.getX() == p2.getX() && p1.getX() == p.getX()) {
            return true;
        }

        double lineSlope = getSlope();
        double pointSlope = (double) (p.getY() - p1.getY()) / (p.getX() - p1.getX());

        return Math.abs(lineSlope - pointSlope) < 0.01;
    }
}