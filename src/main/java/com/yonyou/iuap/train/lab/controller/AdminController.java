package com.yonyou.iuap.train.lab.controller;

import com.yonyou.iuap.train.lab.config.SystemConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AdminController {
    Logger logger= LoggerFactory.getLogger(SystemConfig.SYSTEM_LOG_NAME);
    @RequestMapping("/admin")
    public String index(){
        
        return "templates/admin/index";
    }
}
