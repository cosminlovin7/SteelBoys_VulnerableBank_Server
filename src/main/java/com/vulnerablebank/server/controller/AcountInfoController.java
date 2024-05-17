package com.vulnerablebank.server.controller;

import com.vulnerablebank.server.dto.AccountInfoDto;
import com.vulnerablebank.server.dto.ResponseEntity4AccountInfoRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AcountInfoController {

    private static final int AJAX_CODE_UNAUTHORIZED = 401;
    private static final int AJAX_CODE_OK = 200;

    @GetMapping("/user/{username}")
    public ResponseEntity<ResponseEntity4AccountInfoRequest> getUser(@PathVariable String username) {
        if (null == username) {
            int code = 400;
            String message = "Username not specified";
            ResponseEntity4AccountInfoRequest response = new ResponseEntity4AccountInfoRequest(
                code,
                message,
                null
            );

            return ResponseEntity.status(code).body(response);
        }

        try {
            Thread.sleep(2000);
        } catch (Exception e) {
            //noop
        }

        AccountInfoDto accountInfoDto = new AccountInfoDto(
            "John",
            "Pavlova",
            "john.pavlova@gmail.com",
            12331
        );

        String message = "Account info fetched successfully!";
        ResponseEntity4AccountInfoRequest response = new ResponseEntity4AccountInfoRequest(
            AJAX_CODE_OK,
            message,
            accountInfoDto
        );

        return ResponseEntity.status(AJAX_CODE_OK).body(response);
    }
}
