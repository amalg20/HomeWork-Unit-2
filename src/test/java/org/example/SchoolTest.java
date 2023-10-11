package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

class SchoolTest {


    @Test
    void testEnrollStudent() {

        School school = new School("schoolName");
        Course course = new Course("Java", 2000);
        Student student = new Student("Alaa", "Alhasa", "alaa@gmail.com");
        school.addStudent(student.getStudentId(), student);
        school.addCourse(course.getCourseId(), course);
        school.enrollStudent(student.getStudentId(), course.getCourseId());
        assertEquals(course, student.getCourse());
        assertEquals(course.getPrice(), course.getMoneyEarned());
    }

    @Test
    void testAssignTeacher() {
        School school = new School("schoolName");
        Teacher teacher = new Teacher("Amal", 1000);
        Course course = new Course("Java", 2000);
        school.addTeacher(teacher.getTeacherId(), teacher);
        school.addCourse(course.getCourseId(), course);
        school.assignTeacher(teacher.getTeacherId(), course.getCourseId());
        Assertions.assertEquals(teacher, course.getTeacher());
    }

    @Test
    void testShowCourses() {
        School school = new School("schoolName");
        Course course = new Course("Java", 2000);
        school.addCourse(course.getCourseId(), course);
        assertEquals(school.getCourses(), school.showCourses());
    }


    @Test
    void testLookupCourse() {

        School school = new School("schoolName");
        Course course = new Course("Java", 2000);
        school.addCourse(course.getCourseId(), course);
        System.out.println("id " + course.getCourseId());
        System.out.println(course.getCourseId());
        System.out.println(school.lookupCourse(course.getCourseId()));
        assertEquals(course, school.lookupCourse(course.getCourseId()));
        assertEquals("Java", course.getName());
    }

    @Test
    void testShowStudents() {
        School school = new School("schoolName");
        Student student = new Student("Alaa", "ALhassa", "alaa@gmail.com");
        school.addStudent(student.getStudentId(), student);
        System.out.print(school.showStudents().toString());
        assertEquals(school.getStudents().toString(), school.showStudents().toString());
    }

    @Test
    void testLookupStudent() {
        School school = new School("schoolName");
        Student student = new Student("Alaa", "ALhassa", "alaa@gmail.com");
        school.addStudent(student.getStudentId(), student);
        assertEquals(student, school.lookupStudent(student.getStudentId()));
        assertEquals("Alaa", student.getName());
    }

    @Test
    void testShowTeachers() {
        School school = new School("schoolName");
        Teacher teacher = new Teacher("Amal", 2000);
        school.addTeacher(teacher.getTeacherId(), teacher);
        assertEquals(school.getTeachers().toString(), school.showTeachers().toString());
    }

    @Test
    void testLookupTeacher() {
        School school = new School("schoolName");
        Teacher teacher = new Teacher("Amal", 200);
        school.addTeacher(teacher.getTeacherId(), teacher);
        assertEquals(teacher, school.lookupTeacher(teacher.getTeacherId()));
        assertEquals("Amal", teacher.getName());
    }

    @Test
    void testShowProfit() {
        School school = new School("schoolName");
        Teacher teacher = new Teacher("Amal", 200);
        school.addTeacher(teacher.getTeacherId(), teacher);
        Course course = new Course("Java", 2000);
        school.addCourse(course.getCourseId(), course);
        Student student = new Student("Alaa", "Alhassa", "alaa@gmail.com");
        school.addStudent(student.getStudentId(), student);
        school.enrollStudent(student.getStudentId(), course.getCourseId());
        assertEquals(1800.0, school.showProfit());
    }

    @Test
    void testMoneyEarned() {
        School school = new School("schoolName");
        Course course = new Course("Java", 2000);
        school.addCourse(course.getCourseId(), course);
        Student student = new Student("Alaa", "Alhassa", "alaa@gmail.com");
        school.addStudent(student.getStudentId(), student);
        school.enrollStudent(student.getStudentId(), course.getCourseId());
        assertEquals(2000.0, school.moneyEarned());
    }

    @Test
    void testMoneySpent() {
        School school = new School("schoolName");
        Course course = new Course("Java", 2000);
        school.addCourse(course.getCourseId(), course);
        Student student = new Student("Alaa", "Alhassa", "alaa@gmail.com");
        school.addStudent(student.getStudentId(), student);
        school.enrollStudent(student.getStudentId(), course.getCourseId());
        System.out.println(school.moneySpent(student.getStudentId()));
        assertEquals(2000.0, school.moneySpent(student.getStudentId()));
    }


}