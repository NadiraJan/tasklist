package com.example.tasklist.services.serviceImpl;

import com.example.tasklist.services.TaskService;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TaskServiceImpl implements TaskService {


    @Override
    public Task getById(Long id) {
        return null;
    }

    @Override
    public List<Task> getAllByUserId(Long id) {
        return null;
    }

    @Override
    public Task update(Task task) {
        return null;
    }

    @Override
    public Task crate(Task task) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }
}
