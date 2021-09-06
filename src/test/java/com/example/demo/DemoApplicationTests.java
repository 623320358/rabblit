package com.example.demo;

import com.example.demo.bean.InteractBean;
import com.example.demo.service.InteractService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Autowired
	InteractService interactService;

	@Test
 	public void contextLoads() {
		InteractBean interactBean=interactService.getInfo("qqqqq","qqqaq");
		System.out.print(interactBean.getCompany());
	}

}
