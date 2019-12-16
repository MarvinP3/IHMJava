package com.orange.ihm_eclipse.GENOS;
import com.orange.ihm_eclipse.GENOS.web.controller.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class GenosApplicationTests {

	@Test
	void contextLoads() {
	}
    
	@Test
	void testHelloWorld() {
		
		
		HelloWorld helloWorld;		
		assertEquals("Hello World", "Hello World" );

	}
}

