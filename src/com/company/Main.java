package com.company;

public class Main {

    public static void main(String[] args) {
        try {
            System.out.print(XYZ.Z(2,-1));
        }
        catch (DivisionByZeroException ex) {
            System.out.print(ex.getMessage());
        }
    }
}
