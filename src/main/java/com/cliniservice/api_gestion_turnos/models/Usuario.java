package com.cliniservice.api_gestion_turnos.models;

import lombok.Data;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false)
  private String nombre;

  @Column
  private String apellido;

  @Column(unique = true, nullable = false)
  private String rut;

  @Column(name = "correo", nullable = false)
  private String correoElectronico;

  @Column(name = "fecha_nacimiento")
  private LocalDate fechaNacimiento;

  private String telefono;

  private String empresa;

  @Column(name = "fecha_ingreso")
  private LocalDate fechaIngreso;

  private RolUsuario rol;

}
