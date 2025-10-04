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

    /**
     * 로그인 시 사용자의 정보를 Return합니다.
     * @param token
     * @return
     */
    public String getUserInfo(String token){
        return ~~~~(token);
    }

}
