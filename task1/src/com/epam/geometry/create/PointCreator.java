package com.epam.geometry.create;

import com.epam.geometry.entity.Point;
import com.epam.geometry.util.Tags;
import org.json.simple.JSONObject;

public class PointCreator {
    private JSONObject source;

    public PointCreator(JSONObject source) {
        this.source = source;
    }

    public Point create(){
        float x = (float) this.source.get(Tags.X);
        float y = (float) this.source.get(Tags.Y);
        return new Point(x,y);
    }
}
