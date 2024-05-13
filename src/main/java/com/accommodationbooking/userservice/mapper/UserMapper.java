package com.accommodationbooking.userservice.mapper;

import com.accommodationbooking.userservice.config.mapper.MapperConfig;
import com.accommodationbooking.userservice.dto.UserDto;
import com.accommodationbooking.userservice.model.User;
import org.mapstruct.Mapper;

@Mapper(config = MapperConfig.class)
public interface UserMapper {
    UserDto toDto(final User user);

    User toModel(final UserDto userDto);
}
