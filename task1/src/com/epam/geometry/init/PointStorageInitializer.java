package com.epam.geometry.init;


import com.epam.geometry.create.PointCreator;
import com.epam.geometry.entity.Point;
import com.epam.geometry.exception.PointCreateException;
import com.epam.geometry.store.PointStorage;
import com.epam.geometry.util.JSONUtil;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class PointStorageInitializer {
    private static final Logger LOGGER = LogManager.getLogger(PointStorageInitializer.class);

    public void init(JSONObject jsonObject){
        PointStorage storage = PointStorage.getInstance();
        JSONArray jsonArray = JSONUtil.objectToArray(jsonObject);
        for(Object eJSONArray : jsonArray){
            JSONObject object = (JSONObject) eJSONArray;
            try {
                Point point = new PointCreator().create(object);
                storage.addPoint(point);
            } catch (PointCreateException e) {
                LOGGER.log(Level.ERROR, "Point did not create" , e);
            }
        }
    }
}
