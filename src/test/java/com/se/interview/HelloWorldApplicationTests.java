package com.se.interview;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ActiveProfiles(profiles = "dev")
@SpringBootTest(classes = HelloWorldApplication.class)
@WebAppConfiguration
public class HelloWorldApplicationTests
{

	@Test
	public void contextLoads()
	{
	}
}
