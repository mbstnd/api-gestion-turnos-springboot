package com.cliniservice.api_gestion_turnos.services;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cliniservice.api_gestion_turnos.dto.UsuarioDTO;
import com.cliniservice.api_gestion_turnos.models.RolUsuario;
import com.cliniservice.api_gestion_turnos.models.Usuario;
import com.cliniservice.api_gestion_turnos.repositories.UsuarioRepository;

@Service
public class UsuarioService {

  @Autowired
  private UsuarioRepository usuarioRepository;

  public Usuario registrarUsuario(UsuarioDTO usuarioDTO) {
    if (usuarioRepository.existsByRut(usuarioDTO.getRut())) {
      throw new RuntimeException("El RUT ya está registrado");
    }

    Usuario usuario = new Usuario();
    usuario.setNombre(usuarioDTO.getNombre());
    usuario.setApellido(usuarioDTO.getApellido());
    usuario.setRut(usuarioDTO.getRut());
    usuario.setCorreoElectronico(usuarioDTO.getCorreoElectronico());
    usuario.setFechaNacimiento(LocalDate.parse(usuarioDTO.getFechaNacimiento()));
    usuario.setTelefono(usuarioDTO.getTelefono());
    usuario.setEmpresa(usuarioDTO.getEmpresa());
    usuario.setFechaIngreso(LocalDate.now());

    usuario.setRol(RolUsuario.CLIENTE);

    return usuarioRepository.save(usuario);
  }

}
