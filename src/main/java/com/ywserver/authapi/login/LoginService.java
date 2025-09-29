package com.ywserver.authapi.login;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    public String LoginTestService(){
        String str = "initCommit을 위한 테스트 메서드";
        return str;
    }
}
