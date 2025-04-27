package org.example;

import java.util.List;

public class Student {

    public String name;
    public String group;
    public int course;
    public List<Integer> assessment;

    public Student(String name, String group, int course, List<Integer> assessment) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.assessment = assessment;
    }

    public double getAverageScore() {
        int size = assessment.size();
        double averageScore = 0;
        for (Integer integer : assessment) {
            averageScore += integer;
        }
        return averageScore /= size;
    }

    public int switchToNextCourse() {
        return course++;
    }

    public String toString() {
        return "\nИмя студента: " + name + ", Группа: " + group + ", Курс: " + course + ", Оценки по предметам: " + assessment;
    }

}

