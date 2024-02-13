
package com.example.newbook.domain;

import com.example.newbook.listener.MyEntityListener;
import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Entity
@NoArgsConstructor
@Data
public class UserHistory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long userId;

    private String name;

    private String email;


    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}