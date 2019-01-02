package com.sai.logdemo.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: 典型用法
 *
 * @date: 2018/12/24
 **/
public class TypicalUsage {

    public static final Logger logger = LoggerFactory.getLogger(TypicalUsage.class);

    public static void main(String[] args) {

        String name = "foo";

        //普通拼接构造
        logger.info("Hi " + name);

        //判断拼接构造
        if (logger.isInfoEnabled()) {
            logger.info("Hi " + name);
        }

        //参数化构造
        logger.info("Hi {}",name);

    }
}
