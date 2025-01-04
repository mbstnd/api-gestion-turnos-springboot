package com.cliniservice.api_gestion_turnos.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cliniservice.api_gestion_turnos.dto.UsuarioDTO;
import com.cliniservice.api_gestion_turnos.services.UsuarioService;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

  @Autowired
  private UsuarioService usuarioService;

  @PostMapping("/create")
  public ResponseEntity<?> registrarUsuario(@RequestBody UsuarioDTO usuarioDTO) {
    try {
      return ResponseEntity.ok(usuarioService.registrarUsuario(usuarioDTO));
    } catch (RuntimeException e) {
      return ResponseEntity.badRequest().body(e.getMessage());
    }
  }

}
