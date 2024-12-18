package com.marketplace.realdeal.users.interfaces;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingConstants;

import com.marketplace.realdeal.users.User;
import com.marketplace.realdeal.users.dto.UserToCreateDto;

@Mapper(componentModel = MappingConstants.ComponentModel.SPRING)

public interface UserMapper {
    @Mapping(target = "products", ignore = true)
    @Mapping(target = "id", ignore = true)
    User userToCreateToUser(UserToCreateDto userToCreateDto);
}
