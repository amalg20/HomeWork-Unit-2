package org.example;


import java.util.UUID;


public class Teacher {
    private String teacherId;
    private String name;
    private double salary;

    public Teacher(String name, double salary) throws IllegalArgumentException {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.name = name;
        this.salary = salary;
        this.teacherId = UUID.randomUUID().toString();
    }

    public String getTeacherId() {
        return teacherId;
    }

    public void setTeacherId(String teacherId) {
        this.teacherId = teacherId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) throws IllegalArgumentException {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative.");
        }
        this.salary = salary;
    }


    @Override
    public String toString() {
        return " ** " +
                " Teacher Information " +
                "Teacher : " +
                ", name= : " + name + '\'' +
                ", salary : " + salary +
                " ** ";
    }
}
