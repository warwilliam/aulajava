package com.grupo7.airbnbclone.repositories;

import com.grupo7.airbnbclone.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

//Essa interface que concta no banco
public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {
}
