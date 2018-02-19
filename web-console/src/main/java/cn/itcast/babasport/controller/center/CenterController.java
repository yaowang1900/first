package cn.itcast.babasport.controller.center;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 
 * @author yaowa
 *
 */
@Controller
@RequestMapping("/center")
public class CenterController {
	
	/*
	 * 
	 * 访问后台系统首页
	 */
	@RequestMapping("index.do")
	public String index() {
		return "index";
	}
	
	/**
	 * 访问后台系统顶端
	 * @return
	 */
	@RequestMapping("top.do")
	public String top() {
		return "top";
	}
	
	/**
	 * 访问后台系统主要
	 * @return
	 */
	@RequestMapping("main")
	public String main() {
		return "main";
	}
	
	/**
	 * 访问后台系统左页
	 * @return
	 */
	@RequestMapping("left")
	public String left() {
		return "left";
	}
	
	/**
	 * 访问后台系统能够右页
	 * @return
	 */
	@RequestMapping("right")
	public String right() {
		return "right";
	}
	
	
}
