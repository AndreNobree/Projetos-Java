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
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        OpcoesMenu chamaOpcoesMenu = new OpcoesMenu();

        while(true){
            chamaOpcoesMenu.menu();
            System.out.print("DIGITE A OPÇÃO QUE DESEJA (1-5): ");
            Integer respOpcao = entrada.nextInt();

            switch (respOpcao){
                case 1 ->  System.out.print("OPÇÃO 1\n");
                case 2 ->  System.out.print("OPÇÃO 2\n");
                case 3 ->  System.out.print("OPÇÃO 3\n");
                case 4 ->  System.out.print("OPÇÃO 4\n");
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