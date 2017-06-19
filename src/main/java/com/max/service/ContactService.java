package com.max.service;

import com.max.model.Contact;
import java.util.List;

public interface ContactService {
    Contact getContactById(long id);

    List<Contact> getAllContacts();

    Contact saveContact(Contact contact);
}
