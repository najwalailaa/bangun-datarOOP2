/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bangundatar;

/**
 *
 * @author Najwa
 */
 import java.util.Scanner;
public class Bangundatar {
public int lengthofside, width, height, radius, semimajoraxis,semiminoraxis;

    public int SquareArea(){
        int area;
        area = this.lengthofside * this.lengthofside;
        return area;
    }
    public int SquareParimeter(){
        int parimeter;
        parimeter = this.lengthofside + this.lengthofside;
        return parimeter;
    }
    public int RectangleArea(){
        int area;
        area = this.width *this. height;
        return area;
    }
    public int RectangleParimeter(){
        int parimeter;
        parimeter = 2 * (this.width + this.height);
        return parimeter;
    }
    public double CircleArea(){
        double area, pi = 3.14;
        area = pi * this.radius * this.radius;
        return area;
    }
    public double CircleParimeter(){
        double parimeter, pi = 3.14;
        parimeter = 2 * pi * this.radius;
        return parimeter;
    }
    public double ElipsArea(){
        double area, pi = 3.14;
        area = pi* this.semimajoraxis*this.semiminoraxis;
        return area;
    }
    public double ElipsParimeter(){
        double parimeter, pi = 3.14;
        double c = Math.sqrt((this.semimajoraxis*this.semimajoraxis)+(this.semiminoraxis*this.semiminoraxis)/2);
        parimeter = 2 * pi * c;
        return parimeter;
    }
}
