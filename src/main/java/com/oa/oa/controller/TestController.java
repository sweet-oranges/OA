package com.oa.oa.controller;

import com.oa.oa.bean.SendTable;
import com.oa.oa.service.SendTableService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;

/**
 * 测试
 *
 * @Author zxl on 2019/10/16
 */
@CrossOrigin
@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    private SendTableService sendTableService;


    @RequestMapping("/test")
    public List getAll(HttpServletRequest request)throws Exception{
        Enumeration<?> e = request.getParameterNames();
        System.out.println(request);
        while (e.hasMoreElements()){
            String name = (String)e.nextElement();
            String value = request.getParameter(name);
            System.out.println(name + "=" + value);
        }
//        System.out.println("title:"+map.get("title"));
        return sendTableService.getAll();
    }
}