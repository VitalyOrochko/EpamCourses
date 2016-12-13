package test.com.epam.create;

import com.epam.geometry.create.PointCreator;
import com.epam.geometry.exception.PointCreateException;
import com.epam.geometry.util.Tags;
import org.json.simple.JSONObject;
import org.junit.Test;

public class PointCreatorTest {

    @Test(expected = PointCreateException.class)
    public void createTest() throws PointCreateException{
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(Tags.X,"1.2");
        jsonObject.put(Tags.Y,"aj");
        new PointCreator().create(jsonObject);
    }
}
