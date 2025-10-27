package com.othmansmaili.store.mappers;

import com.othmansmaili.store.dtos.RegisterUserRequest;
import com.othmansmaili.store.dtos.UpdateUserRequest;
import com.othmansmaili.store.dtos.UserDto;
import com.othmansmaili.store.entities.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserDto toDto(User user);
    User toEntity(RegisterUserRequest request);
    void update(UpdateUserRequest request, @MappingTarget User user);
}
