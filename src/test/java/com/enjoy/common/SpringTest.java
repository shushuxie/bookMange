package com.enjoy.common;

import com.enjoy.common.dao.TestDao;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * TODO
 *
 * @author 谢树树
 * @date 30/7/2022 上午11:32
 */
public class SpringTest {

    @Test
    public void demo(){
        System.out.println("hello world");
        //初始化Spring容器ApplicationContext，加载配置文件
        ApplicationContext application = new ClassPathXmlApplicationContext("applicationContext.xml");
        //通过容器获取testDao实例
        TestDao testDao = (TestDao) application.getBean("testDao");
        testDao.sayHello();

    }
}
