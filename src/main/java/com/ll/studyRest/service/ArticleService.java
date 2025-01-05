package com.ll.studyRest.service;

import com.ll.studyRest.dto.ArticleDTO;
import com.ll.studyRest.entity.Article;
import com.ll.studyRest.repository.ArticleRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * packageName    : com.ll.studyRest.service
 * fileName       : ArticleService
 * author         : sungjun
 * date           : 2025-01-05
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-05        kyd54       최초 생성
 */
@Service
@RequiredArgsConstructor
public class ArticleService {
    private final ArticleRepository articleRepository;

    // 단건 조회
    public Optional<Article> findById(Long id) {
        return articleRepository.findById(id);
    }

    // 다건 조회
    public List<ArticleDTO> findAll() {
        // Article 엔티티 리스트를 데이터베이스에서 조회
        List<Article> articles = articleRepository.findAll();

        System.out.println("articles========" + articles);

        // 각 Article 엔티티 객체를 ArticleDTO로 변환하여 리스트로 반환
        return articles.stream()
                .map(article -> new ArticleDTO(article))
                .collect(Collectors.toList());
    }

    // 생성
    public void create(String subject, String content) {
        Article article = new Article(subject, content);
        articleRepository.save(article);
    }

    // 수정
    public void modify(Long id, String subject, String content) {
        // id에 해당하는 article 가져옴
        Optional<Article> optionalArticle = articleRepository.findById(id);

        // 값이 존재할 때 수정
        if (optionalArticle.isPresent()) {
            Article article = optionalArticle.get();
            article.setSubject(subject);
            article.setContent(content);

            // 변경 사항 저장
            articleRepository.save(article);
        }
    }

    // 삭제
    public void delete(Long id) {

        articleRepository.deleteById(id);
    }
}
