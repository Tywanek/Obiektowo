package com.company;

public class Main {

    public static void main(String[] args) {

        User myUser = new User("Andrzej", 75, 80, 1.88);

        System.out.println("User name: " + myUser.getName());
        System.out.println("User age: " + myUser.getAge());
        System.out.println("User BMI: " + myUser.getBMI());

        Rectangle mojKwadrat = new Rectangle(3, 5);
        myUser.setUserRectangle(mojKwadrat);
        myUser.getUserRectangle().setA(4);
        myUser.getUserRectangle().setB(2);

        System.out.println("User rectangle are: " + myUser.getUserRectangle().getArea());


    }

}
