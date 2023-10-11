package com.example.demo.rapasitory;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Mark;

public interface MarkRapository extends JpaRepository<Mark, Integer> {

}
