package com.example.demo.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Mark;
import com.example.demo.rapasitory.MarkRapository;

@Repository
public class MarkDao {
	@Autowired
	MarkRapository markRep;

	public Mark addmark(Mark s) {
		int sem1total = s.getSem1Theory() + s.getSem1Practicals();
		int sem2total = s.getSem2Theory() + s.getSem2Practicals();
		s.setSem1Total(sem1total);
		s.setSem2Total(sem2total);
		return markRep.save(s);

	}

}
