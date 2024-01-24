package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;

public class CromoterapiaFreq extends Ferramenta{
    public CromoterapiaFreq (Portal portal, int id){
        super("Cromoterapia", portal, id);
        this.multi = true;
        this.resultados.add("Vermelho");
        this.resultados.add("Laranja");
        this.resultados.add("Amarelo");
        this.resultados.add("Verde");
        this.resultados.add("Ciano");
        this.resultados.add("Azul");
        this.resultados.add("Violeta");
        
        this.resultados2.add("480 THz");
        this.resultados2.add("510 THz");
        this.resultados2.add("530 THz");
        this.resultados2.add("600 THz");
        this.resultados2.add("620 THz");
        this.resultados2.add("680 THz");
        this.resultados2.add("790 THz");

        this.ações.add("Ajudar a colocar-se nas situações com mais firmeza");
        this.ações.add("Ajudar a sair da procrastinação e falta de ação");
        this.ações.add("Estimular o intelecto, a clareza mental e a criatividade");
        this.ações.add("Ativar a cura de todos os corpos e alinhamento dos chakras");
        this.ações.add("Equilibrar a calma e a paciência em todas as situações");
        this.ações.add("Ativar o empoderamento pessoal e a proteção energética");
        this.ações.add("Desenvolver a criatividade na intuição e a autoconfiança");

        this.repeatString = "a (frequência) de (resultado) para (ação) ";
        this.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta), peço permissão ao Eu Superior de (nome do consulente) para imprimir em todos os seus corpos e todos os chakras (next) para que beneficiem a tomada de decisão. Pulsa no campo, pulsa no campo, pulsa no campo.";

    }
    
}
