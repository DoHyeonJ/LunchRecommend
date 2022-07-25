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

    /**
     * 음식점 추천 List Post 요청
     * @param request 요청 데이터
     * @return ResponseEntity
     */
    @PostMapping("/lunch")
    private ResponseEntity<String> searchLunch(HttpServletRequest request) {
        String latitude = request.getParameter("latitude");
        String longitude = request.getParameter("longitude");
        String page = request.getParameter("page");

        return lunchService.getSearchLunchList(latitude, longitude, page, "15");
    }

    @PutMapping("/lunch")
    private ResponseEntity<String> updateLunch() {
        return ResponseEntity.status(HttpStatus.OK).body("PutMapping!!");
    }

    @DeleteMapping("lunch")
    private ResponseEntity<String> deleteLunch() {
        return ResponseEntity.status(HttpStatus.NO_CONTENT).body("DeleteMapping!!");
    }

}
