package com.nf.action;

import com.nf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class StudentAction {

    @Autowired
    private StudentService studentService;
    @ResponseBody
    @RequestMapping("stuAll")
    private List getAllStudent() {
        return studentService.getAllStudents();
    }
    @RequestMapping("/index")
    private String rk(){
        return "index";
    }
}
