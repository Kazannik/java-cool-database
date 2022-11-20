package ru.kazannik.cooldatabase.user.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import ru.kazannik.cooldatabase.user.dto.UserDto;
import ru.kazannik.cooldatabase.user.model.User;

@Mapper
public interface UserMapper {

    User toUser(UserDto dto);

    @Mapping(target = "id", expression = "java(user.getId())")
    @Mapping(target = "name", expression = "java(dto.getName() != null ? dto.getName() : user.getName())")
    @Mapping(target = "email", expression = "java(dto.getEmail() != null ? dto.getEmail() : user.getEmail())")
    User patchUser(User user, UserDto dto);

    UserDto toDto(User user);

}
