package cn.itcast.babasport.mapper.product;

import java.util.List;

import cn.itcast.babasport.pojo.product.Brand;
import cn.itcast.babasport.pojo.product.BrandQuery;

public interface BrandMapper {

	/**
	 * 品牌列表查询不分页
	 * @param brandQuery
	 * @return
	 */
	public List<Brand> selectBrandsNoPage(BrandQuery brandQuery);
	
	/**
	 * 品牌列表查询分页
	 * @param brandQuery
	 * @return
	 */
	public List<Brand> selectBrandsHavePage(BrandQuery brandQuery);
	
	/**
	 * 品牌列表的总条数
	 * @param brandQuery
	 * @return
	 */
	public int selectBrandCount(BrandQuery brandQuery);
	
	/**
	 * 根据主键查询品牌
	 * @param id
	 * @return
	 */
	public Brand selectBrandById(Long id);
	
}
