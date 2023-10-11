package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Mark;
import com.example.demo.service.MarkService;

@RestController
@RequestMapping("/marks") 
public class MarkController {

	@Autowired
	MarkService markSer;
	
	@PostMapping("/add")
	public Mark addMark(@RequestBody Mark a) {
		return markSer.addMark(a);
	}
}
