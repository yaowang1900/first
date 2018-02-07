package cn.itcast.babasport.controller.test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BbsTestController {

	@RequestMapping("test.do")
	public String test(){
		return "test";
		
	}
	
}
