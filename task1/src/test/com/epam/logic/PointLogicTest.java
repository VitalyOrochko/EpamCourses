package test.com.epam.logic;


import com.epam.geometry.entity.Point;
import com.epam.geometry.logic.PointLogic;
import org.junit.Assert;
import org.junit.Test;

public class PointLogicTest {
    @Test
    public void distanceBetweenPointsTest(){
        Point first = new Point(1, 1);
        Point second = new Point(2, 2);
        float expected = (float) Math.sqrt(2);
        float actual = (float) PointLogic.distanceBetweenPoints(first, second);
        Assert.assertEquals(expected, actual, 0.01);
    }

    @Test
    public void isLocateSameLineTest(){
        Point first = new Point(1, 1);
        Point second = new Point(2, 2);
        Point third = new Point(3, 3);
        Assert.assertTrue(PointLogic.isLocateSameLine(first, second, third));
    }
}
