package com.epam.rd.autotasks.figures;

import static java.lang.Math.*;

class Quadrilateral extends Figure {
    public Point a;
    public Point b;
    public Point c;
    public Point d;

    public Quadrilateral(Point a, Point b, Point c, Point d){
        if(a == null || b == null || c == null || d == null) throw new IllegalArgumentException();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        if(area()==0) throw new IllegalArgumentException();
    }

    @Override
    public Point centroid(){
        return new Point((a.getX()+b.getX()+c.getX()+d.getX())/4,(a.getY()+b.getY()+c.getY()+d.getY())/4);
    }
    @Override
    public boolean isTheSame(Figure figure){
        if(figure instanceof Quadrilateral){
            Quadrilateral other = (Quadrilateral) figure;
            if(a.getX() == other.a.getX() && b.getX() == other.b.getX() && c.getX() == other.c.getX() && d.getX() == other.d.getX()
            && a.getY() == other.a.getY() && b.getY() == other.b.getY() && c.getY() == other.c.getY() && d.getY() == other.d.getY()) return true;
            else return false;
        }
        else return false;
        
    }

    double length(Point A, Point B) {
        double length= sqrt(pow(B.getX()-A.getX(),2)+pow(B.getY()-A.getY(),2));
        return length;
    }

    public double areaOfTriangle(Point a,Point b, Point c){
        double area =  a.getX()* (b.getY() - c.getY()) +
        b.getX() * (c.getY() - a.getY()) +
        c.getX() * (a.getY() - b.getY());

        return area;

    }

    public double area(){
        return areaOfTriangle(a, b, c) + areaOfTriangle(a, c, d);
    }



}
