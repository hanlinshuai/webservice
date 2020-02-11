package com.hanlin.service;

import javax.jws.WebService;

/**
 * webservice服务接口
 * @author:hanlin.yuan
 * @date:2020/2/10
 */
@WebService
public interface HelloService {
    /**
     * 服务接口
     * @param name
     * @return
     */
    String info(String name);

}
