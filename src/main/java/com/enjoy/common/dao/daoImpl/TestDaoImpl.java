package com.enjoy.common.dao.daoImpl;/**
 * TODO
 *
 * @author 谢树树
 * @date 30/7/2022 上午11:35
 */

import com.enjoy.common.dao.TestDao;
import org.springframework.stereotype.Service;

@Service
public class TestDaoImpl implements TestDao {
    @Override
    public void sayHello() {
        System.out.println("testDao Hello World!");
    }
}
