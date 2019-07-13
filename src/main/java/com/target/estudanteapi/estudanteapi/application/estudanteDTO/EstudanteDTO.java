package com.target.estudanteapi.estudanteapi.application.estudanteDTO;

public class EstudanteDTO {

    public EstudanteDTO(String nomeEstudante, String matricula, Integer idade, String turma, String matriculas) {
        this.nomeEstudante = nomeEstudante;
        this.matricula = matricula;
        this.idade = idade;
        this.turma = turma;
        this.matriculas = matriculas;
    }

    private String nomeEstudante;
    private String matricula;
    private Integer idade;
    private String turma;
    private String matriculas;

    public String getNomeEstudante() {
        return nomeEstudante;
    }

    public String getMatricula() {
        return matricula;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getTurma() {
        return turma;
    }

    public String getMatriculas() {
        return matriculas;
    }



    //    public String getNomeEstudante() {
//        return nomeEstudante;
//    }
//
//    public void setNomeEstudante(String nomeEstudante) {
//        this.nomeEstudante = nomeEstudante;
//    }
//
//    public String getMatricula() {
//        return matricula;
//    }
//
//    public void setMatricula(Long matricula) {
//        this.matricula = matricula;
//    }
//
//    public Integer getIdade() {
//        return idade;
//    }
//
//    public void setIdade(Integer idade) {
//        this.idade = idade;
//    }
//
//    public Integer getTurma() {
//        return turma;
//    }
//
//    public void setTurma(Integer turma) {
//        this.turma = turma;
//    }
}
