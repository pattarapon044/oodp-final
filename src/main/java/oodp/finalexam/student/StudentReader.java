package oodp.finalexam.student;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

import lab.oodp.Keyboard;


public class StudentReader {

    String fileName = "students.txt";
    List<Student> students = new ArrayList<>();

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void start() {

        // Load the movie data
        students = loadStudents(fileName);

        // Do some stuff with the data to check that its working
        printStudentsArray(students);

        // Searching highestGPA
        Student highestGPA = getHighestGPA(students);
        printResults(highestGPA);
        System.out.println();

        // Searching student by ID
        System.out.print("Enter student ID: ");
        String id = Keyboard.readInput();
        System.out.print(searchByID(id, students));


    }

    /**
     * Reads movies from a file.
     *
     * @param fileName of students data
     * @return list of students
     */
    public List<Student> loadStudents(String fileName) {

        File myFile = new File(fileName);
        //TODO: complete the method for loading data
        // each line represent an information for 1 student
        // then store each student object to ArrayList students
        try (BufferedReader reader = new BufferedReader(new FileReader(myFile))) {
            reader.lines().forEach((line) -> {
                String[] data = line.split(",");
                students.add(new Student(data[0], data[1], Integer.parseInt(data[2]), Double.parseDouble(data[3])));
            });

            return students;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }

    }

    public void printStudentsArray(List<Student> students) {
        System.out.println("Student List");
        System.out.println("================");

        for (Student student : students) {
            System.out.println(student.toString());
        }
    }

    public Student getHighestGPA(List<Student> students) {
        //TODO:   Complete the getHighestGPA() method.
        return students.stream()
                .max(Comparator.comparingInt(Student::getYear))
                .orElse(null);
    }

    public void printResults(Student highestGPA) {
        System.out.println();
        System.out.println("The highest GPA student is: " + highestGPA.toString());

    }

    public String searchByID(String studentID, List<Student> students) {
        //TODO: Complete the searchByID method
        // if find a student then return string as for example, "002 is Bee"
        // if not find a student then return string as for example, "005 is not in the student list."
        Student find = students.stream()
                .filter(student -> student.getId().equals(studentID))
                .findFirst()
                .orElse(null);

        return find == null ? studentID + " is not in the student list." : studentID + " is " + find.getName();
    }


    public static void main(String[] args) {
        new StudentReader().start();
    }

}
