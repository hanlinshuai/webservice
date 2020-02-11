package com.hanlin.service.impl;

import com.hanlin.service.HelloService;

/**
 * @author:hanlin.yuan
 * @date:2020/2/10
 */
public class HelloServiceImpl implements HelloService {

    @Override
    public String info(String name) {
        return "您好：" + name;
    }
}
