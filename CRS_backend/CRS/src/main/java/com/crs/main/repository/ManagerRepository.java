package com.crs.main.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.crs.main.model.Complaints;
import com.crs.main.model.Managers;

public interface ManagerRepository extends CrudRepository<Managers, String> {

	Optional<Managers> findBymanagerName(String string);

	List<Managers> findBymanagerEmail(String string);

	

}
