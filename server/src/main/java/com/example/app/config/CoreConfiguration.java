package com.example.app.config;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.example.app.model.Student;
import com.example.app.repository.StudentRepository;

@Configuration
@EntityScan(basePackageClasses = Student.class)
@EnableJpaRepositories(basePackageClasses = StudentRepository.class)
public class CoreConfiguration {
}
