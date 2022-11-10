class Student {
    int id;
    int rollNo;

}
public class PersonClass {
    int age = 20;
    public static void main(String []args) {
        System.out.println("Concepts of Classes");

        PersonClass Rohan = new PersonClass();
        Student s1 = new Student();
        s1.id = 10;
        System.out.println(s1.id);

        System.out.println(Rohan.age);
    }
}