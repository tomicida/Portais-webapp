package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;
import com.portais.SubFerramenta;

public class MatrizMorfogenética extends Ferramenta{
    public MatrizMorfogenética (Portal portal, int id){
        super("Matriz Morfogenética", portal, id);

        SubFerramenta intermedFerramenta;

        this.type = 4;
        this.offset = 0;
        
        intermedFerramenta = new SubFerramenta(this, "Coordenadas Portal Ambientes");
        intermedFerramenta.resultados.add("O início, a liderança, proatividade e autonomia");
        intermedFerramenta.resultados.add("A harmonia e o equilíbrio");
        intermedFerramenta.resultados.add("A tridimensionalidade e a materialização de eventos");
        intermedFerramenta.resultados.add("A ordem, o trabalho e a disciplina");
        intermedFerramenta.resultados.add("Liberdade e sentimento de aventura que leva ao crescimento");
        intermedFerramenta.resultados.add("Responsabilidades sociais e familiares");
        intermedFerramenta.resultados.add("Dominação e realização de projetos");
        intermedFerramenta.resultados.add("Gestão, superação e prosperidade");
        intermedFerramenta.resultados.add("Segurança e proteção. Fim de ciclo.");
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "Coordenadas Portal Relacionamentos");
        intermedFerramenta.resultados.add("A flexibilidade e ponderação. Menos dever e mais prazer");
        intermedFerramenta.resultados.add("O equilíbrio entre dar e receber.");
        intermedFerramenta.resultados.add("O cair da máscara e a verdade divina");
        intermedFerramenta.resultados.add("Chamado para a espontaneidade e viver o aqui e agora");
        intermedFerramenta.resultados.add("Sabedoria para se encaixar no momento sem fugir");
        intermedFerramenta.resultados.add("Libertação de opinião de terceiros e ação por si mesmo a sua vida");
        intermedFerramenta.resultados.add("O equilíbrio entre o lado mental e emocional");
        intermedFerramenta.resultados.add("A compreensão e cooperação com todos os intervenientes");
        intermedFerramenta.resultados.add("Assumir os conflitos com clareza para resolver. Sentir que é competente");
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "Coordenadas Portal Eu Interior");
        intermedFerramenta.resultados.add("Reconhecer a divindade em si");
        intermedFerramenta.resultados.add("Emoção, persuasão e organização");
        intermedFerramenta.resultados.add("A tríade universal, cosmos, luz e centelha divina");
        intermedFerramenta.resultados.add("A afirmação positiva e a solução");
        intermedFerramenta.resultados.add("Crescimento e desenvolvimento no propósito de vida");
        intermedFerramenta.resultados.add("Equilíbrio entre poder e autoridade");
        intermedFerramenta.resultados.add("Libertação do poder pessoal");
        intermedFerramenta.resultados.add("O trabalho honrado e honesto contínuo");
        intermedFerramenta.resultados.add("A segurança dos corpos emocional, mental inferior e superior");
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "A Soma dos Três Portais");
        intermedFerramenta.resultados.add("O início");
        intermedFerramenta.resultados.add("Harmonia");
        intermedFerramenta.resultados.add("Consciência 3D");
        intermedFerramenta.resultados.add("Ordem");
        intermedFerramenta.resultados.add("Liberdade");
        intermedFerramenta.resultados.add("Responsabilidade");
        intermedFerramenta.resultados.add("Realização");
        intermedFerramenta.resultados.add("Boa Administração");
        intermedFerramenta.resultados.add("Fim de ciclo");
        this.subFerramentas.add(intermedFerramenta);


        this.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método CQM pedindo ao Eu Superior de (nome do consulente) permissão para atuar no seu campo morfogenético com a Matriz Morfogenética. Lanço na rede as coordenadas morfogenéticas (todas as coordenadas que saírem, não mais de três) para que atuem direta e indiretamente no seu propósito e tomada de decisão. Ativo agora a sua frequência de cura para que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";
        
    }
}
