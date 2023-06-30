 package com.example.demo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entities.Courses;
@Service
public class CourseServiceImpl implements CourseService
{
	List<Courses> list;
	public CourseServiceImpl()
	{
		list = new ArrayList<>();
	    list.add(new Courses(01, "javascript", "javascript is ude foe frontend"));
	    list.add(new Courses(02, "springboot", "create restapi"));
	    
	}

	@Override
	public List<Courses> getCourses() {
		
		return null;
	}

}
