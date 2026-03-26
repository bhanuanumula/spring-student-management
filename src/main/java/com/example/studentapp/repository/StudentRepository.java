package com.example.studentapp.repository;

import com.example.studentapp.model.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StudentRepository {

    private List<Student> students = new ArrayList<>();

    public void save(Student student){
        students.add(student);
    }

    public List<Student> getStudents(){
        return students;
    }

    public boolean deleteById(int id){
        Student s = searchById(id);
        if(s!=null) {
            students.remove(s);
            return true;
        }else{
            return false;
        }
    }

    public Student searchById(int id){
        return students.stream().filter(s->s.getId() == id).findFirst().orElse(null);
    }

}
