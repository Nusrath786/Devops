package com.lti.dao;

import com.lti.model.Student;

public interface StudentDao {
	public int createStudent(Student student);
	public Student readStudentByRollNumber(int rollNumber);
	public boolean updateStudent(int rollNumber, Student student);
	public boolean deleteStudent(int rollNumber);
}
