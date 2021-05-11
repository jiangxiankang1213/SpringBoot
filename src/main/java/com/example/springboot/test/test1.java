package com.example.springboot.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @USER: Jiang-XK
 * @DESCRIPTION:
 * @DATE: 2021/1/15 11:40
 * @param:
 */

public class test1 {
    private static final Logger log = LogManager.getLogger(test1.class);

    public static void main(String[] args) {
        log.info("this is info log");
        log.error("this is error log");
        log.debug("this is debug log");
        log.warn("this is warn log");
        log.trace("this is trace log");
        log.fatal("this is fatal log");
    }
}
