package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class School {

    private String name;

    private Map<String, Student> students;
    private Map<String, Teacher> teachers;
    private Map<String, Course> courses;

    public School(String name) {
        this.students = new HashMap<>();
        this.teachers = new HashMap<>();
        this.courses = new HashMap<>();
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<String, Student> getStudents() {
        return students;
    }

    public void setStudents(Map<String, Student> students) {
        this.students = students;
    }

    public Map<String, Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(Map<String, Teacher> teachers) {
        this.teachers = teachers;
    }

    public Map<String, Course> getCourses() {
        return courses;
    }

    public void setCourses(Map<String, Course> courses) {
        this.courses = courses;
    }

    public void addTeacher(String id, Teacher teacher) {
        teachers.put(id, teacher);

    }

    public void addCourse(String id, Course course) {
        courses.put(id, course);
    }

    public void addStudent(String id, Student student) {
        students.put(id, student);
    }


    /* 1- ENROLL [STUDENT_ID] [COURSE_ID] */
    public void enrollStudent(String studentId, String courseId) {

        Student student = students.get(studentId);
        Course course = courses.get(courseId);
        if (student.getCourse() != null) {
            System.out.println("Student is already enrolled in the course.");
        }
        else {
            student.setCourse(course);
            student.setSpentMoney(course.getPrice() + student.getSpentMoney());
            course.setMoneyEarned(course.getMoneyEarned() + course.getPrice());
            System.out.println(" **  Successfully enrolled  **");
        }
    }

    /* 2- ASSIGN [TEACHER_ID] [COURSE_ID] */
    public void assignTeacher(String teacherId, String courseId) {
        Teacher teacher = teachers.get(teacherId);
        Course course = courses.get(courseId);
        if (teacher!= null && course != null) {
            course.setTeacher(teacher);

        }

    }

    /* 3- SHOW COURSES */
    public Map<String, Course> showCourses() {
        for (Course course : courses.values()) {
            System.out.println("Display a list of all courses: " + course.toString());
        }
        return courses;
    }

    /* 4- LOOKUP COURSE [COURSE_ID]: */
    public Course lookupCourse(String courseId) {
        for (Course course : courses.values()) {
            if (course.getCourseId().equals(courseId)) {
                return course;
            }
        }
        return null;
    }

    /* 5- SHOW STUDENTS */
    public Map<String, Student> showStudents() {
        for (Student student : students.values()) {
            System.out.println("Display a list of all students: " + student.toString());

        }
        return students;
    }

    /* 6- LOOKUP STUDENT [STUDENT_ID] */
    public Student lookupStudent(String studentId) {
        for (Student student : students.values()) {
            if (student.getStudentId().equals(studentId)) {
                System.out.println(student.toString());
                return student;
            }
        }
        return null;
    }

    /* 7- SHOW TEACHERS */
    public Map<String, Teacher> showTeachers() {
        for (Teacher teacher : teachers.values()) {
            System.out.println("Display a list of all teacher: " + teacher.toString());
        }
        return teachers;
    }

    /* 8- LOOKUP TEACHER [TEACHER_ID] */
    public Teacher lookupTeacher(String teacherId) {
        for (Teacher teacher : teachers.values()) {
            if (teacher.getTeacherId().equals(teacherId)) {
                System.out.println(teacher.toString());
                return teacher;
            }
        }
        return null;
    }

    /* 9- SHOW PROFIT */
    public double showProfit() {
        double totalMoneyEarned = 0;
        double totalSalaries = 0;
        double result = 0;
        for (Course course : courses.values()) {
            totalMoneyEarned += course.getMoneyEarned();

        }
        for (Teacher teacher : teachers.values()) {
            totalSalaries += teacher.getSalary();
        }
        result = totalMoneyEarned - totalSalaries;

        return result;
    }

    /* 10- SHOW MONEY EARNED --Bonus-- */
    public double moneyEarned() {
        double totalMoneyEarned = 0;
        for (Course course : courses.values()) {
            totalMoneyEarned += course.getMoneyEarned();
        }
        return totalMoneyEarned;
    }

    /* 11- SHOW MONEY SPENT --Bonus-- */
    public double moneySpent(String studentId ) {
        double moneySpent = 0;
        String name = "alaa";
        for (Student student : students.values()) {
            if (student.getStudentId().equals(studentId)) {
                moneySpent += student.getSpentMoney();
                name = student.getName();
            }
        }
        System.out.println("The spent money for  " + name + " is : " + moneySpent );

        return moneySpent;
    }



    /* Search methods */

    public String searchForStudent(String studentName) {

        String studentId = "";
        for (Student student : students.values()) {
            if (student.getName().equals(studentName)) {
                studentId = student.getStudentId();
                return studentId;
            }
        }
        return null;
    }

    public String searchForCourse(String courseName) {

        String courseId = "";
        for (Course course : courses.values()) {
            if (course.getName().equals(courseName)) {
                courseId = course.getCourseId();

                return courseId;
            }
        }
        return null;
    }

    public String searchForTeacher(String teacherName) {
        String teacherId = "";

        for (Teacher teacher : teachers.values()) {
            if (teacher.getName().equals(teacherName)) {
                teacherId = teacher.getTeacherId();

                return teacherId;
            }
        }

        return null;
    }


}
