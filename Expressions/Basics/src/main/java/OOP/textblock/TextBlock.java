package OOP.textblock;

public class TextBlock {

    public static void main(String[] args) {

        String a1 = "\"";
        String a2 = "\\";
        String s1 = "\u2022 kasun"+"\u2022 thimal";
        String s2 = "\u2022 kasun"+"\n"+"\u2022 thimal";
        String s3 = "Names\n \t\u2022 kasun"+"\n"+"\t\u2022 thimal";

        System.out.println(a1);
        System.out.println(a2);
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        String s4 = """
                Names
                    \u2022 kasun
                    \u2022 thimal
                """;

        System.out.println(s4);


        int age = 35;
        System.out.println("Age is "+age);
        System.out.printf("Age is %d\n",age);
        System.out.printf("Age1 is %d%n",age);

        // precision = 2 decimal points
        // () cast
        System.out.printf("Age2 is %.2f%n",(float)age);

        for(int i=1;i<10000;i*=10)
        {
            System.out.printf("%d%n",i);
        }

        for(int i=1;i<10000;i*=10)
        {
            //width
            System.out.printf("%4d%n",i);
        }


        //static method
        String fs = String.format("Your age is %d",age);
        System.out.println(fs);

        fs = "My age is %d".formatted(age);
        System.out.println(fs);

    }
}
