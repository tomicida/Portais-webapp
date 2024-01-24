package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;

public class MatrizDimensional extends Ferramenta{
    public MatrizDimensional (Portal portal, int id){
        super("Matriz Dimensional", portal, id);

        this.multi = true;
        this.resultados.add("1ªa Dimensão");
        this.resultados.add("2ªa Dimensão");
        this.resultados.add("3ªa Dimensão");
        this.resultados.add("4ªa Dimensão");
        this.resultados.add("5ªa Dimensão");
        this.resultados.add("6ªa Dimensão");
        this.resultados.add("7ªa Dimensão");
        this.resultados.add("8ªa Dimensão");
        this.resultados.add("9ªa Dimensão");

        this.ações.add("ancoragem, fixação e sustentação");
        this.ações.add("simbiose entre a 1D e a 2D e criação de formas de cura na 3D");
        this.ações.add("uso do livre arbítrio, a sua manifestação e a tomada de decisão");
        this.ações.add("Consciência e a migração espaço-temporal");
        this.ações.add("ressonância harmónica do amor e do conhecimento");
        this.ações.add("Luz Crística, formadora de harmonias geometricas");
        this.ações.add("emissão de códigos de luz e som");
        this.ações.add("Ordem Cósmica");
        this.ações.add("modulação da individualidade hiperconsciente");

        this.repeatString = "Lanço na rede a frequência de (resultado) para a/o (ação). ";
        this.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método de CQM pedindo ao Eu Superior de (nome do consulente) permissão para atuar no seu campo morfogenético com a aplicação da frequência da Matriz Dimensional para que se altere a sua perspectiva de realidade e se adeque à vibração do planeta Terra. (next) Ativo agora a sua frequência de cura para que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";

    }
}
