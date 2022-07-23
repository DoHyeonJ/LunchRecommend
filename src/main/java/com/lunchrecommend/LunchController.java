package com.lunchrecommend;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

@Controller
public class LunchController {

    // TODO : REST API 구현필요
    @PostMapping("/lunch")
    private ResponseEntity<String> searchLunch() {
        ResponseEntity response = ResponseEntity.status(HttpStatus.CREATED).body("PostMapping!!");;
        return response;
    }

    @PutMapping("/lunch")
    private ResponseEntity<String> updateLunch() {
        ResponseEntity response = ResponseEntity.status(HttpStatus.OK).body("PutMapping!!");;
        return response;
    }

    @DeleteMapping("lunch")
    private ResponseEntity<String> deleteLunch() {
        ResponseEntity response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("DeleteMapping!!");;
        return response;
    }

}
