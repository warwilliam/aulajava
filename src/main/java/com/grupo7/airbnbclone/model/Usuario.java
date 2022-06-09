package com.grupo7.airbnbclone.model;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;

@Entity
@Table
public class Usuario {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;
    private String sobrenome;
    private Integer idade;


    @OneToOne(mappedBy ="usuario" ,cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonManagedReference

    private Casa casa;


    public Usuario() {
    }

    public Usuario(Integer id, String nome, String sobrenome, Integer idade, Casa casa) {
        this.id = id;
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.casa = casa;
    }

    public Usuario(String nome, String sobrenome, Integer idade, Casa casa) {
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.idade = idade;
        this.casa = casa;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Casa getCasa() {
        return casa;
    }

    public void setCasa(Casa casa) {
        this.casa = casa;
    }
}
