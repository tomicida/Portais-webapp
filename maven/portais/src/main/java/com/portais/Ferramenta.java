package com.portais;

import java.util.ArrayList;

public class Ferramenta {
    public String name;
    public String repeatString;
    public String Decreto;
    public ArrayList<String> resultados;
    public ArrayList<String> resultados2;
    public ArrayList<String> ações;
    public ArrayList<String> funções;
    public ArrayList<SubFerramenta> subFerramentas;
    public int type;
    public int id;
    public int optionPerPage;
    public int offset;
    public boolean multi;
    public Portal portal;
    public Portal target;
    public String repeatString2;

    public Ferramenta(String name, Portal portal,int id){
        Decreto = "ERRO DECRETO";
        repeatString = "";
        repeatString2 = "";
        type = 0;
        offset = 1;
        optionPerPage = 15;
        multi = false;
        
        resultados = new ArrayList<String>();
        resultados2 = new ArrayList<String>();
        ações = new ArrayList<String>();
        funções = new ArrayList<String>();
        subFerramentas = new ArrayList<SubFerramenta>();

        this.name = name;
        this.portal = portal;
        this.id = id;
    }

    public String Decreto(int index, Cliente cliente){
        String decreto;

        //Blue
        decreto = Decreto.replace("(nome do consulente)", "<b style=\"color:blue;\">" +cliente.nome+ "</b>");
        decreto = decreto.replace("(nome do terapeuta)","<b style=\"color:blue;\">" +cliente.nomeTerapeuta+ "</b>");
        
        if (!resultados.isEmpty()) decreto = decreto.replace("(resultado)","<b style=\"color:blue;\">" +resultados.get(index)+ "</b>");
        if (!resultados.isEmpty()) decreto = decreto.replace("(nº e designação)", "<b style=\"color:blue;\">"+(index+1) +" "+resultados.get(index)+ "</b>");
        if (!resultados.isEmpty()) decreto = decreto.replace("(cor)", "<b style=\"color:blue;\">" +resultados.get(index)+ "</b>");
        if (!ações.isEmpty()) decreto = decreto.replace("(todas as ativações que saírem por ordem)", "<b style=\"color:blue;\">" +ações.get(index)+ "</b>");
        if (!ações.isEmpty()) decreto = decreto.replace("(nome da ação)", "<b style=\"color:blue;\">" +ações.get(index)+ "</b>");
        if (!ações.isEmpty()) decreto = decreto.replace("(ação)", "<b style=\"color:blue;\">" +ações.get(index)+ "</b>");
        if (!resultados2.isEmpty()) decreto = decreto.replace("(frequência em MHz)","<b style=\"color:blue;\">" +resultados2.get(index)+ " MHz</b>");
        if (!resultados2.isEmpty()) decreto = decreto.replace("(frequência)","<b style=\"color:blue;\">" +resultados2.get(index)+ "</b>");

        //Red
        decreto = decreto.replace("(x)", "<b style=\"color:red;\">(x) </b>");
        decreto = decreto.replace("(y)", "<b style=\"color:red;\">(y) </b>");
        decreto = decreto.replace("(z)", "<b style=\"color:red;\">(z) </b>");
        decreto = decreto.replace("(efeito)","<b style=\"color:red;\">(efeito) </b>");
        decreto = decreto.replace("(tipo de ambiente)","<b style=\"color:red;\"> (tipo de ambiente) </b>");
        decreto = decreto.replace("(medir no relógio de mensuração)", "<b style=\"color:red;\">(medir no relógio de mensuração) </b>");
        decreto = decreto.replace("(x vezes dia)", "<b style=\"color:red;\">(x vezes ao dia) </b>");
        decreto = decreto.replace("(dias,semanas,meses)", "<b style=\"color:red;\">(dias, semanas, meses) </b>");
        decreto = decreto.replace("(definir atuação do cristal)", "<b style=\"color:red;\">(definir atuação do cristal) </b>");
        decreto = decreto.replace("(medir no biometro)", "<b style=\"color:red;\">(medir no biometro) </b>");
        decreto = decreto.replace("(casa ou empresa)", "<b style=\"color:red;\">(casa ou empresa) </b>");
        decreto = decreto.replace("(medir no biómetro)", "<b style=\"color:red;\">(medir no biometro) </b>");
        decreto = decreto.replace("(x vezes, medir no biometro)", "<b style=\"color:red;\">(x vezes, medir no biometro) </b>");
        decreto = decreto.replace("(dias, semanas, meses, medir no biometro)", "<b style=\"color:red;\">(dias, semanas, meses, medir no biometro) </b>");

        return decreto;
    }

    public String Decreto(ArrayList<Integer> indexArray, Cliente cliente){
        String decreto = Decreto;

        for (int i = 0; i < indexArray.size() ; i++) {
            if(i == indexArray.size()-1)
                decreto = decreto.replace("(next)", repeatString);
            else
                decreto = decreto.replace("(next)", repeatString+"(next)");

            if(i == indexArray.size()-1)
                decreto = decreto.replace("(next2)", repeatString2);
            else
                decreto = decreto.replace("(next2)", repeatString2+"(next2)");

            decreto = subDecreto(decreto, indexArray.get(i), cliente);
        }

        return decreto;
    }


    public String subDecreto(String decreto, int index, Cliente cliente){
        String tempMain = Decreto;
        String result;
        Decreto = decreto;
        result = Decreto(index, cliente);
        Decreto = tempMain;
        return result;
    }

    public String toString(){
        String result = name + "\n";

        for (SubFerramenta subFerramenta : subFerramentas) {
            result += subFerramenta.toString() + "\n";
        }

        return result;
    }
}
