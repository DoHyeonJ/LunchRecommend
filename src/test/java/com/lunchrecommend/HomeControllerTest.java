package com.lunchrecommend;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

class HomeControllerTest {

    private MockMvc mockMvc;

    @DisplayName("HOME VIEW")
    @Test
    public void homeView() throws Exception{
        mockMvc.perform(get("/"));
    }


}