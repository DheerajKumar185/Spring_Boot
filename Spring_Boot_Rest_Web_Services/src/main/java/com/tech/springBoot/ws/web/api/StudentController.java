package com.tech.springBoot.ws.web.api;

import java.math.BigInteger;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;


import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.tech.springBoot.model.Student;

@RestController
public class StudentController {
	
	private static BigInteger nextId;
	private static Map<BigInteger, Student> studentMap;
	
	private static Student save(Student student) {
		if(studentMap == null) {
			studentMap = new HashMap<BigInteger, Student>();
			nextId = BigInteger.ONE;
		}
		student.setId(nextId);
		nextId = nextId.add(BigInteger.ONE);
		studentMap.put(student.getId(), student);
		return student;
	}
	
	static {
		Student s1 = new Student();
		Student s2 = new Student();
		s1.setName("Test1");
		s2.setName("Test2");
		save(s1);
		save(s2);
	}

	@RequestMapping(value = "/api/students", method = RequestMethod.GET)
	public ResponseEntity<Collection<Student>> getStudents() {
		Collection<Student> students = studentMap.values();
		return new ResponseEntity<Collection<Student>>(students, HttpStatus.OK);
	}
}
