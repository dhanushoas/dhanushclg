package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.MarkDao;
import com.example.demo.entity.Mark;

@Service
public class MarkService {

	@Autowired
	MarkDao markDao;

	public Mark addMark(Mark s) {
		return markDao.addmark(s);
	}

}
