package uy.veterinaria.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.veterinaria.response.MascotaResponse;

@RestController
@RequestMapping("/empleados")
public class EmpleadosController {

	@GetMapping("")
	public List<MascotaResponse> getGatos() {
		return new ArrayList<>();
	}
	
}
