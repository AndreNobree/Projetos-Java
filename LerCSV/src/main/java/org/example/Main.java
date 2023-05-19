import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String path = "C:\\Users\\andre.felipe\\Desktop\\Relatório csv.csv";


        List<Product> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))){

            String line = br.readLine();
//            line = br.readLine();//descartar a primeira linha, porém CSV n vem com titulo

            while (line != null){
                String[] vect = line.split(";");//separando colunas por ( ; )
                String status = vect[0];
                Integer patrimonio = Integer.parseInt(vect[1]);
//                String foto = vect[2];
                String descricao = vect[3];
                String marca = vect[4];
                String grupo = vect[5];
                String modelo = vect[6];
                if (modelo.isEmpty()){
                    modelo = "NÃO IDENTIFICADO";
                }
                String garantia = vect[7];

                String local = vect[8];
                Pattern pattern = Pattern.compile(".*?\">");//tirar a tag HTML
                Matcher matcher = pattern.matcher(local);
                if (matcher.find()) {
                    local = matcher.replaceAll("").replace("</A>", "");//tirar a tag HTML 2 parte
                } else {
                    local = "NÃO IDENTIFICADO";
                }

                String valorManu = vect[9];

                if (valorManu.isEmpty()){
                    modelo = "NÃO IDENTIFICADO";
                }
//                String funcao = vect[10];
//                if (funcao.isEmpty()){
//                    funcao = "NÃO IDENTIFICADO";
//                }


                Product prod = new Product(status, patrimonio, descricao, marca, grupo, modelo,
                        garantia, local, valorManu);
                list.add(prod);

                line = br.readLine();
            }
            for (Product p : list){
                System.out.println(p);
            }

        }catch (IOException e){
            System.out.println("ERRO AO LER O ARQUIVO "+ e.getMessage());
        }
    }
}