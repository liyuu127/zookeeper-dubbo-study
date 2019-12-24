package cn.liyu.dubboconsumer.controller;

import cn.liyu.dubbointerface.HelloService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liyu
 * @date 2019/12/24 11:12
 * @description
 */
@RestController
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/hello")
    public String hello() {
        String hello = helloService.sayHello("world");
        System.out.println(helloService.sayHello("liyu"));
        return hello;
    }
}
