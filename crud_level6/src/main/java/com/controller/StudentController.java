package com.controller;

import com.bean.Student;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

//处理学生的CRUD请求
@Controller
public class StudentController {

    @Autowired
    StudentService studentService;
    //查询学生数据（分页查询）
    @RequestMapping("/stus")
    public String getStu(@RequestParam(value = "pn",defaultValue = "1")Integer pn,Model model){
        //目标要实现分页查询 PageHelper分页插件
        //在查询之前只需要调用
        PageHelper.startPage(pn,5);
        //startPage后面紧跟的这个查询就是一个分页查询
        List<Student> stus = studentService.getAll();
        //使用PageInfo包装查询结果
        PageInfo page = new PageInfo(stus,5);
        model.addAttribute("pageInfo",page);
        return "list";
    }
}
