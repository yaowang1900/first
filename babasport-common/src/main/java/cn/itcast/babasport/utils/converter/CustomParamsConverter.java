package cn.itcast.babasport.utils.converter;

import org.springframework.core.convert.converter.Converter;

/**
 * 类型转换器：去掉查询条件的空格
 * @author yaowa
 *
 */
public class CustomParamsConverter implements Converter<String ,String> {

	@Override
	public String convert(String source) {
		if(source != null && "".equals(source)) {
			source = source.trim();
			//输入一个空格，变成空串
			if(!"".equals(source)) {
				return source;
			}
		}
		return null;
	}

}
