package com.portais.Ferramentas;

import java.util.ArrayList;

import com.portais.Cliente;
import com.portais.Ferramenta;
import com.portais.SubFerramenta;

public class MesaArcturiana extends SubFerramenta{

    int currentSeloIndex;
    int currentTomIndex;
    long matrizTempo;
    long  matrizEspaço;
    long  matrizSincronica;

    public MesaArcturiana(Ferramenta mainFerramenta){
        super(mainFerramenta, "Mesa Arcturiana");
        this.type = 2;

        //chalras
        this.resultados.add("Materialização");
        this.resultados.add("Manifestação");
        this.resultados.add("Yin Yang");
        this.resultados.add("Interrelações");
        this.resultados.add("Emoções");
        this.resultados.add("Comunicação");
        this.resultados.add("Cognição");
        this.resultados.add("C. Etérica");
        this.resultados.add("C. Mórfica");

        //selos
        this.selos.add("Dragão");
        this.selos.add("Vento");
        this.selos.add("Noite");
        this.selos.add("Semente");
        this.selos.add("Serpente");
        this.selos.add("Enlaçador de");
        this.selos.add("Mão");
        this.selos.add("Estrela");
        this.selos.add("Lua");
        this.selos.add("Cachorro");
        this.selos.add("Macaco");
        this.selos.add("Humano");
        this.selos.add("Caminhante");
        this.selos.add("Mago");
        this.selos.add("Águia");
        this.selos.add("Guerreiro");
        this.selos.add("Terra");
        this.selos.add("Espelho");
        this.selos.add("Tormenta");
        this.selos.add("Sol");

        this.forças.add("Nutrir");
        this.forças.add("Comunicar");
        this.forças.add("Referenciar");
        this.forças.add("Florescer");
        this.forças.add("Transcender");
        this.forças.add("Transcomunicar");
        this.forças.add("Compreender");
        this.forças.add("Embelezar");
        this.forças.add("Purificar");
        this.forças.add("Amar");
        this.forças.add("Desfrutar");
        this.forças.add("Manifestar");
        this.forças.add("Explorar");
        this.forças.add("Transmutar");
        this.forças.add("Criar");
        this.forças.add("Questionar");
        this.forças.add("Navegar");
        this.forças.add("Refletir");
        this.forças.add("Transformar");
        this.forças.add("Iluminar");


        //tons
        this.tons.add("Magnético");
        this.tons.add("Lunar");
        this.tons.add("Elétrico");
        this.tons.add("Autoexistente");
        this.tons.add("Harmônico");
        this.tons.add("Ritmíco");
        this.tons.add("Ressonante");
        this.tons.add("Galáctico");
        this.tons.add("Solar");
        this.tons.add("Planetário");
        this.tons.add("Espectral");
        this.tons.add("Cristal");
        this.tons.add("Cósmico");

        this.funções.add("Unifica o propósito");
        this.funções.add("Identifica o desafio");
        this.funções.add("Identifica e ativa o serviço");
        this.funções.add("Define a forma de atuação");
        this.funções.add("Potencializa a radiação, comanda e lidera");
        this.funções.add("Organiza a igualdade, equilibra, modera as");
        this.funções.add("Canaliza a entoação e inspira");
        this.funções.add("Sintoniza a integridade e modela");
        this.funções.add("Pulsa a intenção e realiza.");
        this.funções.add("Aperfeiçoa a manifestação. Produz.");
        this.funções.add("Dissolve. Liberta.");
        this.funções.add("Dedica a cooperação. Universaliza.");
        this.funções.add("Persevera a presença. Transcende.");

        this.subFerramentas.add(new MesaArcturianaParte2(mainFerramenta));

        this.repeatString = "Abrindo e ativando o (selo); (tom) no chakra de (resultado)<br>\r\n";

        this.ownDecreto = "Abrindo os canais de comunicação individuais de (nome do consulente) e entrelaçando com os a informação da Mãe-Terra e do Portal Cósmico para uma perfeita comunicação.<br>\r\n" + //
                        "(next)" + //
                        "Ativando o código matriz do tempo (matriz tempo)<br>\r\n" + //
                        "Ativando o código matriz do espaço (matriz espaço)<br>\r\n" + //
                        "Ativando o código da matriz sincrônica (matriz sincrônica)<br>\r\n" + //
                        "Imprimindo em todos os campos de informação de (nome do consulente) a informação de cura impressa no decreto, agora. Imprimindo, ativando, fluindo.";
    }

    
    public String ArcturianaDecreto(ArrayList<Integer> index, Cliente cliente, ArrayList<Integer[]> results, int resultIndex){
        String decreto = subDecreto(ownDecreto, index, cliente);;

        decreto = decreto.replace("(matriz tempo)", "<b style=\"color:blue;\">" +matrizTempo+ "</b>");
        decreto = decreto.replace("(matriz espaço)", "<b style=\"color:blue;\">" +matrizEspaço+ "</b>");
        decreto = decreto.replace("(matriz sincrônica)", "<b style=\"color:blue;\">" +matrizSincronica+ "</b>");;

        for (int i = 0; i < results.size() ; i++) {
            if(i == results.size()-1)
                decreto = decreto.replace("(next)", repeatString);
            else
                decreto = decreto.replace("(next)", repeatString+"(next)");

            System.out.println(index);
            System.out.println(resultIndex);
            index.set(resultIndex, results.get(i)[0]);

            decreto = decreto.replace("(resultado)", "<b style=\"color:blue;\">" +resultados.get(results.get(i)[0])+ "</b>");
            decreto = decreto.replace("(selo)", "<b style=\"color:blue;\">" +selos.get(results.get(i)[1])+"/"+forças.get(results.get(i)[1])+ "</b>");
            decreto = decreto.replace("(tom)", "<b style=\"color:blue;\">" +tons.get(results.get(i)[2])+"/"+funções.get(results.get(i)[2])+ "</b>");
        }

        return decreto;
    }

    public long getMatrizTempo() {
        return matrizTempo;
    }


    public void setMatrizTempo(long matrizTempo) {
        this.matrizTempo = matrizTempo;
    }
    
    public long getMatrizEspaço() {
        return matrizEspaço;
    }


    public void setMatrizEspaço(long matrizEspaço) {
        this.matrizEspaço = matrizEspaço;
    }


    public long getMatrizSincronica() {
        return matrizSincronica;
    }


    public void setMatrizSincronica(long matrizSincronica) {
        this.matrizSincronica = matrizSincronica;
    }
}
