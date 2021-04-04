package com.parkinspace.parkinglotmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/*
sudo docker run --network='host' -p 8080:8080 -e DB_HOST=127.0.0.1 -e DB_PORT=3306 -e DB_USER=admin -e DB_PASSWORD=password -e DB_NAME=parkinglotuser -e URL=0.0.0.0:8080 parkinglot-management:0.0.2-SNAPSHOT
*/


@SpringBootApplication
public class ParkinglotManagementApplication {

	public static void main(String[] args) {
		SpringApplication.run(ParkinglotManagementApplication.class, args);
	}

}
