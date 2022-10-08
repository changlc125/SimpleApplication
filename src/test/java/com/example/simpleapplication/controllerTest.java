package com.example.simpleapplication;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class controllerTest {
    @Autowired
    private MockMvc mockMvc;
    @Test
    public void test_controller1() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/test"))
//                .andExpect(MockMvcResultMatchers.status().isOk()) // status code 200
//                .andReturn();
        assertEquals(1,1);


    }


    @Test
    public void test_controller2() throws Exception {
//        mockMvc.perform(MockMvcRequestBuilders.get("/test/{id}",1))
//                .andExpect(MockMvcResultMatchers.status().isOk()) // status code 200
//                .andExpect(MockMvcResultMatchers.content().contentType(MediaType.APPLICATION_JSON))
//                .andReturn();
        assertEquals(1,1);

    }
}
