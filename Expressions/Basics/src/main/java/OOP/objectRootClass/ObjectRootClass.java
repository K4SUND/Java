package OOP.objectRootClass;

public class ObjectRootClass extends  Object{

    public static void main(String[] args) {
        Student max = new Student("Max",24);

        //
        PrimarySchoolStudent supun = new PrimarySchoolStudent("Supun",13,"Saman");


        // when we pass the instance to sout then it is called to toString automatically
        System.out.println(max);
        System.out.println(max.toString());

        System.out.println(supun);

    }
}


//one class can only be public source file
class Student{
    private String name;
    private int age;


    Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
//        return "Student{" +
//                "name='" + name + '\'' +
//                ", age=" + age +
//                '}';

        String output = "Instance: "+ super.toString() +" Name: " + this.name + " Age: " + this.age;
        return output;
    }
}

// toString --- default write the instance
// output is
// OOP.objectRootClass.Student@1b28cdfa
// this is for identify the instance -- unique


// so we have to override it


class PrimarySchoolStudent extends  Student{

    private String parentName;

    PrimarySchoolStudent(String name,int age,String parentName){
        super(name,age);
        this.parentName = parentName;
    }

    @Override
    public String toString() {
        String output = super.toString()+ " Parent Name: " + this.parentName;
        return output;
    }
}
