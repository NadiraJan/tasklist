package com.example.tasklist.web.dto.mappers;

import com.example.tasklist.web.dto.tasks.TaskDto;
import org.mapstruct.Mapper;
import org.springframework.scheduling.config.Task;

import java.util.List;

@Mapper(componentModel = "spring")
public interface TaskMapper {

    TaskDto toDo(Task task);

    List<TaskDto> todo(List<Task> tasks);

    Task toEntity(TaskDto dto);
}
