package ru.kazannik.cooldatabase.user.service;

import ru.kazannik.cooldatabase.user.dto.UserDto;
import ru.kazannik.cooldatabase.user.model.User;

import java.util.List;

public interface UserService {

    User create(User user);

    UserDto create(UserDto userDto);

    User update(User user);

    UserDto update(Long userId, UserDto userDto);

    boolean existsById(Long userId);

    User findById(Long userId);

    UserDto findByIdToDto(Long id);

    void remove(Long id);

    List<User> findAll();

    List<UserDto> findAllToDto();

    boolean userValidated(Long id);
}
