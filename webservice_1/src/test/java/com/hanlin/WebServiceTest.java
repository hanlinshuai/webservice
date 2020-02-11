package com.hanlin;

import com.hanlin.service.impl.HelloServiceImpl;
import org.apache.cxf.jaxws.JaxWsServerFactoryBean;

/**
 * @author:hanlin.yuan
 * @date:2020/2/10
 */
public class WebServiceTest {

    public static void main(String[] args) {

        JaxWsServerFactoryBean bean = new JaxWsServerFactoryBean();

        // 设置服务地址
        bean.setAddress("http://localhost:8000/ws/hello");

        // 设置服务类
        bean.setServiceBean(new HelloServiceImpl());

        // 发布服务
        bean.create();
    }
}
