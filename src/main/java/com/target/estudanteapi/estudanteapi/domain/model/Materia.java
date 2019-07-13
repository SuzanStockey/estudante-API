package com.target.estudanteapi.estudanteapi.domain.model;

import javax.persistence.*;

@Entity
@Table(name = "Materia")
public class Materia extends BaseEntity{

    @Column(nullable = false,unique = true,name = "codigo")
    private String codigo;

    @Column(nullable = false, unique = true, name = "nome")
    private String nome;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
