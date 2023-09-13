package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.app.model.Classroom;

@Repository
public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}
