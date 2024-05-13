package com.accommodationbooking.userservice.service.impl;

import com.accommodationbooking.userservice.dto.UserDto;
import com.accommodationbooking.userservice.exception.EntityNotFoundException;
import com.accommodationbooking.userservice.mapper.UserMapper;
import com.accommodationbooking.userservice.model.User;
import com.accommodationbooking.userservice.repository.UserRepository;
import com.accommodationbooking.userservice.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    @Override
    public User getUserByEmail(final String email) {
        return userRepository.findByEmail(email)
                .orElseThrow(() -> new EntityNotFoundException("User with email: " + email + " was not found"));
    }

    @Override
    public UserDto getCurrentUser() {
        final String email = SecurityContextHolder.getContext().getAuthentication().getName();
        return userMapper.toDto(getUserByEmail(email));
    }
}
