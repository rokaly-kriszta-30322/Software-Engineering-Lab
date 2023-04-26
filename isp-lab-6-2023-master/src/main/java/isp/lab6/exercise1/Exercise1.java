package isp.lab6.exercise1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Exercise1 {

    private static List<Student> students = new ArrayList<>();

        public static void main(String[] args) {

            addStudent("John Smith", "123456");
            addStudent("Jane Doe", "789012");
            addStudent("Ivana Gogh", "345678");

            displayStudents();

            updateInformation("Jane Doe", "789012", "Jane Smith");

            displayStudents();

            avgGrade("John Smith", "123456");

            removeStudent("Ivana Gogh", "345678");

            displayStudents();

        }

    private static void addStudent(String name, String id){

        Map<String, Integer> grades = new HashMap<>();
        Student student = new Student(name, id, grades);
        students.add(student);

    }

    private static void removeStudent(String name, String id) {
        students.removeIf(student -> student.getName().equals(name) && student.getId().equals(id));
    }

    private static void updateInformation(String oldName, String oldId, String newName) {
        for (Student student : students) {
            if (student.getName().equals(oldName) && student.getId().equals(oldId)) {
                student.setName(newName);
                break;
            }
        }
    }

    private static void avgGrade(String name, String id) {
        for (Student student : students) {
            if (student.getName().equals(name) && student.getId().equals(id)) {
                Map<String, Integer> grades = student.getGrades();
                int total = 0;
                int count = 0;
                for (Integer grade : grades.values()) {
                    total += grade;
                    count++;
                }
                double average = (double) total / count;
                System.out.println(name + "'s average grade is " + average);
                break;
            }
        }
    }

    private static void displayStudents() {
        for (Student student : students) {
            System.out.println("Name: " + student.getName() + ", ID: " + student.getId());
            Map<String, Integer> grades = student.getGrades();
            for (Map.Entry<String, Integer> entry : grades.entrySet()) {
                System.out.println("- " + entry.getKey() + ": " + entry.getValue());
            }
        }
    }

private static class Student {

    private String name;
    private String id;
    private Map<String, Integer> grades;

    public Student(String name, String id, Map<String, Integer> grades) {
        this.name = name;
        this.id = id;
        this.grades = grades;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Map<String, Integer> getGrades() {
        return grades;
    }

    public void addGrade(String subject, int grade) {
        grades.put(subject, grade);
    }

    public void removeGrade(String subject) {
        grades.remove(subject);
    }
}
}

