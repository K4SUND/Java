package Unknown;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class ArithmeticException {
    private static void testFile(String fileName) {
        Path path = Paths.get(fileName);

        try{
            //read  data from text file
            List<String > lines = Files.readAllLines(path);
        } catch (IOException e) {
//            throw new RuntimeException(e);
            int i = 1/0;  // then here it throws Arithmetic Exception
        } finally {
            System.out.println("Finally clause");
        }
    }
    public static void main(String[] args) {
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
