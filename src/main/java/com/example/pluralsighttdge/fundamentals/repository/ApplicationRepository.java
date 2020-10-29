package com.example.pluralsighttdge.fundamentals.repository;

import com.example.pluralsighttdge.fundamentals.entity.Application;
//import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
