package cn.itcast.babasport.controller.brand;

import java.util.List;

import javax.annotation.Resource;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.itcast.babasport.pojo.page.Pagination;
import cn.itcast.babasport.pojo.product.Brand;
import cn.itcast.babasport.service.product.BrandService;

@Controller
@RequestMapping("/brand")
public class BrandController {

	@Resource
	private BrandService brandService;
	
	@RequestMapping("/list.do")
	public String list(String name ,@RequestParam(defaultValue="1") Integer isDisplay, Integer pageNo, Model model) {
		//List<Brand> brands = brandService.selectBrandsNoPage(name, isDisplay);
		Pagination pagination = brandService.selectBrandsHavePage(name, isDisplay, pageNo);
		model.addAttribute("pagination", pagination);
		//查询条件回显
		model.addAttribute("name", name);
		model.addAttribute("isDisplay", isDisplay);
		return "brand/list";
	}
	@RequestMapping("/edit.do")
	public String edit(Long id ,Model model) {
		Brand brand = brandService.selectBrandById(id);
		model.addAttribute("brand", brand);
		return "brand/edit";
		
	}
}
