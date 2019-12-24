package cn.liyu.dubboprovider.service.impl;

import cn.liyu.dubbointerface.HelloService;
import org.springframework.stereotype.Service;

/**
 * @author liyu
 * @date 2019/12/24 10:42
 * @description
 */
@Service//spring的Service
@com.alibaba.dubbo.config.annotation.Service //dubbo的Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String sayHello(String name) {
        return "hello "+name;
    }
}
