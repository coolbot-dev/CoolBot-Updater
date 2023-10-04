package im.adams;

import java.io.IOException;
import java.nio.file.CopyOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

import static java.lang.Thread.sleep;

public class Update {
    public static void main(String[] args) throws IOException, InterruptedException {
        sleep(10);
        Files.copy(Path.of("CoolBot" + args[0] + ".jar"), Path.of("CoolBot.jar"), StandardCopyOption.REPLACE_EXISTING);
        Runtime.getRuntime().exec("java -jar CoolBot.jar");
        sleep(10000);
        Files.delete(Path.of("CoolBot" + args[0] + ".jar"));
    }
}