package com.ofurum.SpringbootCompleteProjectController;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/users")
    public ResponseEntity<?> getAllUser() {
        return new ResponseEntity<>("All Users", HttpStatus.OK);
    }

}