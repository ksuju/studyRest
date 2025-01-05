package com.ll.studyRest.controller;

import com.ll.studyRest.dto.ArticleDTO;
import com.ll.studyRest.entity.Article;
import com.ll.studyRest.service.ArticleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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
        List<ArticleDTO> articleList = articleService.findAll();

        return articleList;
    }

    @GetMapping("/{id}")  // 단건 조회
    public ArticleDTO getArticle(@PathVariable Long id) {

        Optional<Article> article = articleService.findById(id);


        return new ArticleDTO(article.get());   // 데이터 단건 조회
    }

    @PostMapping("")
    public String create(@RequestParam("subject") String subject, @RequestParam("content") String content) { // 생성

        articleService.create(subject, content);
        return "생성완료";
    }

    @PatchMapping("/{id}")    // 수정
    public String patchModify(@PathVariable("id") Long id, @RequestParam("subject") String subject, @RequestParam("content") String content) {

        articleService.modify(id, subject, content);
        return "PATCH_수정완료";
    }

    @PutMapping("/{id}")    // 수정
    public String putModify(@PathVariable("id") Long id, @RequestParam("subject") String subject, @RequestParam("content") String content) {

        articleService.modify(id, subject, content);
        return "PUT_수정완료";
    }

    @DeleteMapping("/{id}")   // 삭제
    public String delete(@PathVariable("id") Long id) {

        articleService.delete(id);
        return "삭제완료";
    }

}
