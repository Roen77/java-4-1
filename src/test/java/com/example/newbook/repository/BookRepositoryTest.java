package com.example.newbook.repository;

import com.example.newbook.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("testdb")
@SpringBootTest
public class BookRepositoryTest {

    @Test
    void bookTest(){

    }
}