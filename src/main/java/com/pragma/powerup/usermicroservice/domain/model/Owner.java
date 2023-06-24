package com.pragma.powerup.usermicroservice.domain.model;



public class Owner {
    private Long id;
    private String name;
    private String surname;
    private String dniNumber;
    private String cellPhone;
    private String birthDate;
    private String mail;
    private String password;

    public Owner(Long id, String name, String surname, String dniNumber, String cellPhone, String birthDate, String mail, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dniNumber = dniNumber;
        this.cellPhone = cellPhone;
        this.birthDate = birthDate;
        this.mail = mail;
        this.password = password;
    }

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDniNumber() {
        return dniNumber;
    }

    public void setDniNumber(String dniNumber) {
        this.dniNumber = dniNumber;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
