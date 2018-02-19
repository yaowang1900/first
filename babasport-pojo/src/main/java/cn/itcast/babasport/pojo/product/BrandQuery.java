package cn.itcast.babasport.pojo.product;

import java.io.Serializable;

/**
 * @author yaowa
 *
 */
public class BrandQuery implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5683725240066059656L;
	//1.查询条件
	private String name;//品牌名称
	private Integer isDisplay;//是否可用
	
	//2.分页属性
	private Integer startRow;	//起始行
	private Integer pageSize = 3;//每页显示条数
	private Integer pageNo = 1;  //当前页码
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getIsDisplay() {
		return isDisplay;
	}
	public void setIsDisplay(Integer isDisplay) {
		this.isDisplay = isDisplay;
	}
	public Integer getStartRow() {
		return startRow;
	}
	public void setStartRow(Integer startRow) {
		this.startRow = startRow;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.startRow = (pageNo - 1) * pageSize;
		this.pageSize = pageSize;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.startRow = (pageNo - 1) * pageSize;
		this.pageNo = pageNo;
	}
	
}
