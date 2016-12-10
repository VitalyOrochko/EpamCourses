package com.epam.geometry.logic;


import com.epam.geometry.entity.Triangle;

public class TriangleLogic {
    private float firstSide;
    private float secondSide;
    private float thirdSide;


    public TriangleLogic(Triangle triangle) {
        this.firstSide = PointLogic.distanceBetweenPoints(triangle.getFirstPoint(), triangle.getSecondPoint());
        this.secondSide = PointLogic.distanceBetweenPoints(triangle.getSecondPoint(), triangle.getThirdPoint());
        this.thirdSide = PointLogic.distanceBetweenPoints(triangle.getFirstPoint(), triangle.getThirdPoint());
    }

    public boolean isRectangular(){
        if((firstSide * firstSide) == (secondSide * secondSide) + (thirdSide * thirdSide)){
            return true;
        }
        else if((secondSide * secondSide) == (firstSide * firstSide) + (thirdSide * thirdSide)){
            return true;
        }
        else if((thirdSide * thirdSide) == (firstSide * firstSide) + (secondSide * secondSide)){
            return true;
        }
        return false;
    }

    public float calculatePerimeter(){
        return firstSide + secondSide + thirdSide;
    }

    public float calculateSquare(){
        float p = calculatePerimeter() / 2;
        return  (float) Math.sqrt(p * (p - firstSide) * (p - secondSide) * (p - thirdSide));
    }
}
