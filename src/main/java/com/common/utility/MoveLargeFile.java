package com.common.utility;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class MoveLargeFile {

    //tested by moving a file of 2.6 gb
    public static void moveFile(String source, String destination) {
        Path sourcePath = Paths.get(source);
        Path destinationPath = Paths.get(destination);

        try {
            Files.move(sourcePath, destinationPath,
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String source       = "F:\\Programming\\Code\\Java\\dataFile\\source\\output.txt";
        String destination  = "F:\\Programming\\Code\\Java\\dataFile\\output\\Moved_Output.txt";
        moveFile(source,destination);

    }

}
