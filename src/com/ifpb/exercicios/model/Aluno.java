package com.ifpb.exercicios.model;

import java.time.LocalDate;

public class Aluno {

    private String cpf;
    private int matricula;
    private String nome;
    private LocalDate nascimento;
    private float nota1;
    private float nota2;

    public Aluno(String cpf, int matricula, String nome, LocalDate nascimento,
                 float nota1, float nota2) {
        this.cpf = cpf;
        this.matricula = matricula;
        this.nome = nome;
        this.nascimento = nascimento;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public void setNascimento(LocalDate nascimento) {
        this.nascimento = nascimento;
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

}
