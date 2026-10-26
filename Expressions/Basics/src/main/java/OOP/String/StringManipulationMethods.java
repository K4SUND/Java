package OOP.String;

public class StringManipulationMethods {

    public static void main(String[] args) {

        String birthDate = "25/11/1982";
        int startingIndex = birthDate.indexOf("1982");
        System.out.println("Start:" + startingIndex);
        System.out.println("Year:" + birthDate.substring(startingIndex));


        //DD/MM/YYYY
        //0123456789
        //start index , last index (start index+length)
        //last index is not included
        System.out.println("Day:" + birthDate.substring(0, 2));
        System.out.println("Day:" + birthDate.substring(3, 5));
        System.out.println("Day:" + birthDate.substring(6, 10));


        //join
        //delimiter
        //elements ( , , , )
        String newDate = String.join(",", "20", "12", "2025");
        System.out.println("Day:" + newDate);


        newDate = "10";
        newDate = newDate.concat("/10");
        newDate = newDate.concat("/2020");

        //
        newDate = "20";

        //concat method - return string object
        newDate = newDate.concat("/").concat("20").concat("/").concat("2020");
        System.out.println(newDate);


        newDate = "10" + "/" + "10" + "/" + "2010";
        System.out.println(newDate);


        // simple replace with character
        // replace all with new character
        newDate = newDate.replace("/", "-");
        System.out.println(newDate);


        //replace with strings
        newDate = newDate.replace("1", "001");
        System.out.println(newDate);


        // pattern(regex)
        newDate = newDate.replaceFirst("1", "212");
        System.out.println(newDate);

        newDate = newDate.replaceAll("-", "--");


        /*
        replaceAll()
        first argument as a regular expression (regex)

        when using regex patterns such as:



            \\d (digits)
            \\s (whitespace)
            . (any character)
            [a-z]
            ^, $, *, +, etc


         */
        String s = "abc123def456";
        s = s.replaceAll("\\d", "X");
        System.out.println(s);


        //repeat
        String s1 = "ABC".repeat(2);
        String s2 = "ABC\n".repeat(2);
        System.out.println(s1);
        System.out.println(s2);


        // indent
        // add space
        String s3 ="1234";
        s3 = s3.repeat(2).indent(2);
        System.out.println(s3);



    }
}
