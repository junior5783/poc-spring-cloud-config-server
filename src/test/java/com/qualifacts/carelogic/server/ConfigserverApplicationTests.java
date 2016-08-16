package com.qualifacts.carelogic.server;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;

import com.qualifacts.carelogic.server.ConfigserverApplication;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ConfigserverApplication.class)
@WebAppConfiguration
public class ConfigserverApplicationTests {

	@Test
	public void contextLoads() {
	}

}
