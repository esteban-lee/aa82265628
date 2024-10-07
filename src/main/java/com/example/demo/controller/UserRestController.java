package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserItemDto;
import com.example.demo.service.TodoItemService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequestMapping("/api/v1/user")
@RestController
public class UserRestController {

    public UserRestController(TodoItemService todoService) {
    }

    /**
     * UserItemDto 형식을 사번(userId) Return.
     *
     * @return
     */
    @GetMapping
    public ResponseEntity<?> getUserId() {
        UserItemDto userDto = UserItemDto.builder().userId("82265628").build();;
        return ResponseEntity.ok(userDto);
    }

}
