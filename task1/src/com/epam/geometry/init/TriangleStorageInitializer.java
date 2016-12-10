package com.epam.geometry.init;

import com.epam.geometry.create.TriangleCreator;
import com.epam.geometry.entity.Triangle;
import com.epam.geometry.exception.StorageException;
import com.epam.geometry.exception.TriangleCreateException;
import com.epam.geometry.stor.PointStorage;
import com.epam.geometry.stor.TriangleStorage;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
;

public class TriangleStorageInitializer {
    private static final int COUNT_POINTS_FOR_TRIANGLE = 3;
    private static final Logger LOGGER = LogManager.getLogger(TriangleStorageInitializer.class);

    public void init(){
        PointStorage pointStorage = PointStorage.getInstance();
        TriangleStorage triangleStorage = TriangleStorage.getInstance();
        Triangle triangle = null;
        while(pointStorage.countOfPoints() >= COUNT_POINTS_FOR_TRIANGLE){
            try {
                triangle = TriangleCreator.create(pointStorage.takePoint(), pointStorage.takePoint(), pointStorage.takePoint());
            } catch (TriangleCreateException e) {
                LOGGER.log(Level.ERROR, "Triangle do not create", e);
            } catch (StorageException e) {
                LOGGER.log(Level.ERROR, "Problem with PointStorage", e);
            }
            triangleStorage.addTriangle(triangle);
        }
    }
 }
