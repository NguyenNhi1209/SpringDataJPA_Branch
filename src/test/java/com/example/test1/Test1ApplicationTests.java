package com.example.test1;

import Repo.StudentRepo;
import ch.qos.logback.core.CoreConstants;
import entity.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test1ApplicationTests {

    // repo_branch

    private StudentRepo studentRepo;

    @Test
    void testSave(){
        Student s = new Student(1,"nhi");
        studentRepo.save(s);
    }

    @Test
    void testRead(){
        System.out.println(studentRepo.findAll());
    }

    @Test
    void testUpdate(){
       Student s = studentRepo.findAll().get(0);
       s.setName("nhi 123");
       studentRepo.save(s);
    }

    @Test
    void testDelete(){
        studentRepo.deleteAll();
    }







}
