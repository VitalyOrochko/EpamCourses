package com.epam.geometry.create;


import com.epam.geometry.entity.Point;
import com.epam.geometry.entity.Triangle;
import com.epam.geometry.exception.TriangleCreateException;
import com.epam.geometry.logic.PointLogic;

public class TriangleCreator {

    public static Triangle create(Point first, Point second, Point third) throws TriangleCreateException {
        if(!PointLogic.isLocateSameLine(first, second, third)){
            return new Triangle(first, second, third);
        }else throw new TriangleCreateException("Points locate on the same line");
    }
}
