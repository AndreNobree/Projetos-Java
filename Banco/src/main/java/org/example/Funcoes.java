package org.example;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class Funcoes {
    //List<Double> extrato = new ArrayList<Double>();
    List<Double> saldoInicial = new ArrayList<>();
    public Double mostraSaldo() {
        try {
            if (saldoInicial.isEmpty()) {
                saldoInicial.add(0.0);
                System.out.printf("SEU SALDO É DE %.2f \n", saldoInicial.get(0));
            } else {
                int ultimoIndice = saldoInicial.size() - 1;
                Double ultimoValor = saldoInicial.get(ultimoIndice);
                System.out.printf("SEU SALDO É DE %.2f \n", ultimoValor);
            }

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return null;
    }
    void fazDeposito(Scanner entrada){
        try{
            System.out.print("ENTRE COM O VALOR DO DEPOSITO\n>> ");
            Double deposito = entrada.nextDouble();

            saldoInicial.add(deposito);

            Thread.sleep(2000);
            System.out.println("DEPÓSITO REALIZADO COM SUCESSO!!");
            Thread.sleep(1000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    void sacarDinheiro(Scanner entrada){
        try{
            System.out.print("ENTRE COM O VALOR DO SAQUE\n>> ");
            Double saque = entrada.nextDouble();

            int ultimoIndice = saldoInicial.size() - 1;
            Double ultimoValor = saldoInicial.get(ultimoIndice);
            ultimoValor -= saque;
            if (ultimoValor < 0){
                System.out.println("VOCÊ NÃO POSSUI SALDO SUFICIENTE");
                Thread.sleep(1000);
            }else{
                saldoInicial.add(ultimoValor);
                Thread.sleep(2000);
                System.out.println("SAQUE REALIZADO COM SUCESSO!!");
                Thread.sleep(1000);
            }

        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    void mostraExtrato(){
        try {
            System.out.println("GERANDO EXTRATO...");
            Thread.sleep(3000);
            System.out.print("SEU EXTRATO BANCÁRIO >> ");
            System.out.println(saldoInicial);
            Thread.sleep(5000);

        }catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
