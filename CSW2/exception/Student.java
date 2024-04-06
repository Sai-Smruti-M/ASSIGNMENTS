package exception;
//InvalidStudentException.java
class InvalidStudentException extends Exception {
 public InvalidStudentException(String message) {
     super(message);
 }

 public InvalidStudentException(String message, Throwable cause) {
     super(message, cause);
 }
}

//Student.java
public class Student {
 private String name;
 private int id;

 public Student(String name, int id) {
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
 class Lecture {
 public void registerStudent(Student student) throws InvalidStudentException {
     if (student.getId() <= 0) {
         throw new InvalidStudentException("Invalid student ID: " + student.getId());
     }
 }

 public static void main(String[] args) {
     Lecture lecture = new Lecture();
     Student student = new Student("John", -1);

     try {
         lecture.registerStudent(student);
     } catch (InvalidStudentException e) {
         e.printStackTrace();
     }
 }
}