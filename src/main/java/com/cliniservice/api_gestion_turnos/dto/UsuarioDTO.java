package com.cliniservice.api_gestion_turnos.dto;

import lombok.Data;

@Data
public class UsuarioDTO {
  private String nombre;
  private String apellido;
  private String rut;
  private String correoElectronico;
  private String fechaNacimiento;
  private String telefono;
  private String empresa;

}
