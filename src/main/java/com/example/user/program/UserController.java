package com.example.user.program;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @PostMapping("/add")
    public ResponseEntity add(@RequestBody User user) {
        return userService.add(user);
    }

    @GetMapping("/get-all")
    public ResponseEntity getAll() {
        return userService.getAll();
    }
}
