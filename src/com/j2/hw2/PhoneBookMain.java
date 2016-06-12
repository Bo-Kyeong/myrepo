package com.j2.hw2;

public class PhoneBookMain {
   public static void main(String[] args) {
      StudentList studentList = new StudentRemote();

      //print all students
      for (Student student : studentList.getAllStudents()) {
         System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");
      }


      //update student
      Student student =studentList.getAllStudents().get(0);
      student.setName("Michael");
      studentList.updateStudent(student);

      //get the student
      studentList.getStudent(0);
      System.out.println("Student: [RollNo : " + student.getRollNo() + ", Name : " + student.getName() + " ]");  
   }
}