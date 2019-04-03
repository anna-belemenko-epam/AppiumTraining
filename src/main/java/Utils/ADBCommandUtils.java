package Utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Runtime.*;

public class ADBCommandUtils {

    public static Boolean execAndShowStatus(String deviceId, String command) throws IOException {
        Boolean isKeyBoardShown = false;
        Process process = null;
        String commandString;
        if(deviceId != null) {
            commandString = String.format("adb -s " + deviceId + " shell " + command);
        }else
            commandString = String.format("adb shell " + command);
        System.out.print("Command is "+commandString+"\n");
        try {
            process = getRuntime().exec(commandString);
        } catch (IOException e) {
        }
        BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
        String line;
        while ((line = reader.readLine()) != null) {
            if (line.contains("mInputShown=true")){
                isKeyBoardShown = true;
            }
            System.out.print(line+"\n");
        }
        return isKeyBoardShown;
    }
}
