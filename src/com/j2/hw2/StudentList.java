package com.j2.hw2;

import java.util.List;

public interface StudentList {
   public List<Student> getAllStudents();
   public Student getStudent(int rollNo);
   public void updateStudent(Student student);
   public void deleteStudent(Student student);
}