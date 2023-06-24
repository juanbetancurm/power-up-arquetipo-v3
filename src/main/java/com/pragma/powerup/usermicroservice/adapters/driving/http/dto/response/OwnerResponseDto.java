package com.pragma.powerup.usermicroservice.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;



@AllArgsConstructor
@Getter
public class OwnerResponseDto {
    private String name;
    private String surname;
    private String dniNumber;
    private String cellPhone;
    private String birthDate;
    private String mail;
    private String password;
}
