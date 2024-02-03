package com.example.JavaAssignment.service;
import com.example.JavaAssignment.entity.Student;
import com.example.JavaAssignment.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public Student CreateStudent(Student student) {
        return studentRepository.createStudent(student);
    }

    public List<Student> getAllStudents() {
        return studentRepository.getAllStudents();
    }

    public Student getById(int id) {
        return studentRepository.getById(id);
    }

    public Student updateStudent(int id, Student updatedStudent) {
        return studentRepository.updateStudent(id, updatedStudent);
    }

    public String deleteStudent(int id) {
        return studentRepository.deleteStudent(id);
    }
}
