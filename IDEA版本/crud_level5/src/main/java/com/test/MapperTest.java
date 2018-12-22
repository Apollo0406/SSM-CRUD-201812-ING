package com.test;

import com.bean.Country;
import com.bean.Student;
import com.dao.CountryMapper;
import com.dao.StudentMapper;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.UUID;

//测试DAO层的工作
/*注释掉的是基础的方式,spring则可以用SPring的单元测试（使用注解）
1.引入spring test的依赖
2.@Configuration指定Spring的配置文件位置
3.@Autowired需要注入的类(组件)
*/

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:applicationContext.xml"})
public class MapperTest {

    @Autowired
    CountryMapper countryMapper;
    @Autowired
    StudentMapper studentMapper;
    @Autowired
    SqlSession sqlSession;

    //测试CountryMapper
    @Test
    public void  testCrud(){
        /*//1.创建Spring的IOC容器
        ApplicationContext ioc = new ClassPathXmlApplicationContext("applicationContext.xml");
        //2.从容其中获取mapper
        ioc.getBean(CountryMapper.class);
        */
        System.out.println(countryMapper);
        //1.插入几个国别
       countryMapper.insertSelective(new Country("中国"));
       countryMapper.insertSelective(new Country("英国"));
       countryMapper.insertSelective(new Country("美国"));

        //2.生成学生数据,测试学生插入
        studentMapper.insertSelective(new Student(null,"张晋","男",1,2,1));

        //3.批量插入多个学生
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        for(int i = 0;i < 1000;i++){
            String uid = UUID.randomUUID().toString().substring(0,5)+i;
            mapper.insertSelective(new Student(null,uid,"男",1,2,3));
        }

    }
}
