package com.example.SpringProject_2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Logger1 {
    private static final Logger logger = LoggerFactory.getLogger(Logger1.class);

    public static void main(String[] args) {
        logger.debug("Debug message: Logger1 is running in DEBUG mode!");
        logger.info("Info message: Logger1 is running in INFO mode!");
    }
}
