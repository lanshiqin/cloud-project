package com.lanshiqin.consumerservice.core.remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 熔断回调类
 * 继承feign远程调用接口，并在实现方法中输出回调的信息
 */
@Component
public class HelloRemoteFallback implements HelloRemote {

    /**
     * 远程调用失败，将会回调该方法
     * @param name 名称
     * @return 自定义返回信息
     */
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello " + name + ", this message is failed";
    }
}
