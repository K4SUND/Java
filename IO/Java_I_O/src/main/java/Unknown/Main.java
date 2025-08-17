package Unknown;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;


public class Main {
    public static void main(String[] args)  {
        String fileName = "testing.csv";
        //Paths - class
        //get - static method of Paths class
        Path path = Paths.get(fileName);
        System.out.println(path);
        // Files- class
        //readAllLines - static method of Files class
        //have to handle exception
        //Unhandled exception: java.io.IOException
        //1. method signature  (but this is main method)  :: throws IOException
        try{
            //first time that file accessing : then here it throws error because until now
            //there is no csv file

            List<String> lines = Files.readAllLines(path);
        }catch (IOException e){
            //put it in to RTE
            //here e = NoSuchFileException
            throw new RuntimeException(e);
        }
    }
}