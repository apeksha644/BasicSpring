package com.example.SpringApplication2.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.SpringApplication2.entities.Course;

public interface CourseDao extends JpaRepository<Course, Long> {

}
