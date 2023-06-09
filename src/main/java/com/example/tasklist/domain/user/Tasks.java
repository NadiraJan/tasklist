package com.example.tasklist.domain.user;

import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Tasks {
    private Long id;
    private String title;
    private String description;
    private Status status;
    private LocalDateTime expirationDate;

}
