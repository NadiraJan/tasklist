package com.example.tasklist.services;

import org.springframework.scheduling.config.Task;

import java.util.List;

public interface TaskService {

    Task getById(Long id);

    List<Task> getAllByUserId(Long id);

    Task update(Task task);

    Task crate(Task task);

    void delete(Long id);



}
