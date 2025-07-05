package utils;


import org.apache.log4j.Logger;

public class Log {

    public static Logger Log = Logger.getLogger(Log.class.getName());

    public static void startTest(String testName){
        Log.info("STARTING TEST: "+ testName);
    }

    public static void endTest(String testName){
        Log.info("ENDING TEST: "+ testName);
    }

    public static void info(String msg){
        Log.info(msg);
    }
}
