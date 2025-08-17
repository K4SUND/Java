package Unknown;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileEx {

    /*
    private static void testFile(String fileName) {
        Path path = Paths.get(fileName);
        try{
            List<String> lines = Files.readAllLines(path);
        }catch (IOException e)
        {
            throw new RuntimeException(e);
        }finally {
            System.out.println("Final is always execute whether try or catch fail");
        }
    }

     */

    private static void testFile(String fileName) throws IOException {
        Path path = Paths.get(fileName);

        try{
        List<String > lines = Files.readAllLines(path);
        }finally {
            System.out.println("Finally clause");
        }
    }
    public static void main(String[] args) throws IOException {
        String fileName = "testingFileName.csv";
        testFile(fileName);    //here exception returns, so the below part is not executing
//        Path path = Paths.get(fileName);

        //**not creating file from here
        File file = new File(fileName);

        if(!file.exists())
        {
            System.out.println("File not exists");
            return;
        }
        System.out.println("File exists");
    }

}
