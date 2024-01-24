package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;
import com.portais.SubFerramenta;

public class ConstelaçãoFamiliar extends Ferramenta{
    public ConstelaçãoFamiliar(Portal portal, int id){
        super("Constelação Familiar", portal, id);

        SubFerramenta interrmedFerramenta;

        this.type = 2;

        this.resultados.add("Mãe");
        this.resultados.add("Pai");
        this.resultados.add("Irmão");
        this.resultados.add("Irmã");
        this.resultados.add("Filha");
        this.resultados.add("Filho");
        this.resultados.add("Antepassado 1ª Geração (avós)");
        this.resultados.add("Antepassado 2ª Geração (bisavós)");
        this.resultados.add("Antepassado 3ª Geração (trisavós)");
        this.resultados.add("Antepassado 4ª Geração (tetravós)");
        this.resultados.add("Eu Próprio");
        this.resultados.add("Criança Interior");

        interrmedFerramenta = new SubFerramenta(this, "Mãe");
        interrmedFerramenta.resultados.add("Exclusão");
        interrmedFerramenta.resultados.add("Fora do Próprio Lugar");
        interrmedFerramenta.resultados.add("Bloqueio");
        interrmedFerramenta.resultados.add("Cura");
        interrmedFerramenta.resultados.add("Desequilíbrio (Dar e Receber)");
        interrmedFerramenta.resultados.add("Honrando um ancestral");
        interrmedFerramenta.resultados.add("Financeiro");
        interrmedFerramenta.resultados.add("Comunicação");
        interrmedFerramenta.resultados.add("Não Merecimento");
        interrmedFerramenta.resultados.add("Abuso");

        interrmedFerramenta.ações.add("Limpar todas as memórias de exclusão em relação a (membro) e se reconciliar");
        interrmedFerramenta.ações.add("Colocar o seu lugar na sua história e não o de (membro) que acontece agora. Acionar o empoderamento para que viva a sua própria história.");
        interrmedFerramenta.ações.add("Limpar os bloqueios referentes a (membro) e reconciliar-se");
        interrmedFerramenta.ações.add("Aceitar a cura em todos os planos da sua história");
        interrmedFerramenta.ações.add("Aceitar receber e saber doar, em equilíbrio, desprogramando sensações de dívida no passado, no seu campo e no dos seus ancestrais");
        interrmedFerramenta.ações.add("Que possa honrar os seus ancestrais, aceitando e entendendo todos os seus processos e seguindo o seu próprio caminho.");
        interrmedFerramenta.ações.add("Limpar todas as informações de escassez no seu campo morfogenético");
        interrmedFerramenta.ações.add("Promover a comunicação limpa e clara, quebrando padrões ancestrais e assumindo a sua individualidade.");
        interrmedFerramenta.ações.add("Reconhecer o seu merecimento na prosperidade em todos os planos da vida");
        interrmedFerramenta.ações.add("Reconciliar-se com todos os abusos a si e seus ancestrais e limpar essa informação do seu campo morfogenético");
        this.subFerramentas.add(interrmedFerramenta);

        interrmedFerramenta = (SubFerramenta) interrmedFerramenta.clone();
        interrmedFerramenta.prevResult = "Pai";
        this.subFerramentas.add(interrmedFerramenta);

        interrmedFerramenta = (SubFerramenta) interrmedFerramenta.clone();
        interrmedFerramenta.prevResult = "Irmão";
        this.subFerramentas.add(interrmedFerramenta);

        interrmedFerramenta = (SubFerramenta) interrmedFerramenta.clone();
        interrmedFerramenta.prevResult = "Irmã";
        this.subFerramentas.add(interrmedFerramenta);

        interrmedFerramenta = (SubFerramenta) interrmedFerramenta.clone();
        interrmedFerramenta.prevResult = "Filha";
        this.subFerramentas.add(interrmedFerramenta);

        interrmedFerramenta = (SubFerramenta) interrmedFerramenta.clone();
        interrmedFerramenta.prevResult = "Filho";
        this.subFerramentas.add(interrmedFerramenta);

        interrmedFerramenta = (SubFerramenta) interrmedFerramenta.clone();
        interrmedFerramenta.prevResult = "Antepassado 1ª Geração (avós)";
        this.subFerramentas.add(interrmedFerramenta);

        interrmedFerramenta = (SubFerramenta) interrmedFerramenta.clone();
        interrmedFerramenta.prevResult = "Antepassado 2ª Geração (bisavós)";
        this.subFerramentas.add(interrmedFerramenta);

        interrmedFerramenta = (SubFerramenta) interrmedFerramenta.clone();
        interrmedFerramenta.prevResult = "Antepassado 3ª Geração (trisavós)";
        this.subFerramentas.add(interrmedFerramenta);

        interrmedFerramenta = (SubFerramenta) interrmedFerramenta.clone();
        interrmedFerramenta.prevResult = "Antepassado 4ª Geração (tetravós)";
        this.subFerramentas.add(interrmedFerramenta);

        interrmedFerramenta = (SubFerramenta) interrmedFerramenta.clone();
        interrmedFerramenta.prevResult = "Eu Próprio";
        this.subFerramentas.add(interrmedFerramenta);

        interrmedFerramenta = (SubFerramenta) interrmedFerramenta.clone();
        interrmedFerramenta.prevResult = "Criança Interior";
        this.subFerramentas.add(interrmedFerramenta);

        this.Decreto = "Abro no portal dos relacionamentos a frequência de cura da Constelação Familiar para que os bloqueios de relação de (nome do consulente) possam ser desativados, limpos e harmonizados. Ativo o elemento (resultado) identificado como causando (causa) no plano das relações de (nome do consulente). (Ação), pulsando no campo a limpeza e harmonização para que se fixe na medida certa e na quantidade exata, dentro do que é divino. Pulsa no campo, pulsa no campo, pulsa no campo.";

    }
}
