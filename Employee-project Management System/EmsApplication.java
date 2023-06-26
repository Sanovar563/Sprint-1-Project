
package com.example.ems;

import org.modelmapper.ModelMapper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class EmsApplication  {


	public static void main(String[] args) {
		SpringApplication.run(EmsApplication.class, args);
	}
	
	//modal mapper method 
	@Bean
		public  ModelMapper modelmapper()
	{
		return new ModelMapper();
	}

	


}
