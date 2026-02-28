package com.ywserver.authapi.user.dto;

public record UserRequest(
        String id,
        String name,
        String email
) {

    public UserRequest {
        if (id == null || id.isBlank()) {
            throw new IllegalArgumentException("User ID는 필수값입니다.");
        }

        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("사용자 이름은 필수값입니다.");
        }

    }

}
