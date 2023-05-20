package org.example;
import java.util.Scanner;
/*
* 1 - home (menu de opções)
* 2 - consulta saldo
* 3 - faz deposito
* 4 - sacar quantia
* 5 - extrato bancário
* */
public class Main {
    //static ConsultaSaldo chamaConsultaSaldo = new ConsultaSaldo();
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        OpcoesMenu chamaOpcoesMenu = new OpcoesMenu();
        Funcoes chamaFuncoes = new Funcoes();



        while(true){
            chamaOpcoesMenu.menu();
            System.out.print("DIGITE A OPÇÃO QUE DESEJA (1-5): ");
            Integer respOpcao = entrada.nextInt();

            switch (respOpcao){
                case 1 ->  chamaFuncoes.mostraSaldo();
                case 2 ->  chamaFuncoes.fazDeposito(entrada);
                case 3 ->  chamaFuncoes.sacarDinheiro(entrada);
                case 4 ->  chamaFuncoes.mostraExtrato();
                case 5 ->  System.out.print("SEÇÃO ENCERRADA\n");
                default -> System.out.println("CODIGO INCORRETO");
            }
            if(respOpcao == 5){
                break;
            }
        }
        entrada.close();
    }
}