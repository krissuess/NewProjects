package qa;

public class Point {
    public double x;
    public double y;

    public  double distance(Point p2) {
        double ac=p2.y-this.y;
        double bc=p2.x-this.x;
        double ab=Math.sqrt(ac*ac+bc*bc);
        return ab;
    }
}
