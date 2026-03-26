package com.example.studentapp.config;

import com.example.studentapp.repository.StudentRepository;
import com.example.studentapp.service.StudentService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {

    @Bean
    public StudentRepository repository(){
        System.out.println("bean : initialized in repo");
        return new StudentRepository();
    }

    @Bean
    public StudentService studentService(StudentRepository studentRepository){
        System.out.println("bean : initialized in service");
        return new StudentService(studentRepository);
    }
}
