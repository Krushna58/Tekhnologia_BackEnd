package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AppController {
	
	@Autowired
	AppService service;
	
	@GetMapping("/getAll")
	 public ResponseEntity<?> viewAll(){
		List<AppDTO> list=service.viewAll();
		if(list==null) {
			return ResponseEntity.ok("not available");
		}
		else {
			return ResponseEntity.ok(list);
		}
	 }
	
	
	@GetMapping("/{id}")
	public ResponseEntity<?>findById(@PathVariable Integer id){
		AppDTO findid=service.findById(id);
		
		if(findid==null) {
			return ResponseEntity.ok("id not available");
		}
		else {
			return ResponseEntity.ok(findid);
		}
	}
	
	@GetMapping("/findbycategory")
	public ResponseEntity<?>findbycat(@RequestParam String category){
		List<AppDTO>item=service.findbycat(category);
		return ResponseEntity.ok(item);
	}
	
	@PostMapping("/addproduct")
	public ResponseEntity<?>addProduct(@RequestBody List<AppDTO> dto ){
		List<AppDTO> item=service.addProduct(dto);
		return ResponseEntity.ok(item);
	}

	
}
