package cn.itcast.babasport.service.product;

import java.util.List;

import cn.itcast.babasport.pojo.page.Pagination;
import cn.itcast.babasport.pojo.product.Brand;

public interface BrandService {
	/**
	 * 品牌列表查询不分页
	 * @param name
	 * @param isDisplay
	 * @return
	 */
	public List<Brand> selectBrandsNoPage(String name ,Integer isDisplay);
	
	/**
	 * 品牌列表查询分页
	 * @param name
	 * @param isDisplay
	 * @param pageNo
	 * @return
	 */
	public Pagination selectBrandsHavePage(String name ,Integer isDisplay ,Integer pageNo);
	
	/**
	 * 根据主键查询
	 * @param id
	 * @return
	 */
	public Brand selectBrandById(Long id);
	
}
