package org.example;

import java.util.UUID;

public class Course {

    private String courseId;
    private String name;
    private double price;
    private double moneyEarned;
    private Teacher teacher;

    public Course(String name, double price) throws IllegalArgumentException {
        if (price < 0) {
            throw new IllegalArgumentException("price cannot be negative.");
        }
        this.name = name;
        this.price = price;
        this.moneyEarned = 0;
        this.courseId = UUID.randomUUID().toString();

    }



    public String getCourseId() {
        return courseId;
    }

    public void setCourseId(String courseId) {
        this.courseId = courseId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) throws IllegalArgumentException {
        if (price < 0) {
            throw new IllegalArgumentException("The price should be more than 1");
        }
        this.price = price;
    }

    public double getMoneyEarned() {
        return moneyEarned;
    }

    public void setMoneyEarned(double moneyEarned) {

        this.moneyEarned = moneyEarned;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return " ** " +
                " Course Information " +
                " Course : " +
                " name : " + name + '\'' +
                ", price : " + price +
                ", money_earned : " + moneyEarned +
                " ** ";
    }

}
