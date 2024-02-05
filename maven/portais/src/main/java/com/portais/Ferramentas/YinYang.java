package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;

public class YinYang extends Ferramenta{
    public YinYang(Portal portal, int id){
        super("Yin Yang", portal, id);

        this.multi = true;

        this.resultados.add("Equilíbrio");
        this.resultados.add("Falta Yang/Racional");
        this.resultados.add("Falta Yin/Emocional");
        this.resultados.add("Excesso Yin/Emocional");
        this.resultados.add("Excesso Yang/Racional");
        this.resultados.add("Excesso Yin/ Passividade");
        this.resultados.add("Excesso Yang/ Atividade");

        this.ações.add("Fixação do equilíbrio em meio da relação");
        this.ações.add("Equilibrio na energia masculina e o lado racional da relação");
        this.ações.add("Equilibrio na energia feminina e o lado emocional da relação");
        this.ações.add("Equilibrio na energia feminina e o lado emocional da relação");
        this.ações.add("Equilibrio na energia masculina e o lado racional da relação");
        this.ações.add("Nivelação da energia passiva com a activa");
        this.ações.add("Nivelação da energia ativa com a passiva");
        
        this.repeatString = "por (resultado) e promovendo (ação), ";
        this.repeatString2= "(ação), ";
        this.Decreto = "Eu ativo a Matriz do Yin Yang para que limpe a informação anomala no relacionamento aqui tratado de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Removendo, destruindo e transmutando todas as frequências de má informação da anomalia (next). Fixo agora no (campo) a ação de (next2). Pulsa no campo, pulsa no campo, pulsa no campo.";

    }
    
}
