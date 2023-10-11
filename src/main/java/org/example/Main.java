package org.example;

import java.util.*;


public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter school name:");
        String schoolName = scanner.nextLine();
        School school = new School(schoolName);

        /* Teacher Information */
        int numTeachers = 0;
        while (true) {
            try {
                System.out.println("Enter number of teachers:");
                numTeachers = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }

        /*  Get teacher details  */
        for (int i = 0; i < numTeachers; i++) {

            System.out.println("Enter teacher name:");
            String teacherName = scanner.next();
            double teacherSalary = 0;
            while (true) {
                try {
                    System.out.println("Enter teacher salary:");
                    teacherSalary = scanner.nextDouble();
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                    scanner.nextLine();
                }
            }
            Teacher t = new Teacher(teacherName, teacherSalary);
            String teacherId = (t.getTeacherId());
            school.addTeacher(teacherId, t);

        }


        /* Courses Information */
        int numCourses = 0;
        while (true) {
            try {
                System.out.println("Enter number of courses:");
                numCourses = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }
        /*  Get course details  */
        for (int i = 0; i < numCourses; i++) {
            System.out.println("Enter course name:");
            String courseName = scanner.next();
            double coursePrice = 0;
            while (true) {
                try {
                    System.out.println("Enter course price:");
                    coursePrice = scanner.nextDouble();
                    ;
                    break;
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                    scanner.nextLine();
                }
            }
            Course course = new Course(courseName, coursePrice);
            school.addCourse(course.getCourseId(), course);
        }


        /* Students Information */
        int numStudents = 0;
        while (true) {
            try {
                System.out.println("Enter number of students:");
                numStudents = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine();
            }
        }

        /*  Get student details  */
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter student name:");
            String studentName = scanner.next();
            scanner.nextLine();
            System.out.println("Enter student address:");
            String studentAddress = scanner.nextLine();
            System.out.println("Enter student email:");
            String studentEmail = scanner.nextLine();

            Student student = new Student(studentName, studentAddress, studentEmail);
            school.addStudent(student.getStudentId(), student);
        }

        while (true) {
            /* Display Commands */
            System.out.println("\n**** SELECT FROM LIST ****");
            System.out.println("1- ENROLL [STUDENT_ID] [COURSE_ID]");
            System.out.println("2- ASSIGN [TEACHER_ID] [COURSE_ID]");
            System.out.println("3- SHOW COURSES");
            System.out.println("4- LOOKUP COURSE [COURSE_ID]");
            System.out.println("5- SHOW STUDENTS");
            System.out.println("6- LOOKUP STUDENT [STUDENT_ID]");
            System.out.println("7- SHOW TEACHERS");
            System.out.println("8- LOOKUP TEACHER [TEACHER_ID]");
            System.out.println("9- SHOW PROFIT");
            System.out.println("10- SHOW MONEY EARNED");
            System.out.println("11- SHOW SPENT MONEY FOR STUDENT");
            System.out.println("12- Exit");

            int selectedCommand = scanner.nextInt();
            switch (selectedCommand) {
                case 1:
                    System.out.println("Enter student name to enroll a course:");
                    String studName = scanner.next();
                    System.out.println("Enter the course name for enrolling:");
                    String courseToJoin = scanner.next();
                    try {
                        school.enrollStudent(school.searchForStudent(studName), school.searchForCourse(courseToJoin));
                    } catch (NullPointerException e) {
                        System.out.println("Error:  " + e.getMessage());
                    }
                    break;

                case 2:
                    System.out.println("Enter teacher name to assign to a course:");
                    String teacherName = scanner.next();
                    System.out.println("Enter the course name for assigning:");
                    String courseToAssign = scanner.next();
                    school.assignTeacher(school.searchForTeacher(teacherName), school.searchForCourse(courseToAssign));
                    System.out.println(" **  Successfully Assigned  **");
                    break;

                case 3:
                    school.showCourses();
                    break;

                case 4:
                    System.out.println("Enter the course name for Display:");
                    String courseToDisplay = scanner.next();
                    System.out.println("Details of course name  " + courseToDisplay + " is : ");
                    try {
                        System.out.println("Search for " + school.lookupCourse(school.searchForCourse(courseToDisplay)));
                    } catch (NullPointerException e) {
                        System.out.println("Error:  " + e.getMessage());
                    }
                    break;

                case 5:
                    school.showStudents();
                    break;

                case 6:
                    System.out.println("Enter student name to Display :");
                    String studNameToDisplay = scanner.next();
                    try {

                        school.lookupStudent(school.searchForStudent(studNameToDisplay));
                    } catch (NullPointerException e) {
                        System.out.println("Error:  " + e.getMessage());
                    }
                    break;

                case 7:
                    school.showTeachers();
                    break;

                case 8:
                    System.out.println("Enter teacher name to Display:");
                    String teacherNameToDisplay = scanner.next();
                    try {
                        school.lookupTeacher(school.searchForTeacher(teacherNameToDisplay));
                    } catch (NullPointerException e) {
                        System.out.println("Error:  " + e.getMessage());
                    }
                    break;

                case 9:
                    System.out.println("Result : " + school.showProfit());
                    break;

                case 10:
                    System.out.println("MONEY EARNED : " + school.moneyEarned());
                    break;

                case 11:
                    System.out.println("Enter student name to Display :");
                    String studNameToFind = scanner.next();
                    school.moneySpent(school.searchForStudent(studNameToFind));
                    break;

                case 12:
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid selection.");
                    break;
            } //end switch

        } //end while

    } // end main

} //end class main