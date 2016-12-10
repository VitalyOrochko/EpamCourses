package test.com.epam.logic;


import com.epam.geometry.create.TriangleCreator;
import com.epam.geometry.entity.Point;
import com.epam.geometry.entity.Triangle;
import com.epam.geometry.exception.TriangleCreateException;
import com.epam.geometry.logic.TriangleLogic;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Test;

public class TriangleLogicTest {
    private static final Logger LOGGER = LogManager.getLogger(TriangleLogicTest.class);

    @Test
    public void isRectangularTest(){
        Triangle triangle = null;
        try {
            triangle = TriangleCreator.create(new Point(0, 0), new Point(4, 0), new Point(4, 3));
        } catch (TriangleCreateException e) {
            LOGGER.log(Level.ERROR, "Triangle do not create during testing", e);
        }
        TriangleLogic triangleLogic = new TriangleLogic(triangle);
        Assert.assertTrue(triangleLogic.isRectangular());
    }

    @Test
    public void calculatePerimeterTest(){
        Triangle triangle = null;
        try {
            triangle = TriangleCreator.create(new Point(0, 0), new Point(4, 0), new Point(4, 3));
        } catch (TriangleCreateException e) {
            LOGGER.log(Level.ERROR, "Triangle do not create during testing", e);
        }
        TriangleLogic triangleLogic = new TriangleLogic(triangle);
        float expected = 12;
        float actual = triangleLogic.calculatePerimeter();
        Assert.assertEquals(expected, actual, 0.001);
    }

    @Test
    public void calculateSquareTest(){
        Triangle triangle = null;
        try {
            triangle = TriangleCreator.create(new Point(0, 0), new Point(4, 0), new Point(4, 3));
        } catch (TriangleCreateException e) {
            LOGGER.log(Level.ERROR, "Triangle do not create during testing", e);
        }
        TriangleLogic triangleLogic = new TriangleLogic(triangle);
        float expected = 6;
        float actual = triangleLogic.calculateSquare();
        Assert.assertEquals(expected, actual, 0.01);
    }
}
