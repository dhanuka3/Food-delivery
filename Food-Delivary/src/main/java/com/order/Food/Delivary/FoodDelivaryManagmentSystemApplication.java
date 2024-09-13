package com.order.Food.Delivary;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class FoodDelivaryManagmentSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(FoodDelivaryManagmentSystemApplication.class, args);
	}
	@Bean
	public ModelMapper modelMapper(){
		return new ModelMapper();
	}
}

