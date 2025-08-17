package Unknown;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class TryWithResources {

    private static void testFile(String fileName) {
        Path p = Paths.get(fileName);
        try {
            List<String> lines = Files.readAllLines(p);

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally clause");
        }
    }

    //filereader use for read the file
    private static void testFile2(String fileName) {

        // here because of access it in finally block
        // if this in try block, can't access by in finally block

        FileReader reader = null;

        try {
            //here it suggest to use try with resources
            //otherwise this resources should be implicitly close in the finally block
//            FileReader reader = new FileReader(fileName);

            reader = new FileReader(fileName);
        } catch (IOException e) {
            System.out.println("not file to read");
            throw new RuntimeException(e);
        } finally {
            System.out.println("Finally clause");
            //first check if there is a file
            if (fileName != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            }
        }
    }


    //filereader use for read the file
    // ** imp
    //try with resource use here
    //auto closing

    private static void testFile3(String fileName) {

        try (FileReader reader = new FileReader(fileName)) {
        } catch (FileNotFoundException e) {
            //catch when open
            System.out.println("File " + fileName + " not found");
            throw new RuntimeException(e);
        } catch (IOException e) {
            //catch other times : when close,...
            throw new RuntimeException(e);
        } catch (NullPointerException | IllegalArgumentException e){
            System.out.println("bad data "+e.getMessage());
        }catch (Exception e) {
            // here it is catching unrelated to IO exceptions
            System.out.println("Exception caught" + e.getMessage());
        } finally {
            //no need the finally block to close.
            //because it is auto closable
            //here we can use this to logging
            System.out.println("Logging something");
        }
    }

    //imp about catch block
    // below one should not be subclass of above one
    // because parent is catching all of it's sub ones
    // un catch clause we can catch multiple exceptions using pipe symbol ("|") ---- those should be disjoint (can't relate each other)

    public static void main(String[] args) {

        String fileName = "testingFileName.csv";
        //to test nullpointerexception and illegalargument clause
        String fileName2 = null;


//        testFile(fileName);
//        testFile2(fileName);
//        testFile3(fileName);
        testFile3(fileName2);
    }
}
