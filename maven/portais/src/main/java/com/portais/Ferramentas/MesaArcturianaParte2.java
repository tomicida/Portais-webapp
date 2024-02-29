package com.portais.Ferramentas;

import java.util.ArrayList;

import com.portais.Cliente;
import com.portais.Ferramenta;
import com.portais.SubFerramenta;

public class MesaArcturianaParte2 extends SubFerramenta{

     String AdeninaDNA;
     String AdeninaRNA;
     String CitosinaDNA;
     String CitosinaRNA;
     String GuaninaDNA;
     String GuaninaRNA;
     String Timina;
     String Uracila;
     int TomIndex;
     int SeloIndex;
     String Kin;
     long matrizTempo;
     long matrizEspaço;
     long matrizSincronica;

     public MesaArcturianaParte2(Ferramenta mainFerramenta){
        super(mainFerramenta, "Mesa Arcturiana");
        this.type = 3;

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

        this.ownDecreto = "Abrindo os canais de comunicação individuais de (nome do consulente) e entrelaçando com os a informação da Mãe-Terra e do Portal Cósmico para uma perfeita comunicação.<br>\r\n" + //
                        "Abrindo e ativando o (selo); (tom), regenerando o RNA e ativando a sincronia ressonante de regeneração do DNA com (Kin).<br>\r\n"+ //
                        "Imprimindo no fluxo energético de (nome do consulente) as frequências de regeneração das bases nitrogenadas presentes no DNA: citosina (Citosina DNA), guanina (Guanina DNA), adenina (Adenina DNA), e timina (Timina), e no RNA: citosina (Citosina RNA), guanina (Guanina RNA), adenina (Adenina RNA), e uracila (Uracila).<br>\r\n" + //
                        "Ativando a combinação harmônica das bases nitrogenadas com (falar o código número por número da esquerda para a direita).<br>\r\n" + //
                        "Ativando o código matriz do tempo (matriz tempo).<br>\r\n" + //
                        "Ativando o código matriz do espaço (matriz espaço).<br>\r\n" + //
                        "Ativando o código da matriz sincrônica (matriz sincronica).<br>\r\n" + //
                        "Imprimindo em todos os campos de informação de (nome do consulente) a informação de cura impressa no decreto, agora. Imprimindo, ativando, fluindo.";
     }

     @Override
     public String Decreto(ArrayList<Integer> index, Cliente cliente){
          
          String result = ownDecreto.replace("(nome do consulente)", "<b style=\"color:blue;\">" +cliente.nome+ "</b>");

          result = result.replace("(selo)", "<b style=\"color:blue;\">" +selos.get(SeloIndex)+"/"+forças.get(SeloIndex)+ "</b>");
          result = result.replace("(tom)", "<b style=\"color:blue;\">" +tons.get(TomIndex)+"/"+funções.get(TomIndex)+ "</b>");
          result = result.replace("(Kin)", "<b style=\"color:blue;\">Kin " +Kin+ "</b>");

          result = result.replace("(matriz tempo)", "<b style=\"color:blue;\">" +matrizTempo+ "</b>");
          result = result.replace("(matriz espaço)", "<b style=\"color:blue;\">" +matrizEspaço+ "</b>");
          result = result.replace("(matriz sincronica)", "<b style=\"color:blue;\">" +matrizSincronica+ "</b>");

          result = result.replace("(Citosina DNA)", "<b style=\"color:blue;\">" +CitosinaDNA+ " Hz</b>");
          result = result.replace("(Citosina RNA)", "<b style=\"color:blue;\">" +CitosinaRNA+ " Hz</b>");
          result = result.replace("(Adenina DNA)", "<b style=\"color:blue;\">" +AdeninaDNA+ " Hz</b>");
          result = result.replace("(Adenina RNA)", "<b style=\"color:blue;\">" +AdeninaRNA+ " Hz</b>");
          result = result.replace("(Guanina DNA)", "<b style=\"color:blue;\">" +GuaninaDNA+ " Hz</b>");
          result = result.replace("(Guanina RNA)", "<b style=\"color:blue;\">" +GuaninaRNA+ " Hz</b>");
          result = result.replace("(Timina)", "<b style=\"color:blue;\">" +Timina+ " Hz</b>");
          result = result.replace("(Uracila)", "<b style=\"color:blue;\">" +Uracila+ " Hz</b>");

          return result;
     }


     public String getAdeninaDNA() {
          return AdeninaDNA;
     }

     public void setAdeninaDNA(String adeninaDNA) {
          AdeninaDNA = adeninaDNA;
     }
     
     public String getAdeninaRNA() {
          return AdeninaRNA;
     }

     public void setAdeninaRNA(String adeninaRNA) {
          AdeninaRNA = adeninaRNA;
     }

     public String getCitosinaDNA() {
          return CitosinaDNA;
     }

     public void setCitosinaDNA(String citosinaDNA) {
          CitosinaDNA = citosinaDNA;
     }

     public String getCitosinaRNA() {
          return CitosinaRNA;
     }

     public void setCitosinaRNA(String citosinaRNA) {
          CitosinaRNA = citosinaRNA;
     }

     public String getGuaninaDNA() {
          return GuaninaDNA;
     }

     public void setGuaninaDNA(String guaninaDNA) {
          GuaninaDNA = guaninaDNA;
     }

     public String getGuaninaRNA() {
          return GuaninaRNA;
     }

     public void setGuaninaRNA(String guaninaRNA) {
          GuaninaRNA = guaninaRNA;
     }

     public String getTimina() {
          return Timina;
     }

     public void setTimina(String timina) {
          Timina = timina;
     }

     public String getUracila() {
          return Uracila;
     }

     public void setUracila(String uracila) {
          Uracila = uracila;
     }
     

     public String getKin() {
          return Kin;
     }


     public void setKin(String kin) {
          Kin = kin;
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

     public int getTomIndex() {
          return TomIndex;
     }

     public void setTomIndex(int tomIndex) {
          TomIndex = tomIndex;
     }

     public int getSeloIndex() {
          return SeloIndex;
     }

     public void setSeloIndex(int seloIndex) {
          SeloIndex = seloIndex;
     }

}
