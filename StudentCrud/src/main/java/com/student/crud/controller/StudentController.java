package com.student.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.crud.model.Student;
import com.student.crud.service.StudentService;

@Controller
public class StudentController {
 
	@Autowired
	private StudentService studentService;
	
//	Display list of Students
	@GetMapping("/")
	public String viewHomePage(Model model) {
		// Create model attribute to bind from data
		model.addAttribute("listStudent",studentService.getAllStudents());
		return "index";
	}
	
	@GetMapping("/showNewStudentForm")
	public String showNewStudentForm(Model model) {
		Student student = new Student();
		model.addAttribute("student", student);
		return "new_student";
	}
	
	@PostMapping("/addStudent")
	public String addStudent(@ModelAttribute("student") Student student) {
		// save student to database
		studentService.addStudent(student);
		return "redirect:/";
	}
	
	@GetMapping("/showFormForUpdateStudent/{id}")
	public String showFormForUpdateStudent(@PathVariable(value = "id") int id,Model model) {
		
//		get student from the service
		Student student = studentService.getStudentById(id);
		
//		set student as a model attribute to pre-populate the form
		model.addAttribute("student",student);
		return "update_student";
	}
	
	@GetMapping("/deleteStudent/{id}")
	public String deleteStudent(@PathVariable(value = "id") int id,Model model) {
//		call employee delete method
		this.studentService.deleteStudentById(id);
		return "redirect:/";
	}
	
	
	
}
