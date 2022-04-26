package com.epam.rd.autotasks.figures;

import static java.lang.Math.*;

class Circle extends Figure{

    public Point center;
    public double radius;

    public Circle(Point center, double radius){
        if(radius<= 0 || center == null) throw new IllegalArgumentException();
        this.center = center;
        this.radius = radius;
        if(area()==0) throw new IllegalArgumentException();
    }

    public Point getCenter(){
        return center;
    }

    public double getRadius(){
        return radius;
    }
    
    public double area(){
        return PI * pow(radius,2);
    }
    
    @Override
    public Point centroid(){
        return center;
    }
    @Override
    public boolean isTheSame(Figure figure){
        if(figure == null) return false;
        if(figure instanceof Circle){
            Circle otherCircle = (Circle) figure;
            return center.getX() == otherCircle.center.getX() && center.getY() == otherCircle.center.getY() && radius == otherCircle.radius;
        }
        else return false;
    }

}
