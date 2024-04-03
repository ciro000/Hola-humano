package com.example.demo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HolaHumanoController {
	
	@GetMapping("/")
	public String index(@RequestParam(value="name", required=false) String nombre,
						@RequestParam(value="lastName", required=false) String apellido) {
		
		if(nombre == null) {
			return "Hola! humano";
		}
		
		else if(apellido == null) {
			return "Hola " + nombre + "!";
		}
		
		else {
			return "Hola " + nombre + " " + apellido + "!";
		}
	}

}
