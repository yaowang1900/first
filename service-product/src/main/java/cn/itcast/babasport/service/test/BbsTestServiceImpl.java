package cn.itcast.babasport.service.test;



import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.babasport.mapper.test.BbsTestMapper;
import cn.itcast.babasport.pojo.test.BbsTest;
import cn.itcast.babasport.service.test.BbsTestService;

@Service
public class BbsTestServiceImpl implements BbsTestService {
	
	@Resource
	private BbsTestMapper bbsTestMapper;

	@Transactional
	@Override
	public void insertBbsTest(BbsTest bbsTest) {
		bbsTestMapper.insertBbsTest(bbsTest);
	}

}
