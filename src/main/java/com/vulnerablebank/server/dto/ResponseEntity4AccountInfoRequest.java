package com.vulnerablebank.server.dto;

public class ResponseEntity4AccountInfoRequest {
    public int status;
    public String message;
    public AccountInfoDto accountInfo;

    public ResponseEntity4AccountInfoRequest() {
        super();
    }

    public ResponseEntity4AccountInfoRequest(
        int status,
        String message,
        AccountInfoDto accountInfo
    ) {
        super();
        this.status = status;
        this.message = message;
        this.accountInfo = accountInfo;
    }
}
