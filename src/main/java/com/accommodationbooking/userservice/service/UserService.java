package com.accommodationbooking.userservice.service;

import com.accommodationbooking.userservice.dto.UserDto;
import com.accommodationbooking.userservice.model.User;

public interface UserService {

    User getUserByEmail(final String email);

    UserDto getCurrentUser();
}
