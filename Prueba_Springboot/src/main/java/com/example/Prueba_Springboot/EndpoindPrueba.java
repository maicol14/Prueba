package com.example.Prueba_Springboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EndpoindPrueba {
	
	 @GetMapping("/products")
	    public List<NumerosEndp> getProducts() {
	        return Arrays.asList(
	            new NumerosEndp(1,2),
	            new NumerosEndp(3,5),
	            new NumerosEndp(6,8)
	        );
	    }
}



