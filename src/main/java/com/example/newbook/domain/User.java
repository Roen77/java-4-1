
package com.example.newbook.domain;

import com.example.newbook.listener.MyEntityListener;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@Builder
@ToString
@Entity
@EntityListeners(value = MyEntityListener.class)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NonNull
    private String name;

    @NonNull
    private String email;

    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

//    @PrePersist
//    public void prePersist(){
//        System.out.println(">>>>> prePersist");
//        this.createdAt = LocalDateTime.now();
//        this.updatedAt = LocalDateTime.now();
//
//    }
//
//    @PostPersist
//    public void  poatPersist(){
//        System.out.println(">>>>> postersist");
//
//    }








}