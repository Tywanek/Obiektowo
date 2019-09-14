package com.company;

public class Rectangle {
    private int a;
    private int b;
    private int area;

    public Rectangle(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getArea() {
        return this.a * this.b;
    }
}
