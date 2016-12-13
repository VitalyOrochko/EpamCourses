package com.epam.geometry.create;

import com.epam.geometry.entity.Point;
import com.epam.geometry.exception.PointCreateException;
import com.epam.geometry.util.Tags;
import com.epam.geometry.valid.Validator;
import org.json.simple.JSONObject;

public class PointCreator {

    public Point create(JSONObject source) throws PointCreateException {
        String xValue = source.get(Tags.X).toString();
        String yValue = source.get(Tags.Y).toString();
        float x;
        float y;
        if(Validator.isValidCoordinate(xValue)){
            x = Float.valueOf(xValue);
        }else{
            throw new PointCreateException("Data is not valid");
        }
        if(Validator.isValidCoordinate(yValue)){
            y = Float.valueOf(yValue);
        }else{
            throw new PointCreateException("Data is not valid");
        }
        return new Point(x,y);
    }
}
