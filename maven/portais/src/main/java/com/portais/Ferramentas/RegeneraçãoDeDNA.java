package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;
import com.portais.SubFerramenta;

public class RegeneraçãoDeDNA extends Ferramenta{
    public RegeneraçãoDeDNA (Portal portal, int id){
        super("Regeneração de DNA", portal, id);

        SubFerramenta intermedFerramenta;
        SubFerramenta intermedSubFerramenta;

        this.type = 2;

        this.resultados.add("Tabela de Vitaminas e Minerais");
        this.resultados.add("Tabela de Glândulas, Hormônios e Neurotransmissores");
        this.resultados.add("Tabela de Aminoácidos");

        intermedFerramenta = new SubFerramenta(this, "Tabela de Vitaminas e Minerais");
        intermedFerramenta.multi = true;
        intermedFerramenta.resultados.add("Vitamina A");
        intermedFerramenta.resultados.add("Vitamina B1");
        intermedFerramenta.resultados.add("Vitamina B2");
        intermedFerramenta.resultados.add("Vitamina B3");
        intermedFerramenta.resultados.add("Vitamina B6");
        intermedFerramenta.resultados.add("Vitamina B12");
        intermedFerramenta.resultados.add("Vitamina C");
        intermedFerramenta.resultados.add("Vitamina D");
        intermedFerramenta.resultados.add("Vitamina E");
        intermedFerramenta.resultados.add("Vitamina K");
        intermedFerramenta.resultados.add("Vitamina U");
        intermedFerramenta.resultados.add("Ácido Fólico");
        intermedFerramenta.resultados.add("Ácido Pantotênico");
        intermedFerramenta.resultados.add("Cálcio");
        intermedFerramenta.resultados.add("Ferro");
        intermedFerramenta.resultados.add("Fósforo");
        intermedFerramenta.resultados.add("Iodo");
        intermedFerramenta.resultados.add("Magnésio");
        intermedFerramenta.resultados.add("Manganês");
        intermedFerramenta.resultados.add("Niacina");
        intermedFerramenta.resultados.add("Potássio");

        intermedFerramenta.ações.add("Atua no desenvolvimento ósseo, na visão, na boa formação da pele, na imunidade e na reprodução, além de ser anticancerígeno.");
        intermedFerramenta.ações.add("Auxilia no metabolismo dos carboidratos, das gorduras e proteínas; atua na musculatura e na respiração dos tecidos.");
        intermedFerramenta.ações.add("Importante para o metabolismo dos carboidratos, das gorduras e proteínas, para a conservação dos tecidos, para os olhos e também para a manutenção da pele.");
        intermedFerramenta.ações.add("Tem indicação para o nervosismo, depressão, estresse, problemas digestivos, pelagra, insônia, problemas de pele (acne, erupções).");
        intermedFerramenta.ações.add("Por ajudar no metabolismo dos aminoácidos e das proteínas, é importante para o crescimento.");
        intermedFerramenta.ações.add("Essencial para o bom funcionamento das células, principalmente as do trato gastrointestinal, da medula óssea e do tecido nervoso.");
        intermedFerramenta.ações.add("Facilita a absorção de ferro, aumenta a resistência do corpo às infecções, auxilia na cicatrização de queimaduras, na formação dos dentes e ossos, protege a gengiva, atua no metabolismo de alguns aminoácidos e é essencial para a manutenção da integridade capilar e dos tecidos. Além disso, é antioxidante.");
        intermedFerramenta.ações.add("Essencial para a formação da estrutura óssea e dos dentes.");
        intermedFerramenta.ações.add("Antioxidante, atua na manutenção do tecido epitelial e auxilia no metabolismo das gorduras e no bom aproveitamento da vitamina A.");
        intermedFerramenta.ações.add("Serve para combater hemorragias nasais, da pele e lesões no fígado.");
        intermedFerramenta.ações.add("Acelera a cicatrização das úlceras no estômago, duodeno e intestino.");
        intermedFerramenta.ações.add("É de grande importância no processo de divisão das hemácias, os glóbulos vermelhos do sangue. Também é responsável por unhas, cabelos e medula óssea, e pelo bom funcionamento do sistema imunológico.");
        intermedFerramenta.ações.add("Importante no metabolismo energético auxilia na reposição dos tecidos corporais.");
        intermedFerramenta.ações.add("Fundamental para o crescimento e importante na construção e na manutenção de ossos e dentes.");
        intermedFerramenta.ações.add("Previne a anemia por ser um nutriente importante na formação das células vermelhas. Também favorece o crescimento e a vitalidade.");
        intermedFerramenta.ações.add("Combate o estresse e as alterações do sistema nervoso.");
        intermedFerramenta.ações.add("Serve para deficiência no desenvolvimento físico e mental, cansaço e fraqueza.");
        intermedFerramenta.ações.add("Trabalha junto com o fósforo para fixar o cálcio nos ossos e dentes. Além disso, é ele que permite que o corpo relaxe depois de uma contração. O bom funcionamento dos nervos e músculos também depende dele.");
        intermedFerramenta.ações.add("Além de aprimorar os reflexos dos músculos, ajuda a combater o cansaço e a fadiga.");
        intermedFerramenta.ações.add("Ajuda a levar oxigênio para as células.");
        intermedFerramenta.ações.add("É um dos responsáveis pelos batimentos do coração, pela normalidade da pressão sanguínea e pelas contrações dos músculos.");

        intermedFerramenta.repeatString = "(designação), ";
        intermedFerramenta.ownDecreto = "Eu, (nome do terapeuta) peço permissão ao Eu Superior de (nome do consulente) para aceder ao seu campo morfogenético, chakras e corpos sutis que se encontram afetados pela anomalia de (next) para que se harmonizem, equilibrem e criem impacto na estrutura do DNA, reestruturando e renovando o funcionamento do corpo físico na medida certa e na quantidade exata, dentro do que é divino. Ativo agora a ação de (next) e promovo o equilíbrio de todos os chakras e todos os corpos sutis. Pulsa, pulsa, pulsa no campo.";

        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "Tabela de Glândulas, Hormônios e Neurotransmissores");
        intermedFerramenta.resultados.add("Hormônios liberados pela neuro-hipófise ou porção caudal da hipófise");
        intermedFerramenta.resultados.add("Hormônios adeno-hipófise liberados pela porção rostral da hipófise");
        intermedFerramenta.resultados.add("Glândula Pineal = epífise");
        intermedFerramenta.resultados.add("Tireoide");
        intermedFerramenta.resultados.add("Paratireoide");
        intermedFerramenta.resultados.add("Timo");
        intermedFerramenta.resultados.add("Células betas das ilhas de Langerhans (ilhotas pancreáticas)");
        intermedFerramenta.resultados.add("Células alfas das ilhas de Langerhans");
        intermedFerramenta.resultados.add("Medula da glândula adrenal");
        intermedFerramenta.resultados.add("Córtex da glândula adrenal");
        intermedFerramenta.resultados.add("Neurotransmissores");

        intermedSubFerramenta = new SubFerramenta(this, "Hormônios liberados pela neuro-hipófise ou porção caudal da hipófise");
        intermedSubFerramenta.resultados.add("Oxitocina");
        intermedSubFerramenta.resultados.add("Hormônio Antidiurético");

        intermedSubFerramenta.ações.add("Estimular a contração uterina, no parto, e na produção de leite");
        intermedSubFerramenta.ações.add("Estimular a reabsorção de água nos tubérculos renais (conserva água no organismo)");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Hormônios adeno-hipófise liberados pela porção rostral da hipófise");
        intermedSubFerramenta.resultados.add("Prolactina");
        intermedSubFerramenta.resultados.add("Hormônio de crescimento (GH)");
        intermedSubFerramenta.resultados.add("Hormônios gonadotrópico");
        intermedSubFerramenta.resultados.add("Hormônio estimulador da tireoide");
        intermedSubFerramenta.resultados.add("Hormônios estimulador da córtex adrenal");
        
        intermedSubFerramenta.ações.add("Estimular a produção de leite pelas glândulas mamárias");
        intermedSubFerramenta.ações.add("Estimular o crescimento do organismo e favorecendo a síntese proteica");
        intermedSubFerramenta.ações.add("Estimular o funcionamento das gônadas (testículos e ovários)");
        intermedSubFerramenta.ações.add("Estimular a secreção dos hormônios da tireoide");
        intermedSubFerramenta.ações.add("Estimular a secreção de hormônios no córtex da suprarrenal");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Glândula Pineal = epífise");
        intermedSubFerramenta.resultados.add("Melatonina");
        
        intermedSubFerramenta.ações.add("Regular o ritmo biológico");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Tireoide");
        intermedSubFerramenta.resultados.add("Triiodotironina (T3) Tiroxina (T4)");
        
        intermedSubFerramenta.ações.add("Estimular a taxa metabólica que influencia o desenvolvimento e crescimento");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Paratireoide");
        intermedSubFerramenta.resultados.add("Hormônio Paratireóideo");
        
        intermedSubFerramenta.ações.add("Estimular a liberação de cálcio e absorção pelos rins. Ativa a vitamina P no intestino");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Timo");
        intermedSubFerramenta.resultados.add("Timosina");
        
        intermedSubFerramenta.ações.add("Auxiliar nas respostas do sistema imunológico");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Células betas das ilhas de Langerhans (ilhotas pancreáticas)");
        intermedSubFerramenta.resultados.add("Insulina");
        
        intermedSubFerramenta.ações.add("Diminuir os níveis de glicose no sangue; estimula a produção de glicogênio (aglomerado de glicose); estimula o armazenamento de gordura e síntese proteica");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Células alfas das ilhas de Langerhans");
        intermedSubFerramenta.resultados.add("Glucagon");
        
        intermedSubFerramenta.ações.add("Aumentar os níveis de glicose no sangue; desestimular a produção de glicogênio");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Medula da glândula adrenal");
        intermedSubFerramenta.resultados.add("Adrenalina (Epinefrina)");
        
        intermedSubFerramenta.ações.add("Aumentar os batimentos cardíacos; aumentar a glicose no sangue; colocar o organismo em alerta");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Córtex da glândula adrenal");
        intermedSubFerramenta.resultados.add("Aldosterona");
        intermedSubFerramenta.resultados.add("Cortisol");
        
        intermedSubFerramenta.ações.add("Promover o equilíbrio dos íons sódio e potássio aumentando a absorção de sódio");
        intermedSubFerramenta.ações.add("Aumentar o nível de glicose no sangue e atua no metabolismo de gorduras (estresse)");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Neurotransmissores");
        intermedSubFerramenta.resultados.add("Dopamina");
        intermedSubFerramenta.resultados.add("Serotonina");
        intermedSubFerramenta.resultados.add("Oxitocina");
        intermedSubFerramenta.resultados.add("Noradrenalina");
        intermedSubFerramenta.resultados.add("Adrenalina");
        intermedSubFerramenta.resultados.add("Endorfina");
        intermedSubFerramenta.resultados.add("Norepinefrina");
        intermedSubFerramenta.resultados.add("Acetilcolina");
        
        intermedSubFerramenta.ações.add("Controlar a estimulação e os níveis do controle motor.");
        intermedSubFerramenta.ações.add("Estimular o humor, memória, aprendizado, alimentação, desejo sexual e sono reparador.");
        intermedSubFerramenta.ações.add("Promover as contrações musculares uterinas; reduzir o sangramento durante o parto, estimular a libertação do leite materno; desenvolver a empatia entre pessoas; e modelar a sensibilidade ao medo.");
        intermedSubFerramenta.ações.add("induzir a excitação física e mental e ao bom humor.");
        intermedSubFerramenta.ações.add("Preparar o organismo para a realização de grandes feitos, derivado da modificação de um aminoácido aromático (tirosina)");
        intermedSubFerramenta.ações.add("Potenciar a ação analgésica e estimular a sensação de bem-estar, conforto, melhor estado de humor e alegria, êxtase e euforia.");
        intermedSubFerramenta.ações.add("Ajudar a aumentar a pressão arterial estreitando os vasos sanguíneos do coração e do coração para o cérebro");
        intermedSubFerramenta.ações.add("Redução da 98inorreia98 cardíaca, Diminuição da força de contração cardíaca, Queda da condução nervosa no nodo sinoatrial e nodo atrioventricular. Na mente, a Ach desempenha um importante papel nas funções cognitivas, como, por exemplo, a aprendizagem. No aparelho respiratório, a Ach é responsável por provocar fechamento do esfíncter pós-capilar, resultando no enchimento dos 98inorreia98 venosos e extravasamento de líquidos, aumentando o volume da submucosa e vasodilatação. Também é responsável por ativar as glândulas serosas, levando a exacerbação das secreções e 98inorreia98e 98inorreia.");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "Tabela de Aminoácidos");
        intermedFerramenta.resultados.add("Ácido Aspártico");
        intermedFerramenta.resultados.add("Ácido Glutâmico");
        intermedFerramenta.resultados.add("Alanina");
        intermedFerramenta.resultados.add("Arginina");
        intermedFerramenta.resultados.add("Asparagina");
        intermedFerramenta.resultados.add("Cisteína");
        intermedFerramenta.resultados.add("Fenilalanina");
        intermedFerramenta.resultados.add("Glicina");
        intermedFerramenta.resultados.add("Glutamina");
        intermedFerramenta.resultados.add("Histidina");
        intermedFerramenta.resultados.add("Isoleucina");
        intermedFerramenta.resultados.add("Leucina");
        intermedFerramenta.resultados.add("Lisina");
        intermedFerramenta.resultados.add("Metionina");
        intermedFerramenta.resultados.add("Prolina");
        intermedFerramenta.resultados.add("Serina");
        intermedFerramenta.resultados.add("Tirosina");
        intermedFerramenta.resultados.add("Treonina");
        intermedFerramenta.resultados.add("Triptofano");
        intermedFerramenta.resultados.add("Valina");
        intermedFerramenta.resultados.add("BCAA");

        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");

        intermedFerramenta.ownDecreto = "Eu, (nome do terapeuta) peço permissão ao Eu Superior de (nome do consulente) para aceder ao seu campo morfogenético, chakras e corpos sutis que se encontram afetados pela anomalia de (designação) para que se harmonizem, equilibrem e criem impacto na estrutura do DNA, reestruturando e renovando o funcionamento do corpo físico na medida certa e na quantidade exata, dentro do que é divino. Eu sou a ativar agora o equilíbrio de (designação) e promovo a harmonização de todos os chakras e todos os corpos sutis. Pulsa, pulsa, pulsa no campo.";

        this.subFerramentas.add(intermedFerramenta);

        this.Decreto = "Eu, (nome do terapeuta) peço permissão ao Eu Superior de (nome do consulente) para aceder ao seu campo morfogenético, chakras e corpos sutis que se encontram afetados pela anomalia de (designação), (hormona) para que se harmonizem, equilibrem e criem impacto na estrutura do DNA, reestruturando e renovando o funcionamento do corpo físico na medida certa e na quantidade exata, dentro do que é divino. Eu sou a ativar agora o equilíbrio de (hormona) para (ação) e promovo a harmonização de todos os chakras e todos os corpos sutis. Pulsa, pulsa, pulsa no campo.";

    }
}
