package pack.sandbox;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DistanceTest {
    @Test
    public void testDistance() {
        Point p1=new Point(0,0);
        Point p2=new Point(0,10);
        Distance d= new Distance(p1,p2);
        d.distance();
        Assert.assertEquals(d.distance(), 10);
    }

}
