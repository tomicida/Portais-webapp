package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;

public class Cristaloterapia extends Ferramenta {
    public Cristaloterapia(Portal portal, int id){
        super("Cristaloterapia", portal, id);

        this.multi = true;
        
        this.resultados.add("Turmalina");
        this.resultados.add("Quartzo Branco");
        this.resultados.add("Quartzo Fumê");
        this.resultados.add("Quartzo Verde");
        this.resultados.add("Esmeralda");
        this.resultados.add("Granada");
        this.resultados.add("Citrino");
        this.resultados.add("Topázio");
        this.resultados.add("Lápis Lazuli");
        this.resultados.add("Ametista");
        this.resultados.add("Sodalita");
        this.resultados.add("Olho de Tigre");
        this.resultados.add("Turquesa");
        this.resultados.add("Calcita");
        this.resultados.add("Quartzo Rosa");
        this.resultados.add("Azurita");
        this.resultados.add("Cornalina");
        this.resultados.add("Rubi");
        this.resultados.add("Malaquita");
        this.resultados.add("Hematita");

        this.ações.add("Proteção contra energias negativas");
        this.ações.add("Ativar a memória mórfica do espaço");
        this.ações.add("Solidificar e concretizar projetos");
        this.ações.add("Aumentar a sensação de alegria e tranquilidade");
        this.ações.add("Apoiar nas situações adversas com clareza mental e intuição");
        this.ações.add("Ajudar na tomada de decisões");
        this.ações.add("Concretizar negócios");
        this.ações.add("Aumentar o nível de produtividade (profissional, pessoal)");
        this.ações.add("Aumentar a calma no ambiente e promover a comunicação clara");
        this.ações.add("Transmutar frequências de baixa densidade");
        this.ações.add("Aumentar a auto-confiança e a fluidez de discurso");
        this.ações.add("Compreender as várias perspetivas das questões");
        this.ações.add("Aliviar e tratar ambientes depressivos");
        this.ações.add("Auxiliar na resolução de problemas");
        this.ações.add("Promover o amor e a harmonia do ambiente");
        this.ações.add("Promover a concentração mental no ambiente");
        this.ações.add("Promover a criatividade no ambiente");
        this.ações.add("Ancorar a manifestação das realizações no ambiente");
        this.ações.add("Promover a união de grupo no ambiente");
        this.ações.add("Abrir as consciências para a solução de confrontos pessoais");

        this.repeatString = "(resultado) para (ação), ";
        this.Decreto = "Eu ativo a Matriz de Cristaloterapia para que reconstrua a informação no ambiente (tipo de ambiente) de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Ativando a reconstrução do ambiente e regeneração da informação de equilíbrio. Ativo a frequência de (next) reconstruindo e harmonizando o campo anómalo, assim como a consciência de mudança de (nome do consulente) para o efeito de (efeito). Pulsa no campo, pulsa no campo, pulsa no campo.";

        
    }
}
