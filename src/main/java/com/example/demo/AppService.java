package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AppService {
	
	@Autowired
	AppRepository repo;

	public List<AppDTO> viewAll() {
		List<AppDTO> list=repo.findAll();
		return list;
		
	}

	public AppDTO findById(Integer id) {
	
		AppDTO findId=repo.findById(id).orElse(null);
		return findId;
		
	}
	
	public List<AppDTO> findbycat(String category) {
		List<AppDTO> item=repo.findbycat(category);
		return item;
	}

	public List<AppDTO> addProduct(List<AppDTO> dto) {
		List<AppDTO> item=repo.saveAll(dto);
		 return  item;
		
	}

	

}
