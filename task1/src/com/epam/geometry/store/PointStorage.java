package com.epam.geometry.store;


import com.epam.geometry.entity.Point;
import com.epam.geometry.exception.StorageException;

import java.util.LinkedList;

public class PointStorage {
    private LinkedList<Point> points;
    private static final PointStorage INSTANCE = new PointStorage();

    private PointStorage(){
        this.points = new LinkedList<Point>();
    }

    public static PointStorage getInstance(){
        return INSTANCE;
    }

    public int countOfPoints(){
        return points.size();
    }

    public void addPoint(Point point){
        this.points.addLast(point);
    }

    public Point takePoint() throws StorageException {
        if(!points.isEmpty()){
            Point tmp = points.getFirst();
            this.points.removeFirst();
            return tmp;
        }else{
            throw new StorageException("PointStorage is empty");
        }
    }

    public boolean isEmpty(){
        return this.points.isEmpty();
    }
}
