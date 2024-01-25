package com.portais.Ferramentas;

import java.util.ArrayList;

import com.portais.Ferramenta;
import com.portais.Portal;
import com.portais.SubFerramenta;

public class FengShui extends Ferramenta{
    public FengShui(Portal portal, int id){
        super("Feng Shui", portal, id);

        SubFerramenta intermedFerramenta;
        SubFerramenta intermedSubFerramenta;
        SubFerramenta intermedSubSubFerramenta;

        this.type=2;
        this.resultados.add("Tabela Geral de Equilíbrios");
        this.resultados.add("Tabela de Necessidades do Espaço");

        intermedFerramenta = new SubFerramenta(this, "Tabela Geral de Equilíbrios");
        
        intermedFerramenta.resultados.add("Casa");
        intermedFerramenta.resultados.add("Empresa");

        intermedSubFerramenta = new SubFerramenta(this, "Casa");

        intermedSubFerramenta.ownDecreto = "Eu ativo a Matriz do Feng Shui para que limpe a informação anomala no ambiente (casa ou empresa) de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Ativo a frequência de (desig) para (ação), reconstruindo e harmonizando o campo anómalo, assim como a consciência de mudança de (nome completo do consulente). Pulsa no campo, pulsa no campo, pulsa no campo.";
        
        intermedSubFerramenta.resultados.add("Yin");
        intermedSubFerramenta.resultados.add("Yang");
        intermedSubFerramenta.resultados.add("Madeira");
        intermedSubFerramenta.resultados.add("Fogo");
        intermedSubFerramenta.resultados.add("Terra");
        intermedSubFerramenta.resultados.add("Metal");
        intermedSubFerramenta.resultados.add("Água");
        intermedSubFerramenta.resultados.add("Qian");
        intermedSubFerramenta.resultados.add("Zhen");
        intermedSubFerramenta.resultados.add("Kan");
        intermedSubFerramenta.resultados.add("Gen");
        intermedSubFerramenta.resultados.add("Kun");
        intermedSubFerramenta.resultados.add("Xun");
        intermedSubFerramenta.resultados.add("Li");
        intermedSubFerramenta.resultados.add("Dui");

        intermedSubFerramenta.resultados2.add("");
        intermedSubFerramenta.resultados2.add("");
        intermedSubFerramenta.resultados2.add("Gerador");
        intermedSubFerramenta.resultados2.add("Expansor");
        intermedSubFerramenta.resultados2.add("Estabilizador");
        intermedSubFerramenta.resultados2.add("Concentrador");
        intermedSubFerramenta.resultados2.add("Conservador");
        intermedSubFerramenta.resultados2.add("Noroeste");
        intermedSubFerramenta.resultados2.add("Este");
        intermedSubFerramenta.resultados2.add("Norte");
        intermedSubFerramenta.resultados2.add("Nordeste");
        intermedSubFerramenta.resultados2.add("Sudoeste");
        intermedSubFerramenta.resultados2.add("Sudeste");
        intermedSubFerramenta.resultados2.add("Sul");
        intermedSubFerramenta.resultados2.add("Oeste");

        intermedSubFerramenta.ações.add("");
        intermedSubFerramenta.ações.add("");
        intermedSubFerramenta.ações.add("Acionar o vórtice gerador de energia");
        intermedSubFerramenta.ações.add("Acionar os nove círculos expansores de energia");
        intermedSubFerramenta.ações.add("Acionar o equilíbrio dos elementos");
        intermedSubFerramenta.ações.add("Acionar a concentração de energia");
        intermedSubFerramenta.ações.add("Acionar a conservação da energia");
        intermedSubFerramenta.ações.add("Aumentar a probabilidade de cooperação");
        intermedSubFerramenta.ações.add("Equilibrar as relações íntimas");
        intermedSubFerramenta.ações.add("Impactar o propósito do local nos intervenientes");
        intermedSubFerramenta.ações.add("Aumentar a sintonia com as habilidades inatas");
        intermedSubFerramenta.ações.add("Ampliar as possibilidades de parcerias");
        intermedSubFerramenta.ações.add("Ampliar no campo a frequência da prosperidade");
        intermedSubFerramenta.ações.add("Aumentar a reputação no campo");
        intermedSubFerramenta.ações.add("Aumentar a sensação de divertimento");

        
        intermedSubSubFerramenta = new SubFerramenta(this, "Yin");
        intermedSubSubFerramenta.ownDecreto = intermedSubFerramenta.ownDecreto;
        intermedSubSubFerramenta.resultados.add("Defeito");
        intermedSubSubFerramenta.resultados.add("Excesso");
        intermedSubSubFerramenta.ações.add("Equilibrar");
        intermedSubSubFerramenta.ações.add("Equilibrar");
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = new SubFerramenta(this, "Yang");
        intermedSubSubFerramenta.ownDecreto = intermedSubFerramenta.ownDecreto;
        intermedSubSubFerramenta.resultados.add("Defeito");
        intermedSubSubFerramenta.resultados.add("Excesso");
        intermedSubSubFerramenta.ações.add("Equilibrar");
        intermedSubSubFerramenta.ações.add("Equilibrar");
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = new SubFerramenta(this, "Madeira");
        intermedSubSubFerramenta.inactive=true;
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = new SubFerramenta(this, "Fogo");
        intermedSubSubFerramenta.inactive=true;
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = new SubFerramenta(this, "Terra");
        intermedSubSubFerramenta.inactive=true;
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = new SubFerramenta(this, "Metal");
        intermedSubSubFerramenta.inactive=true;
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = new SubFerramenta(this, "Água");
        intermedSubSubFerramenta.inactive=true;
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = new SubFerramenta(this, "Qian");
        intermedSubSubFerramenta.inactive=true;
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = new SubFerramenta(this, "Zhen");
        intermedSubSubFerramenta.inactive=true;
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = new SubFerramenta(this, "Kan");
        intermedSubSubFerramenta.inactive=true;
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = new SubFerramenta(this, "Gen");
        intermedSubSubFerramenta.inactive=true;
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = new SubFerramenta(this, "Kun");
        intermedSubSubFerramenta.inactive=true;
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = new SubFerramenta(this, "Xun");
        intermedSubSubFerramenta.inactive=true;
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = new SubFerramenta(this, "Li");
        intermedSubSubFerramenta.inactive=true;
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = new SubFerramenta(this, "Dui");
        intermedSubSubFerramenta.inactive=true;
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);

        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        
        intermedSubFerramenta = (SubFerramenta) intermedSubFerramenta.clone();
        intermedSubFerramenta.prevResult = "Empresa";
        intermedSubFerramenta.ownDecreto = "Eu ativo a Matriz do Feng Shui para que limpe a informação anomala no ambiente (casa ou empresa) de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Ativo a frequência de (desig) para (ação), reconstruindo e harmonizando o campo anómalo, assim como a consciência de mudança de (nome do consulente). Pulsa no campo, pulsa no campo, pulsa no campo.";
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "Tabela de Necessidades do Espaço");

        intermedFerramenta.resultados.add("Casa");
        intermedFerramenta.resultados.add("Empresa");

        intermedSubFerramenta = new SubFerramenta(this, "Casa");
        intermedSubFerramenta.resultados.add("Entrada");
        intermedSubFerramenta.resultados.add("Cozinha");
        intermedSubFerramenta.resultados.add("Sala");
        intermedSubFerramenta.resultados.add("Quartos");
        intermedSubFerramenta.resultados.add("Banheiros");
        intermedSubFerramenta.resultados.add("Varanda/Área");
        intermedSubFerramenta.resultados.add("Envolvente");

        intermedSubSubFerramenta = new SubFerramenta(this, "Entrada");
        intermedSubSubFerramenta.resultados.add("Madeira");
        intermedSubSubFerramenta.resultados.add("Fogo");
        intermedSubSubFerramenta.resultados.add("Terra");
        intermedSubSubFerramenta.resultados.add("Metal");
        intermedSubSubFerramenta.resultados.add("Água");
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = (SubFerramenta) intermedSubSubFerramenta.clone();
        intermedSubSubFerramenta.prevResult = "Cozinha";
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = (SubFerramenta) intermedSubSubFerramenta.clone();
        intermedSubSubFerramenta.prevResult = "Sala";
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = (SubFerramenta) intermedSubSubFerramenta.clone();
        intermedSubSubFerramenta.prevResult = "Quartos";
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = (SubFerramenta) intermedSubSubFerramenta.clone();
        intermedSubSubFerramenta.prevResult = "Banheiros";
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = (SubFerramenta) intermedSubSubFerramenta.clone();
        intermedSubSubFerramenta.prevResult = "Varanda/Área";
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);
        intermedSubSubFerramenta = (SubFerramenta) intermedSubSubFerramenta.clone();
        intermedSubSubFerramenta.prevResult = "Envolvente";
        intermedSubFerramenta.subFerramentas.add(intermedSubSubFerramenta);

        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = (SubFerramenta) intermedSubFerramenta.clone();
        intermedSubFerramenta.prevResult = "Empresa";

        intermedSubFerramenta.resultados= new ArrayList<String>();
        intermedSubFerramenta.resultados.add(0,"Recepção");
        intermedSubFerramenta.resultados.add(1,"ShowRoom");
        intermedSubFerramenta.resultados.add(2,"Contabilidade");
        intermedSubFerramenta.resultados.add(3,"Área Comum");
        intermedSubFerramenta.resultados.add(4,"Banheiros");
        intermedSubFerramenta.resultados.add(5,"Sala Reunião");
        intermedSubFerramenta.resultados.add(6,"Produção");

        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        this.subFerramentas.add(intermedFerramenta);
        this.Decreto = "Eu ativo a Matriz do Feng Shui para que imprima no ambiente (casa ou empresa) de (nome do consulente) e em todos os seus registros no campo morfogenético e mórfico a frequência do elemento (nome do ou dos elementos) em/na/no (cómodo). Ativando, imprimindo e ampliando, ampliando e fortalecendo, fortalecendo e fixando, harmonizando o campo anómalo, assim como a consciência de mudança de (nome do consulente). Pulsa no campo, pulsa no campo, pulsa no campo.";

    }
}
