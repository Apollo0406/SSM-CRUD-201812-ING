package com.test;


import com.bean.Student;
import com.github.pagehelper.PageInfo;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

//Spring4测试的时候，需要servlet3.0的支持

//测试CRUD请求的正确性
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@ContextConfiguration(locations = {"classpath:applicationContext.xml","file:src/main/webapp/WEB-INF/dispatcherServlet-servlet.xml"})
public class MvcTest {
    //传入SpringMvc的ioc
    @Autowired
    WebApplicationContext context;

    //虚拟mvc请求，获取到处理结果
    MockMvc mockMvc;

    @Before
    public void initMokcMvc(){
       mockMvc = MockMvcBuilders
               .webAppContextSetup(context)
               .build();
    }

    @Test
    public void testPage() throws Exception{
        //模拟请求并拿到返回值
         MvcResult result = mockMvc
                 .perform(MockMvcRequestBuilders
                 .get("/stus")
                 .param("pn","1"))
                 .andReturn();

        //请求成功以后，请求与中会有pageInfo,可以取出pageInfo进行验证
        MockHttpServletRequest request = result.getRequest();
        PageInfo pi = (PageInfo) request.getAttribute("pageInfo");
        System.out.println("当前页码："+pi.getPageNum());
        System.out.println("总页码："+pi.getPages());
        System.out.println("总记录数："+pi.getTotal());
        System.out.println("在页面需要连续显示的页码");
        int[] nums = pi.getNavigatepageNums();
        for(int i : nums){
            System.out.print(" "+i);
        }

        //获取学生数据
        List<Student> list = pi.getList();
        for(Student s : list){
            System.out.println("ID:"+s.getStuId()+"==>Name:"+s.getStuName()+"==>Sex:"+s.getStuSex()+"==>Coun_id:"+s.getStuCounId()+"==>Major_id"+s.getStuMajorId()+"==>Uni_id:"+s.getStuUniId());
        }
    }
}
