package com.lanshiqin.producerservice.core.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 资源控制器
 * 用来演示不同角色访问该控制器的接口返回的信息
 */
@RestController
@RequestMapping("/resources")
public class ResourceController {

    /**
     * 只有 ROLE_USER 角色的用户才能访问
     * @return 问候信息
     */
    @GetMapping("/hello")
    @PreAuthorize("hasRole('ROLE_USER')")
    public String helloUser(){
        return "hello User!";
    }

    /**
     * 只有 ROLE_ADMIN 角色的用户才能访问
     * @return 问候信息
     */
    @GetMapping("/admin")
    @PreAuthorize("hasRole('ROLE_ADMIN')")
    public String helloAdmin(){
        return "hello Admin";
    }

    /**
     * 只有 ROLE_GUEST 角色的用户才能访问
     * @return 问候信息
     */
    @GetMapping("/guest")
    @PreAuthorize("hasRole('ROLE_GUEST')")
    public String helloGuest(){
        return "hello Guest";
    }

}
