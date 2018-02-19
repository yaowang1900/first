package cn.itcast.babasport.service.brand;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.itcast.babasport.mapper.product.BrandMapper;
import cn.itcast.babasport.pojo.page.Pagination;
import cn.itcast.babasport.pojo.product.Brand;
import cn.itcast.babasport.pojo.product.BrandQuery;
import cn.itcast.babasport.service.product.BrandService;
@Service("brandService")
public class BrandServiceImpl implements BrandService {

	@Autowired
	private BrandMapper brandMapper;
	
	/**
	 * 查询不分页
	 */
	@Override
	public List<Brand> selectBrandsNoPage(String name, Integer isDisplay) {
		//1.创建brandQuery,用来封装查询条件
		BrandQuery brandQuery = new BrandQuery();
		if(name!=null&&"".equals(name)) {
			brandQuery.setName(name);
		}
		if(isDisplay!=null) {
			brandQuery.setIsDisplay(isDisplay);
		}
		List<Brand> brands = brandMapper.selectBrandsNoPage(brandQuery);
		return brands;
	}

	/**
	 * 查询分页
	 */
	@Override
	public Pagination selectBrandsHavePage(String name, Integer isDisplay, Integer pageNo) {
		//1.创建brandQuery,用来封装查询条件
		BrandQuery brandQuery = new BrandQuery();
		StringBuilder params = new StringBuilder();
		if(name != null && !"".equals(name)) {
			brandQuery.setName(name);
			params.append("name=").append(name);//url?name=xxx
		}
		if(isDisplay != null) {
			brandQuery.setIsDisplay(isDisplay);
			params.append("isDisplay=").append(isDisplay);//url?name=xxx&isDisplay=xxx
		}
		brandQuery.setPageNo(Pagination.cpn(pageNo));
		brandQuery.setPageSize(4);
		//2.根据条件查询
		List<Brand> list = brandMapper.selectBrandsHavePage(brandQuery);
		int totalCount = brandMapper.selectBrandCount(brandQuery);
		//3.创建分页对象并填充数据
		Pagination pagination = new Pagination(brandQuery.getPageNo(),brandQuery.getPageSize(), totalCount,list);
		//4.构建分页工具栏
		String url = "/brand/list.do";
		pagination.pageView(url, params.toString());
		return pagination;
	}

	/**
	 * 根据主键查询
	 */
	@Override
	public Brand selectBrandById(Long id) {
		return brandMapper.selectBrandById(id);
	}

	
}
