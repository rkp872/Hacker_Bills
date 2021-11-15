package com.infinx;

import com.infinx.entity.Bill;
import com.infinx.repository.BillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.PostConstruct;
import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class HackerBiilsApplication {

	@Autowired
	private BillRepository billRepository;

	public static void main(String[] args) {
		SpringApplication.run(HackerBiilsApplication.class, args);
	}



}
