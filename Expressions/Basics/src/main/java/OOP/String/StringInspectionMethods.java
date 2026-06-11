package OOP.String;

public class StringInspectionMethods {


    public static void main(String[] args) {

        String a = "Kasun Dilumina";
//        String a = "";
        String b = "    ";

        System.out.println(a.length());
        System.out.println(a.charAt(0));
        System.out.println(a.charAt(1));
        System.out.println(a.charAt(2));
        System.out.println(a.charAt(3));
        System.out.println(a.charAt(4));
        System.out.println(a.charAt(a.length()-1));


        System.out.println(a.indexOf("a"));  //1
        System.out.println(a.indexOf("Dilumina")); //6
        System.out.println(a.lastIndexOf("a")); //13

        // length = 0 true
        System.out.println(a.isEmpty()); //false
        System.out.println(b.isEmpty()); //false

        // true --> length = 0 || all whitespaces
        System.out.println(a.isBlank());
        System.out.println(b.isBlank());


        String x = "01234a67a9a";
        System.out.printf("first a : %d%n",x.indexOf('a'));

        //look from index 6
        System.out.printf("second a : %d%n",x.indexOf('a',6));

        //look to index 6 (backward)
        System.out.printf("second a : %d%n",x.lastIndexOf('a',6));

    }
}
