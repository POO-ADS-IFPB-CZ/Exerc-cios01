package com.ifpb.exercicios.view;

import com.ifpb.exercicios.model.ContaCorrente;

public class App {

    public static void main(String[] args) {

        ContaCorrente c1 = new ContaCorrente("João",
                1, 1);
        ContaCorrente c2 = new ContaCorrente("Maria",
                1,2);

        c1.depositar(500);

        c2.depositar(1000);

        if(ContaCorrente.transferir(c2,c1,2000)){
            System.out.println("OK");
        }else{
            System.out.println("Falha!");
        }

        System.out.println(c1.getSaldo());
        System.out.println(c2.getSaldo());

    }

}
