package org.example;


import java.util.UUID;


public class Student {
    private String studentId;
    private String name;
    private String address;
    private String email;

    private double spentMoney;
    private Course course;

    public Student(String name, String address, String email) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.studentId = UUID.randomUUID().toString();
        this.spentMoney = 0;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public double getSpentMoney() {
        return spentMoney;
    }

    public void setSpentMoney(double spentMoney) {
        this.spentMoney = spentMoney;
    }

    @Override
    public String toString() {
        return " ** " +
                " Student Information " +
                ", name : " + name + '\'' +
                ", address : " + address + '\'' +
                ", email : " + email + '\'' +

                " ** ";
    }
}
