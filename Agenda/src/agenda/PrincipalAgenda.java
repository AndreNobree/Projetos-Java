package agenda;

import java.util.Scanner;

public class PrincipalAgenda {
    public static void main(String[] args) throws Exception {
        Scanner entrada = new Scanner(System.in);

        String resp; 

        UserDiaHora usuarioUserDiaHora = new UserDiaHora();
        usuarioUserDiaHora.cadastraUser(entrada);
        Menu chamaMenu = new Menu();
        
        System.out.print("OLÁ, ");
        usuarioUserDiaHora.diaHoje();

        while(true){
            System.out.print(" O QUE DESEJA VER? \n");

            chamaMenu.menu();
            System.out.print(">> ");
            resp = entrada.next();

            Acoes chamaAcoes = new Acoes();

            switch(resp){
                case "1"-> chamaAcoes.verAgenda();

                case "2"-> chamaAcoes.insereItem(entrada);

                case "3"-> chamaAcoes.apagaItem(entrada);

                case "4", "sair"-> System.out.println("TERMINANDO PROGRAMA");

                default -> System.out.println("CODIGO INCORRETO");

            }   

            if(resp.equalsIgnoreCase("sair") || resp.equalsIgnoreCase("4")){
                break;
            }
        }
        entrada.close();         
    }

}