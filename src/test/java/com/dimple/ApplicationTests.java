package com.dimple;

import com.dimple.framework.security.service.SysLoginService;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Vincent.M
 * @mail mengshaojie@188.com
 * @date 2020/1/10
 * @copyright ©2018 孟少杰 All Rights Reserved
 * @desc
 */
@Ignore
@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    SysLoginService sysLoginService;

    @Test
    public void test(){
        sysLoginService.login("admin","123456","8sn4","926ed7b290a34c3a9cb6aad1638dd1bb");
    }
}
