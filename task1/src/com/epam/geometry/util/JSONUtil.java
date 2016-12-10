package com.epam.geometry.util;


import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;

public class JSONUtil {
    private static final Logger LOGGER = LogManager.getLogger(JSONUtil.class);

    public static JSONObject loadJSONObject(String path){
        JSONParser parser = new JSONParser();
        JSONObject object = null;

        try {
            object = (JSONObject) parser.parse(new FileReader(path));
        } catch (IOException e) {
            LOGGER.log(Level.ERROR, e);
        } catch (ParseException e) {
            LOGGER.log(Level.ERROR, e);
        }
        return object;
    }

    public static JSONArray objectToArray(JSONObject jsonObject){
        return (JSONArray) jsonObject.get(Tags.POINTS);
    }
}

