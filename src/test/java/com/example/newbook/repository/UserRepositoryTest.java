package com.example.newbook.repository;

import com.example.newbook.domain.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("testdb")
@SpringBootTest
class UserRepositoryTest {

    @Autowired
    private  UserRepository userRepository;

    @Test
    void crud(){
        userRepository.save(new User());

//        println
        userRepository.findAll().forEach(System.out::println);
    }

    @Test
    void listenerTest(){
        User user = new User();
        user.setEmail("eee@aa.com");
        user.setName("aaa");


        userRepository.save(user);

        User user2 = userRepository.findById(1L).orElseThrow(RuntimeException::new);

        userRepository.deleteById(4L);
    }

    @Test
    void prePersistTest(){
        User user = new User();

        user.setEmail("more@tes.com");
        user.setName("martin");
//        user.setCreatedAt(LocalDateTime.now());
//        user.setUpdatedAt(LocalDateTime.now());

        userRepository.save(user);


        System.out.println(userRepository.findByEmail("martin@fastcampus.com"));
    }

    @Test
    void preUpdateTest(){
        User user = userRepository.findById(1L).orElseThrow(RuntimeException::new);

        System.out.println("as is:"+ user);

        user.setName("roen");
        userRepository.save(user);

        System.out.println("tobe:"+userRepository.findAll().get(0));
    }


}