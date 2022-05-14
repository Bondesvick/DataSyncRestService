package com.stanbic.service.salesforce.data.sync.service.mappers;

import com.stanbic.service.salesforce.data.sync.service.DTOs.User;
import com.stanbic.service.salesforce.data.sync.service.entities.LocalSalesforceUser;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    UserMapper MAPPER = Mappers.getMapper(UserMapper.class);

    User getUser(LocalSalesforceUser localSalesforceUser);

    List<User> getUsers(List<LocalSalesforceUser> localSalesforceUserList);

//    /////////

    LocalSalesforceUser setUser(User user);

    List<LocalSalesforceUser> setUsers(List<User> userList);
}