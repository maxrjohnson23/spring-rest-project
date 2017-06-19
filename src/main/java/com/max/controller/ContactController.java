package com.max.controller;

import com.max.model.Contact;
import com.max.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ContactController {

  @Autowired
  private ContactRepository contactRepository;

  @PostMapping(path = "/contacts")
  public Contact saveContact(@RequestBody Contact contact) {
    contactRepository.save(contact);
    return contact;
  }

  @GetMapping(path = "/contacts")
  public List<Contact> getContacts() {
    return contactRepository.findAll();
  }

}
