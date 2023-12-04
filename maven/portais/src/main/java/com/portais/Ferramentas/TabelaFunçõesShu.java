package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.SubFerramenta;

public class TabelaFunçõesShu extends SubFerramenta{
    public TabelaFunçõesShu (Ferramenta mainFerramenta){
        super(mainFerramenta, "Tabela Funções Shu");
        SubFerramenta subSubTemp;

        this.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método de Cura Quântica Multidimensional e a Matriz dos Meridianos Energéticos com a função de equilibrar as funções Shu, pedindo ao Eu Superior de (nome do consulente) permissão para atuar nos seus campos, chakras e corpos sutis. Ativo agora a frequência do ponto (ponto) na localização (canal). Que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo";
        this.resultados.add("Pulmão");
        this.resultados.add("Mestre do Coração");
        this.resultados.add("Coração");
        this.resultados.add("Intestino Delgado");
        this.resultados.add("Triplo Aquecedor");
        this.resultados.add("Intestino Grosso");
        this.resultados.add("Bexiga");
        this.resultados.add("Vesícula Biliar");
        this.resultados.add("Estômago");
        this.resultados.add("Rim");
        this.resultados.add("Baço-Pâncreas");
        this.resultados.add("Fígado");

        subSubTemp = new SubFerramenta(mainFerramenta, "Pulmão");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");

        subSubTemp.ações.add("11");
        subSubTemp.ações.add("10");
        subSubTemp.ações.add("9");
        subSubTemp.ações.add("8");
        subSubTemp.ações.add("5");
        subSubTemp.ownDecreto = this.ownDecreto;
        this.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(mainFerramenta, "Mestre do Coração");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("9");
        subSubTemp.ações.add("8");
        subSubTemp.ações.add("7");
        subSubTemp.ações.add("5");
        subSubTemp.ações.add("3");
        subSubTemp.ownDecreto = this.ownDecreto;
        this.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(mainFerramenta, "Coração");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("9");
        subSubTemp.ações.add("8");
        subSubTemp.ações.add("7");
        subSubTemp.ações.add("4");
        subSubTemp.ações.add("3");
        subSubTemp.ownDecreto = this.ownDecreto;
        this.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(mainFerramenta, "Intestino Delgado");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("1");
        subSubTemp.ações.add("2");
        subSubTemp.ações.add("3");
        subSubTemp.ações.add("5");
        subSubTemp.ações.add("8");
        subSubTemp.ownDecreto = this.ownDecreto;
        this.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(mainFerramenta, "Triplo Aquecedor");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("1");
        subSubTemp.ações.add("2");
        subSubTemp.ações.add("3");
        subSubTemp.ações.add("6");
        subSubTemp.ações.add("10");
        subSubTemp.ownDecreto = this.ownDecreto;
        this.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(mainFerramenta, "Intestino Grosso");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("1");
        subSubTemp.ações.add("2");
        subSubTemp.ações.add("3");
        subSubTemp.ações.add("5");
        subSubTemp.ações.add("11");
        subSubTemp.ownDecreto = this.ownDecreto;
        this.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(mainFerramenta, "Bexiga");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("67");
        subSubTemp.ações.add("66");
        subSubTemp.ações.add("65");
        subSubTemp.ações.add("60");
        subSubTemp.ações.add("40");
        subSubTemp.ownDecreto = this.ownDecreto;
        this.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(mainFerramenta, "Vesícula Biliar");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("44");
        subSubTemp.ações.add("43");
        subSubTemp.ações.add("41");
        subSubTemp.ações.add("38");
        subSubTemp.ações.add("34");
        subSubTemp.ownDecreto = this.ownDecreto;
        this.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(mainFerramenta, "Estômago");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("45");
        subSubTemp.ações.add("44");
        subSubTemp.ações.add("43");
        subSubTemp.ações.add("41");
        subSubTemp.ações.add("36");
        subSubTemp.ownDecreto = this.ownDecreto;
        this.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(mainFerramenta, "Rim");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("1");
        subSubTemp.ações.add("2");
        subSubTemp.ações.add("3");
        subSubTemp.ações.add("7");
        subSubTemp.ações.add("10");
        subSubTemp.ownDecreto = this.ownDecreto;
        this.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(mainFerramenta, "Baço-Pâncreas");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("1");
        subSubTemp.ações.add("2");
        subSubTemp.ações.add("3");
        subSubTemp.ações.add("5");
        subSubTemp.ações.add("9");
        subSubTemp.ownDecreto = this.ownDecreto;
        this.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(mainFerramenta, "Fígado");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("1");
        subSubTemp.ações.add("2");
        subSubTemp.ações.add("3");
        subSubTemp.ações.add("4");
        subSubTemp.ações.add("8");
        subSubTemp.ownDecreto = this.ownDecreto;
        this.subFerramentas.add(subSubTemp);
        
    }
}
