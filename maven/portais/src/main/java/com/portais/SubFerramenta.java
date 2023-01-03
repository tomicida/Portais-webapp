package com.portais;

import java.util.ArrayList;

public class SubFerramenta implements Cloneable{
    public int type;
    public int offset;
    public int optionPerPage;
    public String prevResult;
    public String repeatString;
    public Ferramenta mainFerramenta;
    public ArrayList<SubFerramenta> subFerramentas;
    public ArrayList<String> resultados;
    public ArrayList<String> resultados2;
    public ArrayList<String> ações;
    public ArrayList<String> funções;
    public boolean inactive;
    public boolean multi;
    public String ownDecreto;
    public String repeatString2;

    public SubFerramenta(Ferramenta ferramenta, String prevResult){
        repeatString= "";
        repeatString2= "";
        type = 0;
        offset = 1;
        optionPerPage = 10;
        inactive = false;
        multi = false;
        
        resultados = new ArrayList<String>();
        resultados2 = new ArrayList<String>();
        subFerramentas = new ArrayList<SubFerramenta>();
        ações = new ArrayList<String>();
        funções = new ArrayList<String>();

        this.mainFerramenta = ferramenta;
        this.prevResult = prevResult;
    }

    public String Decreto(ArrayList<Integer> index, Cliente cliente){
        String decreto = ownDecreto;
        if(decreto == null) 
            decreto = mainFerramenta.Decreto;

        if(!ações.isEmpty()){
            decreto = decreto.replace("(ação)", "<b style=\"color:blue;\">" +ações.get(index.get(index.size()-1))+ "</b>");
            decreto = decreto.replace("(Ação)", "<b style=\"color:blue;\">" +ações.get(index.get(index.size()-1))+ "</b>");
            decreto = decreto.replace("(todas as ativações que saírem por ordem)", "<b style=\"color:blue;\">" +ações.get(index.get(index.size()-1))+ "</b>");
        }

        if(!resultados2.isEmpty()){
            decreto = decreto.replace("(anomalia deus)", "<b style=\"color:blue;\">" +resultados2.get(index.get(1))+ "</b>");
        }
        
        if(index.size()==3){
            decreto = decreto.replace("(campo, número, ligação)", "<b style=\"color:blue;\">" + mainFerramenta.resultados.get(index.get(0)) + " com tipo "+(index.get(1)+offset)+" " + prevResult+" e ligação " + resultados.get(index.get(2)) + "</b>");
            decreto = decreto.replace("(# valor)", "<b style=\"color:blue;\">" + prevResult + "</b>");
            decreto = decreto.replace("(canal)", "<b style=\"color:blue;\">" + prevResult + "</b>");
            decreto = decreto.replace("(orgão)", "<b style=\"color:blue;\">" + resultados.get(index.get(2)) + "</b>");
            decreto = decreto.replace("(hormona)", "<b style=\"color:blue;\">" + resultados.get(index.get(2)) + "</b>");
            decreto = decreto.replace("(ponto)", "<b style=\"color:blue;\">" + ações.get(index.get(2)) + "</b>");
            decreto = decreto.replace("(localização)", "<b style=\"color:blue;\">" + prevResult + "</b>");
            decreto = decreto.replace("(nome do elemento)", "<b style=\"color:blue;\">" + resultados.get(index.get(2)) + "</b>");
            decreto = decreto.replace("(simbolo reiki)", "<b style=\"color:blue;\">" + resultados.get(index.get(2)) + "</b>");
            decreto = decreto.replace("(index reiki)", "<b style=\"color:blue;\">" + index.get(2) + "</b>");
            decreto = decreto.replace("(geopatia)","<b style=\"color:blue;\">" + resultados.get(index.get(2)) + "</b>");
            decreto = decreto.replace("(tipo geo)","<b style=\"color:blue;\">" + resultados.get(index.get(2)) + "</b>");
            decreto = decreto.replace("(desig)", "<b style=\"color:blue;\">" + resultados.get(index.get(2)) + "</b>");
            if(!resultados2.isEmpty())decreto = decreto.replace("(geopatias)","<b style=\"color:blue;\">" + resultados2.get(index.get(2)) + "</b>");
        }

        if(index.size()==4){
            decreto = decreto.replace("(simbolo reiki)", "<b style=\"color:blue;\">" + resultados.get(index.get(3)) + "</b>");
            decreto = decreto.replace("(cómodo)", "<b style=\"color:blue;\">" + mainFerramenta.subFerramentas.get(index.get(0)).subFerramentas.get(index.get(1)).resultados.get(index.get(2)) + "</b>");
            decreto = decreto.replace("(nome do ou dos elementos)", "<b style=\"color:blue;\">" + resultados.get(index.get(3)) + "</b>");
            decreto = decreto.replace("(desig)", "<b style=\"color:blue;\">" + prevResult + "</b>");
            decreto = decreto.replace("(geopatia)","<b style=\"color:blue;\">Inimigos Ocultos " + resultados.get(index.get(3)) + "</b>");
        }

        if(resultados.size()>index.get(1)){
            decreto = decreto.replace("(index)", "<b style=\"color:blue;\">" + index.get(1)+ "</b>");
            decreto = decreto.replace("(campo, número, ligação)", "<b style=\"color:blue;\">" + mainFerramenta.resultados.get(index.get(0))+"; "+ resultados.get(index.get(1))+"</b>");
            decreto = decreto.replace("(nome do floral)", "<b style=\"color:blue;\">" + resultados.get(index.get(1)) + "</b>");
            decreto = decreto.replace("(nome da cepa)", "<b style=\"color:blue;\">" + resultados.get(index.get(1)) + "</b>");
            decreto = decreto.replace("(indicação)", "<b style=\"color:blue;\">" + resultados.get(index.get(1)) + "</b>");
            decreto = decreto.replace("(oligoelemento)", "<b style=\"color:blue;\">" + resultados.get(index.get(1)) + "</b>");
            decreto = decreto.replace("(sintoma)", "<b style=\"color:blue;\">" + resultados.get(index.get(1)) + "</b>");
            decreto = decreto.replace("(causa)", "<b style=\"color:blue;\">" + resultados.get(index.get(1))+ "</b>");
            decreto = decreto.replace("(nome do cristal)", "<b style=\"color:blue;\">" + resultados.get(index.get(1))+ "</b>");
            decreto = decreto.replace("(princípio)", "<b style=\"color:blue;\">" + resultados.get(index.get(1))+ "</b>");
            decreto = decreto.replace("(designar qual ou quais por ordem de saída)", "<b style=\"color:blue;\">" + resultados.get(index.get(1))+ "</b>");
            decreto = decreto.replace("(simbolo)", "<b style=\"color:blue;\">" + resultados.get(index.get(1))+ "</b>");
            decreto = decreto.replace("(nome de deus)", "<b style=\"color:blue;\">" + resultados.get(index.get(1))+ "</b>");
            if(!ações.isEmpty()){
                decreto = decreto.replace("(nº e designação)", "<b style=\"color:blue;\">" + (index.get(1) + offset) + " " + resultados.get(index.get(1))+" "+  ações.get(index.get(1)) + "</b>");
            }
        }
        decreto = decreto.replace("(designação)", "<b style=\"color:blue;\">" + mainFerramenta.subFerramentas.get(index.get(0)).resultados.get(index.get(1))+ "</b>");

        decreto = mainFerramenta.subDecreto(decreto, index.get(0), cliente);

        return decreto;
    }

    public String Decreto(ArrayList<Integer> index, Cliente cliente, ArrayList<Integer> results, int resultIndex){
        String decreto = ownDecreto;

        for (int i = 0; i < results.size() ; i++) {
            if(i == results.size()-1)
                decreto = decreto.replace("(next)", repeatString);
            else
                decreto = decreto.replace("(next)", repeatString+"(next)");
            
            if(i == results.size()-1)
                decreto = decreto.replace("(next2)", repeatString2);
            else
                decreto = decreto.replace("(next2)", repeatString2+"(next2)");

            index.set(resultIndex-2, results.get(i));
            decreto = subDecreto(decreto, index, cliente);
        }

        return decreto;
    }

    public String subDecreto(String decreto, ArrayList<Integer> index, Cliente cliente){
        String tempMain = ownDecreto;
        String result;
        ownDecreto = decreto;
        result = Decreto(index, cliente);
        ownDecreto = tempMain;
        return result;
    }

    public String toString(){
        String result;

        result = prevResult + "\n";
        for (SubFerramenta subFerramenta : subFerramentas) {
            result += subFerramenta.toString() + "\n";
        }
        return result;
    }

    public Object clone(){  
        try{  
            return super.clone();  
        }catch(Exception e){ 
            return null; 
        }
    }
}
