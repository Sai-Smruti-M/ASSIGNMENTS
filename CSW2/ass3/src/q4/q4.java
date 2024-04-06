package q4;

import java.util.Scanner;
import java.util.LinkedList;
class student
{
    String name;
    int age;
    int mark;
    student(String n,int a,int m)
    {
        this.name=n;
        this.age=a;

        this.mark=m;
        
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getMark() {
        return mark;
    }
    public void setMark(int mark) {
        this.mark = mark;
    }
    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        student student = (student) obj;
        return age == student.age &&
                mark == student.mark &&
                name.equals(student.name);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }

}

public class q4 
{
    public static void main(String[] args)
     {
        LinkedList<student> l=new LinkedList<student>();
        l.add(new student("SAI",20,100));
        l.add(new student("Bob", 22, 78));
        l.add(new student("Charlie", 21, 90));

        // (a.) Display the list
        System.out.println("Student List:");
        for (student student : l) {
            System.out.println(student);
        }

        // (b.) Ask the user to enter a Student object and print its existence
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter student details (name, age, mark) for search:");
        String name = scanner.next();
        int age = scanner.nextInt();
        int mark = scanner.nextInt();
        student searchStudent = new student(name, age, mark);

        boolean exists = l.contains(searchStudent);
        System.out.println("Student exists in the list: " + exists);

        // (c.) Remove a specified Student object
        System.out.println("Enter student details to remove (name, age, mark):");
        name = scanner.next();
        age = scanner.nextInt();
        mark = scanner.nextInt();
        student removeStudent = new student(name, age, mark);

        boolean removed = l.remove(removeStudent);
        if (removed) {
            System.out.println("Student removed successfully.");
        } else {
            System.out.println("Student not found in the list.");
        }

        // (d.) Count the number of objects present in the list
        System.out.println("Number of students in the list: " + l.size());
        scanner.close();
    }
}