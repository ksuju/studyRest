package com.ll.studyRest.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Data;

/**
 * packageName    : com.ll.studyRest.dto
 * fileName       : ArticleRequest
 * author         : sungjun
 * date           : 2025-01-05
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-05        kyd54       최초 생성
 */
@Data
public class ArticleCreateRequest {
    @NotBlank
    private String subject;
    @NotBlank
    private String content;
}
