package test.com.epam.util;

import com.epam.geometry.util.JSONUtil;
import org.junit.Test;

import java.io.IOException;

public class JSONUtilTest {
    @Test(expected = RuntimeException.class)
    public void loadJSONObjectTest(){
        JSONUtil.loadJSONObject("");
    }
}
