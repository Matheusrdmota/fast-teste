package analisador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class AnalisadorDePresenca {

    private String[] atas;
    private List<List<String>> colaboradoresEmCadaWorkshop;

    public AnalisadorDePresenca(String[] atas){
        this.atas = atas;
        this.colaboradoresEmCadaWorkshop = new ArrayList<>();
        this.encontraColaboradoresEmCadaWorkshop();
    }

    public String[] colaboradoresQueViram2WorkshopsSeguidos(){
        //Variável que armazenará os colaboradores que estiveram presentes em dois workshops seguidos
        List<String> listaDeColaboradoresQueViramDoisWorkshopsSeguidos = new ArrayList<>();

        //Itera e compara a ata atual e ata anterior para encontrar os colaboradores que estiveram presentes em ambas
        for(int i = 1; i < colaboradoresEmCadaWorkshop.size(); i++){

            List<String> ataAtual = colaboradoresEmCadaWorkshop.get(i);
            List<String> ataAnterior = colaboradoresEmCadaWorkshop.get(i - 1);

            for(int j = 0; j < ataAtual.size(); j++){
                String colaborador = ataAtual.get(j);

                if(ataAnterior.contains(colaborador) &&
                        !listaDeColaboradoresQueViramDoisWorkshopsSeguidos.contains(colaborador)){

                    listaDeColaboradoresQueViramDoisWorkshopsSeguidos.add(colaborador);

                }
            }
        }
        //Coloca a lista em ordem alfabética
        Collections.sort(listaDeColaboradoresQueViramDoisWorkshopsSeguidos);

        //Retorna a lista convertida em array de string
        return this.converteArrayListEmStringArray(listaDeColaboradoresQueViramDoisWorkshopsSeguidos);
    }

    //Método para criar array de arrays com o id de cada colaborador que participou do workshop
    private void encontraColaboradoresEmCadaWorkshop(){
        this.colaboradoresEmCadaWorkshop = Arrays.stream(this.atas)
                .map(x -> Arrays.stream(x.split(" ")).collect(Collectors.toList()))
                .collect(Collectors.toList());
    }

    //Método de conversão de ArrayList em array de String
    private String[] converteArrayListEmStringArray(List<String> arrayList){
        String[] arrayListConvertido = arrayList.toArray(new String[arrayList.size()]);
        return arrayListConvertido;
    }
}
