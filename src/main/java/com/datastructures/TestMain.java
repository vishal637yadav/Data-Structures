package com.datastructures;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestMain {
    private static final Logger logger = LoggerFactory.getLogger(TestMain.class);

    public static void main(String[] args) {
        logger.trace("|--------->>This is Main Class!!!!--<<<<---------logger :{}:|", logger);
        logger.debug("|--------->>This is Main Class!!!!--<<<<---------logger :{}:|", logger);
        logger.info("|--------->>This is Main Class!!!!--<<<<---------logger :{}:|", logger);
        logger.warn("|--------->>This is Main Class!!!!--<<<<---------logger :{}:|", logger);
        logger.error("|--------->>This is Main Class!!!!--<<<<---------logger :{}:|", logger);
        doStuff("Vishal");
    }

    public static void doStuff(final String value) {
        logger.trace("doStuff needed more information - {}", value);
        logger.debug("doStuff needed to debug - {}", value);
        logger.info("doStuff took input - {}", value);
        logger.warn("doStuff needed to warn - {}", value);
        logger.error("doStuff encountered an error with value - {}", value);
    }

}
