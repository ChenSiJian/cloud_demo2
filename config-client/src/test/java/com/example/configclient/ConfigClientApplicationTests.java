package com.example.configclient;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConfigClientApplicationTests {

	private static IdWorker idWorker = new IdWorker(-1, -1);

	@Test
	public void contextLoads() {


		System.out.println(idWorker.nextId());

	}

}
