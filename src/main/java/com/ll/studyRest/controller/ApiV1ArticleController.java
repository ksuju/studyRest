package com.ll.studyRest.controller;

import com.ll.studyRest.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    public String list() {
        return "다건";
    }

    @GetMapping("/${id}")  // 단건 조회
    public String getArticle() {
        return "단건";
    }

    @PostMapping("")   // 생성
    public String create() {
        return "생성";
    }

    @PatchMapping("/${id}")    // 수정
    public String modify() {
        return "수정";
    }

    @DeleteMapping("/${id}")   // 삭제
    public String delete() {
        return "삭제";
    }

}
