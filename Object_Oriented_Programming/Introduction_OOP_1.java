package Object_Oriented_Programming;

        //What I have covered in this class :
//        this keyword,
//        constructor,
//        constructor overloading ,
//        parameterized constructor,
//        non-parameterized constructor,
//        calling a constructor from another constructor,
//        wrapper classes,
//        final keyword,
//        final keyword with objects,
//        finalize (You can not remove a object from the memory when no reference variable is pointing to it,
//       -but you can set what to happen when that object is deleted from the memory(sort of destructor)).


public class Introduction_OOP_1 {
    public static void main(String[] args) {

        //Declaration of arr type Student
        Student[] students = new Student[5];

        //Creating object
        //With non-parameterized constructor
//        Student stu1 =  new Student();
//        Student stu2 =  new Student();

        //With non-parameterized constructor
        Student stu1 =  new Student(12,"Iron Man", 45.76f);
        Student stu2 =  new Student();

        //Calling a constructor will take data from another object
        Student randomStudent = new Student(stu1);

        //Calling a constructor form another constructor
        Student somethingStu = new Student();

        //Printing values constructor form another constructor
//        System.out.println("For : somethingStu");
//        System.out.println("Name : " +somethingStu.name);
//        System.out.println("Roll Number : " +somethingStu.rollNum);
//        System.out.println("Marks : " +somethingStu.marks);
//
//        System.out.println();


        //Printing values of object when no valued assigned to object
//        System.out.println("For : stu1");
//        System.out.println("Name : " +stu1.name);
//        System.out.println("Roll Number : " +stu1.rollNum);
//        System.out.println("Marks : " +stu1.marks);

//        System.out.println();

//        System.out.println("For : stu2");
//        System.out.println("Name : " +stu2.name);
//        System.out.println("Roll Number : " +stu2.rollNum);
//        System.out.println("Marks : " +stu2.marks);

        //        System.out.println();

//        System.out.println("For : randomStudent");
//        System.out.println("Name : " +randomStudent.name);
//        System.out.println("Roll Number : " +randomStudent.rollNum);
//        System.out.println("Marks : " +randomStudent.marks);
//
//        System.out.println();

        //Printing for function greetings()
//        stu1.greetings();
//        stu2.greetings();


        //Setting values to that object
//        //Fot stu 1
//        stu1.name = "Yogesh";
//        stu1.rollNum = 59;
//        stu1.marks = 56.87f;

//        //Fot stu 2
//        stu2.name = "Kevin";
//        stu2.rollNum = 66;
//        stu2.marks = 65.78f;

        //Setting students in students array
//        students[0] = stu1;
//        students[1] = stu2;

        //Looping through students array nothing special
//        for (Student student : students){
//            System.out.println(student.name + " " + student.marks + " " + student.rollNum);
//        }

        //Final Object
        final Student john =  new Student(12,"John Doe", 34.56f);
        john.name = "New Name";

        //Reassigning non-final object to another object
        //john = new Student(11, "Re-Assigned-Name", 12.76f);

        //Printing for non-final john
//        System.out.println("For : john");
//        System.out.println("Name : " +john.name);
//        System.out.println("Roll Number : " +john.rollNum);
//        System.out.println("Marks : " +john.marks);

//        System.out.println();

        //Printing for john
//        System.out.println("For : john");
//        System.out.println("Name : " +john.name);
//        System.out.println("Roll Number : " +john.rollNum);
//        System.out.println("Marks : " +john.marks);

        //Finalize : It will be automatically called when any object from the class will be Destroyed by GC.
        Student finalStu;

        for (int i = 0; i < 1000000000; i++) {
            finalStu = new Student();
        }

    }
}

class Student{
    int rollNum;
    String name;
    float marks;

    //Non-Parameterized Constructor
//    Student(){
//        this.rollNum = 00;
//        this.name = "Default Name";
//        this.marks = 0.00f;
//    }

    //Parameterized Constructor
    Student(int rollNum, String name, float marks){
            this.rollNum = rollNum;
            this.name = name;
            this.marks = marks;
    }

    //Constructor taking data from other object
    Student(Student Other){
        this.rollNum = Other.rollNum;
        this.name = Other.name;
        this.marks = Other.marks;
    }

    //Calling a constructor from another constructor
    Student(){
        this ( 00,"Something Name",0.0f);
    }

    //Experimenting with this keyword
    void greetings(){
        System.out.println("Hello Namaste : " +this.name);
    }

    //Finalize
    @Override
    protected void finalize() throws Throwable {
        //super.finalize();
        System.out.println("Object is destroyed !");
    }
}