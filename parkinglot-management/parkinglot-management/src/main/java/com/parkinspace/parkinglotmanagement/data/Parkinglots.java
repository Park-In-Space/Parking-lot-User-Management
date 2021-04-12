package com.parkinspace.parkinglotmanagement.data;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/*CREATE TABLE `parkinglotuser`.`parkinglots` (
  `id_pl` INT NOT NULL AUTO_INCREMENT,
  `id_plu` INT NOT NULL,
  `parkingid` INT NOT NULL,
  PRIMARY KEY (`id_pl`), KEY `id_plu` (`id_plu`),CONSTRAINT `parkinglots_ibfk_1`
  FOREIGN KEY (`id_plu`) REFERENCES `parkinglotusers` (`id_plu`));*/

@Entity
@Table( name = "parkinglots" )
public class Parkinglots {

    @Column(name = "id_pl")
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.EAGER,cascade=CascadeType.ALL)
    @JoinColumn(name="id_plu", nullable=false)
    private ParkinglotUser parkinglotuser;

    private int parkingid;
    
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

    public int getParkingid() {
        return parkingid;
    }

    public void setParkingid(int parkingid) {
        this.parkingid = parkingid;
    }
    
}
