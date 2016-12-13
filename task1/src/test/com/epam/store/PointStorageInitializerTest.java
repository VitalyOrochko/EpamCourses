package test.com.epam.store;

import com.epam.geometry.entity.Point;
import com.epam.geometry.exception.StorageException;
import com.epam.geometry.init.PointStorageInitializer;
import com.epam.geometry.store.PointStorage;
import com.epam.geometry.util.JSONUtil;
import org.json.simple.JSONObject;
import org.junit.Assert;
import org.junit.Test;

public class PointStorageInitializerTest {
    @Test
    public void initTest() throws StorageException {
        JSONObject jsonObject = JSONUtil.loadJSONObject("data\\points.json");
        new PointStorageInitializer().init(jsonObject);
        PointStorage storage = PointStorage.getInstance();
        Point point = storage.takePoint();
        Assert.assertEquals(5, point.getX(), 0.01);
        Assert.assertEquals(1.2, point.getY(), 0.01);
    }
}
