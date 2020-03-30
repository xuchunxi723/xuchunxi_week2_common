package com.xuchunxi.common.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

public class PersonTest {
	//person测试类
	@Test
	public void personTest() throws ParseException {
		//循环创建10000次person对象并赋值
		for (int i = 0; i < 10000; i++) {
			Person p = new Person();
			p.setName(StringUtil.generateChineseName());
			p.setAge(RandomUtil.random(1, 120));
			p.setAbout(StringUtil.randomChineseString(140));
			int num =RandomUtil.random(20100101, 20200330);
			String nn = String.valueOf(num);
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Date date = sdf.parse(nn);
			p.setCreated(date);
			System.out.println(p);
		}
	}

}
