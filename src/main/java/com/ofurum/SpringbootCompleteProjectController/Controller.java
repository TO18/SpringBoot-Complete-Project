package com.ofurum.SpringbootCompleteProjectController;

import com.ofurum.SpringbootCompleteProjectModel.GetUsersRequest;
import com.ofurum.SpringbootCompleteProjectModel.PostUsersRequest;
import com.ofurum.SpringbootCompleteProjectModel.PutUsersRequest;
import com.ofurum.SpringbootCompleteProjectModel.PatchUsersRequest;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.*;
import javax.validation.*;

@RestController
@RequestMapping("/users")
public class Controller {



    @GetMapping
    public ResponseEntity<?> getRequest(@Valid GetUsersRequest getUsersRequest) {
        return new ResponseEntity<>(getUsersRequest, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> postRequest(@Valid @RequestBody PostUsersRequest postUsersRequest) {
        return new ResponseEntity<>(postUsersRequest, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> putRequest(@PathVariable("id") int id,
                                        @Valid @RequestBody PutUsersRequest putUsersRequest) {
        if (id != putUsersRequest.getId()) {
            return new ResponseEntity<>(putUsersRequest, HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity<>(putUsersRequest, HttpStatus.OK);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> patchRequest(@PathVariable("id") int id,
                                          @Valid @RequestBody PatchUsersRequest patchUsersRequest) {
        if (id != patchUsersRequest.getId()) {
            return new ResponseEntity<>(patchUsersRequest, HttpStatus.FORBIDDEN);
        }
        return new ResponseEntity<>(patchUsersRequest, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteRequest(@PathVariable("id") int id) {
        return new ResponseEntity<>(id, HttpStatus.NO_CONTENT);
    }
}