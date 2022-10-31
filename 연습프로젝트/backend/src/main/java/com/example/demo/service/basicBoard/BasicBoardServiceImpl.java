package com.example.demo.service.basicBoard;

import com.example.demo.entity.BasicBoard;
import com.example.demo.repository.BasicBoardRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class BasicBoardServiceImpl implements BasicBoardService {

    @Autowired
    BasicBoardRepository repository;

    @Override
    public void register(BasicBoard board) {
        repository.save(board);
    }

    @Override
    public List<BasicBoard> list() {
        return repository.findAll(Sort.by(Sort.Direction.DESC, "boardNo"));
    }

}
