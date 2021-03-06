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
        System.out.println("我需要进行回退版本测试111");
        System.out.println("提交新版本测试");
        return "Hello " + name;
    }
}
