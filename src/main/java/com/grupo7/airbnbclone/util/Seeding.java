package com.grupo7.airbnbclone.util;

import com.grupo7.airbnbclone.model.*;
import com.grupo7.airbnbclone.repositories.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
@Configuration
public class Seeding implements ApplicationRunner {


    private UsuarioRepository usuarioRepository;
    private CasaRepository casaRepository;

    @Autowired
    public Seeding(UsuarioRepository usuarioRepository, CasaRepository casaRepository) {
        this.usuarioRepository = usuarioRepository;
        this.casaRepository = casaRepository;
    }

    public void run(ApplicationArguments args){

        Usuario usuario1 = new Usuario();
        usuario1.setNome("William");
        usuario1.setSobrenome("Rodrigues");
        usuario1.setIdade(35);

        Casa casa1= new Casa();
        casa1.setNome("HomeSweethome");
        casa1.setEndereco("Rua dos bobos numero 0");

        usuario1.setCasa(casa1);
        casa1.setUsuario(usuario1);
        usuarioRepository.save(usuario1);
        casaRepository.save(casa1);



    }

}
