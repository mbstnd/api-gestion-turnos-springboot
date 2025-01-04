package com.cliniservice.api_gestion_turnos.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cliniservice.api_gestion_turnos.models.Turno;

public interface TurnoRepository extends JpaRepository<Turno, Long> {
  List<Turno> findByUsuarioId(Long usuarioId);

}
