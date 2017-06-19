package com.max.evalproject.rest;

import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import com.max.controller.ContactController;
import com.max.model.Contact;
import com.max.repository.ContactRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ContactRestTest {


  @Autowired
  WebApplicationContext webApplicationContext;

  @Mock
  ContactRepository contactRepository;

  @InjectMocks
  private ContactController contactController;

  private MockMvc mockMvc;

  @Before
  public void setup() {
    MockitoAnnotations.initMocks(this);
    mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void testCreateContact() throws Exception {
    Contact contact = new Contact();
    contact.setName("Max");
    contact.setEmail("max@test.com");

    when(contactRepository.findOne(1L)).thenReturn(contact);

    mockMvc.perform(get("/contacts")).andExpect(status().isOk()).andExpect(content().contentType(
        MediaType.APPLICATION_JSON_UTF8));


  }

}
