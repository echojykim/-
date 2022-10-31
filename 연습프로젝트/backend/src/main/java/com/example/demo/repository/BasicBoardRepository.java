package com.example.demo.repository;

import com.example.demo.entity.BasicBoard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BasicBoardRepository extends JpaRepository<BasicBoard, Long> {

}
