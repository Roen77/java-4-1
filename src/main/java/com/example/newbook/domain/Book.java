package com.example.newbook.domain;

import com.example.newbook.listener.Auditable;
import com.example.newbook.listener.MyEntityListener;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;


@NoArgsConstructor
@Data
@Entity
@EntityListeners(value = MyEntityListener.class)
public class Book implements Auditable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    private String name;

    private String author;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;

    @PrePersist
    public void prePersist(){
        System.out.println(">>>>> prePersist");
        this.createdAt = LocalDateTime.now();
        this.updatedAt = LocalDateTime.now();
    }

}