package com.terrell.application;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.terrell.application.MySpringWebPageApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = MySpringWebPageApplication.class)
@WebAppConfiguration
public class MySpringWebPageApplicationTests {

	@Test
	public void contextLoads() {
	}

}
