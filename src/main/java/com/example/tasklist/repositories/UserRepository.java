package com.example.tasklist.repositories;

import com.example.tasklist.domain.user.User;
import javax.management.relation.Role;
import java.util.Optional;

public interface UserRepository {
    Optional<User> findById(Long id);

    Optional<User> findByUserName(String userName);

    void update(User user);

    void create(User user);

    void insertUserRole(Long userId, Role role);

    boolean isTaskOwner(Long userId, Long taskId);

    void delete(Long id);


}
