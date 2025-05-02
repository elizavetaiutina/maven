package org.example;

import java.util.Iterator;
import java.util.Set;

public class Methods {
    // Отчисляем тех у кого балл меньше 3
    public static void expulsiontStudents(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageScore() < 3) {
                iterator.remove();
                //System.out.println("Студент отчислен !" + student.name);
            }
        }
    }

    // Переводим на следующий курс тех у кого средний балл больше или равно 3
    public static void switchToNextCourseStudent(Set<Student> students) {
        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            if (student.getAverageScore() >= 3) {
                student.switchToNextCourse();
                //System.out.println("Переводим на след курс !" + student.course);
            }
        }
    }

    // Имена студентов, которые учатся на этом курсе
    public static void printStudents(Set<Student> students, int course) {
        System.out.println("На " + course + " курсе учатся :");
        int countStudents = 0;
        for (Student student : students) {
            if (student.course == course) {
                System.out.println(student.name);
                countStudents++;
            }
        }
        if (countStudents == 0) {
            System.out.println("Студентов нет");
        }

    }
}
