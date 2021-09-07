package uy.veterinaria.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import uy.veterinaria.dataaccess.IMascotasDataAccess;
import uy.veterinaria.model.Mascota;
import uy.veterinaria.request.MascotaRequest;
import uy.veterinaria.response.MascotaResponse;

@Service
public class MascotasServices {

	@Autowired
	private IMascotasDataAccess mascotasDataAccess;
	
	public List<MascotaResponse> get() {
		List<Mascota> mascotas = mascotasDataAccess.findAll();
		List<MascotaResponse> mascotasResponse = new ArrayList<>();
		for (Mascota m : mascotas) {
			MascotaResponse paco = new MascotaResponse();
			paco.setNombre(m.getNombre());
			paco.setEdad(m.getEdad());
			mascotasResponse.add(paco);
		}
		return mascotasResponse;
	}

	public MascotaResponse crear(MascotaRequest mascotaSolicitud) {
		Mascota mascotaAGuardar = new Mascota();
		mascotaAGuardar.setEdad(mascotaSolicitud.getEdad());
		mascotaAGuardar.setNombre(mascotaSolicitud.getNombre());		
		Mascota mascotas = mascotasDataAccess.saveAndFlush(mascotaAGuardar);
		MascotaResponse mascotasResponse = new MascotaResponse();
		mascotasResponse.setId(mascotas.getId());
		mascotasResponse.setEdad(mascotas.getEdad());
		mascotasResponse.setNombre(mascotas.getNombre());
		return mascotasResponse;
	}

}
