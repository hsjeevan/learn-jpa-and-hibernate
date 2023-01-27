package com.hsjeevan.springboot.learnjpaandhibernate.course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.hsjeevan.springboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.hsjeevan.springboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.hsjeevan.springboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;


@Component
public class CourseCommandLineRunner implements CommandLineRunner {
//	@Autowired
//	private CourseJdbcRepository repository;
	
//	@Autowired
//	private CourseJpaRepository repository;
	
	@Autowired
	private CourseSpringDataJpaRepository repository;
	
	private Course c2 =  new Course(2, "Learn Azure JPA!", "Jeevan");
	
	@Override
	public void run(String... args) throws Exception {
		
		// TODO Auto-generated method stub
		repository.save(new Course(1, "Learn AWS JPA!", "Jeevan"));
		repository.save(c2);
		repository.save(new Course(3, "Learn GCP JPA!", "Jeevan"));
		repository.deleteById(2l);
		
		
		System.out.println(repository.findById(1l));
		System.out.println(repository.findById(3l));
		
		System.out.println(repository.findByAuthor("Raghu"));
		System.out.println(repository.findByName("Learn GCP JPA!"));
	}
	

}
