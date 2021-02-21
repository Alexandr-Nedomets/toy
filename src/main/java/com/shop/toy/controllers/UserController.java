package com.shop.toy.controllers;

import com.shop.toy.models.dto.UserDto;
import com.shop.toy.services.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/api/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping
    public ResponseEntity save(@Valid @RequestBody UserDto userDto){
        UserDto save = userService.save(userDto);
        return ResponseEntity.ok(userDto);
    }
}
