package com.ms.user.controllers;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ms.user.DTO.UserRecordDTO;
import com.ms.user.models.UserModel;
import com.ms.user.services.UserService;

import jakarta.validation.Valid;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    
    @PostMapping("/users")
    public ResponseEntity<UserModel> saveUser(@RequestBody @Valid UserRecordDTO userRecordDTO){
        // Implement saving user logic here
        var userModel = new UserModel();
        BeanUtils.copyProperties(userRecordDTO, userModel);
        var savedUser = userService.saveUser(userModel);

        return ResponseEntity.status(HttpStatus.CREATED).body(savedUser);
    }
}
