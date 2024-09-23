import java.util.Scanner;
public class Person {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name");
        String name = sc.nextLine();
        System.out.println("Enter age ");
        int age = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter grade of student");
        char grade = sc.next().charAt(0);
        Student student = new Student(name, age, grade);
        student.displayInfo();
    }
}
class PersonDetail{
    String name;
    int age;
    public PersonDetail(String name, int age){
        this.name = name;
        this.age = age;
    }
    public void displayInfo(){
        System.out.println("Name is => "+ name);
        System.out.println("Age is => "+ age);
    }
}
class Student extends PersonDetail{
    char grade;
    public Student(String name, int age,char grade){
        super(name,age);
        this.grade = grade;
    }
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Student grade is "+grade);
    }
}