package com.vulnerablebank.server.controller;

import com.vulnerablebank.server.cmd.LoginRequestCmd;
import com.vulnerablebank.server.dto.ResponseEntity4LoginRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorizationController {

    private static final String DEFAULT_PASSWORD = "CTF_SMD_LOGIN_FLAG_2024";
    private static final int AJAX_CODE_UNAUTHORIZED = 401;
    private static final int AJAX_CODE_OK = 200;

    @PostMapping("/login")
    public ResponseEntity<ResponseEntity4LoginRequest> handleLoginRequest(
        @RequestBody LoginRequestCmd loginRequestCmd
    ) {
        if (
            null == loginRequestCmd.getUsername()
            || loginRequestCmd.getUsername().isEmpty()
        ) {
            int code = 400;
            String message = "Username not specified";
            ResponseEntity4LoginRequest response = new ResponseEntity4LoginRequest(
                code,
                message
            );

            return ResponseEntity.status(code).body(response);
        }

        if (
            null == loginRequestCmd.getPassword()
            || loginRequestCmd.getPassword().isEmpty()
        ) {
            int code = 400;
            String message = "Password not specified";
            ResponseEntity4LoginRequest response = new ResponseEntity4LoginRequest(
                code,
                message
            );

            return ResponseEntity.status(code).body(response);
        }

        boolean allowLogin = false;
        int code = AJAX_CODE_UNAUTHORIZED;
        String message = "Incorrect username or password.";
        if (loginRequestCmd.getPassword().contentEquals(DEFAULT_PASSWORD)) {
            allowLogin = true;
            code = AJAX_CODE_OK;
            message = "Authorization successful!";
        }

        ResponseEntity4LoginRequest response = new ResponseEntity4LoginRequest(
            code,
            message
        );

        if (allowLogin) {
            response.CTF_SMD_LOGIN_FLAG = null;
        }

        return ResponseEntity.status(code).body(response);
    }
}
