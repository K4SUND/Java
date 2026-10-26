package OOP.POJO;

public class Pojo {

    /*
     pojo

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            Student s = new Student("1" + i,
                    switch (i) {
                        case 1 -> "A";
                        case 2 -> "B";
                        case 3 -> "C";
                        case 4 -> "D";
                        case 5 -> "E";
                        default -> "Anonymous";
                    }
                    ,
                    "05/07/2001",
                    "Java MasterClass");
            System.out.println(s);

        }
    }

     */


    /*
    // Record
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            StudentRecord s = new StudentRecord("1" + i,
                    switch (i) {
                        case 1 -> "A";
                        case 2 -> "B";
                        case 3 -> "C";
                        case 4 -> "D";
                        case 5 -> "E";
                        default -> "Anonymous";
                    }
                    ,
                    "05/07/2001",
                    "Java MasterClass");
            System.out.println(s);

        }
    }

     */

    public static void main(String[] args) {
        Student s1 = new Student(
                "1",
                "Kasun",
                "02/09/2001",
                "Java"
        );
        StudentRecord s2 = new StudentRecord(
                "2",
                "Thimal",
                "31/07/2001",
                "Java"
        );

        System.out.println(s1); //Student{id='1', name='Kasun', dateOfBirth='02/09/2001', classList='Java'}
        System.out.println(s2); //StudentRecord[id=2, name=Thimal, dateOfBirth=31/07/2001, classList=Java]


        //setter method
        s1.setClassList(s1.getClassList()+",C++");
//        s2.class ---> immutable


        // getter method
        System.out.println(s1.getName()+":"+s1.getClassList());
        System.out.println(s2.name()+":"+s2.classList());


    }
}
