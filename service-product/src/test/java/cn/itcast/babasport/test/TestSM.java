package cn.itcast.babasport.test;

import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.itcast.babasport.mapper.test.BbsTestMapper;
import cn.itcast.babasport.pojo.test.BbsTest;
import cn.itcast.babasport.service.test.BbsTestService;


@ContextConfiguration(locations={"classpath:spring-config.xml"})
@RunWith(SpringJUnit4ClassRunner.class)
public class TestSM {
	@Resource
	private BbsTestMapper bbsTestMapper;
	
	@Resource
	private BbsTestService bbsTestService;
	
	/**
	 * 测试mybatis
	 */
	@Test
	public void testMybatis(){
		BbsTest bbsTest = new BbsTest();
		bbsTest.setName("nidaye");
		bbsTest.setBirthday(new Date());
		bbsTestService.insertBbsTest(bbsTest);
	}
	
	/**
	 * 测试spring管理service 的bean
	 */
	@Test
	public void testService(){
		BbsTest bbsTest = new BbsTest();
		bbsTest.setName("nierdaye");
		bbsTest.setBirthday(new Date());
		bbsTestService.insertBbsTest(bbsTest);
	}
	
	@Test
	public void testService1() {
		List<BbsTest> selectBbsTest = bbsTestService.selectBbsTest();
		System.out.println(selectBbsTest.toString()+"999999999");
	}
}
