package com.example.demo.service.BasicBoard;

import com.example.demo.entity.BasicBoard;

import java.util.List;

public interface BasicBoardService {
    public void register (BasicBoard board);
    public List<BasicBoard> list();
//    public BasicBoard read (Integer boardNo);
//    public void modify (BasicBoard board);
//    public void remove (Integer boardNo);
}
