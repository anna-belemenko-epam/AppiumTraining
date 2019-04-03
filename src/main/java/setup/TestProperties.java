package setup;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class TestProperties {
    Properties currentProps = new Properties();

    protected Properties getCurrentProps(String propKey) throws IOException {
        FileInputStream in = new FileInputStream("C:\\AppiumTraining\\src\\main\\resources\\" + propKey);
        currentProps.load(in);
        in.close();
        return currentProps;
    }

    protected String getProperty(String propKey) {
        return currentProps.getProperty(propKey, null);
    }
}
