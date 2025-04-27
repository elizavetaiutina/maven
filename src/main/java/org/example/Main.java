package org.example;

import java.util.*;

public class Main {
    public static void main(String args[]) {
        Set<Student> students = new HashSet<>();
        Student studentOne = new Student("Андрей", "E200E", 3, Arrays.asList(3, 4, 5, 4));
        Student studentTwo = new Student("Петр", "E200E", 3, Arrays.asList(2, 3, 3, 3));
        Student student3 = new Student("Иван", "E200E", 3, Arrays.asList(5, 5, 5, 5));
        Student student4 = new Student("Алексей", "E200E", 1, Arrays.asList(2, 2, 2, 2));
        Student student5 = new Student("Павел", "E200E", 2, Arrays.asList(2, 2, 2, 2));
        Student student6 = new Student("Максим", "E200E", 2, Arrays.asList(3, 4, 3, 3));
        students.add(studentOne);
        students.add(studentTwo);
        students.add(student3);
        students.add(student4);
        students.add(student5);
        students.add(student6);
        System.out.println("Изначальный список студентов: " + students + "\n\n");

        Methods.expulsiontStudents(students);
        Methods.switchToNextCourseStudent(students);
        Methods.printStudents(students, 3);
        System.out.println("\n\nТЕПЕРЬ ТАК : " + students);


        /*
        System.out.println("\n\n\n\n\nЗАДАНИЕ 2");*/
    }
}