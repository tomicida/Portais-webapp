package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;

public class Aromaterapia extends Ferramenta{
    public Aromaterapia (Portal portal, int id){
        super("Aromaterapia", portal, id);

        this.multi = true;
        this.resultados.add("Manjericão");
        this.resultados.add("Hortelã-Pimenta");
        this.resultados.add("Alecrim");
        this.resultados.add("Sândalo");
        this.resultados.add("Junípero");
        this.resultados.add("Mirra");
        this.resultados.add("Bergamota");
        this.resultados.add("Camomila Azul");
        this.resultados.add("Tanaceto Azul");
        this.resultados.add("Melissa");
        this.resultados.add("Lavanda");
        this.resultados.add("Ravintsara");
        this.resultados.add("Olíbano");
        this.resultados.add("Sempreviva");
        this.resultados.add("Rosa Damascena");

        this.resultados2.add("52");
        this.resultados2.add("78");
        this.resultados2.add("81");
        this.resultados2.add("96");
        this.resultados2.add("98");
        this.resultados2.add("105");
        this.resultados2.add("105");
        this.resultados2.add("105");
        this.resultados2.add("105");
        this.resultados2.add("105");
        this.resultados2.add("118");
        this.resultados2.add("134");
        this.resultados2.add("147");
        this.resultados2.add("181");
        this.resultados2.add("320");

        this.ações.add("Higienizar o ambiente");
        this.ações.add("Prevenção de discussões e tensões no ambiente");
        this.ações.add("Remover a frequência de exaustão física e mental do ambiente");
        this.ações.add("Despertar o desejo sexual e estimular a líbido");
        this.ações.add("Reanimar e revitalizar o ambiente carregado psiquicamente");
        this.ações.add("Dissipar a negatividade");
        this.ações.add("Promover o empoderamento pessoal");
        this.ações.add("Harmonizar e dissipar de tensões no ambiente");
        this.ações.add("Prevenir alergias e infeções no ambiente");
        this.ações.add("Promover o aconchego e a calma no ambiente");
        this.ações.add("Criar uma atmosfera pacífica e conciliadora, com ternura");
        this.ações.add("Estimular o sistema imunitário e promove o vigor físico e mental");
        this.ações.add("Facilitar a cura de quadros psicossomáticos");
        this.ações.add("Promover o sentimento de rejuvenescimento e gratidão");
        this.ações.add("Favorecer o sentimento de perdão no ambiente");

        this.repeatString = "(resultado), enviando para o campo a frequência de (frequência em MHz) para (ação), ";
        this.Decreto = "Eu ativo a Matriz de Aromaterapia para que reconstrua a informação no ambiente de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Ativando a reconstrução do ambiente e regeneração da informação de equilíbrio. Ativo o óleo essencial (next) reconstruindo e harmonizando o campo anómalo, assim como a consciência de mudança de (nome do consulente). Ativado agora. Pulsa no campo, pulsa no campo, pulsa no campo.";

        
    }
}
