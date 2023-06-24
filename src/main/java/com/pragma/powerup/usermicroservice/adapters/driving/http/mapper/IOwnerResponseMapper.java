package com.pragma.powerup.usermicroservice.adapters.driving.http.mapper;

import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.response.OwnerResponseDto;
import com.pragma.powerup.usermicroservice.adapters.driving.http.dto.response.PersonResponseDto;
import com.pragma.powerup.usermicroservice.domain.model.Owner;
import com.pragma.powerup.usermicroservice.domain.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;

import java.util.List;

@Mapper(componentModel = "spring",
        unmappedTargetPolicy = ReportingPolicy.IGNORE,
        unmappedSourcePolicy = ReportingPolicy.IGNORE)
public interface IOwnerResponseMapper {

    @Mapping(source = "owner.name", target = "name")
    @Mapping(source = "owner.surname", target = "surname")
    @Mapping(source = "owner.dniNumber", target = "dniNumber")
    @Mapping(source = "owner.cellPhone", target = "cellPhone")
    @Mapping(source = "owner.birthDate", target = "birthDate")
    @Mapping(source = "owner.mail", target = "mail")
    @Mapping(source = "owner.password", target = "password")
    OwnerResponseDto userToOwnerResponse(User user);
    List<OwnerResponseDto> userListToOwnerResponseList(List<User> userList);

}
