package com.grupo3azarquiel.demo.controller;


import com.grupo3azarquiel.demo.models.Usuario;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;


@RestController
public class UsuarioController {

    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable Long id ) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Ejemplo");
        usuario.setId(id);
        usuario.setApellido("Ejemplo");
        usuario.setEmail("ejemplo@gmail.com");
        usuario.setTelefono("656753440");

        return usuario;
    }

    @RequestMapping(value = "usuario1")
    public Usuario editar( ) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Ejemplo");
        usuario.setApellido("Ejemplo");
        usuario.setEmail("ejemplo@gmail.com");
        usuario.setTelefono("656753440");

        return usuario;
    }

    @RequestMapping(value = "usuario12")
    public Usuario eliminar( ) {
        Usuario usuario = new Usuario();
        usuario.setNombre("Ejemplo");
        usuario.setApellido("Ejemplo");
        usuario.setEmail("ejemplo@gmail.com");
        usuario.setTelefono("656753440");
        return usuario;
    }

    @RequestMapping(value = "usuario123")
    public Usuario buscar() {
        Usuario usuario = new Usuario();
        usuario.setNombre("Ejemplo");
        usuario.setApellido("Ejemplo");
        usuario.setEmail("ejemplo@gmail.com");
        usuario.setTelefono("656753440");

        return usuario;
    }

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios() {
        List<Usuario> usuarios = new ArrayList<>();
        Usuario usuario = new Usuario();
        usuario.setNombre("Ejemplo");
        usuario.setId(123L);
        usuario.setApellido("Ejemplo");
        usuario.setEmail("ejemplo@gmail.com");
        usuario.setTelefono("656753440");


        Usuario usuario2 = new Usuario();
        usuario2.setNombre("Ejemplo2");
        usuario2.setId(65L);
        usuario2.setApellido("Ejemplo2");
        usuario2.setEmail("ejemplo2@gmail.com");
        usuario2.setTelefono("698254621");

        Usuario usuario3 = new Usuario();
        usuario3.setNombre("Ejemplo3");
        usuario3.setId(23L);
        usuario3.setApellido("Ejemplo3");
        usuario3.setEmail("ejemplo3@gmail.com");
        usuario3.setTelefono("650369721");

        usuarios.add(usuario);
        usuarios.add(usuario2);
        usuarios.add(usuario3);
        return usuarios;
    }

}
