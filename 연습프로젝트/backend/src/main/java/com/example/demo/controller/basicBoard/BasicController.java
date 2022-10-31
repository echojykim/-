package com.example.demo.controller.basicBoard;

import com.example.demo.entity.BasicBoard;
import com.example.demo.service.basicBoard.BasicBoardService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RestController
@RequestMapping("/basicBoard/board")
@CrossOrigin(origins = "http://localhost:8080", allowedHeaders = "*")
//웹 페이지의 제한된 자원을 외부 도메인에서 접근을 허용해주는 메커니즘
// 서로다른 도메인에서 리소스를 공유하는 방식

public class BasicController {

    @Autowired
    private BasicBoardService service;

//    @GetMapping("/list") //사용자가 list url을 요청하는 경우
//    public ResponseEntity<List<BasicBoard>> getVueBoardList() {
//        //<보드>의 리스트를 응답 요청하는 리스트
//        log.info("getVueBoardList()");
//
//        return new ResponseEntity<>(service.list(), HttpStatus.OK);
//                    //보드서비스의 리스트, 상태코드 OK를 응답으로 전달
//                //controller에선 ResponseEntity 사용이 안정적이다.
//    }

    @PostMapping("/register")
    public void BasicBoardRegister (@Validated @RequestBody BasicBoard board) {
        log.info("basicBoardRegister()");

        service.register(board);
    }

    @GetMapping("/list")
    public List<BasicBoard> basicBoardlist() {
        log.info("basicBoardList()");

        return service.list();
    }
}
