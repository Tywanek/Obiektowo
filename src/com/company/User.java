package com.company;

public class User {
    private String name;
    private int age;
    private int weight;
    private double height;
    private Rectangle userRectangle;

    public User(String name, int age, int weight, double height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getBMI() {
        /*
        BMI = masa/(wzrost)^2
         */
        return weight / (height * height);
    }

    public void setUserRectangle(Rectangle userRectangle) {
        this.userRectangle = userRectangle;
    }

    public Rectangle getUserRectangle() {
        return userRectangle;
    }
}
