package com.example.user.program;

import com.example.user.common.HttpResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public ResponseEntity add(User user) {

        if (userRepository.existsByName(user.getName())) {
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body(new HttpResponse<>().responseFail("name already exist"));
        }

        user.setAddedDate(new Date());
        user.setAddedTime(new Date());

        userRepository.save(user);

        return ResponseEntity.ok().body(new HttpResponse<>()
                .responseOk("user added"));
    }

    public ResponseEntity getAll() {

        return ResponseEntity.ok().body(new HttpResponse<>()
                .responseOk(userRepository.findAll()));
    }
}
