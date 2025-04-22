package vn.tayjava.service;

import vn.tayjava.dto.request.UserCreationRequest;
import vn.tayjava.dto.request.UserPasswordRequest;
import vn.tayjava.dto.request.UserUpdateRequest;
import vn.tayjava.dto.response.UserPageResponse;
import vn.tayjava.dto.response.UserResponse;

public interface UserService {

    UserPageResponse findAll(String keyword, String sort, int page, int size);

    UserResponse findById(Long id);

    UserResponse findByUsername(String username);

    UserResponse findByEmail(String email);

    long save(UserCreationRequest req);

    void update(UserUpdateRequest req);

    void changePassword(UserPasswordRequest req);

    void delete(Long id);
}