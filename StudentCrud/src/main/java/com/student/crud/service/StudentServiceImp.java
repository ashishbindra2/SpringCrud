package com.student.crud.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.student.crud.model.Student;
import com.student.crud.repository.StudentRepository;

@Service
public class StudentServiceImp implements StudentService {
    @Autowired
	private StudentRepository studentRepository;
	
    @Override
	public List<Student> getAllStudents(){
	  return studentRepository.findAll();
     }
    
    @Override
    public void addStudent(Student student) {
    	this.studentRepository.save(student);
    }

	@Override
	public Student getStudentById(int id) {
		Optional<Student> opational = studentRepository.findById(id);
		Student student = null;
		if(opational.isPresent()) {
			student = opational.get();
		}else {
			throw new RuntimeException("Student not fount for Roll No :: "+id);
		}
		return student;
	}

	@Override
	public void deleteStudentById(int id) {
		this.studentRepository.deleteById(id);
		
	}
}
