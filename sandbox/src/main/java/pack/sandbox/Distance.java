package pack.sandbox;

public class Distance {
    public Point p1;
    public Point p2;

    public Distance(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public double distance() {
        return Math.sqrt((this.p1.x - this.p2.x) * (this.p1.x - this.p2.x) + (this.p1.y - this.p2.y) * (this.p1.y - this.p2.y));
    }

}


