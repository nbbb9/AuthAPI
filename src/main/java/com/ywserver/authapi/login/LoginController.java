package com.ywserver.authapi.login;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/login")
@RequiredArgsConstructor
@Slf4j
public class LoginController {
    private final LoginService loginService;

    @GetMapping("/test")
    public ResponseEntity<String> LoginTest(){
        log.info("로그인 테스트 수행");
        String result = loginService.LoginTestService();
        return ResponseEntity.ok(result);
    }

    @PostMapping("")
    public ResponseEntity<String> Login(
            @RequestHeader("Authorization") String token
    ){
        return ResponseEntity.ok(loginService.getUserInfo(token));
    }

}