package com.test;

import java.util.UUID;


import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.bean.Major;
import com.bean.Student;
import com.dao.MajorMapper;
import com.dao.StudentMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {
	
	@Autowired
	MajorMapper majorMapper;
	
	@Autowired
	StudentMapper studentMapper;
	
	@Autowired
	SqlSession sqlSession;
	
	/**
	 * 测试MajorMapper
	 */
	@Test
	public void testCRUD(){
		System.out.println(majorMapper);
		
		//1插入几个专业
    	majorMapper.insertSelective(new Major(4, "计算机科学"));
    	majorMapper.insertSelective(new Major(5, "通信工程"));
		
		//2插入学生信息
		//StudentMapper.insertSelective(new Student(null, "Jerry", "M", "Jerry@atguigu.com", 1));
		
		//3.批量插入学生信息测试
		/*StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
		for(int i = 0;i<5;i++){
			String uid = UUID.randomUUID().toString().substring(0,5)+i;
			mapper.insertSelective(new Student(null,uid, "M", uid+"@atguigu.com", 1));
		}
		System.out.println("批量插入结束");*/
		
	}

}
