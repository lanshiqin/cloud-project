package com.lanshiqin.consumerservice.core.controller;

import com.lanshiqin.consumerservice.core.remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Hello控制器
 */
@RestController
public class HelloController {

    @Autowired
    private HelloRemote helloRemote;  // 远程调用接口

    /**
     * 输出hello方法
     * @param name 名称
     * @return 远程调用返回值
     */
    @RequestMapping(value = "/hello/{name}")
    public String hello(@PathVariable(value = "name") String name){
        return helloRemote.hello(name);
    }
}
