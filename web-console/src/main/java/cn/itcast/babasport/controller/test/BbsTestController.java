package cn.itcast.babasport.controller.test;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.itcast.babasport.service.test.BbsTestService;


@Controller
public class BbsTestController {
	
	/*@Resource
	private BbsTestService bbsTestService;*/
	@Resource
	private BbsTestService bbsTestService;
	

	@RequestMapping("test.do")
	public String test(){
		return "test";
		
	}
	
}
