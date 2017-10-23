package com.lanshiqin.producerservice.core.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 读取配置中心的配置测试控制器
 * @ RefreshScope 注解会在配置中心配置改变的时候 手动访问本项目的/refresh路径，就会实现自动刷新配置文件,重新加载配置文件中的数据
 */
@RestController
@RefreshScope
public class InfoController {

    @Value("${app.info}")
    private String info;    // 注入app.info的值（本地配置文件没有这个配置，该配置从配置中心读取）

    /**
     * 输出 变量值
     * @return 变量值
     */
    @RequestMapping("/appInfo")
    public String info(){
        return info;
    }
}
