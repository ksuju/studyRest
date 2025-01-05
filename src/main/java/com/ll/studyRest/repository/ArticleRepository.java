package com.ll.studyRest.repository;

import com.ll.studyRest.entity.Article;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * packageName    : com.ll.studyRest.repository
 * fileName       : ArticleRepository
 * author         : sungjun
 * date           : 2025-01-05
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-05        kyd54       최초 생성
 */
@Repository
public interface ArticleRepository extends JpaRepository<Article, Long> {
}
