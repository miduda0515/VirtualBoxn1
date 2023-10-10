package com.apicomsqlite.aula003.enity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class VirtualBox {
    @Id
    private int id;

    private String nome;
    private String classe;
    private int produto;

    VirtualBox(){}

    public String getClasse() {
        return classe;
    }
    public int getId() {
        return id;
    }
    public int getproduto() {
        return produto;
    }
    public String getNome() {
        return nome;
    }
    
    public void setClasse(String classe) {
        this.classe = classe;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setNivel(int produto) {
        this.nivel = produto;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}