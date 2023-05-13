package agenda;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Acoes {
    public static List<String> lista = new ArrayList<String>();

    void verAgenda() {
        if (lista.isEmpty()){
            System.out.println("SEM COMPROMISSOS REGISTRADOS");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else{
            try {
                System.out.println(lista);
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        return;
    }

    String insereItem(Scanner entrada){
        
        String  result, pergunta, infoHora = " HORA: ", infoData = " DATA: ";
        String novaData, dataExata, compromisso = " COMPROMISSO: ", horaExata, novaHora, novoItem;

        while(true){
            System.out.println("\nINFORME A HORA DO COMPROMISSO(HHMM) ");
            novaHora = entrada.next().trim();
            entrada.nextLine();
            horaExata = novaHora.substring(0, 2) + ":" + novaHora.substring(2);

            System.out.println("INFORME A DATA DO COMPROMISSO(ddMMyyyy)");
            novaData = entrada.next().trim();
            entrada.nextLine();
            String dia = novaData.substring(0, 2);
            String mes = novaData.substring(2, 4);
            String ano = novaData.substring(4, 8);
            dataExata = dia + "/" + mes + "/" + ano +" ";


            System.out.println("INFORME O COMPROMISSO");
            novoItem = entrada.nextLine().trim();
    
            result = infoHora + horaExata + infoData + dataExata + compromisso + novoItem + "\n";
            lista.add(result);
    
            System.out.println("DESEJA ADIONIONAR MAIS UM ITEM?(s/n) ");
            pergunta = entrada.next();
            entrada.nextLine();
    
            if (pergunta.equalsIgnoreCase("s") || pergunta.equalsIgnoreCase("sim")){
                continue;
            }
            else{
                break;
            }
        }
        return result;
    }
    

    String apagaItem(Scanner entrada){

        while(true){
            System.out.println(lista);
            System.out.print("INFORME O NÚMERO DA LINHA DO COMPROMISSO QUE DESEJA APAGAR OU DIGITE 'sair' PARA SAIR\n>>");
            String itemApaga = entrada.next();
            if (itemApaga.equalsIgnoreCase("sair")){
                break;
            }else{
                int indice = Integer.parseInt(itemApaga) - 1;
                lista.remove(indice);
            }
        }
        return "Apagar item";
    }
}