package Unknown;

import java.util.ArrayList;

record Student(String name, int age) {

    public Student(String name) {
        this(name,22);
    }


    // custom toString method
    @Override
    public String toString(){

        return String.format("%s : %d", this.name.toUpperCase(), this.age);
    }

}

public class ArrayListMethods {

    public static void main(String[] args) {

        //
        ArrayList<Student> freshers = new ArrayList<>();
        freshers.add(new Student("Kasun"));
        freshers.add(new Student("Thimal"));
        freshers.add(new Student("Kaveen"));

        System.out.println(freshers);

        System.out.println("-".repeat(20));
        // overload add method
        freshers.add(1,new Student("jeewaka"));
        System.out.println(freshers); //calls toString method
        freshers.set(1,new Student("jeewaka",24));
        System.out.println(freshers); //calls toString method

        freshers.remove(1);
        System.out.println(freshers); //calls toString method





    }
}
