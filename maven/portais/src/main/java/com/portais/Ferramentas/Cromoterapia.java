package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;

public class Cromoterapia extends Ferramenta{
    public Cromoterapia(Portal portal,int id){
        super("Cromoterapia", portal, id);

        this.multi = true;

        this.resultados.add("Branco");
        this.resultados.add("Verde");
        this.resultados.add("Violeta");
        this.resultados.add("Laranja");
        this.resultados.add("Vermelho");
        this.resultados.add("Azul");
        this.resultados.add("Amarelo");
        this.resultados.add("Indigo");

        this.ações.add("Potenciamento de todas as cores e a elevação de frequência ao máximo do campo mórfico");
        this.ações.add("A energia da natureza, na força equilibrada dos sentidos no ambiente. Baixo no ambiente a frequência da esperança, da satisfação e da saúde");
        this.ações.add("A purificação, transformando e transmutando todas as energias negativas em positivas no campo mórfico");
        this.ações.add("O auxílio da mente a assimilar novas ideias, estimular os sentidos, a criatividade e a comunicação no campo mórfico");
        this.ações.add("Activação e estimulação das relações interpessoais, com energia sexual de ação e a criatividade e estimulando o apetite e a fala direta");
        this.ações.add("Transmissão de calma e serenidade e acionando o seu poder asséptico. Ativando tranquilidade aos ambientes");
        this.ações.add("A ativação da mente, os pensamentos, o ânimo, inspiração e estimulação do raciocínio no auto-controle");
        this.ações.add("Auxílio em todos os casos em que as tensões e restrições do meio produzem estado de má saúde física, emocional ou mental");
        
        this.repeatString = "(resultado), promovendo (nome da ação), ";
        this.Decreto = "Eu ativo a Matriz de Cromoterapia para que limpe a informação anomala no ambiente de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela frequência da cor (next) na quantidade certa e na medida exata, reconstruindo e fortalecendo, reconstruindo e fortalecendo, reconstruindo e fortalecendo o campo anómalo, assim como a consciência de mudança de (nome completo do consulente).";

    }
    
}
