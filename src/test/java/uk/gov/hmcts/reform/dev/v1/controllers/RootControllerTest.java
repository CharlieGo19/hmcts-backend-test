package uk.gov.hmcts.reform.dev.v1.controllers;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.web.servlet.MockMvc;


@WebMvcTest(RootController.class)
public class RootControllerTest {

    private String rootMessage = "What're you doing up here, or down here... "
                               + "Wait, I'm confused, am I at the top, or the bottom?";

    @Autowired
    private MockMvc mockMvc;

    @Test
    void shouldReturnQuirkyMessage() throws Exception {
        mockMvc.perform(get("/")).andExpect(status().isOk()).andExpect(content().string(rootMessage));
    }
}
