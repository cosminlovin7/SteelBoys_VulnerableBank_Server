package com.vulnerablebank.server.dto;

public class AccountInfoDto {
    public String firstName;
    public String lastName;
    public String email;
    public Integer balance;

    public AccountInfoDto() {
        super();
    }

    public AccountInfoDto(
        String firstName,
        String lastName,
        String email,
        Integer balance
    ) {
        super();
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.balance = balance;
    }
}
