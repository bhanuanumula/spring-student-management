package com.example.studentapp.service;

import com.example.studentapp.repository.StudentRepository;
import com.example.studentapp.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


public class StudentService {

    private StudentRepository repo;

    @Autowired
    public StudentService(StudentRepository repo){
        System.out.println("in constructor: "+getClass().getSimpleName());
        this.repo = repo;
    }

    public void createStudent(String name){
        repo.save(new Student(name));
    }

    public List<Student> getStudents(){
        return repo.getStudents();
    }

    public String delete(int id){
        repo.deleteById(id);
        return "deleted - "+id;
    }

    public Student search(int id){
        Student s = repo.searchById(id);
        if(s == null) {
            System.out.println("Student not found");
        }
        return s;
    }

}
