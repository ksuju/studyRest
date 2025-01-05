package com.ll.global.rsData;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * packageName    : com.ll.global.rsData
 * fileName       : RsData
 * author         : sungjun
 * date           : 2025-01-05
 * description    : 자동 주석 생성
 * ===========================================================
 * DATE              AUTHOR             NOTE
 * -----------------------------------------------------------
 * 2025-01-05        kyd54       최초 생성
 */
@Getter
@Setter
@AllArgsConstructor
public class RsData<T> {
    private String resultCode;
    private String msg;
    private T data;
    public static <T> RsData<T> of(String resultCode, String msg, T data) {
        return new RsData<>(resultCode, msg, data);
    }
    public static <T> RsData<T> of(String resultCode, String msg) {
        return of(resultCode, msg, null);
    }
    @JsonIgnore
    public boolean isSuccess() {
        return resultCode.startsWith("200");
    }
    @JsonIgnore
    public boolean isFail() {
        return !isSuccess();
    }
}
