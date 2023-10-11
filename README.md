# School Management System

![School](https://github.com/amalg20/ddd/assets/145042005/ab962401-8cce-4ad8-9887-469ff3f95822)


_The idea of this project to help manage students, teachers and courses with some basic functionalities_

We create four main classes and these are: Teacher, Student, Course and School.

## Classes

## Frist: Teacher class:
This class will have:
1. Variable called teacherId of data type string, auto-generated (Private member)
2. Variable called name of data type string (Private member)
3. Variable called salary of data type double (Private member)
4. A parameterized constructor that takes name and salary also the Getter and Setter.

### Second: Course class:
This class will have:
1. Variable called courseId of data type string, auto-generated (Private member)
2. Variable called name of data type string (Private member)
3. Variable called price of data type double (Private member)
4. Variable called money_earned of data type double(Private member)
5. Nullable variable called teacher of data type Teacher (Private member)
6. A parameterized constructor that takes name and price also the Getter and Setter.

### Third: Student class:
This class will have:
1. Variable called studentId of data type string, auto-generated (Private member)
2. Variable called name of data type string (Private member)
3. Variable called address of data type string (Private member)
4. Variable called email of data type string (Private member)
5. Nullable variable called course of data type Course (Private member)
6. A parameterized constructor that takes name, address and email also the Getter and Setter.

#### Fourth: School class:
This class will have:
1. Variable called name of data type string (Private member)
2. Variable called students of data type Map<String, Student> (Private member)
3. Variable called teachers of data type Map<String, Student> (Private member)
4. Variable called courses of data type Map<String, Student> (Private member)
5. A parameterized constructor that takes name, address and email also the Getter and Setter.

## How the application works
Firstlly, The application starts by asking the user for a name for the school. Then, the user is asked for a number of how many teachers should be created. Also, the user is prompted to enter the details of each teacher (based on the number chosen above). Next, the user is asked for the number of courses to be created. Also, the user is prompted to enter details of each course based on the number chosen above. Then, the user is asked for the number of students to be created. In addition, the user is prompted to enter details of each student based on the number chosen above. Lastlly, the user is now prompted to enter any command to execute a specified action in the system.

## Commands we used 
1. **ENROLL [STUDENT_ID] [COURSE_ID]:** This command will help us to enroll the student specified in the corresponding course.
2. **ASSIGN [TEACHER_ID] [COURSE_ID]:** This command will help us to assign the teacher specified to the corresponding course
3. **SHOW COURSES:** This command will display a list of all courses
4. **LOOKUP COURSE [COURSE_ID]:** This command will display the full details of the specified course
5. **SHOW STUDENTS:** This command will display a list of all students
6. **LOOKUP STUDENT [STUDENT_ID]:** This command will display the full details of the specified student
7. **SHOW TEACHERS:** This command will display a list of all teachers
8. **LOOKUP TEACHER [TEACHER_ID]:** This command will display the full details of the specified teacher
9. **SHOW PROFIT:** This command will calculate (The total money earned from all courses) - (The sum of all the teachers’ salaries) and return the result

## From the " main"  
We were navigated through the command using switch method for standard Input and Output.
We also used exceptions to handle errors.

## From the "test"
We created unit tests for every method we have done before.

## Adding more commands
We add more commands that can help us to display more information such as ***(SHOW STUDENTS [COURSE_ID], SHOW MONEY EARNED, SHOW MONEY SPENT)***.

## References:
1. http://www.aimteck.com/why-schools-need-school-management-system/
   






