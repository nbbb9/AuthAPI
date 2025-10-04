package com.ywserver.authapi.base.exceptions;

import org.springframework.web.bind.annotation.ResponseStatus;

// @ResponseStatus를 통해 메서드 또는 예외가 실행될 때 HTTP 상태 코드를 클라이언트에게 응답하도록 지정
@ResponseStatus
public class CustomException extends RuntimeException {

    public CustomException(String message) {
        super(message);
    }

    public CustomException(String message, Throwable cause) {
        super(message, cause);
    }

}