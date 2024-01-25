package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;

public class EscalaDeSolfeggio extends Ferramenta{

    public EscalaDeSolfeggio (Portal portal, int id){
        super("Escala de Solfeggio",portal,id);

        this.multi = true;

        this.resultados.add("UT ou DO");
        this.resultados.add("RE");
        this.resultados.add("MI");
        this.resultados.add("FA");
        this.resultados.add("SOL");
        this.resultados.add("LA");
        this.resultados.add("SI");

        this.ações.add("Libertação de culpas e medos sociais");
        this.ações.add("Facilitar os processos de mudança");
        this.ações.add("Reestruturação da malha energética sutil no ambiente");
        this.ações.add("Harmonizar relações interpessoais e os movimentos sociais");
        this.ações.add("Expressar a verdade, a solução e a clareza no ambiente");
        this.ações.add("Fortalecer a Intuição e os processos criativos");
        this.ações.add("Promover a ativação do propósito no ambiente");

        this.repeatString="(resultado), para (nome da ação), ";
        
        this.Decreto = "Eu ativo a Matriz da Escala de Solfeggio para que limpe a informação anomala no ambiente de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela nota/frequência (next) na quantidade certa e na medida exata, limpando e fortalecendo, fortalecendo e reconstruindo, reconstruindo e harmonizando o campo anómalo, assim como a consciência de mudança de (nome do consulente).";

    }
    
}
