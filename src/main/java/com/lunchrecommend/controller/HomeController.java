package com.lunchrecommend.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    // 카카오 API 키 (application.properties 설정)
    @Value("${appkey.kakao}")
    private String appKey;

    @GetMapping("/")
    public String index(Model model) {
        String appKeyScript = "//dapi.kakao.com/v2/maps/sdk.js?appkey=" + appKey + "&libraries=services";
        model.addAttribute("appKey", appKeyScript);
        return "index.html";
    }

}
