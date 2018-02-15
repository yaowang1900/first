package cn.itcast.babasport.controller.frame;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/frame")
public class FrameController {
	
	@RequestMapping("/product_main.do")
	public String product_main() {
		return "frame/product_main";
	}
	
	@RequestMapping("/product_left.do")
	public String public_left() {
		return "frame/product_left";
	}
	
}
