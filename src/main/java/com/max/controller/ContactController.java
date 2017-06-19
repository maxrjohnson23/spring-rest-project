package com.max.controller;

import com.max.model.Contact;
import com.max.service.ContactService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {

  @Autowired
  private ContactService contactService;

  @PostMapping(path = "/contacts")
  public Contact saveContact(@RequestBody Contact contact) {
    contactService.saveContact(contact);
    return contact;
  }

  @GetMapping(path = "/contacts")
  public List<Contact> getContacts() {
    return contactService.getAllContacts();
  }

  @GetMapping(path = "/contacts/{id}")
  public Contact getContact(@PathVariable("id") Long id) {
    return contactService.getContactById(id);
  }


}
