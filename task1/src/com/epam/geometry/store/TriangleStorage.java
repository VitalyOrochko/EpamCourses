package com.epam.geometry.store;


import com.epam.geometry.entity.Triangle;
import com.epam.geometry.exception.StorageException;


import java.util.LinkedList;

public class TriangleStorage {
    private LinkedList<Triangle> triangles;
    private static final TriangleStorage INSTANCE = new TriangleStorage();

    private TriangleStorage(){
        this.triangles = new LinkedList<Triangle>();
    }

    public static TriangleStorage getInstance(){
        return INSTANCE;
    }

    public void addTriangle(Triangle triangle){
        this.triangles.addLast(triangle);
    }

    public Triangle takeTriangle() throws StorageException {
        if(!triangles.isEmpty()){
            Triangle tmp = triangles.getFirst();
            this.triangles.removeFirst();
            return tmp;
        }else{
            throw new StorageException("TriangleStorage is empty");
        }
    }

    public boolean isEmpty(){
        return this.triangles.isEmpty();
    }
}
