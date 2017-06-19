package com.max.service;

import com.max.model.Contact;
import com.max.repository.ContactRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {

  @Autowired
  ContactRepository contactRepository;

  @Override
  public Contact getContactById(long id) {
    return contactRepository.getOne(id);
  }

  @Override
  public List<Contact> getAllContacts() {
    return contactRepository.findAll();
  }

  @Override
  public Contact saveContact(Contact contact) {
    return contactRepository.save(contact);
  }
}
