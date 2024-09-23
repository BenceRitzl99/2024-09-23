package com.example;

public class Triangle implements Shape {
    double base;
    double height;
    
    double aSide;
    double bSide;
    double cSide;
    

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public Triangle(double aSide, double bSide, double cSide) {
        this.aSide = aSide;
        this.bSide = bSide;
        this.cSide = cSide;
    }


    @Override
    public double calculateArea() {
        return (base * height) / 2;
    }

    @Override
    public double calculatePerimeter() {
        return aSide + bSide + cSide;
    }

    
}
