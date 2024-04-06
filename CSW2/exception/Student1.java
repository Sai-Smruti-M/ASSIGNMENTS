package exception;



//Student.java
public class Student1 {
 private String name;
 private int id;

 public Student1(String name, int id) {
     this.name = name;
     this.id = id;
 }

 public String getName() {
     return name;
 }                                                                                           

 public int getId() {
     return id;
 }
}

//Lecture.java
class Lecture1{
 public void registerStudent(Student student) {
     if (student.getId() <= 0) {
         throw new InvalidStudentExceptionUnch("Invalid student ID: " + student.getId());
     }
 }

 public static void main(String[] args) {
     Lecture1 lecture = new Lecture1();
     Student student = new Student("John", -1);

     try {
         lecture.registerStudent(student);
     } catch (InvalidStudentExceptionUnch e) {
         e.printStackTrace();
     }
 }
}
//InvalidStudentExceptionUnch.java
class InvalidStudentExceptionUnch extends RuntimeException {
public InvalidStudentExceptionUnch(String message) {
   super(message);
}

public InvalidStudentExceptionUnch(String message, Throwable cause) {
   super(message, cause);
}
}