package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;
import com.portais.SubFerramenta;

public class PortaisDimensionais extends Ferramenta{
    public PortaisDimensionais(Portal portal, int id){
        super("Portais Dimensionais", portal, id);

        SubFerramenta intermedFerramenta;

        this.type = 2;

        this.resultados.add("1ª Dimensão");
        this.resultados.add("2ª Dimensão");
        this.resultados.add("3ª Dimensão");
        this.resultados.add("4ª Dimensão");
        this.resultados.add("5ª Dimensão");
        this.resultados.add("6ª Dimensão");
        this.resultados.add("7ª Dimensão");
        this.resultados.add("8ª Dimensão");

        intermedFerramenta = new SubFerramenta(this, "1ª Dimensão");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        
        intermedFerramenta.ações.add("Ativar o acesso à frequência de conscientização");
        intermedFerramenta.ações.add("Desativar a sensação de não pertença ao planeta");
        intermedFerramenta.ações.add("Ativar a materialização de projetos de propósito");
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "2ª Dimensão");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        
        intermedFerramenta.ações.add("Ativar a vontade de auto-cura celular");
        intermedFerramenta.ações.add("Diluir as crenças e padrões acerca de doença");
        intermedFerramenta.ações.add("Equilibrar o quantum energético de toda a estrutura DNA");
        intermedFerramenta.ações.add("Ativar o o conhecimento do campo mórfico de frequência de informação em Gaya");
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "3ª Dimensão");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        
        intermedFerramenta.ações.add("Ativar o conhecimento das três dimensões físicas");
        intermedFerramenta.ações.add("Equilibrar o propósito no aqui e agora");
        intermedFerramenta.ações.add("Ativar a clareza mental e emocional na tomada de decisão");
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "4ª Dimensão");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        
        intermedFerramenta.ações.add("Ativar a busca conhecimento além da matéria");
        intermedFerramenta.ações.add("Equilibrar o movimento dos corpos sutis no tempo e no espaço");
        intermedFerramenta.ações.add("Desativar crenças e padrões ancestrais");
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "5ª Dimensão");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        
        intermedFerramenta.ações.add("Ativar a consciência do espírito no espaço-tempo");
        intermedFerramenta.ações.add("Programar o campo morfogenético e reestruturar o DNA para assimilar a informação das densidades superiores");
        intermedFerramenta.ações.add("Ativar a sensibilidade e a clareza dos planos sutis. Descalcificar a glândula pineal ativando a amplitude de frequência de 700 a 936Hz, agora");
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "6ª Dimensão");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        
        intermedFerramenta.ações.add("Abrir a consciência para as infinitas possibilidades");
        intermedFerramenta.ações.add("Transmutar crenças e padrões limitantes e ativar a divindade crística em todos os corpos");
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "7ª Dimensão");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        
        intermedFerramenta.ações.add("Ativando a ligação do atma e do chakra coronário com o cosmos.");
        intermedFerramenta.ações.add("Facilitar a ativação da inteligência do coração");
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "8ª Dimensão");
        intermedFerramenta.resultados.add("");
        
        intermedFerramenta.ações.add("Ativar a consciência divina no foco, informação, forma, tempo, espírito, alma, infinito e eternidade");
        this.subFerramentas.add(intermedFerramenta);

        this.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) peço permissão aos planos mais elevados e ao corpo búdico de (nome do consulente) para abrir a frequência etérica de Metatrão para fixar a informação de (resultado) com a ação de (ação) que causam bloqueios não divinos na existência presente de (nome do consulente). Decreto aberto o campo akáshico para que possa (ação) fixando o equilíbrio, na medida exata e na quantidade certa. Pulso no campo, pulso no campo, pulso no campo.";

    }
}
