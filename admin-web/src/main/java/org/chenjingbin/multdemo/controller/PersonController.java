package org.chenjingbin.multdemo.controller;

import org.chenjingbin.multdemo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author chenjb
 * @email 764024742@qq.com
 * @date 2019/7/23 15:07
 */
@Controller
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/test.do")
    @ResponseBody
    public String get(){
        System.out.println(personService.selectPersonList());
        return "test";
    }
}
