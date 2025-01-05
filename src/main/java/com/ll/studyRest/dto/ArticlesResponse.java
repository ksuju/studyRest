package com.ll.studyRest.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

/**
 * packageName    : com.ll.studyRest.dto
 * fileName       : ArticlesResponse
 * author         : sungjun
 * date           : 2025-01-05
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-05        kyd54       최초 생성
 */
@AllArgsConstructor
@Getter
public class ArticlesResponse {
    private final List<ArticleDTO> articleList;
}
