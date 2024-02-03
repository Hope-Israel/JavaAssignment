package com.example.JavaAssignment.repository;

import com.example.JavaAssignment.entity.Student;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentRepository {

    private final List<Student> list = new ArrayList<>();

    //function to view all students
    public List<Student> getAllStudents() {
        return list;
    }

    //A function that searches for students in the system by ID
    public Student getById(int id) {
        for (Student s: list) {
            if(s.getId() == id) {
                return s;
            }
        }
        return null;
    }

    //Adds a new student to the list with ID, Name, and Age
    public Student createStudent(Student student) {
        Student s = new Student();
        s.setId(student.getId());
        s.setName(student.getName());
        s.setAge(student.getAge());
        list.add(s);
        return s;
    }

    //Updates an existing student within the system using student id
    public Student updateStudent(int id, Student updatedStudent) {
        for (int i = 0; i < list.size(); i++) {
            Student existingStudent = list.get(i);
            if (existingStudent.getId() == id) {
                existingStudent.setName(updatedStudent.getName());
                existingStudent.setAge(updatedStudent.getAge());
                return existingStudent;
            }
        }
        throw new RuntimeException("Student not found with id: " + id);
    }

    //Deletes a student from the system using student ID
    public String deleteStudent(int id) {
        list.removeIf(student -> student.getId() == id);
        return "Student with id "+ id + " has been deleted.";
    }
}
