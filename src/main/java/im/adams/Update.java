package im.adams;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import static java.lang.Thread.sleep;

public class Update {
    public static void main(String[] args) throws IOException, InterruptedException {
        sleep(1000);
        Files.copy(Path.of("CoolBot" + args[0] + ".jar"), Path.of("CoolBot.jar"), StandardCopyOption.REPLACE_EXISTING);
        Process process = Runtime.getRuntime().exec("java -jar CoolBot.jar");
    }
}