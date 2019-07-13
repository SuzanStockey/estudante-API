package com.target.estudanteapi.estudanteapi.domain.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "Estudante")
public class Estudante extends BaseEntity{

    @Column(name = "nomeEstudante", length = 255, nullable = false, unique = true)
    private String nomeEstudante;

    @Column(name = "matricula", nullable = false, unique = true, length = 10)
    private String matricula;

    @Column(name = "idade",nullable = false)
    private Integer idade;

    @Column(name = "turma",nullable = false)
    String turma;

    @ManyToMany
    List<Materia> materias;

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public void setNomeEstudante(String nomeEstudante) {
        this.nomeEstudante = nomeEstudante;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    public List<Materia> getMaterias() {
        return materias;
    }

    public void setMaterias(List<Materia> materias) {
        this.materias = materias;
    }

    public String getMateriasNomes() {
        String nomesMatriculas = "";

        for (Materia materia: this.materias) {
            nomesMatriculas += materia.getNome() + ", ";
        }

        return nomesMatriculas;
    }
}
