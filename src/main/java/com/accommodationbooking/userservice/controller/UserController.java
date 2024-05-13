package com.accommodationbooking.userservice.controller;

import com.accommodationbooking.userservice.dto.UserDto;
import com.accommodationbooking.userservice.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api/users")
@RequiredArgsConstructor
@Tag(name = "User management", description = "Endpoint for managing users")
public class UserController {
    private final UserService userService;

    @GetMapping(value = "/me")
    @Operation(summary = "Get current user", description = "Get current user")
    public UserDto getCurrentUser() {
        return userService.getCurrentUser();
    }
}
