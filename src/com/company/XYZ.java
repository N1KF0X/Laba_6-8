package com.company;

public class XYZ {
    public static double Z(double x, double y) throws  DivisionByZeroException{
        if(y==-1) throw new DivisionByZeroException("Division by zero");
        return  (x+y)/(y+1);
    }
}

