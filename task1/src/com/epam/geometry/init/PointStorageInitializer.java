package com.epam.geometry.init;


import com.epam.geometry.create.PointCreator;
import com.epam.geometry.entity.Point;
import com.epam.geometry.stor.PointStorage;
import com.epam.geometry.util.JSONUtil;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class PointStorageInitializer {
    private JSONObject jsonObject;

    public PointStorageInitializer(JSONObject jsonObject) {
        this.jsonObject = jsonObject;
    }

    public void init(){
        PointStorage storage = PointStorage.getInstance();
        JSONArray jsonArray = JSONUtil.objectToArray(this.jsonObject);
        Point point;

        for(Object eJSONArray : jsonArray){
            JSONObject object = (JSONObject) eJSONArray;
            point = new PointCreator(object).create();
            storage.addPoint(point);
        }
    }
}
