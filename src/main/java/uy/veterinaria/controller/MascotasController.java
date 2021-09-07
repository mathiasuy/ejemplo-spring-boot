package uy.veterinaria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import uy.veterinaria.request.MascotaRequest;
import uy.veterinaria.response.MascotaResponse;
import uy.veterinaria.services.MascotasServices;

@RestController
@RequestMapping("/mascotas")
public class MascotasController {

	@Autowired
	private MascotasServices mascotasServices;

	@GetMapping("/get")
	public List<MascotaResponse> getGatos() {
		return mascotasServices.get();
	}

	@PostMapping("/crear")
	public MascotaResponse crear(@RequestBody MascotaRequest mascotaSolicitud) {
		return mascotasServices.crear(mascotaSolicitud);
	}
}
