package com.pragma.powerup.usermicroservice.adapters.driving.http.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class OwnerResponseDto {
    private Long id;
    private String name;
    private String surname;
    private Long idNumber;
    private String cellPhone;
    private String birthdate;
    private String mail;
    private String password;
}
