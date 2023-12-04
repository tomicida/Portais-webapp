package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;
import com.portais.SubFerramenta;

public class QuartzosQuânticosECristais extends Ferramenta{
    public QuartzosQuânticosECristais (Portal portal, int id){
        super("Quartzos Quânticos e Cristais", portal, id);

        SubFerramenta intermedFerramenta;
        SubFerramenta intermedSubFerramenta;

        this.type = 2;

        this.resultados.add("Quartzos Quânticos");
        this.resultados.add("Cristais");

        intermedFerramenta = new SubFerramenta(this, "Quartzos Quânticos");
        intermedFerramenta.resultados.add("6500");
        intermedFerramenta.resultados.add("7000");
        intermedFerramenta.resultados.add("8000");
        intermedFerramenta.resultados.add("10000");
        intermedFerramenta.resultados.add("12500");
        intermedFerramenta.resultados.add("15000");
        intermedFerramenta.resultados.add("20000");
        intermedFerramenta.resultados.add("25000");
        intermedFerramenta.resultados.add("30000");
        intermedFerramenta.resultados.add("50000");

        intermedSubFerramenta = new SubFerramenta(this, "6500");
        intermedSubFerramenta.resultados.add("Cérebro");
        intermedSubFerramenta.resultados.add("Pulmão");
        intermedSubFerramenta.resultados.add("Diafragma");
        intermedSubFerramenta.resultados.add("Coração");
        intermedSubFerramenta.resultados.add("Fígado");
        intermedSubFerramenta.resultados.add("Estomago");
        intermedSubFerramenta.resultados.add("Colon");
        intermedSubFerramenta.resultados.add("Intestino Delgado");
        intermedSubFerramenta.resultados.add("Orgão Reprodutor (M/F)");
        intermedSubFerramenta.resultados.add("Rim");
        intermedSubFerramenta.resultados.add("Ureter");
        intermedSubFerramenta.resultados.add("Canal Evacuação");

        intermedSubFerramenta.ações.add("");
        intermedSubFerramenta.ações.add("");
        intermedSubFerramenta.ações.add("");
        intermedSubFerramenta.ações.add("");
        intermedSubFerramenta.ações.add("");
        intermedSubFerramenta.ações.add("");
        intermedSubFerramenta.ações.add("");
        intermedSubFerramenta.ações.add("");
        intermedSubFerramenta.ações.add("");
        intermedSubFerramenta.ações.add("");
        intermedSubFerramenta.ações.add("");
        intermedSubFerramenta.ações.add("");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        
        intermedSubFerramenta = (SubFerramenta) intermedSubFerramenta.clone();
        intermedSubFerramenta.prevResult = "7000";
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = (SubFerramenta) intermedSubFerramenta.clone();
        intermedSubFerramenta.prevResult = "8000";
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = (SubFerramenta) intermedSubFerramenta.clone();
        intermedSubFerramenta.prevResult = "10000";
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = (SubFerramenta) intermedSubFerramenta.clone();
        intermedSubFerramenta.prevResult = "12500";
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = (SubFerramenta) intermedSubFerramenta.clone();
        intermedSubFerramenta.prevResult = "15000";
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = (SubFerramenta) intermedSubFerramenta.clone();
        intermedSubFerramenta.prevResult = "20000";
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = (SubFerramenta) intermedSubFerramenta.clone();
        intermedSubFerramenta.prevResult = "25000";
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = (SubFerramenta) intermedSubFerramenta.clone();
        intermedSubFerramenta.prevResult = "30000";
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = (SubFerramenta) intermedSubFerramenta.clone();
        intermedSubFerramenta.prevResult = "50000";
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "Cristais");
        intermedFerramenta.multi = true;
        intermedFerramenta.resultados.add("Turmalina");
        intermedFerramenta.resultados.add("Quartzo Branco");
        intermedFerramenta.resultados.add("Quartzo Fumê");
        intermedFerramenta.resultados.add("Quartzo Verde");
        intermedFerramenta.resultados.add("Esmeralda");
        intermedFerramenta.resultados.add("Granada");
        intermedFerramenta.resultados.add("Citrino");
        intermedFerramenta.resultados.add("Topázio");
        intermedFerramenta.resultados.add("Lápis Lazuli");
        intermedFerramenta.resultados.add("Ametista");
        intermedFerramenta.resultados.add("Sodalita");
        intermedFerramenta.resultados.add("Olho de Tigre");
        intermedFerramenta.resultados.add("Turquesa");
        intermedFerramenta.resultados.add("Calcita");
        intermedFerramenta.resultados.add("Quartzo Rosa");
        intermedFerramenta.resultados.add("Azurita");
        intermedFerramenta.resultados.add("Cornalina");
        intermedFerramenta.resultados.add("Rubi");
        intermedFerramenta.resultados.add("Malaquita");
        intermedFerramenta.resultados.add("Hematita");

        intermedFerramenta.repeatString = "(nome do cristal), ";
        intermedFerramenta.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método de Cura Quântica Multidimensional pedindo ao Eu Superior de (nome do consulente) permissão para atuar no seu campo morfogenético com a frequência dos cristais. Lanço na rede a frequência do cristal (next) para que atuem direta e indiretamente no seu propósito e tomada de decisão. Ativo agora a sua frequência de cura para que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";

        this.subFerramentas.add(intermedFerramenta);

        this.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método CQM pedindo ao Eu Superior de (nome do consulente) permissão para atuar no seu campo morfogenético com a aplicação da frequência dos quartzos quânticos. Lanço na rede o quantum energético de (# valor) para equilíbrio do (orgão) para que atuem direta e indiretamente no seu propósito e tomada de decisão e consequentemente na regeneração de DNA. Ativo agora a sua frequência de cura para que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";

    }
}
