package cn.controller;

import cn.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class IndexController {
    @Autowired
    private IndexService Service;


    @RequestMapping(value = "/getService", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public int getService() {
        System.out.println("getService..");
        return 1;
    }


}
