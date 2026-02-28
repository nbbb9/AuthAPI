package com.ywserver.authapi.login;

import com.ywserver.authapi.user.UserService;
import com.ywserver.authapi.user.dto.UserDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class LoginService {

    private final UserService userService;

    public String LoginTestService(){
        String str = "initCommit을 위한 테스트 메서드";
        return str;
    }

    /**
     * 로그인 시 사용자의 정보를 Return합니다.
     * @param token
     * @return String(사용자 정보)
     */
    public UserDto getUserInfo(String token){
        UserDto userInfo = userService.getUserInfoWithToken(token);
        return userInfo;
    }

}
