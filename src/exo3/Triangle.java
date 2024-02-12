package exo3;

import exo2.Forme;

public class Triangle extends Forme {
    private double side_1;
    private double side_2;
    private double side_3;
    private double base;
    private double height;

    public double perimetre() {
        return side_1+side_2+side_3;
    }
    public double getSide_1() {
        return side_1;
    }

    public void setSide_1(double side_1) {
        this.side_1 = side_1;
    }

    public double getSide_2() {
        return side_2;
    }

    public void setSide_2(double side_2) {
        this.side_2 = side_2;
    }

    public double getSide_3() {
        return side_3;
    }

    public void setSide_3(double side_3) {
        this.side_3 = side_3;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }


    }



