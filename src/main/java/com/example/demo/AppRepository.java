package com.example.demo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AppRepository extends JpaRepository<AppDTO,Integer> {
	
	@Query("select item from AppDTO as item where item.category=?1")
	public List<AppDTO> findbycat(String category);

	
}
