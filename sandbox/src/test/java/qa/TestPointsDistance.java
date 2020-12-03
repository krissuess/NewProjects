package qa;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPointsDistance {
    @Test
    public void check (){
        Point p3 = new Point(12.0, 13.0);
        Point p4 = new Point(11.0, 56.0);

        double d=p3.distance(p4);
        double e=43.011626;

        Assert.assertEquals(d,e, 0.01);

    }

    @Test
    public void checkNegativeValue (){
        Point p5=new Point(12.0, 13.0);
        Point p6=new Point(-11.0, -56.0);

        double d=p5.distance(p6);
        double e=72.732386;

        Assert.assertEquals(d,e,0.01);

    }
}
