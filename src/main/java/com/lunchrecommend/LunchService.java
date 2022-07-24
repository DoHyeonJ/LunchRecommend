package com.lunchrecommend;

import org.springframework.http.*;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class LunchService {

    // 좌표기준 음식점 데이터 조회
    public ResponseEntity<String> getSearchLunchList(String longitude, String latitude, int page, int size) {
        HttpHeaders headers = new HttpHeaders();
        headers.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
        headers.setContentType(MediaType.APPLICATION_JSON);
        headers.set("Authorization", "KakaoAK f66d5d626664079ae9aceadae18273fa");

        HttpEntity<String> entity = new HttpEntity<>("", headers);

        String baseUrl = "https://dapi.kakao.com/v2/local/search/category.json?" +
                "category_group_code=FD6" +
                "&page=" + page +
                "&size="+ size +
                "&sort=accuracy&x=" + longitude +
                "&y=" + latitude;

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<String> response = restTemplate.exchange(baseUrl, HttpMethod.GET, entity, String.class);

        return response;
    }

}
