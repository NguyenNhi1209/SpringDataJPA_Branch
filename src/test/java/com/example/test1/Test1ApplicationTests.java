package com.example.test1;

import Repo.StudentRepo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Test1ApplicationTests {

    //jpql_branch
    private StudentRepo studentRepo;

    @Test
    void testRead(){
        studentRepo.getAll();

    }

    @Test
    void testDelete(){
        studentRepo.deleteAll();
    }

}
