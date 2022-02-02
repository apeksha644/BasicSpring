package com.example.SpringApplication2.services;

import java.util.List;

import com.example.SpringApplication2.entities.Course;

public interface CourseService {
	
	public List<Course> getCourses();

	public Course getCourse(long  courseId);
	
	public Course addCourse(Course course);
	
	public Course updateCourse(Course course);
	
	public Course deleteCourse(long parseLong);
	

	

}
