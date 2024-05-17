package com.vulnerablebank.server.dto;

public class ResponseEntity4LoginRequest {
    public int status;
    public String message;
    public String CTF_SMD_LOGIN_FLAG;

    public ResponseEntity4LoginRequest() {
        super();
    }

    public ResponseEntity4LoginRequest(int status, String message) {
        super();
        this.status = status;
        this.message = message;
        this.CTF_SMD_LOGIN_FLAG = "Well done! You have discovered one of the flags! The default password is: CTF_SMD_LOGIN_FLAG_2024. It can be used with any id for login.";
    }
}
