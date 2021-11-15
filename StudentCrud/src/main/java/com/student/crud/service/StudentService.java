package com.student.crud.service;

import java.util.List;

import com.student.crud.model.Student;

public interface StudentService {
	List<Student> getAllStudents();
	void addStudent(Student student);
	Student getStudentById(int id);
	void deleteStudentById(int id);
}
