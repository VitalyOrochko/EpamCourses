package com.epam.geometry.logic;

import com.epam.geometry.entity.Point;

public class PointLogic {

    public static float distanceBetweenPoints(Point first, Point second){
        return (float) Math.sqrt(Math.pow(first.getX() - second.getX(), 2) + Math.pow(first.getY() - second.getY(), 2));
    }

    public static boolean isLocateSameLine(Point first, Point second, Point third){
        if(((third.getX() - first.getX()) * (second.getY() - first.getY()) ) ==
                ((third.getY() - first.getY()) * ((second.getX() - first.getX())))){
            return true;
        }
        return false;
    }
}
