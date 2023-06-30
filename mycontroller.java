package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entities.Courses;
import com.example.demo.services.CourseService;

@RestController
public class mycontroller 
{
	@Autowired
	private CourseService courseService;
	@GetMapping("/home")
	public String home()
	{
		return "welcome to my home";
	}
	@PostMapping("/career")
	public String career()
	{
		return "computer engineer";
	}
	@GetMapping("/courses")
	public List<Courses> getCourses()
	{
		return this.courseService.getCourses();
	}
	
	}