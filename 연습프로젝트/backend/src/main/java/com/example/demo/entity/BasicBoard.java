package com.example.demo.entity;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Id;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
public class BasicBoard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) //ID랑 해서 primary로 등록하게 하는 어노테이션
    //중복요소가 없고 모든 각개의 들어온 내용의 기준이 되는 걸 따지면 보면 boardNo인거임
    private Long boardNo;

    @Column(length = 128, nullable = false)
    private String title;

    @Column(length = 32, nullable = false)
    private String writer;

    @Lob //content는 길이가 길어서 긴 내용을 담는 경우 사용하는 어노테이션
    private String content;

    @CreationTimestamp //날짜를 생성하는 스탬프. 게시글 등록하면 이 데이터가 생성. 그때 날짜를 기록해줌
    private Date regDate;

    @UpdateTimestamp //게시글 수정시 갱신되는 부분
    private Date upDate;


}
