package test.com.epam.valid;

import com.epam.geometry.valid.Validator;
import org.junit.Assert;
import org.junit.Test;

public class ValidatorTest {
    @Test
    public void isValidCoordinateTest(){
        String first = "1.2";
        Assert.assertTrue(Validator.isValidCoordinate(first));
        String second = "1j";
        Assert.assertFalse(Validator.isValidCoordinate(second));
        String third = "-1";
        Assert.assertTrue(Validator.isValidCoordinate(third));
    }
}
