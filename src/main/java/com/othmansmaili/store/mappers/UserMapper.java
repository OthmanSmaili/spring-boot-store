package com.othmansmaili.store.mappers;

import com.othmansmaili.store.dtos.UserDto;
import com.othmansmaili.store.entities.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
}
