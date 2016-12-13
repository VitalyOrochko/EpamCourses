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
        try {
            JSONObject object = (JSONObject) parser.parse(new FileReader(path));
            return object;
        } catch (IOException e) {
            LOGGER.log(Level.FATAL, e);
            throw new RuntimeException("Problem with input data");
        } catch (ParseException e) {
            LOGGER.log(Level.FATAL, e);
            throw new RuntimeException("Problem with parsing input data");
        }

    }

    public static JSONArray objectToArray(JSONObject jsonObject){
        return (JSONArray) jsonObject.get(Tags.POINTS);
    }
}

