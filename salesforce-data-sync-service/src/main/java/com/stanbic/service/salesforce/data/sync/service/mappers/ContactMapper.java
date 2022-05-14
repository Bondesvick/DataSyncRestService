package com.stanbic.service.salesforce.data.sync.service.mappers;

import com.stanbic.service.salesforce.data.sync.service.DTOs.Contact;
import com.stanbic.service.salesforce.data.sync.service.entities.LocalFinacleContact;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ContactMapper {
    ContactMapper MAPPER = Mappers.getMapper(ContactMapper.class);

    Contact getContact(LocalFinacleContact localFinacleContact);

    List<Contact> getContacts(List<LocalFinacleContact> localFinacleContactList);
}
