package com.ywserver.authapi.base.enums;

import lombok.Getter;

@Getter
public enum IsDelete {
    // ENUM을 단순 열거형 즉, 정해진 값의 집합으로만 사용하지 않고
    // 상수 속성과 메서드를 가지게 할 수 있다.
    // 아래의 경우에는 IsDelete.Y.getCode()로 값을 가져오거나
    // UI에서 사용할때도 IsDelete.Y.getDescription() 으로 안전하게 표현할 수 있다.
    Y("Y", "삭제됨"),
    N("N", "사용중");

    private final String code;
    private final String description;

    IsDelete(String code, String description) {
        this.code = code;
        this.description = description;
    }
}
