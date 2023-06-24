package com.pragma.powerup.usermicroservice.domain.usecase;

import com.pragma.powerup.usermicroservice.adapters.driven.jpa.mysql.exceptions.*;
import com.pragma.powerup.usermicroservice.domain.api.IOwnerServicePort;
import com.pragma.powerup.usermicroservice.domain.model.Owner;
import com.pragma.powerup.usermicroservice.domain.spi.IOwnerPersistencePort;

import java.util.regex.Pattern;


public class OwnerUseCase implements IOwnerServicePort, IOwnerPersistencePort {
    private final IOwnerPersistencePort ownerPersistencePort;

    public OwnerUseCase(IOwnerPersistencePort ownerPersistencePort) {
        this.ownerPersistencePort = ownerPersistencePort;
    }

    @Override
    public void saveOwner(Owner owner) {
        /*
        * Here we have the validation function
        * */

        ownerPersistencePort.validateOwner(owner);
        ownerPersistencePort.saveOwner(owner);
    }
    /*Validation function mentioned in saveOwner*/
    public void validateOwner(Owner owner) {
        validateMandatoryFields(owner);
        validateEmail(owner.getMail());
        validatePhoneNumber(owner.getCellPhone());
        validateIdentificationDocument(owner.getDniNumber());
        //validateAge(owner.getBirthDate());
    }
    /*Validation for empty fields*/
    private void validateMandatoryFields(Owner owner) {
        if (owner.getName() == null || owner.getName().isEmpty() || owner.getName().isBlank() ||
                owner.getSurname() == null || owner.getSurname().isEmpty() || owner.getSurname().isBlank() ||
                owner.getDniNumber() == null || owner.getDniNumber().isEmpty() || owner.getDniNumber().isBlank() ||
                owner.getCellPhone() == null || owner.getCellPhone().isEmpty() || owner.getCellPhone().isBlank() ||
                owner.getMail() == null || owner.getMail().isEmpty() || owner.getMail().isBlank() ||
                owner.getPassword() == null || owner.getPassword().isEmpty() || owner.getPassword().isBlank()) {
            throw new InvalidNullFieldsException();
        }
    }
    /*Email validation*/
    private void validateEmail(String email) {
        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$";
        if (!Pattern.matches(emailRegex, email)) {
            throw new InvalidMailException();
        }

    }

    /*Phone format validation*/
    private void validatePhoneNumber(String phoneNumber) {
        if (phoneNumber.length() > 13 || !phoneNumber.matches("^[0-9+]+$")) {
            throw new InvalidPhoneNumberException();
        }
    }

    /*Document number validation*/
    private void validateIdentificationDocument(String identificationDocument) {
        if (!identificationDocument.matches("^[0-9]+$")) {
            throw new InvalidIdDocumentException();
        }
    }

    /*BirthDate Validation*/
    /*
    private void validateAge(Date dateOfBirth) {

        LocalDate currentDate = LocalDate.now();
        LocalDate birthDate = dateOfBirth.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int age = Period.between(birthDate, currentDate).getYears();
        if (age < 18) {
            throw new IllegalArgumentException("User must be of legal age.");
        }
    }
    */

}
