package com.ywserver.authapi.user;

import com.ywserver.authapi.base.exceptions.CustomException;
import com.ywserver.authapi.user.dto.UserDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    /**
     * token을 통해 사용자의 정보를 반환합니다.
     * @param token
     * @return useDto
     */
    public UserDto getUserInfoWithToken(String token) {

        if (token == null || token.isEmpty()) {
            CustomException exception = new CustomException("Not Enabled Token");
        }

        UserDto userInfo = userRepository.findUserByToken(token);

        return userInfo;

    }


    

}