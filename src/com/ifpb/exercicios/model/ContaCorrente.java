package com.ifpb.exercicios.model;

public class ContaCorrente {

    private String titular;
    private int agencia;
    private int conta;
    private float saldo;

    public ContaCorrente(String titular, int agencia, int conta) {
        this.titular = titular;
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = 0;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public float getSaldo() {
        return saldo;
    }

    public boolean sacar(float valor){
        if(valor > saldo){
            return false;
        }else{
            saldo -= valor;
            return true;
        }
    }

    public boolean depositar(float valor) {
        saldo += valor;
        return true;
    }

    public boolean transferir(ContaCorrente destino, float valor){
        if(valor > saldo){
            return false;
        }else{
            saldo -= valor;
            destino.saldo += valor;
            return true;
        }
    }

    // sobrecarga de operador ==> sobrecarga
    public static boolean transferir(ContaCorrente origem, ContaCorrente destino,
                                     float valor){
        if(valor > origem.saldo){
            return false;
        }else{
            origem.saldo -= valor;
            destino.saldo += valor;
            return true;
        }
    }

}
