package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;

public class RemoçãoDeChipsEImplantes extends Ferramenta{
    public RemoçãoDeChipsEImplantes (Portal portal, int id){
        super("Remoção de Chips e Implantes", portal, id);
        this.multi = true;
        
        this.resultados.add("Bio-Influenciador");
        this.resultados.add("Latência de Informação próximos aos chakras principais");
        this.resultados.add("Implante Parasita");
        this.resultados.add("Vampirizadores - Ovóides");
        this.resultados.add("Imobilizadores de Funções e/ou Emoções");
        this.resultados.add("Manipuladores de Vontade");
        this.resultados.add("Chip de Memórias Holográficas Inibidoras de DNA");
        this.resultados.add("Implante Metafísico de Crença Patológica");
        this.resultados.add("Inibidor de Propósito");
        this.resultados.add("Chip de Extração de Informação");

        this.ações.add("Remover toda a influência nos chakras e corpos sutis e destruir a informação deletéria no campo");
        this.ações.add("Remover todos os bloqueios nos meridianos de energia e seus apêndices provocados pela instalação de frequências densas de repetição junto dos 7 chakras anexos ao corpo físico e harmonizar os corpos sutis afetados");
        this.ações.add("Remover o laço de sintonia do intruso com o hospedeiro, destruir todas as ligações deletérias e prevenir nova instalação, elevando a faixa de sintonia do campo afetado do consulente para os 500Hz");
        this.ações.add("Ativar o reequilíbrio da Energia Vital do consulente, destruir a informação deletéria e elevar a consciência como prevenção de novas entradas");
        this.ações.add("Destruir a influência negativa da frequência de passividade, desinteresse e procrastinação e ampliar a consciência a frequências acima dos 350Hz");
        this.ações.add("Evocar a Consciência Cósmica e a elevação de frequência para que todos os bloqueios de vontade e ação sejam anulados e destruídos");
        this.ações.add("Apagar toda a informação inibidora de DNA. Aplicar e ativar todas as sequências de cura para regeneração de DNA");
        this.ações.add("Ativar a programação de ressignificação de paradigmas de realidade em relação a crenças nocivas. Deletar todas as informações anómalas dos campos de informação pessoais");
        this.ações.add("Desativando, removendo o agente inibidor de propósito. Ativar o progresso, a emancipação e a expansão de consciência");
        this.ações.add("Removendo o chip de extração de informação e todas as ramificações a nível dos sistemas de organização do corpo. Cicatrizando agora todas as mazelas expostas na extração e promovendo o equilíbrio em todos os corpos sutis");

        this.repeatString = "Anulo a frequência de (resultado) e ativo a Matriz das Grandes Esferas da Medicina Quântica para (ação). ";
        this.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método de CQM e a Matriz das Grandes Esferas da Medicina Quântica pedindo ao Eu Superior de (nome do consulente) permissão para atuar nos seus chakras e corpos sutis. (next)Ativo agora a sua frequência de cura para que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";

    }
}
