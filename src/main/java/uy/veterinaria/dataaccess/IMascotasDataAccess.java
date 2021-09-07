package uy.veterinaria.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import uy.veterinaria.model.Mascota;

@Repository
public interface IMascotasDataAccess extends JpaRepository<Mascota, Long>{

}
