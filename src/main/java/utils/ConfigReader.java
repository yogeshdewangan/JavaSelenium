package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties prop;

    public static Properties getProp(){
        prop = new Properties();

        try{
            FileInputStream fip = new FileInputStream("src/test/resources/config.properties");
            prop.load(fip);
        }catch (IOException e){
            e.printStackTrace();
        }
        return prop;
    }
}
