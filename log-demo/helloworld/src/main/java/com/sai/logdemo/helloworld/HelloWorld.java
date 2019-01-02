package com.sai.logdemo.helloworld;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @Description: demo
 *
 * @date: 2018/12/24
 **/
public class HelloWorld {

    public static final Logger logger = LoggerFactory.getLogger(HelloWorld.class);

    public static void main(String[] args) {
        logger.info("Hello World");
    }
}
