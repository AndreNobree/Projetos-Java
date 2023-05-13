package agenda;
import java.util.Scanner;
import java.util.Date;//pegar hora
import java.text.SimpleDateFormat;

public class UserDiaHora {
    String usuario;

    String cadastraUser(Scanner entrada){
        
        System.out.print("Digite seu nome: ");
        usuario = entrada.next().toUpperCase();
        
        
        return usuario;
    }
    void diaHoje(){
        Date dataHoraAtual = new Date();
        SimpleDateFormat formatador = new SimpleDateFormat("HH");
        String horaFormatada = formatador.format(dataHoraAtual);
        
        int horaFormatadaInt = Integer.parseInt(horaFormatada);

        if (horaFormatadaInt > 12 && horaFormatadaInt < 18) {
            System.out.printf("BOA TARDE %s",usuario);
        }else if (horaFormatadaInt >= 18 && horaFormatadaInt <= 23) {
            System.out.printf("BOA NOITE %s",usuario);
        }else{
            System.out.printf("BOM DIA %s",usuario);
        }
    }
}