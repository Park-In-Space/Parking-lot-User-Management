package com.parkinspace.parkinglotmanagement.data;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

/*CREATE TABLE `parkinglotuser`.`parkinglotusers` (
  `id_plu` INT NOT NULL AUTO_INCREMENT,
  `userid` VARCHAR(400) NOT NULL,
  `username` VARCHAR(50) NOT NULL,
  `email` VARCHAR(200) NOT NULL,
  `name` VARCHAR(200) NOT NULL,
  `phone` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_plu`));*/

@Entity
@Table(name = "parkinglotusers")
public class ParkinglotUser {

  @Column(name = "id_plu")
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private int id;
  @Column
  private String userid;
  @Column
  private String username;
  @Column
  private String email;
  @Column
  private String name;
  @Column
  private String phone;

  @JsonIgnore
  @OneToMany(mappedBy = "parkinglotuser")
  private List<Parkinglots> parkinglots;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getUserId() {
    return userid;
  }

  public void setUserId(String userid) {
    this.userid = userid;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public List<Parkinglots> getParkinglots() {
    return parkinglots;
  }

  public void setParkinglots(List<Parkinglots> parkinglots) {
    this.parkinglots = parkinglots;
  }

}
