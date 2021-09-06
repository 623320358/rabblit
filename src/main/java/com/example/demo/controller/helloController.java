package com.example.demo.controller;

import com.example.demo.bean.InteractBean;
import com.example.demo.service.InteractService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by RABBIT on 2021/9/2.
 */
@Controller
public class helloController {

    @Autowired
    InteractService interactService;

    @RequestMapping("123")
    public String sayQL()
    {
        return "123";
    }

    @RequestMapping(value ="/login",method=RequestMethod.POST)
    public String login(String name,String problem)
    {
        InteractBean interactBean=interactService.getInfo(name,problem);
        if (interactBean!=null)
        {
            return interactBean.getCompany();

        }
        else
        {
            return "false";
        }

    }
}

