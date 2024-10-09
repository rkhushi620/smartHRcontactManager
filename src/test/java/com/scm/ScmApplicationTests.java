package com.scm;

import java.util.List;
import static org.assertj.core.api.Assertions.assertThat;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.scm.services.EmailService;

@SpringBootTest
class ScmApplicationTests {

	@Test
	void contextLoads() {
	}

	
	@Autowired
	private EmailService service;

	@Test
	void sendEmailTest() {
		service.sendEmail("khushbooranimuz2000@gmail.com", "Just managing the emails",
				"this is scm project working on email service");
	}

	@Test
	void testUnits() {
		
		
		int result=40;	
		
		 List<String>  list = List.of("ram","shyam","ankit");
		
//		assertThat(result).isEqualTo(50);
		 
		 assertThat(list).asList().size().isGreaterThan(5);
		
		
}
}