package com.lunchrecommend;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequiredArgsConstructor
public class LunchController {

    private final LunchService lunchService;

    @PostMapping("/lunch")
    private ResponseEntity<String> searchLunch(HttpServletRequest request) {
        String latitude = request.getParameter("latitude");
        String longitude = request.getParameter("longitude");

        ResponseEntity response = lunchService.getSearchLunchList(latitude, longitude, 1, 15);
        return response;
    }

    @PutMapping("/lunch")
    private ResponseEntity<String> updateLunch() {
        ResponseEntity response = ResponseEntity.status(HttpStatus.OK).body("PutMapping!!");
        return response;
    }

    @DeleteMapping("lunch")
    private ResponseEntity<String> deleteLunch() {
        ResponseEntity response = ResponseEntity.status(HttpStatus.NO_CONTENT).body("DeleteMapping!!");
        return response;
    }

}
