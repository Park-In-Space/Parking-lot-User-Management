package com.parkinspace.parkinglotmanagement.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*CREATE TABLE `parkinglotuser`.`parkinglots` (
  `id_pl` INT NOT NULL AUTO_INCREMENT,
  `id_plu` INT NOT NULL,
  `password` VARCHAR(50) NOT NULL,
  `name` VARCHAR(200) NOT NULL,
  `description` VARCHAR(250) NULL,
  `slots` INT NOT NULL,
  `location` VARCHAR(100) NOT NULL,
  PRIMARY KEY (`id_pl`));*/

@Entity
@Table( name = "parkinglots" )
public class Parkinglots {

    @Column(name = "id_pl")
    @Id
    private int id;

    @ManyToOne
    @JoinColumn(name="id_plu", nullable=false)
    private ParkinglotUser parkinglotuser;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ParkinglotUser getParkinglotuser() {
        return parkinglotuser;
    }

    public void setParkinglotuser(ParkinglotUser parkinglotuser) {
        this.parkinglotuser = parkinglotuser;
    }
    
}
