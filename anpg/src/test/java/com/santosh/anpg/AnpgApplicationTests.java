package com.santosh.anpg;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;
import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootTest
@AutoConfigureMockMvc
class AnpgApplicationTests {

	
	@Autowired
	private MockMvc mockMvc;

	@Test
	void contextLoads() {
	}

	@Test
	void validatePhoneNumber7() {
		String phoneNumber = "5026814076";
		assertEquals(true, phoneNumber.matches("^[1-9](([0-9]{6})|([0-9]{9}))$"));
	}

	@Test
	public void callRestAPI() throws Exception {
		ObjectMapper objectMapper = new ObjectMapper();
		MvcResult result = mockMvc.perform(MockMvcRequestBuilders.get("/phone/5026814076")).andReturn();
		Map<Integer, List<String>> resultMap = objectMapper.readValue(result.getResponse().getContentAsString(),
				Map.class);
		assertNotNull(resultMap);
	}

}
