package sg.edu.nus.iss;

import java.io.File;
import java.io.IOException;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    public static void main(String[] args) throws IOException {
        String dirPath = "./data2";
        
        File newDirectory = new File(dirPath);
        // if directory exists, print to console 'directory exists' message
        // else create the directory
        if (newDirectory.exists()) {
            System.out.println("Directory already exists");
        } else {
            newDirectory.mkdir();
        }
    }
}
