package edu.pe.cibertec.DSWII_EF_CACHE_MazuelosJuan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableCaching
@SpringBootApplication
public class DswiiEfCacheMazuelosJuanApplication {

	public static void main(String[] args) {
		SpringApplication.run(DswiiEfCacheMazuelosJuanApplication.class, args);
	}

}
