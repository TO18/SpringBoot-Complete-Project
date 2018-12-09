package com.ofurum.SpringbootCompleteProjectController;

import com.ofurum.SpringbootCompleteProjectModel.GetUserRequestModel;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class Controller {

    @GetMapping
    public ResponseEntity<?> getAllUser(@Valid GetUserRequestModel getUserRequestModel) {
        return new ResponseEntity<>(getUserRequestModel, HttpStatus.OK);
    }

}