package com.mycompany.app;
import org.slf4j.*;
public class App{
    public static void main( String[] args ){
        System.out.println( "Hello World!" );
        Logger  logger = LoggerFactory.getLogger(App.class);
        logger.info("Hello world");
    }
}

