package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;
import com.portais.SubFerramenta;

public class VidasPassadas extends Ferramenta{
    public VidasPassadas (Portal portal, int id){
        super("Vidas Passadas", portal, id);

        SubFerramenta intermedFerramenta;

        this.type = 2;
        this.resultados.add("Memórias Holográficas");
        this.resultados.add("Crenças e Padrões");
        this.resultados.add("Contractos, Pactos, Juramentos, Votos, Acordos");
        this.resultados.add("Resgates");

        intermedFerramenta = new SubFerramenta(this,"Memórias Holográficas");
        intermedFerramenta.multi = true;
        intermedFerramenta.resultados.add("Pesadelos");
        intermedFerramenta.resultados.add("Traumas");
        intermedFerramenta.resultados.add("Saudade");
        intermedFerramenta.resultados.add("Culpa");
        intermedFerramenta.resultados.add("Fuga");
        intermedFerramenta.resultados.add("Luta Interna");
        intermedFerramenta.resultados.add("Insegurança");
        intermedFerramenta.resultados.add("Raiva");
        intermedFerramenta.resultados.add("Medo");
        intermedFerramenta.resultados.add("Desespero");
        intermedFerramenta.resultados.add("Vingança");
        intermedFerramenta.resultados.add("Vergonha");
        intermedFerramenta.resultados.add("Rejeição");

        intermedFerramenta.ações.add("Transmutar");
        intermedFerramenta.ações.add("Diluir");
        intermedFerramenta.ações.add("Transmutar");
        intermedFerramenta.ações.add("Transmutar");
        intermedFerramenta.ações.add("Assumir");
        intermedFerramenta.ações.add("Pacificar");
        intermedFerramenta.ações.add("Transmutar");
        intermedFerramenta.ações.add("Pacificar");
        intermedFerramenta.ações.add("Assumir");
        intermedFerramenta.ações.add("Transmutar");
        intermedFerramenta.ações.add("Perdoar");
        intermedFerramenta.ações.add("Diluir");
        intermedFerramenta.ações.add("Aceitar");

        intermedFerramenta.repeatString = "(ação) o/a (sintoma), ";
        intermedFerramenta.ownDecreto = "Activo a frequência da onda violeta para adentrar nas memórias holográficas que causam bloqueios na vida presente de (nome do consulente). Decreto aberto o campo akáshico para que possa (next) fixando o equilíbrio, na medida exata e na quantidade certa. Pulso no campo, pulso no campo, pulso no campo.";

        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this,"Crenças e Padrões");
        intermedFerramenta.multi = true;
        intermedFerramenta.resultados.add("Escassez");
        intermedFerramenta.resultados.add("Não Merecimento");
        intermedFerramenta.resultados.add("Punição");
        intermedFerramenta.resultados.add("Religiosidade");
        intermedFerramenta.resultados.add("Materialismo");
        intermedFerramenta.resultados.add("Autoritarismo");

        intermedFerramenta.ações.add("Destruir");
        intermedFerramenta.ações.add("Apagar");
        intermedFerramenta.ações.add("Reconciliar");
        intermedFerramenta.ações.add("Transmutar");
        intermedFerramenta.ações.add("Transmutar");
        intermedFerramenta.ações.add("Pacificar");

        intermedFerramenta.repeatString = "(ação) o/a (sintoma), ";
        intermedFerramenta.ownDecreto = "Activo a frequência da onda branca para adentrar nas crenças e padrões que causam bloqueios na vida presente de (nome do consulente). Decreto aberto o campo akáshico para que possa (next) fixando o equilíbrio, na medida exata e na quantidade certa. Pulso no campo, pulso no campo, pulso no campo.";

        this.subFerramentas.add(intermedFerramenta);
        
        intermedFerramenta = new SubFerramenta(this,"Contractos, Pactos, Juramentos, Votos, Acordos");
        intermedFerramenta.multi = true;
        intermedFerramenta.resultados.add("Voto de Pobreza");
        intermedFerramenta.resultados.add("Voto de Castidade");
        intermedFerramenta.resultados.add("Celibato");
        intermedFerramenta.resultados.add("Voto de Obediência");
        intermedFerramenta.resultados.add("Amor Eterno");
        intermedFerramenta.resultados.add("Voto Silêncio");
        intermedFerramenta.resultados.add("Pacto Energético");
        intermedFerramenta.resultados.add("Magias");

        intermedFerramenta.ações.add("Quebrar");
        intermedFerramenta.ações.add("Destruir");
        intermedFerramenta.ações.add("Destruir");
        intermedFerramenta.ações.add("Quebrar");
        intermedFerramenta.ações.add("Desatar");
        intermedFerramenta.ações.add("Quebrar");
        intermedFerramenta.ações.add("Destruir");
        intermedFerramenta.ações.add("Transmutar");

        intermedFerramenta.repeatString = "(ação) o/a (sintoma), ";
        intermedFerramenta.ownDecreto = "Activo a frequência do vento solar, juntamente com a cruz crística para adentrar nos contratos, pactos, juramentos, votos e acordos, feito no passado e que causam bloqueios na vida presente de (nome do consulente). Decreto aberto o campo akáshico para que possa (next) fixando o equilíbrio, resgatando o (sintoma), na medida exata e na quantidade certa. Pulso no campo, pulso no campo, pulso no campo.";

        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this,"Resgates");
        intermedFerramenta.multi = true;
        intermedFerramenta.resultados.add("Corpo Físico");
        intermedFerramenta.resultados.add("Corpo Etérico");
        intermedFerramenta.resultados.add("Corpo Emocional");
        intermedFerramenta.resultados.add("Corpo Mental");
        intermedFerramenta.resultados.add("Espírito");
        intermedFerramenta.resultados.add("Alma");

        intermedFerramenta.ações.add("Resgatar");
        intermedFerramenta.ações.add("Resgatar");
        intermedFerramenta.ações.add("Resgatar");
        intermedFerramenta.ações.add("Resgatar");
        intermedFerramenta.ações.add("Resgatar");
        intermedFerramenta.ações.add("Resgatar");

        intermedFerramenta.repeatString = "(ação) o/a (sintoma), ";
        intermedFerramenta.ownDecreto = "Activo a frequência do raio azul para adentrar nos resgates do passado e que causam bloqueios na vida presente de (nome do consulente). Decreto aberto o campo akáshico para que possa (next) fixando o equilíbrio, na medida exata e na quantidade certa. Pulso no campo, pulso no campo, pulso no campo.";

        this.subFerramentas.add(intermedFerramenta);

    }
}
