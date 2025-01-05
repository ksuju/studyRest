package com.ll.studyRest.controller;

import com.ll.global.rsData.RsData;
import com.ll.studyRest.dto.ArticleDTO;
import com.ll.studyRest.dto.ArticleCreateRequest;
import com.ll.studyRest.entity.Article;
import com.ll.studyRest.service.ArticleService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

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
    public RsData<List<ArticleDTO>> list() {
        List<ArticleDTO> articleList = articleService.findAll();

        return RsData.of("200","데이터 다건 조회 성공", articleList);
    }

    @GetMapping("/{id}")  // 단건 조회
    public RsData<ArticleDTO> getArticle(@PathVariable Long id) {
        Optional<Article> article = articleService.findById(id);

        return RsData.of("200", "데이터 단건 조회 성공", new ArticleDTO(article.get()));   // 데이터 단건 조회
    }

    @PostMapping("")    // 등록
    public String create(@Valid @RequestBody ArticleCreateRequest articleCreateRequest) { // 생성
        articleService.create(articleCreateRequest);
        return "생성완료";
    }

    @PatchMapping("/{id}")    // 수정
    public RsData patchModify(@PathVariable("id") Long id, @RequestBody ArticleCreateRequest articleCreateRequest) {

        articleService.modify(id, articleCreateRequest);
        return RsData.of("200","PATCH_수정완료");
    }

    @PutMapping("/{id}")    // 수정
    public RsData putModify(@PathVariable("id") Long id, @RequestBody ArticleCreateRequest articleCreateRequest) {

        articleService.modify(id, articleCreateRequest);
        return RsData.of("200","PUT_수정완료");
    }

    @DeleteMapping("/{id}")   // 삭제
    public RsData delete(@PathVariable("id") Long id) {

        articleService.delete(id);
        return RsData.of("200","삭제완료");
    }

}
