package com.icici.spring_web_app_docker;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
class SpringWebAppDockerApplicationTests {

	@Autowired
    private MockMvc mockMvc;


	// write test case for controller class
	@Test
	public void testHelloWorld() throws Exception {
	    mockMvc.perform(get("/hello"))
	           .andExpect(status().isOk())
	           .andExpect(content().string("Hello, World!"));
	}

	@Test
	public void sampleTest() {
	    // Sample test case to ensure the context loads
		assertTrue(true);
	}
	
		

}
