package com.max.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Date;
import java.util.Map;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table
public class Contact {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private long id;

  private String name;
  private String company;
  private boolean favorite;
  private String smallImageURL;
  private String largeImageURL;
  private String email;
  private String website;
  private Date birthdate;
  private String workPhone;
  private String homePhone;
  private String mobilePhone;
  @OneToOne(cascade = CascadeType.ALL)
  private Address address;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public boolean isFavorite() {
    return favorite;
  }

  public void setFavorite(boolean favorite) {
    this.favorite = favorite;
  }

  public String getSmallImageURL() {
    return smallImageURL;
  }

  public void setSmallImageURL(String smallImageURL) {
    this.smallImageURL = smallImageURL;
  }

  public String getLargeImageURL() {
    return largeImageURL;
  }

  public void setLargeImageURL(String largeImageURL) {
    this.largeImageURL = largeImageURL;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getWebsite() {
    return website;
  }

  public void setWebsite(String website) {
    this.website = website;
  }

  public Date getBirthdate() {
    return birthdate;
  }

  public void setBirthdate(Date birthdate) {
    this.birthdate = birthdate;
  }

  public String getWorkPhone() {
    return workPhone;
  }

  public void setWorkPhone(String workPhone) {
    this.workPhone = workPhone;
  }

  public String getHomePhone() {
    return homePhone;
  }

  public void setHomePhone(String homePhone) {
    this.homePhone = homePhone;
  }

  public String getMobilePhone() {
    return mobilePhone;
  }

  public void setMobilePhone(String mobilePhone) {
    this.mobilePhone = mobilePhone;
  }

  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public String getCompany() {
    return company;
  }

  public void setCompany(String company) {
    this.company = company;
  }

  @JsonProperty("phone")
  private void mapFromNestedPhoneObject(Map<String, String> phone) {
    workPhone = phone.get("work");
    homePhone = phone.get("home");
    mobilePhone = phone.get("mobile");
  }
}



