package test.com.epam.create;

import com.epam.geometry.create.TriangleCreator;
import com.epam.geometry.entity.Point;
import com.epam.geometry.exception.TriangleCreateException;
import org.junit.Test;

public class TriangleCreateTest {
    @Test(expected = TriangleCreateException.class)
    public void createTest() throws TriangleCreateException {
        Point first = new Point(1, 1);
        Point second = new Point(1, 2);
        Point third = new Point(1, 3);
        TriangleCreator.create(first, second, third);
    }
}
