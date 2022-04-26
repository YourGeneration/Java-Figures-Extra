package com.epam.rd.autotasks.figures;

import static java.lang.Math.*;

class Triangle extends Figure {
    public Point a;
    public Point b;
    public Point c;

    public Triangle(Point a, Point b, Point c){
        if(a == null || b == null || c == null) throw new IllegalArgumentException();
        this.a = a;
        this.b = b;
        this.c = c;
        if(area()==0) throw new IllegalArgumentException();

        double area =  a.getX()* (b.getY() - c.getY()) +
        b.getX() * (c.getY() - a.getY()) +
        c.getX() * (a.getY() - b.getY());

        if (area == 0) throw new IllegalArgumentException();

    }
    @Override
    public Point centroid(){
        return new Point((a.getX()+b.getX()+c.getX())/3,(a.getY()+b.getY()+c.getY())/3);
    }
    @Override
    public boolean isTheSame(Figure figure){
        if(figure instanceof Triangle){
            Triangle other = (Triangle) figure;
            if(a.getX() == other.a.getX() && b.getX() == other.b.getX() && c.getX() == other.c.getX() 
            && a.getY() == other.a.getY() && b.getY() == other.b.getY() && c.getY() == other.c.getY()) return true;
            else return false;
        }
        else return false;
    }

    double length(Point A, Point B) {
        double length= sqrt(pow(B.getX()-A.getX(),2)+pow(B.getY()-A.getY(),2));
        return length;
    }

    
    public double area(){
        double abLength = length(a, b);
        double bcLength = length(b, c);
        double caLength = length(c, a);

        //using the heron formula
        double p = (abLength+bcLength+caLength)*0.5;
        double area = sqrt(p*(p-abLength)*(p-bcLength)*(p-caLength));
        return area;

    }


}
