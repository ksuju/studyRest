package com.ll.studyRest.controller;

import com.ll.studyRest.dto.ArticleDTO;
import com.ll.studyRest.entity.Article;
import com.ll.studyRest.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * packageName    : com.ll.studyRest.controller
 * fileName       : ApiV1ArticleController
 * author         : sungjun
 * date           : 2025-01-05
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-05        kyd54       최초 생성
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/articles")
public class ApiV1ArticleController {
    private final ArticleService articleService;

    @GetMapping("")    // 다건 조회
    public List<ArticleDTO> list() {
        List<ArticleDTO> articleList = new ArrayList<>();

        // 임시 데이터 삽입
        Article article1 = new Article("제목1", "내용1");
        articleList.add(new ArticleDTO(article1));

        Article article2 = new Article("제목2", "내용2");
        articleList.add(new ArticleDTO(article2));

        Article article3 = new Article("제목3", "내용3");
        articleList.add(new ArticleDTO(article3));

        return articleList;
    }

    @GetMapping("/{id}")  // 단건 조회
    public ArticleDTO getArticle() {
        List<ArticleDTO> articleList = new ArrayList<>();

        // 임시 데이터 삽입
        Article article1 = new Article("제목1", "내용1");
        articleList.add(new ArticleDTO(article1));

        Article article2 = new Article("제목2", "내용2");
        articleList.add(new ArticleDTO(article2));

        Article article3 = new Article("제목3", "내용3");
        articleList.add(new ArticleDTO(article3));

        return articleList.get(0);  // 0번 인덱스에 저장된 데이터 단건 조회
    }

    @PostMapping("")   // 생성
    public String create() {
        return "생성";
    }

    @PatchMapping("/{id}")    // 수정
    public String patchModify() {
        return "PATCH 수정";
    }

    @PutMapping("/{id}")    // 수정
    public String putModify() {
        return "PUT 수정";
    }

    @DeleteMapping("/{id}")   // 삭제
    public String delete() {
        return "삭제";
    }

}
