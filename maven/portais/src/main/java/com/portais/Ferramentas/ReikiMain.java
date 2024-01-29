package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;
import com.portais.SubFerramenta;

public class ReikiMain extends Ferramenta{
    public ReikiMain (Portal portal, int id){
        super("Reiki", portal, id);

        SubFerramenta intermedFerramenta;

        this.type = 2;

        this.resultados.add("Princípio");
        this.resultados.add("Símbolo");

        intermedFerramenta = new SubFerramenta(this, "Princípio");
        intermedFerramenta.multi = true;
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        intermedFerramenta.resultados.add("");
        
        intermedFerramenta.ações.add("Facilitar a calma em todas as situações e programar a paciência");
        intermedFerramenta.ações.add("Ajudar a afastar a preocupação diária e desprogramar a ansiedade");
        intermedFerramenta.ações.add("Intuir a gratidão por tudo o que já manifestou");
        intermedFerramenta.ações.add("Facilitar o impulso para o trabalho dedicado em todas as áreas");
        intermedFerramenta.ações.add("Ativar a gentileza e amabilidade com todos os seres");
        intermedFerramenta.repeatString = "principio (index) para (ação), ";
        intermedFerramenta.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) e invocando os mestres ancestrais de Reiki, peço permissão ao Eu Superior de (nome do consulente) para ativar as frequências de equilíbrio e harmonia com o (next) imprimindo essas informações no seu campo morfogenético para que se sinta confortado e empoderado, na medida certa e quantidade exata. Pulsa no campo, pulsa no campo, pulsa no campo.";
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "Símbolo");
        intermedFerramenta.multi = true;
        intermedFerramenta.resultados.add("Cho-Ku-Rei");
        intermedFerramenta.resultados.add("Sei-He-Ki");
        intermedFerramenta.resultados.add("Hon-Sha-Zen-Shonen");
        intermedFerramenta.resultados.add("Dai-Koo-Myo");
        intermedFerramenta.resultados.add("Dumo");
        intermedFerramenta.resultados.add("Raku");

        intermedFerramenta.ações.add("Potenciar a ação do propósito no campo");
        intermedFerramenta.ações.add("Acionar a proteção e a transmutação de energias");
        intermedFerramenta.ações.add("Equilibrar todas as energias do passado, presente e futuro");
        intermedFerramenta.ações.add("Restaurar o equilíbrio e sinergia entre chakras");
        intermedFerramenta.ações.add("Equilibrar a energia do propósito divino do local");
        intermedFerramenta.ações.add("Acionar a confiança nas múltiplas possibilidades");
        intermedFerramenta.repeatString = "simbolo (simbolo) para (ação), ";
        intermedFerramenta.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) e invocando os mestres ancestrais de Reiki, peço permissão ao Eu Superior de (nome do consulente) para ativar as frequências de equilíbrio e harmonia com o (next) imprimindo essas informações no seu campo morfogenético para que se sinta confortado e empoderado, na medida certa e quantidade exata. Pulsa no campo, pulsa no campo, pulsa no campo.";
        this.subFerramentas.add(intermedFerramenta);

        this.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) e invocando os mestres ancestrais de Reiki, peço permissão ao Eu Superior de (nome do consulente) para ativar as frequências de equilíbrio e harmonia com o (simbolo) para (ação) imprimindo essas informações no seu campo morfogenético para que se sinta confortado e empoderado, na medida certa e quantidade exata. Pulsa no campo, pulsa no campo, pulsa no campo.";

    }
}
