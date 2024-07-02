package me.dio.java_restful_api.service;

import me.dio.java_restful_api.domain.model.User;

public interface UserService {
    User findById(Long id);

    User create(User userToCreate);
}
