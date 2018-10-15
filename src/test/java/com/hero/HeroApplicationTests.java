package com.hero;

import com.hero.rabbit.MsgProducer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class HeroApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Autowired
	private MsgProducer sendMsg;

	@Test
	public void sendAndReceive_2(){
		sendMsg.sendMsg("瞎卡拉卡");
	}



}
