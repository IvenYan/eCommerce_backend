package com.management.backend;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagementApplicationTests {

	@Test
	public void contextLoads() {
		System.out.println("sss"+10000%100);

		String str1="ABCDEFG";
		str1.substring(3);
		str1.concat("123");
		System.out.println(str1);
		String abcdefg = new String("ABCDEFG");
		System.out.println(str1==abcdefg);

	}


}
