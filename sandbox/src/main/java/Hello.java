public class Hello {
    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point();
        p1.x=12;
        p1.y=23;
        p2.x=11;
        p2.y=56;
        double d=Hello.distance(p1,p2);
        System.out.println(d);

        double e = p1.distance(p2);
        System.out.println(e);
    }

    public static double distance(Point p1, Point p2) {
        double ac=p2.y-p1.y;
        double bc=p2.x-p1.x;
        double ab=Math.sqrt(ac*ac+bc*bc);
        return ab;
    }

}
