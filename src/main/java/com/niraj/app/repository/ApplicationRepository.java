package com.niraj.app.repository;

import com.niraj.app.entity.Application;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationRepository extends CrudRepository<Application, Long> {
}
