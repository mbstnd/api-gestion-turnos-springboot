package com.cliniservice.api_gestion_turnos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cliniservice.api_gestion_turnos.models.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
  boolean existsByRut(String rut);

  Usuario findByRut(String rut);

}
