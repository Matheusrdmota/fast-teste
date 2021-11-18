import analisador.AnalisadorDePresenca;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Incializa cinco variáveis com os inputs que serão testados
        String[] input = {"hbas ies", "alco2 hbas", "pot alco2 hbas"};
        String[] input2 = {"hbas ies alco", "alco hbas tst gkmo", "pot aacs alco aaosc fgrr", "till ies alco2 tst gkmo hbas"};
        String[] input3 = {"hbas ies", "", "alco hbas gkmo"};
        String[] input4 = {};
        String[] input5 = {"hbas ies", "hbas ies"};

        //Inicializa as classes analisadoras de presenças com os cinco inputs
        AnalisadorDePresenca analisadorDePresenca = new AnalisadorDePresenca(input);
        AnalisadorDePresenca analisadorDePresenca2 = new AnalisadorDePresenca(input2);
        AnalisadorDePresenca analisadorDePresenca3 = new AnalisadorDePresenca(input3);
        AnalisadorDePresenca analisadorDePresenca4 = new AnalisadorDePresenca(input4);
        AnalisadorDePresenca analisadorDePresenca5 = new AnalisadorDePresenca(input5);

        //output dos dados
        System.out.println(Arrays.toString(analisadorDePresenca.colaboradoresQueViram2WorkshopsSeguidos()));
        System.out.println(Arrays.toString(analisadorDePresenca2.colaboradoresQueViram2WorkshopsSeguidos()));
        System.out.println(Arrays.toString(analisadorDePresenca3.colaboradoresQueViram2WorkshopsSeguidos()));
        System.out.println(Arrays.toString(analisadorDePresenca4.colaboradoresQueViram2WorkshopsSeguidos()));
        System.out.println(Arrays.toString(analisadorDePresenca5.colaboradoresQueViram2WorkshopsSeguidos()));
    }
}
