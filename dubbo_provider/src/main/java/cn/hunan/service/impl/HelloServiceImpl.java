package cn.hunan.service.impl;

import cn.hunan.service.HelloService;
import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;

@Service(interfaceClass = HelloService.class)
@Transactional
public class HelloServiceImpl implements HelloService {
    @Override
    public String sayHello(String name) {
        System.out.println("执行了sayHello方法");
        return "Hello " + name;
    }
}
