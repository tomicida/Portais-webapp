package com.portais;

import java.util.ArrayList;

public class TreeRoot {
    public ArrayList<Portal> portais;

    public Portal Portal1;
    public Portal Portal2;
    public Portal Portal3;
    public Portal Portal4;

    public TreeRoot(){
        Ferramenta temp;
        SubFerramenta subTemp;
        SubFerramenta subSubTemp;
        SubFerramenta subSubSubTemp;
        portais = new ArrayList<Portal>();

        Portal1 = new Portal("Portal de Ambientes",0);
        Portal2 = new Portal("Portal de Relacionamentos",1);
        Portal3 = new Portal("Portal do Eu Interior",2);
        Portal4 = new Portal("Portal CQM",3);

        //Portal de Ambientes
        temp = new Ferramenta("Cromoterapia",Portal1,0);
        temp.multi = true;

        temp.resultados.add("Branco");
        temp.resultados.add("Verde");
        temp.resultados.add("Violeta");
        temp.resultados.add("Laranja");
        temp.resultados.add("Vermelho");
        temp.resultados.add("Azul");
        temp.resultados.add("Amarelo");
        temp.resultados.add("Indigo");

        temp.ações.add("Potenciamento de todas as cores e a elevação de frequência ao máximo do campo mórfico.");
        temp.ações.add("A energia da natureza, na força equilibrada dos sentidos no ambiente. Baixo no ambiente a frequência da esperança, da satisfação e da saúde.");
        temp.ações.add("A purificação, transformando e transmutando todas as energias negativas em positivas no campo mórfico.");
        temp.ações.add("O auxílio da mente a assimilar novas ideias, estimular os sentidos, a criatividade e a comunicação no campo mórfico.");
        temp.ações.add("Activação e estimulação das relações interpessoais, com energia sexual de ação e a criatividade e estimulando o apetite e a fala direta.");
        temp.ações.add("Transmissão de calma e serenidade e acionando o seu poder asséptico. Ativando tranquilidade aos ambientes.");
        temp.ações.add("A ativação da mente, os pensamentos, o ânimo, inspiração e estimulação do raciocínio no auto-controle.");
        temp.ações.add("Auxílio em todos os casos em que as tensões e restrições do meio produzem estado de má saúde física, emocional ou mental.");
        
        temp.repeatString = "(nome da cor), promovendo (nome da ação), ";
        temp.Decreto = "Eu ativo a Matriz de Cromoterapia para que limpe a informação anomala no ambiente de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela frequência da cor (next) na quantidade certa e na medida exata, reconstruindo e fortalecendo, reconstruindo e fortalecendo, reconstruindo e fortalecendo o campo anómalo, assim como a consciência de mudança de (nome completo do consulente).";

        Portal1.AddFerramenta(temp);

        temp = new Ferramenta("Escala de Solfeggio",Portal1,1);
        temp.multi = true;

        temp.resultados.add("UT ou DO");
        temp.resultados.add("RE");
        temp.resultados.add("MI");
        temp.resultados.add("FA");
        temp.resultados.add("SOL");
        temp.resultados.add("LA");
        temp.resultados.add("SI");

        temp.ações.add("Libertação de culpas e medos sociais");
        temp.ações.add("Facilitar os processos de mudança");
        temp.ações.add("Reestruturação da malha energética sutil no ambiente");
        temp.ações.add("Harmonizar relações interpessoais e os movimentos sociais");
        temp.ações.add("Expressar a verdade, a solução e a clareza no ambiente");
        temp.ações.add("Fortalecer a Intuição e os processos criativos");
        temp.ações.add("Promover a ativação do propósito no ambiente");

        temp.repeatString="(nome da nota), para (nome da ação), ";
        
        temp.Decreto = "Eu ativo a Matriz da Escala de Solfeggio para que limpe a informação anomala no ambiente de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela nota/frequência (next) na quantidade certa e na medida exata, limpando e fortalecendo, fortalecendo e reconstruindo, reconstruindo e harmonizando o campo anómalo, assim como a consciência de mudança de (nome completo do consulente).";

        Portal1.AddFerramenta(temp);

        temp = new Ferramenta("Ligação Relações",Portal1,2);
        temp.type = 1;
        temp.target = Portal2;
        Portal1.AddFerramenta(temp);

        temp = new Ferramenta("Frequências de Cura",Portal1,3);
        temp.resultados.add("174 Hz");
        temp.resultados.add("285 Hz");
        temp.resultados.add("396 Hz");
        temp.resultados.add("417 Hz");
        temp.resultados.add("528 Hz");
        temp.resultados.add("639 Hz");
        temp.resultados.add("741 Hz");
        temp.resultados.add("852 Hz");
        temp.resultados.add("963 Hz");

        temp.ações.add("Remover das memórias abstratas a energia cármica, promover a sensação de segurança, motivando a fazer o seu melhor.");
        temp.ações.add("Retornar as células à sua forma original e influenciar os campos de mórficos para reestruturar a anomalia.");
        temp.ações.add("Permitir a realização de metas da maneira mais direta. Enraizar, despertar e retornar à realidade.");
        temp.ações.add("Conectar com processos de ressonância ou processos de amplificação. Permitir o retorno ao “caminho certo”. Limpar experiências traumáticas e influências destrutivas de eventos passados. Limpar impressão de limitação, que desabilita a pessoa para atingir seus objetivos de vida. Energizar as células do corpo e ajudar a usar os potenciais criativos.");
        temp.ações.add("Retornar o DNA humano ao seu estado original e perfeito, aumento da quantidade de energia da vida, clareza da mente, consciência, criatividade, estados de êxtase como profunda paz interior no ambiente.");
        temp.ações.add("Criar de uma comunidade harmoniosa e relações interpessoais harmoniosas. Clareza para lidar com problemas de relacionamentos. Incentivar a célula a se comunicar com seu ambiente. Melhorar a comunicação, compreensão, tolerância e amor.");
        temp.ações.add("Limpar a célula das toxinas. Promover uma vida mais saudável, mais simples, limpar a célula de diferentes tipos de radiações eletromagnéticas.");
        temp.ações.add("Despertar a força interna e auto-realização. Dissolver a energia mental estagnada de over-thinking. (Atividade mental) Esclarecer os bloqueios de energia que impedem a comunicação clara e forte.");
        temp.ações.add("Permitir a experiência direta, o retorno à Unidade. Reconectar o ambiente com o propósito dos intervenientes.");

        temp.Decreto = "Eu ativo a Matriz das Frequências de Cura para que limpe a informação anomala no ambiente de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela frequência (nome da frequência), para (nome da ação), na quantidade certa e na medida exata, limpando e fortalecendo, fortalecendo e reconstruindo, reconstruindo e harmonizando o campo anómalo, assim como a consciência de mudança de (nome completo do consulente). Pulsa no campo, pulsa no campo, pulsa no campo.";
        Portal1.AddFerramenta(temp);

        temp = new Ferramenta("Ferramenta em Branco (Ambientes)",Portal1,4);
        temp.type = 2;
        
        temp.resultados.add("Geobiologia");
        temp.resultados.add("Reiki");

        subTemp = new SubFerramenta(temp, "Geobiologia");
        subTemp.resultados.add("Linhas Hartmann");
        subTemp.resultados.add("Linha Curry");
        subTemp.resultados.add("Geopatia Geográfica");
        subTemp.resultados.add("Geopatia Sutil");
        subTemp.resultados.add("Geopatia Anatómica");

        //TODO Linha Hartmann
        subSubTemp=new SubFerramenta(temp, "Linhas Hartmann");
        subSubTemp.type = 1;
        subTemp.subFerramentas.add(subSubTemp);

        //TODO Linha Curry
        subSubTemp=new SubFerramenta(temp, "Linha Curry");
        subSubTemp.type = 1;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp=new SubFerramenta(temp, "Geopatia Geográfica");
        subSubTemp.resultados.add("C.E.M.");
        subSubTemp.resultados.add("C.E.M.");
        subSubTemp.resultados.add("Aparelhos Domésticos");
        subSubTemp.resultados.add("Aparelhos Domésticos");
        subSubTemp.resultados.add("Aparelhos Domésticos");
        subSubTemp.resultados.add("Aparelhos Domésticos");
        subSubTemp.resultados.add("Ondas de Forma");
        subSubTemp.resultados.add("Ondas de Forma");
        subSubTemp.resultados.add("Ondas de Forma");
        subSubTemp.resultados.add("Abstratas");
        subSubTemp.resultados.add("Abstratas");
        subSubTemp.resultados.add("Abstratas");
        subSubTemp.resultados.add("Má Localização");
        subSubTemp.resultados.add("Má Localização");
        subSubTemp.resultados.add("Construção");
        subSubTemp.resultados.add("Construção");
        subSubTemp.resultados.add("Construção");
        subSubTemp.resultados.add("Construção");
        subSubTemp.resultados.add("Poluição Ar");
        subSubTemp.resultados.add("Poluição Ar");
        subSubTemp.resultados.add("Geologia");
        subSubTemp.resultados.add("Geologia");

        subSubTemp.resultados2.add("Campos EM Internos");
        subSubTemp.resultados2.add("Campos EM Externo");
        subSubTemp.resultados2.add("Televisor");
        subSubTemp.resultados2.add("Roteador Wi-Fi");
        subSubTemp.resultados2.add("Microondas");
        subSubTemp.resultados2.add("Computador");
        subSubTemp.resultados2.add("Objetos");
        subSubTemp.resultados2.add("Cores");
        subSubTemp.resultados2.add("Construção");
        subSubTemp.resultados2.add("Campo Mórfico");
        subSubTemp.resultados2.add("Memórias Holográficas");
        subSubTemp.resultados2.add("Interferências Externas");
        subSubTemp.resultados2.add("Geográfica");
        subSubTemp.resultados2.add("Geológica");
        subSubTemp.resultados2.add("Ondas de Informação Esgoto");
        subSubTemp.resultados2.add("Materiais Tóxicos");
        subSubTemp.resultados2.add("Materiais Radioativos");
        subSubTemp.resultados2.add("Materiais Não Harmónicos");
        subSubTemp.resultados2.add("Interior");
        subSubTemp.resultados2.add("Exterior");
        subSubTemp.resultados2.add("Lençol Freático");
        subSubTemp.resultados2.add("Fratura na Rocha");
        
        subSubTemp.ações.add("Ativar a frequência Keiti em todos os cómodos afetados para diminuir o efeito nocivo");
        subSubTemp.ações.add("Ativar a frequência Keiti em todos os pontos cardeais para diminuir o efeito nocivo");
        subSubTemp.ações.add("Ativar a frequência Keiti na área de influência do aparelho para diminuir o efeito nocivo");
        subSubTemp.ações.add("Ativar a frequência Keiti na área de influência do aparelho para diminuir o efeito nocivo");
        subSubTemp.ações.add("Ativar a frequência Keiti na área de influência do aparelho para diminuir o efeito nocivo");
        subSubTemp.ações.add("Ativar a frequência Keiti na área de influência do aparelho para diminuir o efeito nocivo");
        subSubTemp.ações.add("Ativar a frequência do Labirinto de Amiens para transmutar o efeito nocivo da onda de forma");
        subSubTemp.ações.add("Ativar a frequência do Labirinto de Amiens para transmutar o efeito nocivo da onda de forma");
        subSubTemp.ações.add("Ativar a frequência do Labirinto de Amiens para transmutar o efeito nocivo da onda de forma");
        subSubTemp.ações.add("Desinstalar todas as informações nocivas e ativar a ressignificação do sinal anómalo");
        subSubTemp.ações.add("Desinstalar todas as informações nocivas e ativar a ressignificação do sinal anómalo");
        subSubTemp.ações.add("Ativar o campo de força de proteção do consulente, ativando a requência apométrica CQM da P.E.I.");
        subSubTemp.ações.add("Ajustar a georeferência terrestre com os vórtices e portais etéricos para eliminação de forças magnéticas nocivas");
        subSubTemp.ações.add("Ajustar a georeferência terrestre com os vórtices e portais etéricos para eliminação de forças telúricas nocivas");
        subSubTemp.ações.add("Ativar as frequências das geometrias Exodin, Phtah, Dispersor e Multioscilador para eliminar informações nocivas");
        subSubTemp.ações.add("Ativar as frequências das geometrias Exodin, Phtah, Dispersor e Programador Físico para eliminar informações nocivas");
        subSubTemp.ações.add("Ativar as frequências das geometrias Exodin, Phtah, Dispersor e Programador Físico para eliminar informações nocivas");
        subSubTemp.ações.add("Ativar as frequências das geometrias Exodin, Phtah, Dispersor e Multioscilador para eliminar informações nocivas");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Multioscilador e Programador Físico para que transformem e purifiquem e informação do espaço");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Multioscilador e Programador Físico para que transformem e purifiquem e informação do espaço");
        subSubTemp.ações.add("Ajustar a georeferência terrestre com os vórtices e portais etéricos para eliminação de forças telúricas nocivas");
        subSubTemp.ações.add("Ajustar a georeferência terrestre com os vórtices e portais etéricos para eliminação de forças telúricas nocivas");
        
        subSubTemp.ownDecreto = "Ativando o acesso ao Atma de (nome do terapeuta) e a todos os corpos sutis participantes no processo de regeneração ambiental de (nome do consulente), pedindo permissão para ação corretiva no espaço aqui tratado. Retificando a anomalia mórfica de (tipo geo) com a informação de (geopatias) e abrindo campo de cura para (ação). Pulsa no campo, pulsa no campo, pulsa no campo.";

        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp=new SubFerramenta(temp, "Geopatia Sutil");
        subSubTemp.resultados.add("Antigo Cemitério");
        subSubTemp.resultados.add("Local de Práticas Frequência Densa");
        subSubTemp.resultados.add("Interferência Externa Negativa");
        subSubTemp.resultados.add("Frequência Densa Direcionada");
        subSubTemp.resultados.add("Móveis e/ou Objetos Impregnados");
        subSubTemp.resultados.add("Presença de Entidades Negativas");
        subSubTemp.resultados.add("Objetos Condicionadores de Vontade");
        subSubTemp.resultados.add("Memórias Acrónicas");
        subSubTemp.resultados.add("Radiações Etéricas Nocivas");
        subSubTemp.resultados.add("Miasmas");
        subSubTemp.resultados.add("Vampirizadores Energéticos");
        subSubTemp.resultados.add("Energia Sexual Desequilibrada");
        subSubTemp.resultados.add("Condicionadores Negativos");
        subSubTemp.resultados.add("Inimigos Ocultos");
        subSubTemp.resultados.add("Ataques Psíquicos");
        subSubTemp.resultados.add("Pactos Energéticos");
        subSubTemp.resultados.add("Contratos Energéticos");
        subSubTemp.resultados.add("Forma Pensamento Densas");
        subSubTemp.resultados.add("Sacrifício Humano/Animal");
        subSubTemp.resultados.add("Egrégoras Negativas");
        subSubTemp.resultados.add("Ganchos Energéticos");
        
        
        subSubTemp.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta");
        subSubTemp.ações.add("Transmutar a informação espaço- temporal com a frequência da cor violeta");
        subSubTemp.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar a Geometria Exodin de proteção");
        subSubTemp.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar a Geometria Exodin de proteção");
        subSubTemp.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta");
        subSubTemp.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar a Geometria Exodin de proteção, enviando a forma frequencial para zonas de frequência análoga.");
        subSubTemp.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta");
        subSubTemp.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta e a frequência da cor verde para limpeza e eterização espacial");
        subSubTemp.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar a Geometria Exodin de proteção");
        subSubTemp.ações.add("Transmutar a informação espaço- temporal com a frequência da cor violeta");
        //TODO Confirmar Vampirizadores Energéticos
        subSubTemp.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar as Geometrias Exodin de proteção e Labirinto de Amiens para sustentação da proteção");
        subSubTemp.ações.add("Ativar a frequência do equilíbrio Yin/Yang para promover a cura do espaço. Ativar a frequência da geometria programador físico com a sintonia do equilíbrio da energia");
        subSubTemp.ações.add("Transmutar a informação espaço- temporal com a frequência da cor violeta");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar as Geometrias Exodin de proteção e Labirinto de Amiens para sustentação da proteção");
        subSubTemp.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta");
        subSubTemp.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta");
        subSubTemp.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta");
        subSubTemp.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta");
        subSubTemp.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar as Geometrias Exodin de proteção e Dispersor para afastar as energias nocivas");
        subSubTemp.ações.add("Ativar a frequência da geometria Phtah para cortar todo o vínculo de informação nocivo, Dispersor para remover e transmutar com a frequência da cor violeta");
        
        subSubSubTemp = new SubFerramenta(temp,"Antigo Cemitério");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Local de Práticas Frequência Densa");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Interferência Externa Negativa");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Frequência Densa Direcionada");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Móveis e/ou Objetos Impregnados");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Presença de Entidades Negativas");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Objetos Condicionadores de Vontade");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Memórias Acrónicas");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Radiações Etéricas Nocivas");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Miasmas");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Vampirizadores Energéticos");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Energia Sexual Desequilibrada");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Condicionadores Negativos");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Inimigos Ocultos");
        subSubSubTemp.resultados.add("Físicos");
        subSubSubTemp.resultados.add("Etéricos");

        subSubSubTemp.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar as Geometrias Exodin de proteção e Dispersor para afastar as energias nocivas");
        subSubSubTemp.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar as Geometrias Exodin de proteção e Dispersor para afastar as energias nocivas");
        subSubSubTemp.ownDecreto = "Ativando o acesso ao Atma de (nome do terapeuta) e a todos os corpos sutis participantes no processo de regeneração ambiental de (nome do consulente), pedindo permissão para ação corretiva no espaço aqui tratado. Retificando a anomalia mórfica de com a informação de (geopatia) e abrindo campo de cura para (ação). Pulsa no campo, pulsa no campo, pulsa no campo.";
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Ataques Psíquicos");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Pactos Energéticos");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Contratos Energéticos");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Forma Pensamento Densas");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Sacrifício Humano/Animal");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Egrégoras Negativas");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp,"Ganchos Energéticos");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);


        subSubTemp.ownDecreto = "Ativando o acesso ao Atma de (nome do terapeuta) e a todos os corpos sutis participantes no processo de regeneração ambiental de (nome do consulente), pedindo permissão para ação corretiva no espaço aqui tratado. Retificando a anomalia mórfica de com a informação de (geopatia) e abrindo campo de cura para (ação). Pulsa no campo, pulsa no campo, pulsa no campo.";
        
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp=new SubFerramenta(temp, "Geopatia Anatómica");
        subSubTemp.resultados.add("Tumor");
        subSubTemp.resultados.add("Neoplasia");
        subSubTemp.resultados.add("Hipotensão");
        subSubTemp.resultados.add("Hipertensão");
        subSubTemp.resultados.add("Sepsis");
        //TODO confirmar Hipoxia/Hipoxis
        subSubTemp.resultados.add("Hipoxia");
        subSubTemp.resultados.add("Anoxia");
        subSubTemp.resultados.add("Necrose");
        subSubTemp.resultados.add("Isquemia");
        subSubTemp.resultados.add("Inflamação");
        subSubTemp.resultados.add("Infecção");
        subSubTemp.resultados.add("Trombose");
        subSubTemp.resultados.add("Hipoglicémia");
        subSubTemp.resultados.add("Hiperglicémia");
        subSubTemp.resultados.add("Desequilíbrio Hormonal");
        subSubTemp.resultados.add("Hipovolemia");
        subSubTemp.resultados.add("Hipofunção");
        subSubTemp.resultados.add("Obstrução");
        subSubTemp.resultados.add("Cálculos");
        subSubTemp.resultados.add("Anemia");
        subSubTemp.resultados.add("Degeneração DNA");

        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        subSubTemp.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        
        subSubTemp.ownDecreto = "Ativando o acesso ao Atma de (nome do terapeuta) e a todos os corpos sutis participantes no processo de regeneração ambiental de (nome do consulente), pedindo permissão para ação corretiva no espaço aqui tratado. Retificando a anomalia mórfica de com a informação de (geopatia) e abrindo campo de cura para (ação). Pulsa no campo, pulsa no campo, pulsa no campo.";
        
        subTemp.subFerramentas.add(subSubTemp);

        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "Reiki");
        subTemp.resultados.add("Princípio");
        subTemp.resultados.add("Símbolo");

        subSubTemp = new SubFerramenta(temp, "Principio");
        subSubTemp.multi=true;
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Facilitar a calma em todas as situações e programar a paciência");
        subSubTemp.ações.add("Ajudar a afastar a preocupação diária e desprogramar a ansiedade");
        subSubTemp.ações.add("Intuir a gratidão por tudo o que já manifestou");
        subSubTemp.ações.add("Facilitar o impulso para o trabalho dedicado em todas as áreas");
        subSubTemp.ações.add("Ativar a gentileza e amabilidade com todos os seres");
        subSubTemp.repeatString = "principio (index reiki) para (ação), ";
        subSubTemp.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) e invocando os mestres ancestrais de Reiki, peço permissão ao Eu Superior de (nome do consulente) para ativar as frequências de equilíbrio e harmonia com o (next) imprimindo essas informações no seu campo morfogenético para que se sinta confortado e empoderado, na medida certa e quantidade exata. Pulsa no campo, pulsa no campo, pulsa no campo.";
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Símbolo");
        subSubTemp.multi = true;
        subSubTemp.resultados.add("Cho-Ku-Rei");
        subSubTemp.resultados.add("Sei-He-Ki");
        subSubTemp.resultados.add("Hon-Sha-Zen-Shonen");
        subSubTemp.resultados.add("Dai-Koo-Myo");
        subSubTemp.resultados.add("Dumo");
        subSubTemp.resultados.add("Raku");

        subSubTemp.ações.add("Potenciar a ação do propósito no campo");
        subSubTemp.ações.add("Acionar a proteção e a transmutação de energias");
        subSubTemp.ações.add("Equilibrar todas as energias do passado, presente e futuro");
        subSubTemp.ações.add("Restaurar o equilíbrio e sinergia entre chakras");
        subSubTemp.ações.add("Equilibrar a energia do propósito");
        subSubTemp.ações.add("Acionar a confiança nas múltiplas possibilidades");
        subSubTemp.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) e invocando os mestres ancestrais de Reiki, peço permissão ao Eu Superior de (nome do consulente) para ativar as frequências de equilíbrio e harmonia com o (simbolo reiki) para (ação) imprimindo essas informações no seu campo morfogenético para que se sinta confortado e empoderado, na medida certa e quantidade exata. Pulsa no campo, pulsa no campo, pulsa no campo.";
        subSubTemp.repeatString = "simbolo (simbolo reiki) para (ação), ";
        subSubTemp.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) e invocando os mestres ancestrais de Reiki, peço permissão ao Eu Superior de (nome do consulente) para ativar as frequências de equilíbrio e harmonia com o (next) imprimindo essas informações no seu campo morfogenético para que se sinta confortado e empoderado, na medida certa e quantidade exata. Pulsa no campo, pulsa no campo, pulsa no campo.";
        subTemp.subFerramentas.add(subSubTemp);
        
        temp.subFerramentas.add(subTemp);

        Portal1.AddFerramenta(temp);

        temp = new Ferramenta("Ligação CQM",Portal1,5);
        temp.type = 1;
        temp.target = Portal4;
        Portal1.AddFerramenta(temp);

        temp = new Ferramenta("Campo Morfogenético",Portal1,6);
        temp.type = 2;

        temp.resultados.add("Campo Mórfico");
        temp.resultados.add("Campo Morfogenético");

        subTemp = new SubFerramenta(temp,"Campo Mórfico");
        subTemp.resultados.add("Passado");
        subTemp.resultados.add("Presente");
        subTemp.resultados.add("Futuro");
        subTemp.resultados.add("Emocional");
        subTemp.resultados.add("Mental");
        subTemp.resultados.add("Espiritual");

        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("Limpar, reconstruir, equilibrar e harmonizar");
        subTemp.ações.add("Limpar, reconstruir, equilibrar e harmonizar");
        subTemp.ações.add("Abrir a expansão de consciência");
        subSubTemp = new SubFerramenta(temp,"Passado");
        subSubTemp.resultados.add("Social");
        subSubTemp.resultados.add("Familiar");
        subSubTemp.resultados.add("Conjugal");
        subSubTemp.resultados.add("Profissional");
        subSubTemp.ações.add("Limpar e harmonizar");
        subSubTemp.ações.add("Reconciliar e Harmonizar");
        subSubTemp.ações.add("Equilibrar e Harmonizar");
        subSubTemp.ações.add("Limpar e Harmonizar");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp,"Presente");
        subSubTemp.resultados.add("Social");
        subSubTemp.resultados.add("Familiar");
        subSubTemp.resultados.add("Conjugal");
        subSubTemp.resultados.add("Profissional");
        subSubTemp.ações.add("Limpar e harmonizar");
        subSubTemp.ações.add("Reconciliar e Harmonizar");
        subSubTemp.ações.add("Equilibrar e Harmonizar");
        subSubTemp.ações.add("Limpar e Harmonizar");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp,"Futuro");
        subSubTemp.resultados.add("Social");
        subSubTemp.resultados.add("Familiar");
        subSubTemp.resultados.add("Conjugal");
        subSubTemp.resultados.add("Profissional");
        subSubTemp.ações.add("Intuir e Congregar");
        subSubTemp.ações.add("Congregar e Clarificar");
        subSubTemp.ações.add("Clarificar e Harmonizar");
        subSubTemp.ações.add("Clarificar e Harmonizar");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Emocional");
        subSubTemp.inactive = true;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Mental");
        subSubTemp.inactive = true;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Espiritual");
        subSubTemp.inactive = true;
        subTemp.subFerramentas.add(subSubTemp);

        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp,"Campo Morfogenético");
        subTemp.resultados.add("Passado");
        subTemp.resultados.add("Presente");
        subTemp.resultados.add("Futuro");
        subTemp.resultados.add("Emocional");
        subTemp.resultados.add("Mental");
        subTemp.resultados.add("Espiritual");

        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("Limpar, reconstruir, equilibrar e harmonizar");
        subTemp.ações.add("Limpar, reconstruir, equilibrar e harmonizar");
        subTemp.ações.add("Abrir a expansão de consciência");
        subSubTemp = new SubFerramenta(temp,"Passado");
        subSubTemp.resultados.add("Social");
        subSubTemp.resultados.add("Familiar");
        subSubTemp.resultados.add("Conjugal");
        subSubTemp.resultados.add("Profissional");
        subSubTemp.ações.add("Limpar e harmonizar");
        subSubTemp.ações.add("Reconciliar e Harmonizar");
        subSubTemp.ações.add("Equilibrar e Harmonizar");
        subSubTemp.ações.add("Limpar e Harmonizar");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp,"Presente");
        subSubTemp.resultados.add("Social");
        subSubTemp.resultados.add("Familiar");
        subSubTemp.resultados.add("Conjugal");
        subSubTemp.resultados.add("Profissional");
        subSubTemp.ações.add("Limpar e harmonizar");
        subSubTemp.ações.add("Reconciliar e Harmonizar");
        subSubTemp.ações.add("Equilibrar e Harmonizar");
        subSubTemp.ações.add("Limpar e Harmonizar");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp,"Futuro");
        subSubTemp.resultados.add("Social");
        subSubTemp.resultados.add("Familiar");
        subSubTemp.resultados.add("Conjugal");
        subSubTemp.resultados.add("Profissional");
        subSubTemp.ações.add("Intuir e Congregar");
        subSubTemp.ações.add("Congregar e Clarificar");
        subSubTemp.ações.add("Clarificar e Harmonizar");
        subSubTemp.ações.add("Clarificar e Harmonizar");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Emocional");
        subSubTemp.inactive = true;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Mental");
        subSubTemp.inactive = true;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Espiritual");
        subSubTemp.inactive = true;
        subTemp.subFerramentas.add(subSubTemp);

        temp.subFerramentas.add(subTemp);

        temp.Decreto="Eu ativo a Matriz do Campo Mórfico/Morfogenético para que limpe a informação anomala no ambiente de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Removendo, destruindo e transmutando todas as frequências de má informação da anomalia do (campo, número, ligação) e promovendo (ação) . Fixo agora no (campo) a ação de (ação). Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal1.AddFerramenta(temp);

        temp = new Ferramenta("Feng Shui",Portal1,7);
        temp.type=2;
        temp.resultados.add("Tabela Geral de Equilíbrios");
        temp.resultados.add("Tabela de Necessidades do Espaço");

        subTemp = new SubFerramenta(temp, "Tabela Geral de Equilíbrios");
        
        subTemp.resultados.add("Casa");
        subTemp.resultados.add("Empresa");

        subSubTemp = new SubFerramenta(temp, "Casa");

        subSubTemp.ownDecreto = "Eu ativo a Matriz do Feng Shui para que limpe a informação anomala no ambiente (casa ou empresa) de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Ativo a frequência de (desig) para (ação), reconstruindo e harmonizando o campo anómalo, assim como a consciência de mudança de (nome completo do consulente). Pulsa no campo, pulsa no campo, pulsa no campo.";
        
        subSubTemp.resultados.add("Yin");
        subSubTemp.resultados.add("Yang");
        subSubTemp.resultados.add("Madeira");
        subSubTemp.resultados.add("Fogo");
        subSubTemp.resultados.add("Terra");
        subSubTemp.resultados.add("Metal");
        subSubTemp.resultados.add("Água");
        subSubTemp.resultados.add("Qian");
        subSubTemp.resultados.add("Zhen");
        subSubTemp.resultados.add("Kan");
        subSubTemp.resultados.add("Gen");
        subSubTemp.resultados.add("Kun");
        subSubTemp.resultados.add("Xun");
        subSubTemp.resultados.add("Li");
        subSubTemp.resultados.add("Dui");

        subSubTemp.resultados2.add("");
        subSubTemp.resultados2.add("");
        subSubTemp.resultados2.add("Gerador");
        subSubTemp.resultados2.add("Expansor");
        subSubTemp.resultados2.add("Estabilizador");
        subSubTemp.resultados2.add("Concentrador");
        subSubTemp.resultados2.add("Conservador");
        subSubTemp.resultados2.add("Noroeste");
        subSubTemp.resultados2.add("Este");
        subSubTemp.resultados2.add("Norte");
        subSubTemp.resultados2.add("Nordeste");
        subSubTemp.resultados2.add("Sudoeste");
        subSubTemp.resultados2.add("Sudeste");
        subSubTemp.resultados2.add("Sul");
        subSubTemp.resultados2.add("Oeste");

        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("Acionar o vórtice gerador de energia");
        subSubTemp.ações.add("Acionar os nove círculos expansores de energia");
        subSubTemp.ações.add("Acionar o equilíbrio dos elementos");
        subSubTemp.ações.add("Acionar a concentração de energia");
        subSubTemp.ações.add("Acionar a conservação da energia");
        subSubTemp.ações.add("Aumentar a probabilidade de cooperação");
        subSubTemp.ações.add("Equilibrar as relações íntimas");
        subSubTemp.ações.add("Impactar o propósito do local nos intervenientes");
        subSubTemp.ações.add("Aumentar a sintonia com as habilidades inatas");
        subSubTemp.ações.add("Ampliar as possibilidades de parcerias");
        subSubTemp.ações.add("Ampliar no campo a frequência da prosperidade");
        subSubTemp.ações.add("Aumentar a reputação no campo");
        subSubTemp.ações.add("Aumentar a sensação de divertimento");

        
        subSubSubTemp = new SubFerramenta(temp, "Yin");
        subSubSubTemp.ownDecreto = subSubTemp.ownDecreto;
        subSubSubTemp.resultados.add("Defeito");
        subSubSubTemp.resultados.add("Excesso");
        subSubSubTemp.ações.add("Equilibrar");
        subSubSubTemp.ações.add("Equilibrar");
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp, "Yang");
        subSubSubTemp.ownDecreto = subSubTemp.ownDecreto;
        subSubSubTemp.resultados.add("Defeito");
        subSubSubTemp.resultados.add("Excesso");
        subSubSubTemp.ações.add("Equilibrar");
        subSubSubTemp.ações.add("Equilibrar");
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp, "Madeira");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp, "Fogo");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp, "Terra");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp, "Metal");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp, "Água");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp, "Qian");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp, "Zhen");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp, "Kan");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp, "Gen");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp, "Kun");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp, "Xun");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp, "Li");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = new SubFerramenta(temp, "Dui");
        subSubSubTemp.inactive=true;
        subSubTemp.subFerramentas.add(subSubSubTemp);

        subTemp.subFerramentas.add(subSubTemp);
        
        subSubTemp = (SubFerramenta) subSubTemp.clone();
        subSubTemp.prevResult = "Empresa";
        subSubTemp.ownDecreto = "Eu ativo a Matriz do Feng Shui para que limpe a informação anomala no ambiente (casa ou empresa) de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Ativo a frequência de (desig) para (ação), reconstruindo e harmonizando o campo anómalo, assim como a consciência de mudança de (nome completo do consulente). Pulsa no campo, pulsa no campo, pulsa no campo.";
        subTemp.subFerramentas.add(subSubTemp);

        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "Tabela de Necessidades do Espaço");

        subTemp.resultados.add("Casa");
        subTemp.resultados.add("Empresa");

        subSubTemp = new SubFerramenta(temp, "Casa");
        subSubTemp.resultados.add("Entrada");
        subSubTemp.resultados.add("Cozinha");
        subSubTemp.resultados.add("Sala");
        subSubTemp.resultados.add("Quartos");
        subSubTemp.resultados.add("Banheiros");
        subSubTemp.resultados.add("Varanda/Área");
        subSubTemp.resultados.add("Envolvente");

        subSubSubTemp = new SubFerramenta(temp, "Entrada");
        subSubSubTemp.resultados.add("Madeira");
        subSubSubTemp.resultados.add("Fogo");
        subSubSubTemp.resultados.add("Terra");
        subSubSubTemp.resultados.add("Metal");
        subSubSubTemp.resultados.add("Água");
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = (SubFerramenta) subSubSubTemp.clone();
        subSubSubTemp.prevResult = "Cozinha";
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = (SubFerramenta) subSubSubTemp.clone();
        subSubSubTemp.prevResult = "Sala";
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = (SubFerramenta) subSubSubTemp.clone();
        subSubSubTemp.prevResult = "Quartos";
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = (SubFerramenta) subSubSubTemp.clone();
        subSubSubTemp.prevResult = "Banheiros";
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = (SubFerramenta) subSubSubTemp.clone();
        subSubSubTemp.prevResult = "Varanda/Área";
        subSubTemp.subFerramentas.add(subSubSubTemp);
        subSubSubTemp = (SubFerramenta) subSubSubTemp.clone();
        subSubSubTemp.prevResult = "Envolvente";
        subSubTemp.subFerramentas.add(subSubSubTemp);

        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = (SubFerramenta) subSubTemp.clone();
        subSubTemp.prevResult = "Empresa";

        subSubTemp.resultados= new ArrayList<String>();
        subSubTemp.resultados.add(0,"Recepção");
        subSubTemp.resultados.add(1,"ShowRoom");
        subSubTemp.resultados.add(2,"Contabilidade");
        subSubTemp.resultados.add(3,"Área Comum");
        subSubTemp.resultados.add(4,"Banheiros");
        subSubTemp.resultados.add(5,"Sala Reunião");
        subSubTemp.resultados.add(6,"Produção");

        subTemp.subFerramentas.add(subSubTemp);

        temp.subFerramentas.add(subTemp);
        temp.Decreto = "Eu ativo a Matriz do Feng Shui para que imprima no ambiente (casa ou empresa) de (nome do consulente) e em todos os seus registros no campo morfogenético e mórfico a frequência do elemento (nome do ou dos elementos) em/na/no (cómodo). Ativando, imprimindo e ampliando, ampliando e fortalecendo, fortalecendo e fixando, harmonizando o campo anómalo, assim como a consciência de mudança de (nome completo do consulente). Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal1.AddFerramenta(temp);

        temp = new Ferramenta("Ligação Eu Interior",Portal1,8);
        temp.type = 1;
        temp.target = Portal3;
        Portal1.AddFerramenta(temp);

        temp = new Ferramenta("Cristaloterapia",Portal1,9);
        temp.multi = true;
        temp.resultados.add("Turmalina");
        temp.resultados.add("Quartzo Branco");
        temp.resultados.add("Quartzo Fumê");
        temp.resultados.add("Quartzo Verde");
        temp.resultados.add("Esmeralda");
        temp.resultados.add("Granada");
        temp.resultados.add("Citrino");
        temp.resultados.add("Topázio");
        temp.resultados.add("Lápis Lazuli");
        temp.resultados.add("Ametista");
        temp.resultados.add("Sodalita");
        temp.resultados.add("Olho de Tigre");
        temp.resultados.add("Turquesa");
        temp.resultados.add("Calcita");
        temp.resultados.add("Quartzo Rosa");
        temp.resultados.add("Azurita");
        temp.resultados.add("Cornalina");
        temp.resultados.add("Rubi");
        temp.resultados.add("Malaquita");
        temp.resultados.add("Hematita");

        temp.ações.add("Proteção contra energias negativas");
        temp.ações.add("Ativar a memória mórfica do espaço");
        temp.ações.add("Solidificar e concretizar projetos");
        temp.ações.add("Aumentar a sensação de alegria e tranquilidade");
        temp.ações.add("Apoiar nas situações adversas com clareza mental e intuição");
        temp.ações.add("Ajudar na tomada de decisões");
        temp.ações.add("Concretizar negócios");
        temp.ações.add("Aumentar o nível de produtividade (profissional, pessoal)");
        temp.ações.add("Aumentar a calma no ambiente e promover a comunicação clara");
        temp.ações.add("Transmutar frequências de baixa densidade");
        temp.ações.add("Aumentar a auto-confiança e a fluidez de discurso");
        temp.ações.add("Compreender as várias perspetivas das questões");
        temp.ações.add("Aliviar e tratar ambientes depressivos");
        temp.ações.add("Auxiliar na resolução de problemas");
        temp.ações.add("Promover o amor e a harmonia do ambiente");
        temp.ações.add("Promover a concentração mental no ambiente");
        temp.ações.add("Promover a criatividade no ambiente");
        temp.ações.add("Ancorar a manifestação das realizações no ambiente");
        temp.ações.add("Promover a união de grupo no ambiente");
        temp.ações.add("Abrir as consciências para a solução de confrontos pessoais");

        temp.repeatString = "(cristal) para (ação), ";
        temp.Decreto = "Eu ativo a Matriz de Cristaloterapia para que reconstrua a informação no ambiente (tipo de ambiente) de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Ativando a reconstrução do ambiente e regeneração da informação de equilíbrio. Ativo a frequência de (next) reconstruindo e harmonizando o campo anómalo, assim como a consciência de mudança de (nome completo do consulente) para o efeito de (efeito). Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal1.AddFerramenta(temp);

        temp = new Ferramenta("Aromaterapia",Portal1,10);
        temp.multi = true;
        temp.resultados.add("Manjericão");
        temp.resultados.add("Hortelã-Pimenta");
        temp.resultados.add("Alecrim");
        temp.resultados.add("Sândalo");
        temp.resultados.add("Junípero");
        temp.resultados.add("Mirra");
        temp.resultados.add("Bergamota");
        temp.resultados.add("Camomila Azul");
        temp.resultados.add("Tanaceto Azul");
        temp.resultados.add("Melissa");
        temp.resultados.add("Lavanda");
        temp.resultados.add("Ravintsara");
        temp.resultados.add("Olíbano");
        temp.resultados.add("Sempreviva");
        temp.resultados.add("Rosa Damascena");

        temp.resultados2.add("52");
        temp.resultados2.add("78");
        temp.resultados2.add("81");
        temp.resultados2.add("96");
        temp.resultados2.add("98");
        temp.resultados2.add("105");
        temp.resultados2.add("105");
        temp.resultados2.add("105");
        temp.resultados2.add("105");
        temp.resultados2.add("105");
        temp.resultados2.add("118");
        temp.resultados2.add("134");
        temp.resultados2.add("147");
        temp.resultados2.add("181");
        temp.resultados2.add("320");

        temp.ações.add("Higienizar o ambiente");
        temp.ações.add("Prevenção de discussões e tensões no ambiente");
        temp.ações.add("Remover a frequência de exaustão física e mental do ambiente");
        temp.ações.add("Despertar o desejo sexual e estimular a líbido");
        temp.ações.add("Reanimar e revitalizar o ambiente carregado psiquicamente");
        temp.ações.add("Dissipar a negatividade");
        temp.ações.add("Promover o empoderamento pessoal");
        temp.ações.add("Harmonizar e dissipar de tensões no ambiente");
        temp.ações.add("Prevenir alergias e infeções no ambiente");
        temp.ações.add("Promover o aconchego e a calma no ambiente");
        temp.ações.add("Criar uma atmosfera pacífica e conciliadora, com ternura");
        temp.ações.add("Estimular o sistema imunitário e promove o vigor físico e mental");
        temp.ações.add("Facilitar a cura de quadros psicossomáticos");
        temp.ações.add("Promover o sentimento de rejuvenescimento e gratidão");
        temp.ações.add("Favorecer o sentimento de perdão no ambiente");

        temp.repeatString = "(nome), enviando para o campo a frequência de (frequência em MHz) para (ação), ";
        temp.Decreto = "Eu ativo a Matriz de Aromaterapia para que reconstrua a informação no ambiente de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Ativando a reconstrução do ambiente e regeneração da informação de equilíbrio. Ativo o óleo essencial (next) reconstruindo e harmonizando o campo anómalo, assim como a consciência de mudança de (nome completo do consulente). Ativado agora. Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal1.AddFerramenta(temp);

        //Portal de Relacionamentos

        temp = new Ferramenta("Gráficos Radiestesicos",Portal2,0);
        
        temp.resultados.add("Decágono");
        temp.resultados.add("Desembaraçador");
        temp.resultados.add("Desimpregnador");
        temp.resultados.add("Diafragma");
        temp.resultados.add("Turbilhão");
        temp.resultados.add("Exdocin");
        temp.resultados.add("Triturador");
        temp.resultados.add("Pirâmide de Quéops");
        temp.resultados.add("Labirinto D’Amiens");
        temp.resultados.add("Triângulo Divino");
        temp.resultados.add("Irradiador Energético");
        temp.resultados.add("Prosperador");
        temp.resultados.add("AntahKarana");
        temp.resultados.add("Keala Maui");
        temp.resultados.add("Grum (Phath Alterado)");
        temp.resultados.add("Espiral");
        temp.resultados.add("Multioscilador");
        temp.resultados.add("4 Diamantes de Herrinckx");
        temp.resultados.add("Programador Físico");
        temp.resultados.add("Phath");
        temp.resultados.add("Mesa de Salomão");
        temp.resultados.add("Selo de Salomão");
        temp.resultados.add("Anti-Magia");
        temp.resultados.add("Magnetron");
        temp.resultados.add("Nove Círculos");
        temp.resultados.add("Luxor");
        temp.resultados.add("Exito");
        temp.resultados.add("Protetor Psiquico");
        temp.resultados.add("Eliminador");
        temp.resultados.add("Mapeador Electromagnético");
        temp.resultados.add("Matriz Morfogenética");
        temp.resultados.add("Vortice Triangular");

        
        temp.ações.add("Aciona e facilita a modelação da relação para o equilíbrio");
        temp.ações.add("Desobstruí e desembaraça situações em que não se vê saída imediata. e/ou faz aparecer a verdade em situações confusas.");
        temp.ações.add("Utilizado para limpeza e purificação astral ou de energias deletérias de relacionamentos.");
        temp.ações.add("Proporciona a manifestação do objetivo a ser atingido no plano material.");
        temp.ações.add("Ajuda na compreensão de quem somos e a forma de comportamento dos outros.");
        temp.ações.add("Fortalece o campo áurico, protege de energias nocivas de trabalhos de magia, estimula os mecanismos inconscientes relacionados com a autodefesa psíquica, protegendo contra ataques psíquicos e energia de inveja, ciúmes, ódio.");
        temp.ações.add("Elimina situações mal resolvidas");
        temp.ações.add("Concretiza a cura total do relacionamento com clareza das partes");
        temp.ações.add("LIMPADOR e BLOQUEADOR - limpa e bloqueia energias nocivas ou EMISSOR para todos os objetivos divinos.");
        temp.ações.add("Para desfazer situações complicadas, ajudar a resolver problemas difíceis, conscientizar das situações, para problemas com adolescentes.");
        temp.ações.add("Usado para confraternização entre os seres, harmonização de interesses, afetos perdidos, para pedir equilíbrio e inspiração.");
        temp.ações.add("Impulsiona a prosperidade no relacionamento");
        temp.ações.add("Promove a integração da harmonização na relação");
        temp.ações.add("Acionar o perdão em todas as formas na relação");
        temp.ações.add("Dissipa e cura o sentimento de solidão");
        temp.ações.add("Dissipa latência e inoperância e cria movimento");
        temp.ações.add("Enviar a frequência de cura na medida certa e na quantidade exata.");
        temp.ações.add("Equilíbrar os efeitos eletromagneticos, teluricos e radiações solares no ambiente");
        temp.ações.add("Reprogramar a organização celular e estruturar as memórias de traumas e fobias.");
        temp.ações.add("Magnetizar e organizar as multiplas possibilidades e impulsionar a melhor tomada de decisão");
        temp.ações.add("Ativador psiônico, trabalha os corpos mentais e emocional nos desequilíbrios em testemunho.");
        temp.ações.add("Aumentar a energia pessoal e criar equilíbrio entre a mente (mental e emocional) e o corpo e equilíbrar as energias masculina e feminina dos locais.");
        temp.ações.add("Proteger o campo individual de influências externas negativas");
        temp.ações.add("Ativar as frequência de aromaterapia, fitoterapia, homeopatia no campo do consulente.");
        temp.ações.add("Proteção do campo morfogenético e ampliação da frequência de cura alfa-ômega.");
        temp.ações.add("Eliminar os efeitos negativos de todas as interferências negativas geopáticas e sutis externas.");
        temp.ações.add("Promove a prosperidade em todos os planos do sujeito");
        temp.ações.add("Ativa o campo de proteção contra todo o tipo de influências externas");
        temp.ações.add("Eliminar influências negativas de qualquer tipo, tanto de outras pessoas quanto de condições ambientais, telúricas, cósmicas.");
        temp.ações.add("Harmonizar e equilibrar todos os campos electromagnéticos relacionados com o testemunho.");
        temp.ações.add("Ativar a clareza mental e emocional para a melhor tomada de decisão em eventos próximos.");
        temp.ações.add("Ativar as frequências de equilíbrio de amor, empoderamento e sabedoria");
        

        temp.funções.add("É um purificador e intensificador de energia, você pode colocar uma gema, quartzo ou remédio de qualquer tipo para realçar suas qualidades. Deixa a energia pura do objeto, por isso é aconselhável utilizá-lo antes do tratamento ou detecção com um testemunho para ter seu nível de energia em níveis puros, sem interferências. Também pode colocar o testemunho no centro com um papel escrito com o tratamento, deixando-o por um tempo determinado para imprimir a informação no campo.");
        temp.funções.add("É útil para desbloquear uma situação material ou desbloquear obstáculos, tanto financeiros, emocionais ou de todos os tipos. Acelera a resolução de qualquer processo. Coloque o testemunho no centro por um período de 45 minutos por dia.");
        temp.funções.add("É útil para descarregar ou limpar o testemunho de influências externas. Antes de usar outro gráfico ativo para qualquer finalidade, é aconselhável descarregá-lo de quaisquer influências externas e deixá-lo com seus valores naturais.");
        temp.funções.add(" ");
        temp.funções.add("Para melhorar a saúde, o humor e as questões materiais, como problemas judiciais. O testemunho é colocado no interior com a frequência a ser transferida. O propósito deve ser muito exato e concreto.");
        temp.funções.add("Ele protege em um nível físico, psicológico e espiritual, tanto de ataques externos quanto de influências de todos os tipos. Acionado, oferece 36 horas de proteção a cada 10 minutos de exposição, bastando colocar o testemunho no centro do gráfico. Pode ser adicionada uma frequência de cura desejo ao gráfico, mas para proteção geral não é necessário.");
        temp.funções.add(" ");
        temp.funções.add("É uma recriação em plano das forças que atuam em uma pirâmide. O testemunho com a frequencia de cura no centro. Pode ser doloroso no início, mas desaparece rapidamente para obter alívio. Deixe o tempo determinado por biometro.");
        temp.funções.add("Usado para curar e fortalecer, pode proteger de poluentes energias externas, bem como de influências telúricas adversas. Excelente para isolar campos de trabalho pois as frequências externas não entram no campo isolado. Separadamente, depois de se amplificar a frequência de cura com outro gráfico, pode se colocar o testemunho para proteger e enivar a frequência.");
        temp.funções.add(" ");
        temp.funções.add("Serve para equilibrar as energias entre um sujeito e os outros, colocando o testemunho da pessoa específica no centro e o de outras pessoas para se harmonizar nas pétalas. Ele também fornece proteção ao grupo, resolve problemas entre as pessoas e revitaliza os relacionamentos do grupo. Deixe o tempo necessário para obter os efeitos desejados, normalmente obtido atraves de biometro.");
        temp.funções.add(" ");
        temp.funções.add("Símbolo clássico do Hinduísmo que representa o coração, que para esta cultura é o lugar onde reside a alma. Pode ser utilizado tanto diretamente pelo contato com a superfície impressa na área a ser curada, posicionando-o no ambiente para se harmonizar e com o testemunho e frequência de cura no centro. É uma chamada para a energia interna e o equilíbrio de todo o ser, tanto em um nível físico, espiritual ou transcendente. É usado para a cura, a busca por respostas interiores e o reequilíbrio de todos os potenciais da pessoa.");
        temp.funções.add("Símbolo da cultura xamanica havaiana, usado para aumentar a energia vital e estabelecer harmonia com o cosmos, através do perdão. Pode ser utilizado transportando-o no bolso ou elemento preso ao corpo, bem como com o testemunho e a frequência de cura no centro. Também pode ser usado como protetor de um lugar ou para atrair energia universal.");
        temp.funções.add("Com o gráfico em sua posição adequada e o testemunho no triângulo central com o vértice voltado para baixo, ele será magnetizado. Durante sete dias ficará magnetizado colocando as mãos a alguns milímetros dele e durante cinco minutos, sendo importante que todos os pensamentos sejam positivos e otimistas, disspando as emoções negativas de solidão. Os efeitos começarão a ser notados após oito ou dez dias.");
        temp.funções.add(" ");
        temp.funções.add("É orientado com as aberturas para o Norte na Radiestesia, não tendo orientação específica na Radionica e para usá-lo basta colocar o testemunho e o tratamento no centro. Por exemplo, se queremos aliviar uma dor, vamos colocar a foto ou o testemunho da pessoa no centro e o analgésico por cima (ou a sua descrição.");
        temp.funções.add("O testemunho é colocado com a frequência de cura no centro e pode ser mantido indefinidamente ou determinado por meio de consulta de biometro. É útil para questões de saúde ambiental humana e animal ou vegetal. Ele combina a energia eletromagnética da Terra com a energia solar por isso trabalha também no equilíbrio das linhas Hartmann, Curry e Ley.");
        temp.funções.add("É usado para condicionar as células do corpo em uma direção, atua lenta e continuamente (tratamento físico) ou ordenar e equilíbrar as estruturas de memórias densas como traumas e fobias.");
        temp.funções.add("Com o gráfico em sua posição adequada e o testemunho no triângulo central com o vértice voltado para baixo, ele será magnetizado. Durante sete dias ficará magnetizado colocando as mãos a alguns milímetros dele e durante cinco minutos, sendo importante que todos os pensamentos sejam positivos e otimistas, transmitindo uma sensação de sucesso e proteção contra qualquer ataque ou elemento externo. Após esses dias, o gráfico estará magnetizado e emitindo suas propriedades benéficas. Os efeitos começarão a ser notados após oito ou dez dias.");
        temp.funções.add("Estrela de doze pontas com uma série de círculos em quatro de suas extremidades com dois círculos concêntricos fechando o conjunto geométrico, possui três letras hebraicas no lado externo dos círculos (frequências): Alef (centro), Mem (esquerda) e Shin (direita). Maneira simples, carga energética: Orientar o centro da estrela no centro da mesa de cura, com o testemunho da pessoa com a frequência de cura no centro. O tempo de atuação é determinado por meio de biometro. Este gráfico, como ocorre com os labirintos tradicionais ou outros tradicionais, pode ser utilizado como elementos de equilíbrio, circuitos destinados à ação remota ou como antena radiônica.");
        temp.funções.add("Gráfico para aumentar a energia da pessoa e de frequências de cura. Usado com testemunho e frequência de cura no centro. É o símbolo hebraico clássico com três círculos externos para evitar interferência externa. De acordo com alguns pesquisadores, é muito eficaz para aumentar a energia pessoal e criar equilíbrio entre a mente (mental e emocional) e o corpo e equilíbrar as energias masculina e feminina dos locais.");
        temp.funções.add("Gráfico ativo clássico da radiestesia franco-belga. Ele é usado para proteger seu portador ou o proprietário do gráfico no centro de influências externas. Observe que ele incorpora três círculos, que em layouts gráficos ativos é equivalente a limitar quaisquer influências externas.");
        temp.funções.add("Existem muitos designs diferentes, tanto gráficos como feitos com ímãs ou de outras formas, é um clássico em radiônica e psiônica, esse é o design dos irmãos Servranx. Como gráfico, pode ser usado para transferir qualquer efeito com o controle e o remédio no centro. Outra forma é colocar o testemunho do sujeito e a frequência de cura a ser tratada no centro. Permite que atue pelo tempo determinado por biometro.");
        temp.funções.add("É usado para a proteção de todos os tipos de campos morfogenéticos. É usado ainda com uma sequência numérica de cura, dada pelo gráfico Alfa-ômega ou por um biometro para potenciar a cura desse campo. Aciona-se com testemunho ao centro com a frequencia de cura durante o tempo determinado pelo biometro.");
        temp.funções.add("Baseado no desenho de um anel usado pela múmia de um sacerdote egípcio encontrado pelo egiptólogo Horward Carter, também conhecido como o 'anel atlante'. É utilizado como elemento psiônico por Roger De Lafforest, que atribuiu a capacidade de eliminar os efeitos negativos da energia terrestre, limpando e equilibrando o ambiente onde se encontra; É colocado debaixo da cama se houver distúrbios do sono, se for usado para tratamento remoto, o testemunho e a frequência de cura colocados no centro do desenho");
        temp.funções.add("Dos irmãos Servranx, com o objetivo de promover o sucesso econômico e material, bem como a prosperidade em todos os sentidos, tanto na esfera privada como na pública. Coloque o testemunho pelo tempo necessário, normalmente obtido através de biometro.");
        temp.funções.add("Proteção psíquica contra todo tipo de influências externas ao nível mental de qualquer tipo e origem, basta colocar o testemunho no centro por 45 minutos e ela protege por mais de um dia. Se for considerado necessário, deixe-o ativar pelo tempo determinado pelo biometro");
        temp.funções.add("É útil para eliminar influências negativas de qualquer tipo, tanto de outras pessoas quanto de condições ambientais, telúricas, cósmicas ou outras. É colocado o testemunho da pessoa a ser tratada, não tem efeito preventivo senão por influências atuais. Deixe agir por 30 minutos.");
        temp.funções.add("Utilizado pelo método CQM® para representar os campos electromagnéticos equilibrados do nosso planeta, atua nos ambientes e nos campos mórficos para harmonizar e equilibrar. Colocar o testemunho no centro com a frequência de cura durante o tempo indicado pelo biometro.");
        temp.funções.add("Utilizado pelo método CQM® para representar os campos morfogenéticos e as infinitas possibilidades de futuro, posiciona, através de coordenadas dadas pelo biometro a melhor tomada de decisão perante um evento significativo da vida do sujeito");
        temp.funções.add("Utilizado pelo método CQM® para acionar um vórtice imediato para acionar o propósito no campo do sujeito com as frequências triplices: amor, empoderamento e sabedoria. Atua no campo colocado em antena pelo tempo indicado pelo biometro.");

        temp.Decreto = "Na divina presença do Eu Sou de (nome completo do terapeuta), ativo os gráficos radiônicos (nomear todos os que estão na mesa ou fazer um decreto por cartão) no plano relacional aqui relatado por (nome do consulente) e programo a clareza, a harmonia e o equilíbrio dentro do que é divino. Que os gráficos pulsem no campo na medida certa e na quantidade exata durante um período de (medir no relógio de mensuração). A começar neste momentum. Pulsa no campo e clarifica, pulsa no campo e harmoniza, pulsa no campo e equilibra, AGORA.";


        Portal2.AddFerramenta(temp);

        temp = new Ferramenta("Ho’oponopono e Leis Huna",Portal2,1);
        
        temp.resultados.add("Auto-Perdão");
        temp.resultados.add("Perdão ao Outro");
        temp.resultados.add("Perdão a um Evento");
        temp.resultados.add("Ike");
        temp.resultados.add("Kala");
        temp.resultados.add("Makia");
        temp.resultados.add("Manawa");
        temp.resultados.add("Aloha");
        temp.resultados.add("Mana");
        temp.resultados.add("Pono");

        temp.ações.add("Promovo o auto-perdão");
        temp.ações.add("Promovo o perdão aos intervenientes relacionais");
        temp.ações.add("Promovo o perdão à situação");
        temp.ações.add("Envio a clareza mental de que somos criadores da nossa realidade");
        temp.ações.add("Desprogramo o sentimento de algum tipo de limitação");
        temp.ações.add("Promovo o foco e a atenção no relacionamento");
        temp.ações.add("Promovo a pro-ação e evitar deixar as resoluções para depois");
        temp.ações.add("Programo o corpo emocional e mental com recursos relacionais");
        temp.ações.add("Empodero os intervenientes para que manifestem os sentimentos");
        temp.ações.add("Programo a eficácia na resolução de conflitos relacionais");

        temp.Decreto = "Na divina presença do Eu Sou de (nome completo do terapeuta), ativo o (tipo) no plano relacional aqui relatado por (nome do consulente) e programo a clareza, a harmonia e o equilíbrio dentro do que é divino. (ação), para que pulse no campo na medida certa e na quantidade exata durante um período de (medir no relógio de mensuração). Pulsa no campo e clarifica, pulsa no campo e harmoniza, pulsa no campo e equilibra, AGORA.";

        Portal2.AddFerramenta(temp);

        temp = new Ferramenta("Ligação Eu Interior",Portal2,2);
        temp.type = 1;
        temp.target = Portal3;
        Portal2.AddFerramenta(temp);

        temp = new Ferramenta("Vidas Passadas",Portal2,3);
        temp.type = 2;
        temp.resultados.add("Memórias Holográficas");
        temp.resultados.add("Crenças e Padrões");
        temp.resultados.add("Contractos, Pactos, Juramentos, Votos, Acordos");
        temp.resultados.add("Resgates");

        subTemp = new SubFerramenta(temp,"Memórias Holográficas");
        subTemp.multi = true;
        subTemp.resultados.add("Pesadelos");
        subTemp.resultados.add("Traumas");
        subTemp.resultados.add("Saudade");
        subTemp.resultados.add("Culpa");
        subTemp.resultados.add("Fuga");
        subTemp.resultados.add("Luta Interna");
        subTemp.resultados.add("Insegurança");
        subTemp.resultados.add("Raiva");
        subTemp.resultados.add("Medo");
        subTemp.resultados.add("Desespero");
        subTemp.resultados.add("Vingança");
        subTemp.resultados.add("Vergonha");
        subTemp.resultados.add("Rejeição");

        subTemp.ações.add("Transmutar");
        subTemp.ações.add("Diluir");
        subTemp.ações.add("Transmutar");
        subTemp.ações.add("Transmutar");
        subTemp.ações.add("Assumir");
        subTemp.ações.add("Pacificar");
        subTemp.ações.add("Transmutar");
        subTemp.ações.add("Pacificar");
        subTemp.ações.add("Assumir");
        subTemp.ações.add("Transmutar");
        subTemp.ações.add("Perdoar");
        subTemp.ações.add("Diluir");
        subTemp.ações.add("Aceitar");

        subTemp.repeatString = "(ação) o/a (sintoma), ";
        subTemp.ownDecreto = "Activo a frequência da onda violeta para adentrar nas memórias holográficas que causam bloqueios na vida presente de (nome do consulente). Decreto aberto o campo akáshico para que possa (next) fixando o equilíbrio, na medida exata e na quantidade certa. Pulso no campo, pulso no campo, pulso no campo.";

        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp,"Crenças e Padrões");
        subTemp.multi = true;
        subTemp.resultados.add("Escassez");
        subTemp.resultados.add("Não Merecimento");
        subTemp.resultados.add("Punição");
        subTemp.resultados.add("Religiosidade");
        subTemp.resultados.add("Materialismo");
        subTemp.resultados.add("Autoritarismo");

        subTemp.ações.add("Destruir");
        subTemp.ações.add("Apagar");
        subTemp.ações.add("Reconciliar");
        subTemp.ações.add("Transmutar");
        subTemp.ações.add("Transmutar");
        subTemp.ações.add("Pacificar");

        subTemp.repeatString = "(ação) o/a (sintoma), ";
        subTemp.ownDecreto = "Activo a frequência da onda branca para adentrar nas crenças e padrões que causam bloqueios na vida presente de (nome do consulente). Decreto aberto o campo akáshico para que possa (next) fixando o equilíbrio, na medida exata e na quantidade certa. Pulso no campo, pulso no campo, pulso no campo.";

        temp.subFerramentas.add(subTemp);
        
        subTemp = new SubFerramenta(temp,"Contractos, Pactos, Juramentos, Votos, Acordos");
        subTemp.multi = true;
        subTemp.resultados.add("Voto de Pobreza");
        subTemp.resultados.add("Voto de Castidade");
        subTemp.resultados.add("Celibato");
        subTemp.resultados.add("Voto de Obediência");
        subTemp.resultados.add("Amor Eterno");
        subTemp.resultados.add("Voto Silêncio");
        subTemp.resultados.add("Pacto Energético");
        subTemp.resultados.add("Magias");

        subTemp.ações.add("Quebrar");
        subTemp.ações.add("Destruir");
        subTemp.ações.add("Destruir");
        subTemp.ações.add("Quebrar");
        subTemp.ações.add("Desatar");
        subTemp.ações.add("Quebrar");
        subTemp.ações.add("Destruir");
        subTemp.ações.add("Transmutar");

        subTemp.repeatString = "(ação) o/a (sintoma), ";
        subTemp.ownDecreto = "Activo a frequência do vento solar, juntamente com a cruz crística para adentrar nos contratos, pactos, juramentos, votos e acordos, feito no passado e que causam bloqueios na vida presente de (nome do consulente). Decreto aberto o campo akáshico para que possa (next) fixando o equilíbrio, resgatando o (sintoma), na medida exata e na quantidade certa. Pulso no campo, pulso no campo, pulso no campo.";

        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp,"Resgates");
        subTemp.multi = true;
        subTemp.resultados.add("Corpo Físico");
        subTemp.resultados.add("Corpo Etérico");
        subTemp.resultados.add("Corpo Emocional");
        subTemp.resultados.add("Corpo Mental");
        subTemp.resultados.add("Espírito");
        subTemp.resultados.add("Alma");

        subTemp.ações.add("Resgatar");
        subTemp.ações.add("Resgatar");
        subTemp.ações.add("Resgatar");
        subTemp.ações.add("Resgatar");
        subTemp.ações.add("Resgatar");
        subTemp.ações.add("Resgatar");

        subTemp.repeatString = "(ação) o/a (sintoma), ";
        subTemp.ownDecreto = "Activo a frequência do raio azul para adentrar nos resgates do passado e que causam bloqueios na vida presente de (nome do consulente). Decreto aberto o campo akáshico para que possa (next) fixando o equilíbrio, na medida exata e na quantidade certa. Pulso no campo, pulso no campo, pulso no campo.";

        temp.subFerramentas.add(subTemp);

        Portal2.AddFerramenta(temp);

        temp = new Ferramenta("Ferramenta em Branco (Relacionamentos)",Portal2,4);
        temp.offset = 0;
        temp.multi = true;
        temp.resultados.add("O Louco");
        temp.resultados.add("O Mago");
        temp.resultados.add("A Sacerdotisa");
        temp.resultados.add("A Imperatriz");
        temp.resultados.add("O Imperador");
        temp.resultados.add("O Papa");
        temp.resultados.add("Os Enamorados");
        temp.resultados.add("O Carro");
        temp.resultados.add("A Justiça");
        temp.resultados.add("O Ermita");
        temp.resultados.add("A Roda da Fortuna");
        temp.resultados.add("A Força");
        temp.resultados.add("O Enforcado");
        temp.resultados.add("A Morte");
        temp.resultados.add("A Temperança");
        temp.resultados.add("O Diabo");
        temp.resultados.add("A Torre");
        temp.resultados.add("A Estrela");
        temp.resultados.add("A Lua");
        temp.resultados.add("O Sol");
        temp.resultados.add("O Julgamento");
        temp.resultados.add("O Mundo");


        //ativação
        temp.ações.add("Possibilidade");
        temp.ações.add("Vontade");
        temp.ações.add("Instinto");
        temp.ações.add("Criação");
        temp.ações.add("Ambição");
        temp.ações.add("Padrão Positivo");
        temp.ações.add("Conexão");
        temp.ações.add("Movimento");
        temp.ações.add("Equilíbrio");
        temp.ações.add("Isolamento");
        temp.ações.add("Propósito");
        temp.ações.add("Resistência");
        temp.ações.add("Resgate");
        temp.ações.add("Metamorfose");
        temp.ações.add("Moderação");
        temp.ações.add("Servidão");
        temp.ações.add("Ruptura");
        temp.ações.add("Esperança");
        temp.ações.add("Ilusão");
        temp.ações.add("Sucesso");
        temp.ações.add("Despertar");
        temp.ações.add("Plenitude");

        //significado
        temp.resultados2.add("Loucura, disparate, extravagância, mente ativa");
        temp.resultados2.add("Habilidade, força de vontade, auto-confiança, dualidade");
        temp.resultados2.add("Ciência, educação, conhecimento, fertilidade");
        temp.resultados2.add("Abundância, criatividade, ação");
        temp.resultados2.add("Poder, autoridade, racionalidade, nutrir, adaptação, ordem");
        temp.resultados2.add("Empoderamento, Sabedoria");
        temp.resultados2.add("Um teste que vai passar com sucesso, um (novo) amor, uma (nova) parceria, adaptação");
        temp.resultados2.add("Triunfo, algo em andamento , ousar, calar, saber, querer");
        temp.resultados2.add("Equilíbrio, equilíbrio no propósito, sucesso com questões jurídicas ou palingénicas");
        temp.resultados2.add("Isolamento introspetivo, avanço iluminativo");
        temp.resultados2.add("Bom fluxo, evento palingênico, sucesso");
        temp.resultados2.add("Poder de propósito, impulso positivo, dharma");
        temp.resultados2.add("Sabedoria através do auto-conhecimento, período de estagnação para desenvolvimento pessoal");
        temp.resultados2.add("Evolução, mudança, transformação, fim de ciclo");
        temp.resultados2.add("Moderação, intuição, apelo ao Eu Superior");
        temp.resultados2.add("Proximidade de evento de mudança no propósito, questões internas promovem desenvolvimento");
        temp.resultados2.add("Necessidade de defesa e de proteção, necessidade de se posicionar empoderado");
        temp.resultados2.add("Nascimento, renascimento, esperança, futuro brilhante");
        temp.resultados2.add("Magia, estudo dos mistérios, fase de vida");
        temp.resultados2.add("Felicidade, alegria, sucesso integral");
        temp.resultados2.add("Renovações, questões palingénicas, metamorfoses");
        temp.resultados2.add("O todo, sucesso garantido, plenitude");
        //significado reverso
        temp.resultados2.add("Hesitação, problemas por ignorar a loucura, confusão mental, descuido");
        temp.resultados2.add("Uso errado dos talentos, presunção, falta de habilidades");
        temp.resultados2.add("Ignorância, falta de conhecimento, passividade, infertilidade");
        temp.resultados2.add("Procrastinação, vacilo, perda de poder");
        temp.resultados2.add("Emoções imaturas, obstrução a planos, falta de empoderamento, falta de autoridade, anarquia");
        temp.resultados2.add("Gentileza excessiva, fraqueza");
        temp.resultados2.add("Um teste falhado, um amor ou parceria perdidos, inadaptação");
        temp.resultados2.add("Derrota, obstáculo a chegarem rapidamente");
        temp.resultados2.add("Desequilíbrio, intolerância, preconceito, fanatismo");
        temp.resultados2.add("Medo, isolamento depressivo, atos imprudentes");
        temp.resultados2.add("Mau fluxo, doença somatizada, bloqueio");
        temp.resultados2.add("Poder Físico, impulso negativo, karma");
        temp.resultados2.add("Dependência, tentativa de se enturmar, procrastinação");
        temp.resultados2.add("Estagnação, morte, doença, chamada de atenção para evento negativo");
        temp.resultados2.add("Confronto de interesses, falta de moderação");
        temp.resultados2.add("Proximidade de evento traumático, questões internas promovem bloqueios");
        temp.resultados2.add("Dificuldades, bloqueios, crenças limitantes, ruína, catástrofe");
        temp.resultados2.add("Expetativa, desapontamento, esterilidade");
        temp.resultados2.add("Decepção, inimigos escondidos, influências externas negativas");
        temp.resultados2.add("Fluxo normal, sucesso parcial (pode fazer melhor)");
        temp.resultados2.add("Contratempos, recuos, atrasos");
        temp.resultados2.add("Falência, inércia, compensações envenenadas");


        //chakra associado
        temp.funções.add("Coronário");
        temp.funções.add("Laríngeo");
        temp.funções.add("Frontal");
        temp.funções.add("Cardíaco e Sexual");
        temp.funções.add("Raiz");
        temp.funções.add("Laríngeo");
        temp.funções.add("Cardíaco");
        temp.funções.add("Laríngeo");
        temp.funções.add("Cardíaco");
        temp.funções.add("Frontal");
        temp.funções.add("Solar");
        temp.funções.add("Solar");
        temp.funções.add("Frontal");
        temp.funções.add("Cardíaco");
        temp.funções.add("Solar, Frontal, Coronário");
        temp.funções.add("Raiz");
        temp.funções.add("Coronário");
        temp.funções.add("Coronário");
        temp.funções.add("Frontal, Coronário");
        temp.funções.add("Solar");
        temp.funções.add("Coronário");
        temp.funções.add("Raiz");

        temp.repeatString = "(designar qual ou quais por ordem de saída), ";
        temp.repeatString2 = "(todas as ativações que saírem por ordem), ";
        temp.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) peço permissão ao Eu Superior de (nome do consulente) para limpar a informação anómala nos seus campos frequenciais e imprimir a(s) frequência(s) de cura do(s) Arcano(s) Maior(es) (next) com a potência das energias que lhe(s) está (estão) associadas. Ativo agora as potências de (next2) e processo o seu campo de cura para que desbloqueie o sinal anómalo e promova a força de ação dentro do seu propósito.";
        Portal2.AddFerramenta(temp);

        temp = new Ferramenta("Ligação CQM",Portal2,5);
        temp.type = 1;
        temp.target = Portal4;
        Portal2.AddFerramenta(temp);

        temp = new Ferramenta("Campo Morfogenético",Portal2,6);
        temp.type = 2;

        temp.resultados.add("Campo Mórfico");
        temp.resultados.add("Campo Morfogenético");

        subTemp = new SubFerramenta(temp,"Campo Mórfico");
        subTemp.resultados.add("Passado");
        subTemp.resultados.add("Presente");
        subTemp.resultados.add("Futuro");
        subTemp.resultados.add("Emocional");
        subTemp.resultados.add("Mental");
        subTemp.resultados.add("Espiritual");

        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("Limpar, reconstruir, equilibrar e harmonizar");
        subTemp.ações.add("Limpar, reconstruir, equilibrar e harmonizar");
        subTemp.ações.add("Abrir a expansão de consciência");
        subSubTemp = new SubFerramenta(temp,"Passado");
        subSubTemp.resultados.add("Social");
        subSubTemp.resultados.add("Familiar");
        subSubTemp.resultados.add("Conjugal");
        subSubTemp.resultados.add("Profissional");
        subSubTemp.ações.add("Limpar e harmonizar");
        subSubTemp.ações.add("Reconciliar e Harmonizar");
        subSubTemp.ações.add("Equilibrar e Harmonizar");
        subSubTemp.ações.add("Limpar e Harmonizar");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp,"Presente");
        subSubTemp.resultados.add("Social");
        subSubTemp.resultados.add("Familiar");
        subSubTemp.resultados.add("Conjugal");
        subSubTemp.resultados.add("Profissional");
        subSubTemp.ações.add("Limpar e harmonizar");
        subSubTemp.ações.add("Reconciliar e Harmonizar");
        subSubTemp.ações.add("Equilibrar e Harmonizar");
        subSubTemp.ações.add("Limpar e Harmonizar");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp,"Futuro");
        subSubTemp.resultados.add("Social");
        subSubTemp.resultados.add("Familiar");
        subSubTemp.resultados.add("Conjugal");
        subSubTemp.resultados.add("Profissional");
        subSubTemp.ações.add("Intuir e Congregar");
        subSubTemp.ações.add("Congregar e Clarificar");
        subSubTemp.ações.add("Clarificar e Harmonizar");
        subSubTemp.ações.add("Clarificar e Harmonizar");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Emocional");
        subSubTemp.inactive = true;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Mental");
        subSubTemp.inactive = true;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Espiritual");
        subSubTemp.inactive = true;
        subTemp.subFerramentas.add(subSubTemp);

        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp,"Campo Morfogenético");
        subTemp.resultados.add("Passado");
        subTemp.resultados.add("Presente");
        subTemp.resultados.add("Futuro");
        subTemp.resultados.add("Emocional");
        subTemp.resultados.add("Mental");
        subTemp.resultados.add("Espiritual");

        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("Limpar, reconstruir, equilibrar e harmonizar");
        subTemp.ações.add("Limpar, reconstruir, equilibrar e harmonizar");
        subTemp.ações.add("Abrir a expansão de consciência");
        subSubTemp = new SubFerramenta(temp,"Passado");
        subSubTemp.resultados.add("Social");
        subSubTemp.resultados.add("Familiar");
        subSubTemp.resultados.add("Conjugal");
        subSubTemp.resultados.add("Profissional");
        subSubTemp.ações.add("Limpar e harmonizar");
        subSubTemp.ações.add("Reconciliar e Harmonizar");
        subSubTemp.ações.add("Equilibrar e Harmonizar");
        subSubTemp.ações.add("Limpar e Harmonizar");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp,"Presente");
        subSubTemp.resultados.add("Social");
        subSubTemp.resultados.add("Familiar");
        subSubTemp.resultados.add("Conjugal");
        subSubTemp.resultados.add("Profissional");
        subSubTemp.ações.add("Limpar e harmonizar");
        subSubTemp.ações.add("Reconciliar e Harmonizar");
        subSubTemp.ações.add("Equilibrar e Harmonizar");
        subSubTemp.ações.add("Limpar e Harmonizar");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp,"Futuro");
        subSubTemp.resultados.add("Social");
        subSubTemp.resultados.add("Familiar");
        subSubTemp.resultados.add("Conjugal");
        subSubTemp.resultados.add("Profissional");
        subSubTemp.ações.add("Intuir e Congregar");
        subSubTemp.ações.add("Congregar e Clarificar");
        subSubTemp.ações.add("Clarificar e Harmonizar");
        subSubTemp.ações.add("Clarificar e Harmonizar");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Emocional");
        subSubTemp.inactive = true;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Mental");
        subSubTemp.inactive = true;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Espiritual");
        subSubTemp.inactive = true;
        subTemp.subFerramentas.add(subSubTemp);

        temp.subFerramentas.add(subTemp);

        temp.Decreto = "Eu ativo a Matriz do Campo Mórfico/Morfogenético para que limpe a informação anomala no relacionamento aqui tratado de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Removendo, destruindo e transmutando todas as frequências de má informação da anomalia do (campo, número, ligação) e promovendo (ação) . Fixo agora no (campo) a ação de (ação). Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal2.AddFerramenta(temp);

        temp = new Ferramenta("Cura Egípcia",Portal2,7);
        temp.type = 3;
        temp.optionPerPage = 40;

        temp.resultados.add("OM METISTICA");
        temp.resultados.add("ACARESH");
        temp.resultados.add("SHAALAM");
        temp.resultados.add("MELVIC");
        temp.resultados.add("CALOTH");
        temp.resultados.add("ZONAR");
        temp.resultados.add("YAVITH");
        temp.resultados.add("YANKIN");
        temp.resultados.add("YAM YOM");
        temp.resultados.add("YALOT");
        temp.resultados.add("UTAI FUMIRE");
        temp.resultados.add("SKEE");
        temp.resultados.add("SWEET");
        temp.resultados.add("TETA");
        temp.resultados.add("TOO LA TEC");
        temp.resultados.add("TANATRON");
        temp.resultados.add("STELIK");
        temp.resultados.add("SANTA ESMERALDA");
        temp.resultados.add("SEI HE KI");
        temp.resultados.add("SHAMBALA");
        temp.resultados.add("SKALIBUR");
        temp.resultados.add("SELT");
        temp.resultados.add("SELAPH");
        temp.resultados.add("SHAMLIT");
        temp.resultados.add("SHADY");
        temp.resultados.add("OM TAL RAME NUI");
        temp.resultados.add("OM TRACKDOBLE");
        temp.resultados.add("OM TRE LAM TAM");
        temp.resultados.add("RAMA");
        temp.resultados.add("RANYAM");
        temp.resultados.add("OM TRASH MASH CAM LOO");
        temp.resultados.add("RAKU SUPERLUMINAL");
        temp.resultados.add("OM VRIL");
        temp.resultados.add("OM RADHIX");
        temp.resultados.add("OM NUT");
        temp.resultados.add("OM LAM");
        temp.resultados.add("OM SHO");
        temp.resultados.add("OM SHAZE SHONEN");
        temp.resultados.add("OM SHO HAM");
        temp.resultados.add("OM MAN LIM TREIM TO LIT");
        
        temp.ações.add("Ativando OM METISTICA, fazendo uma varredura no ambiente, limpando e transmutando todas as cargas psíquicas, formas pensamentos, miasmas e elementais negativos e toda e qualquer energia negativa que impactem direta ou indiretamente o campo relacional");
        temp.ações.add("Ativando ACARESH, na frequência trina da chama rosa do amor, dourado da sabedoria, azul de empoderamento. Ativando a conexão com o EU SOU e a família akáshica e todas as impressões no campo mórfico da relação.");
        temp.ações.add("Ativando SHAALAM e as 49 frequências cósmicas com as seus atributos e propriedades no campo mórfico da relação");
        temp.ações.add("Ativando MELVIC e solicitando a orientação no propósito evolutivo da relação no campo mórfico da Terra");
        temp.ações.add("Ativando CALOTH e regenerando as malhas eletromagnéticas e quantum energético de todos os corpos sutis que desequilibram a harmonia da relação.");
        temp.ações.add("Ativando ZONAR e os trabalhos na linha do tempo com os trajetos palingenicos e memórias holográficas não alinhadas lendo e recuperando os registros não significados nos corpos mental superior e akáshico.");
        temp.ações.add("Ativando YAVITH para limpar, harmonizar e proteger o campo mórfico da relação.");
        temp.ações.add("Ativando YANKIN para realizar a análise do DNA dos corpos sutis dos intervenientes e procurando ressonâncias em discordância e promover o evento necessário para a saúde de todos.");
        temp.ações.add("Ativando YAM YOM e inserindo no campo morfogenético dos intervenientes formas pensamento que promovam uma relação saudável;");
        temp.ações.add("Ativando YALOT para promover todas as anomalias estruturais em todos os planos da relação.");
        temp.ações.add("Ativando UTAI FUMIRE para que o campo vibracional de um evento significativo próximo seja de prosperidade e acima de 540Hz.");
        temp.ações.add("Ativando SKEE para beneficiar a materialização do propósito da relação");
        temp.ações.add("Ativando SWEET para ancorar a energia feminina na relação na medida certa e quantidade exata. Alinhando o chakra cardíaco doa intervenientes no propósito.");
        temp.ações.add("Ativando TETA para amplificar a energia mental na relação.");
        temp.ações.add("Ativando TOO LA TEC para despertar a consciência, ancorando os corpos sutis na fonte para que possam baixar as informações que impulsionam o propósito.");
        temp.ações.add("Ativando TANATRON para a clareza emocional e mental nas possibilidades de futuro e nos eventos significativos da relação");
        temp.ações.add("Ativando STELIK para remoção de implantes, chips ou qualquer informação direcionada que não cumpra o equilíbrio do propósito da relação.");
        temp.ações.add("Ativando SANTA ESMERALDA para promover a cura psíquica, emocional e física de todos os intervenientes.");
        temp.ações.add("Ativando SEI HE KI para atuar no corpo emocional e no mental inferior para organizar, processar e materializar os mecanismos de cura do medo e culpa nas situações familiares.");
        temp.ações.add("Ativando SHAMBALA para a ancoragem de todos os aspetos de aprendizado de vida como experiências de crescimento e do empoderamento pessoal através da autoconfiança.");
        temp.ações.add("Ativando SKALIBUR para fortalecimento dos campos eletromagnéticos de expansão de carisma e magnetismo pessoal.");
        temp.ações.add("Ativando SELT para efetuar curas relacionadas á contaminação por efeitos de radiação restaurando o padrão original do DNA.");
        temp.ações.add("Ativando SELAPH para remover todos os registros frequenciais e memórias holográficas que imprimam sensação de não pertencimento.");
        temp.ações.add("Ativando SHAMLIT para atuar como filtro em todas as informações externas nocivas, transmutando a sua frequência em informação de experiência evolutiva");
        temp.ações.add("Ativando SHADY para desbloquear os meridianos energéticos promovendo o fluxo equilibrado de todas as frequências benéficas ao bom funcionamento do chakras.");
        temp.ações.add("Ativando OM TAL RAME NUI para estimular a metafísica do sistema linfático para promover a integridade, a manifestação atuante, total domínio de si mesmo e a vitalidade para a ação positiva");
        temp.ações.add("Ativando OM TRACKDOBLE para restaurar e descongestionar o as emoções que promovem o bom funcionamento do fígado e baço e limpar de impurezas e toxinas. Impulsionar a tomada de decisão e a proatividade positiva.");
        temp.ações.add("Ativando OM TRE LAM TAM para imprimir no campo as funções anti-inflamatórias e antibióticas no corpo físico e o desbloqueio emocional das frequências de vergonha (20Hz), tristeza (75Hz) e raiva (150Hz)");
        temp.ações.add("Ativando RAMA para imprimir no campo a frequência da alegria (540Hz) e intuir o enraizamento perante as ideias abstratas e criativas");
        temp.ações.add("Ativando RANYAM para desbloquear os chakras através da limpeza de frequências baixas atuantes. Nutrir e amparar");
        temp.ações.add("Ativando OM TRASH MASH CAM LOO para aliviar toda a sensação de dor emocional no momento");
        temp.ações.add("Ativando RAKU SUPERLUMINAL para");
        temp.ações.add("Ativando OM VRIL para imprimir frequência do Prana no campo e oxigenar todas as funções hormonais associadas ao sentimento de perda.");
        temp.ações.add("Ativando OM RADHIX para potenciar a tradução frequencial dos intestinos,melhorando o desempenho das sinapses na atuação de expulsão de energias não benéficas do organismo.");
        temp.ações.add("Ativando OM NUT para limpar o sistema reprodutor e potenciar a fertilidade física, mental e emocional");
        temp.ações.add("Ativando OM LAM para atuar no sistema linfático para depuração orgânica");
        temp.ações.add("Ativando OM SHO para proteger o campo morfogenético de energias baixas intrusas");
        temp.ações.add("Ativando o OM SHAZE SHONEN para abrir a consciência a eventos akáshicos e auxiliar na assimilação da sua função no propósito");
        temp.ações.add("Ativando OM SHO HAM para abrir os canais de tradução akáshica e potenciar a influência benéfica nos chakras cardíaco, frontal e coronário");
        temp.ações.add("Ativando OM MAN LIM TREIM TO LIT para reestruturar as moléculas de água das células do corpo, programando cada uma delas a vibrar na cura da doença física");

        temp.Decreto = "Abrindo todos os corpos, faixas dimensionais, pontos da linha temporal e estados de consciência que precisam ser trabalhados hoje. Ativando e abrindo a frequência do canal cósmico. Sintonizando nas oito dimensões anexas ao campo ressonante do planeta e fazendo uma varredura da primeira à terceira dimensão removendo, encaminhando e transmutando toda e qualquer energia, forma pensamento, miasma, elemental ou entidade negativada. (ação), pulsando e fixando no campo, fixando no campo, fixando no campo.";

        Portal2.AddFerramenta(temp);

        temp = new Ferramenta("Ligação Ambientes",Portal2,8);
        temp.type = 1;
        temp.target = Portal1;
        Portal2.AddFerramenta(temp);

        temp = new Ferramenta("Yin Yang",Portal2,9);

        temp.resultados.add("Equilíbrio");
        temp.resultados.add("Falta Yang/Racional");
        temp.resultados.add("Falta Yin/Emocional");
        temp.resultados.add("Excesso Yin/Emocional");
        temp.resultados.add("Excesso Yang/Racional");
        temp.resultados.add("Excesso Yin/ Passividade");
        temp.resultados.add("Excesso Yang/ Atividade");

        temp.ações.add("Fixação do equilíbrio em meio da relação");
        temp.ações.add("Equilibrio na energia masculina e o lado racional da relação");
        temp.ações.add("Equilibrio na energia feminina e o lado emocional da relação");
        temp.ações.add("Equilibrio na energia feminina e o lado emocional da relação");
        temp.ações.add("Equilibrio na energia masculina e o lado racional da relação");
        temp.ações.add("Nivelação da energia passiva com a activa");
        temp.ações.add("Nivelação da energia ativa com a passiva");
        
        temp.Decreto = "Eu ativo a Matriz do Yin Yang para que limpe a informação anomala no relacionamento aqui tratado de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Removendo, destruindo e transmutando todas as frequências de má informação da anomalia por (tipo) e promovendo (ação) . Fixo agora no (campo) a ação de (ação). Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal2.AddFerramenta(temp);

        temp = new Ferramenta("Constelação Familiar",Portal2,10);
        temp.type = 2;

        temp.resultados.add("Mãe");
        temp.resultados.add("Pai");
        temp.resultados.add("Irmão");
        temp.resultados.add("Irmã");
        temp.resultados.add("Filha");
        temp.resultados.add("Filho");
        temp.resultados.add("Antepassado 1ª Geração (avós)");
        temp.resultados.add("Antepassado 2ª Geração (bisavós)");
        temp.resultados.add("Antepassado 3ª Geração (trisavós)");
        temp.resultados.add("Antepassado 4ª Geração (tetravós)");
        temp.resultados.add("Eu Próprio");
        temp.resultados.add("Criança Interior");

        subTemp = new SubFerramenta(temp, "Mãe");
        subTemp.resultados.add("Exclusão");
        subTemp.resultados.add("Fora do Próprio Lugar");
        subTemp.resultados.add("Bloqueio");
        subTemp.resultados.add("Cura");
        subTemp.resultados.add("Desequilíbrio (Dar e Receber)");
        subTemp.resultados.add("Honrando um ancestral");
        subTemp.resultados.add("Financeiro");
        subTemp.resultados.add("Comunicação");
        subTemp.resultados.add("Não Merecimento");
        subTemp.resultados.add("Abuso");

        subTemp.ações.add("Limpar todas as memórias de exclusão em relação a (membro) e se reconciliar");
        subTemp.ações.add("Colocar o seu lugar na sua história e não o de (membro) que acontece agora. Acionar o empoderamento para que viva a sua própria história.");
        subTemp.ações.add("Limpar os bloqueios referentes a (membro) e reconciliar-se");
        subTemp.ações.add("Aceitar a cura em todos os planos da sua história");
        subTemp.ações.add("Aceitar receber e saber doar, em equilíbrio, desprogramando sensações de dívida no passado, no seu campo e no dos seus ancestrais");
        subTemp.ações.add("Que possa honrar os seus ancestrais, aceitando e entendendo todos os seus processos e seguindo o seu próprio caminho.");
        subTemp.ações.add("Limpar todas as informações de escassez no seu campo morfogenético");
        subTemp.ações.add("Promover a comunicação limpa e clara, quebrando padrões ancestrais e assumindo a sua individualidade.");
        subTemp.ações.add("Reconhecer o seu merecimento na prosperidade em todos os planos da vida");
        subTemp.ações.add("Reconciliar-se com todos os abusos a si e seus ancestrais e limpar essa informação do seu campo morfogenético");
        temp.subFerramentas.add(subTemp);

        subTemp = (SubFerramenta) subTemp.clone();
        subTemp.prevResult = "Pai";
        temp.subFerramentas.add(subTemp);

        subTemp = (SubFerramenta) subTemp.clone();
        subTemp.prevResult = "Irmão";
        temp.subFerramentas.add(subTemp);

        subTemp = (SubFerramenta) subTemp.clone();
        subTemp.prevResult = "Irmã";
        temp.subFerramentas.add(subTemp);

        subTemp = (SubFerramenta) subTemp.clone();
        subTemp.prevResult = "Filha";
        temp.subFerramentas.add(subTemp);

        subTemp = (SubFerramenta) subTemp.clone();
        subTemp.prevResult = "Filho";
        temp.subFerramentas.add(subTemp);

        subTemp = (SubFerramenta) subTemp.clone();
        subTemp.prevResult = "Antepassado 1ª Geração (avós)";
        temp.subFerramentas.add(subTemp);

        subTemp = (SubFerramenta) subTemp.clone();
        subTemp.prevResult = "Antepassado 2ª Geração (bisavós)";
        temp.subFerramentas.add(subTemp);

        subTemp = (SubFerramenta) subTemp.clone();
        subTemp.prevResult = "Antepassado 3ª Geração (trisavós)";
        temp.subFerramentas.add(subTemp);

        subTemp = (SubFerramenta) subTemp.clone();
        subTemp.prevResult = "Antepassado 4ª Geração (tetravós)";
        temp.subFerramentas.add(subTemp);

        subTemp = (SubFerramenta) subTemp.clone();
        subTemp.prevResult = "Eu Próprio";
        temp.subFerramentas.add(subTemp);

        subTemp = (SubFerramenta) subTemp.clone();
        subTemp.prevResult = "Criança Interior";
        temp.subFerramentas.add(subTemp);

        temp.Decreto = "Abro no portal dos relacionamentos a frequência de cura da Constelação Familiar para que os bloqueios de relação de (nome do consulente) possam ser desativados, limpos e harmonizados. Ativo o elemento (membro) identificado como causando (causa) no plano das relações de (nome do consulente). (Ação), pulsando no campo a limpeza e harmonização para que se fixe na medida certa e na quantidade exata, dentro do que é divino. Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal2.AddFerramenta(temp);


        //Portal do Eu Interior
        temp = new Ferramenta("Regeneração de DNA",Portal3,0);
        temp.type = 2;

        temp.resultados.add("Tabela de Vitaminas e Minerais");
        temp.resultados.add("Tabela de Glândulas, Hormônios e Neurotransmissores");
        temp.resultados.add("Tabela de Aminoácidos");

        subTemp = new SubFerramenta(temp, "Tabela de Vitaminas e Minerais");
        subTemp.multi = true;
        subTemp.resultados.add("Vitamina A");
        subTemp.resultados.add("Vitamina B1");
        subTemp.resultados.add("Vitamina B2");
        subTemp.resultados.add("Vitamina B3");
        subTemp.resultados.add("Vitamina B6");
        subTemp.resultados.add("Vitamina B12");
        subTemp.resultados.add("Vitamina C");
        subTemp.resultados.add("Vitamina D");
        subTemp.resultados.add("Vitamina E");
        subTemp.resultados.add("Vitamina K");
        subTemp.resultados.add("Vitamina U");
        subTemp.resultados.add("Ácido Fólico");
        subTemp.resultados.add("Ácido Pantotênico");
        subTemp.resultados.add("Cálcio");
        subTemp.resultados.add("Ferro");
        subTemp.resultados.add("Fósforo");
        subTemp.resultados.add("Iodo");
        subTemp.resultados.add("Magnésio");
        subTemp.resultados.add("Manganês");
        subTemp.resultados.add("Niacina");
        subTemp.resultados.add("Potássio");

        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");

        subTemp.repeatString = "(designação), ";
        subTemp.ownDecreto = "Eu, (nome do terapeuta) peço permissão ao Eu Superior de (nome do consulente) para aceder ao seu campo morfogenético, chakras e corpos sutis que se encontram afetados pela anomalia de (next) para que se harmonizem, equilibrem e criem impacto na estrutura do DNA, reestruturando e renovando o funcionamento do corpo físico na medida certa e na quantidade exata, dentro do que é divino. Ativo agora a ação de (next) e promovo o equilíbrio de todos os chakras e todos os corpos sutis. Pulsa, pulsa, pulsa no campo.";

        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "Tabela de Glândulas, Hormônios e Neurotransmissores");
        subTemp.resultados.add("Hormônios liberados pela neuro-hipófise ou porção caudal da hipófise");
        subTemp.resultados.add("Hormônios adeno-hipófise liberados pela porção rostral da hipófise");
        subTemp.resultados.add("Glândula Pineal = epífise");
        subTemp.resultados.add("Tireoide");
        subTemp.resultados.add("Paratireoide");
        subTemp.resultados.add("Timo");
        subTemp.resultados.add("Células betas das ilhas de Langerhans (ilhotas pancreáticas)");
        subTemp.resultados.add("Células alfas das ilhas de Langerhans");
        subTemp.resultados.add("Medula da glândula adrenal");
        subTemp.resultados.add("Córtex da glândula adrenal");
        subTemp.resultados.add("Neurotransmissores");

        subSubTemp = new SubFerramenta(temp, "Hormônios liberados pela neuro-hipófise ou porção caudal da hipófise");
        subSubTemp.resultados.add("Oxitocina");
        subSubTemp.resultados.add("Hormônio Antidiurético");

        subSubTemp.ações.add("Estimular a contração uterina, no parto, e na produção de leite");
        subSubTemp.ações.add("Estimular a reabsorção de água nos tubérculos renais (conserva água no organismo)");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Hormônios adeno-hipófise liberados pela porção rostral da hipófise");
        subSubTemp.resultados.add("Prolactina");
        subSubTemp.resultados.add("Hormônio de crescimento (GH)");
        subSubTemp.resultados.add("Hormônios gonadotrópico");
        subSubTemp.resultados.add("Hormônio estimulador da tireoide");
        subSubTemp.resultados.add("Hormônios estimulador da córtex adrenal");
        
        subSubTemp.ações.add("Estimular a produção de leite pelas glândulas mamárias");
        subSubTemp.ações.add("Estimular o crescimento do organismo e favorecendo a síntese proteica");
        subSubTemp.ações.add("Estimular o funcionamento das gônadas (testículos e ovários)");
        subSubTemp.ações.add("Estimular a secreção dos hormônios da tireoide");
        subSubTemp.ações.add("Estimular a secreção de hormônios no córtex da suprarrenal");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Glândula Pineal = epífise");
        subSubTemp.resultados.add("Melatonina");
        
        subSubTemp.ações.add("Regular o ritmo biológico");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Tireoide");
        subSubTemp.resultados.add("Triiodotironina (T3) Tiroxina (T4)");
        
        subSubTemp.ações.add("Estimular a taxa metabólica que influencia o desenvolvimento e crescimento");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Paratireoide");
        subSubTemp.resultados.add("Hormônio Paratireóideo");
        
        subSubTemp.ações.add("Estimular a liberação de cálcio e absorção pelos rins. Ativa a vitamina P no intestino");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Timo");
        subSubTemp.resultados.add("Timosina");
        
        subSubTemp.ações.add("Auxiliar nas respostas do sistema imunológico");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Células betas das ilhas de Langerhans (ilhotas pancreáticas)");
        subSubTemp.resultados.add("Insulina");
        
        subSubTemp.ações.add("Diminuir os níveis de glicose no sangue; estimula a produção de glicogênio (aglomerado de glicose); estimula o armazenamento de gordura e síntese proteica");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Células alfas das ilhas de Langerhans");
        subSubTemp.resultados.add("Glucagon");
        
        subSubTemp.ações.add("Aumentar os níveis de glicose no sangue; desestimular a produção de glicogênio");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Medula da glândula adrenal");
        subSubTemp.resultados.add("Adrenalina (Epinefrina)");
        
        subSubTemp.ações.add("Aumentar os batimentos cardíacos; aumentar a glicose no sangue; colocar o organismo em alerta");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Córtex da glândula adrenal");
        subSubTemp.resultados.add("Aldosterona");
        subSubTemp.resultados.add("Cortisol");
        
        subSubTemp.ações.add("Promover o equilíbrio dos íons sódio e potássio aumentando a absorção de sódio");
        subSubTemp.ações.add("Aumentar o nível de glicose no sangue e atua no metabolismo de gorduras (estresse)");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Neurotransmissores");
        subSubTemp.resultados.add("Dopamina");
        subSubTemp.resultados.add("Serotonina");
        subSubTemp.resultados.add("Oxitocina");
        subSubTemp.resultados.add("Noradrenalina");
        subSubTemp.resultados.add("Adrenalina");
        subSubTemp.resultados.add("Endorfina");
        subSubTemp.resultados.add("Norepinefrina");
        subSubTemp.resultados.add("Acetilcolina");
        
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subTemp.subFerramentas.add(subSubTemp);

        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "Tabela de Aminoácidos");
        subTemp.resultados.add("Ácido Aspártico");
        subTemp.resultados.add("Ácido Glutâmico");
        subTemp.resultados.add("Alanina");
        subTemp.resultados.add("Arginina");
        subTemp.resultados.add("Asparagina");
        subTemp.resultados.add("Cisteína");
        subTemp.resultados.add("Fenilalanina");
        subTemp.resultados.add("Glicina");
        subTemp.resultados.add("Glutamina");
        subTemp.resultados.add("Histidina");
        subTemp.resultados.add("Isoleucina");
        subTemp.resultados.add("Leucina");
        subTemp.resultados.add("Lisina");
        subTemp.resultados.add("Metionina");
        subTemp.resultados.add("Prolina");
        subTemp.resultados.add("Serina");
        subTemp.resultados.add("Tirosina");
        subTemp.resultados.add("Treonina");
        subTemp.resultados.add("Triptofano");
        subTemp.resultados.add("Valina");
        subTemp.resultados.add("BCAA");

        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");

        subTemp.ownDecreto = "Eu, (nome do terapeuta) peço permissão ao Eu Superior de (nome do consulente) para aceder ao seu campo morfogenético, chakras e corpos sutis que se encontram afetados pela anomalia de (designação) para que se harmonizem, equilibrem e criem impacto na estrutura do DNA, reestruturando e renovando o funcionamento do corpo físico na medida certa e na quantidade exata, dentro do que é divino. Eu sou a ativar agora o equilíbrio de (designação) e promovo a harmonização de todos os chakras e todos os corpos sutis. Pulsa, pulsa, pulsa no campo.";

        temp.subFerramentas.add(subTemp);

        temp.Decreto = "Eu, (nome do terapeuta) peço permissão ao Eu Superior de (nome do consulente) para aceder ao seu campo morfogenético, chakras e corpos sutis que se encontram afetados pela anomalia de (designação), (hormona) para que se harmonizem, equilibrem e criem impacto na estrutura do DNA, reestruturando e renovando o funcionamento do corpo físico na medida certa e na quantidade exata, dentro do que é divino. Eu sou a ativar agora o equilíbrio de (hormona) para (ação) e promovo a harmonização de todos os chakras e todos os corpos sutis. Pulsa, pulsa, pulsa no campo.";

        Portal3.AddFerramenta(temp);

        temp = new Ferramenta("Chakras e Corpos Sutis",Portal3,1);
        temp.type = 2;
        
        temp.resultados.add("Chakra");
        temp.resultados.add("Corpo Sutil");

        subTemp = new SubFerramenta(temp, "Chakra");
        subTemp.resultados.add("Básico");
        subTemp.resultados.add("Umbilical");
        subTemp.resultados.add("Solar");
        subTemp.resultados.add("Cardíaco");
        subTemp.resultados.add("Laríngeo");
        subTemp.resultados.add("Frontal");
        subTemp.resultados.add("Coronário");

        subSubTemp = new SubFerramenta(temp, "Básico");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Ativar a segurança e a materialização");
        subSubTemp.ações.add("Equilibrar o funcionamento das glândulas supra-renais");
        subSubTemp.ações.add("Desativar a sensação de que não pertence ao lugar, não sabe onde pertence de solidão, insegurança, abandono, desconexão, não merece existir,");
        subSubTemp.ações.add("Desinstalar a informação de desconfiança, incredulidade, consciência pobre, possessibilidade e avareza. Quebrar o vínculo constante ao passado, se sentindo, vítima, desconfortável com o corpo, agitado");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Umbilical");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Ativar a criatividade e o prazer");
        subSubTemp.ações.add("Equilibrar o funcionamento das gónadas, ovários, testículos e próstata");
        subSubTemp.ações.add("Desativar ansiedade, vergonha, abandono e raiva tristeza, dualidade desequilibrada, frustração, confusão");
        subSubTemp.ações.add("Desinstalar a informação de procrastinação na decisão, ciume, racionalidade excessiva, ilusões grandiosas, corpo rígido, medo de comunicar, compulsão sexual.");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Solar");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Ativar o poder social e as relações interpessoais");
        subSubTemp.ações.add("Equilibrar o funcionamento do pâncreas");
        subSubTemp.ações.add("Desativar Irresponsabilidade social, isolamento, egoísmo, fraqueza de caráter, agitação, raiva, desejo de poder e de ser o melhor sem escrúpulos");
        subSubTemp.ações.add("Desinstalar a informação de sentimento de superioridade e reatividade, stress, compulsividade, indisciplina, sentimento de vítima, salvador ou algoz.");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Cardíaco");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Ativar a coerência e o amor");
        subSubTemp.ações.add("Equilibrar a glândula do timo");
        subSubTemp.ações.add("Desativar a alienação e apego, masoquismo e dependência, tristeza e solidão, amedrontamento e sentimento depressivo.");
        subSubTemp.ações.add("Desinstalar a informação de não confiar em ninguém, fanatismo compulsivo e a postura corporal ruim");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Laríngeo");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Ativar a comunicação, a vontade e o conhecimento");
        subSubTemp.ações.add("Equilibrar o funcionamento da tiroide e paratiróide");
        subSubTemp.ações.add("Desativar orgulho e medo, não conseguir dizer a verdade, medo de comunicar, mania de superioridade, stress, incapacidade de relaxar, hiperatividade, dissimulação, hesitação em interações");
        subSubTemp.ações.add("Desinstalar a informação de ser dono de um conhecimento e consciência usados só em proveito próprio, usar de esperteza para tirar proveito, hedonismo, tentar se mostrar envolvido apenas teoricamente.");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Frontal");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Ativar a inspiração, a intuição e a visão interior");
        subSubTemp.ações.add("Equilibrar o funcionamento da glândula pituitária");
        subSubTemp.ações.add("Desativar peso na mente racional, confusão e frieza, paranóia, cisma e preocupação, necessidade de ver para crer, questionamento e negação da realidade subjetiva");
        subSubTemp.ações.add("Desinstalar a informação não presente no corpo físico, pseudo intelectual, exacerbação de conceitos materiais, comportamento manipulativo e calculista.");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Coronário");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Ativar a percepção etérica, a transcendência e a cura espiritual");
        subSubTemp.ações.add("Equilibrar o funcionamento da glândula pineal");
        subSubTemp.ações.add("Desativar dúvida, depressão, apatia com o mundo e pessoas, negação da existência de vibrações superiores, dificuldade de aprender e conhecer além do racional de referência");
        subSubTemp.ações.add("Desinstalar a informação de necessidade de controlar tudo, dominar, de ser endoutrinável, uma vez que teme o desconhecido e a negação da sua personalidade.");
        subTemp.subFerramentas.add(subSubTemp);

        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "Corpo Sutil");
        
        subTemp.resultados.add("Físico");
        subTemp.resultados.add("Etérico");
        subTemp.resultados.add("Emocional");
        subTemp.resultados.add("Mental Inferior");
        subTemp.resultados.add("Mental Superior");
        subTemp.resultados.add("Búdico");
        subTemp.resultados.add("Átmico");

        subSubTemp = new SubFerramenta(temp, "Físico");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Desativar as crenças e padrões que levam à rejeição do corpo físico");
        subSubTemp.ações.add("Desinstalar memórias holográficas akáshicas de desestruturação de DNA");
        subSubTemp.ações.add("Ativar a recetividade de fluído cósmico em benefício de todas as células do corpo físico. Programar a memória da água presente no corpo físico para a ativação da frequência de 528Hz");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Etérico");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Desativar crenças e padrões de não empoderamento do campo de proteção pessoal");
        subSubTemp.ações.add("Transmutar todas as formas energia de frequências densas e enviá-las em benefício do campo morfogenético do hospedeiro");
        subSubTemp.ações.add("Desinstalar todas as formas pensamento, cismas e implantações energéticas densas que degeneram o corpo etérico. Ativar a frequência de cura de 741Hz para limpeza e regeneração do corpo etérico");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Emocional");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Desativar crenças e padrões akáshicos e/ou geracionais emocionais que transportam a informação de culpa");
        subSubTemp.ações.add("Desinstalar todo o sentimento não divino e não coerente com a manifestação da Divindade Interna");
        subSubTemp.ações.add("Ativar o empoderamento das emoções positivas abrindo a amplitude de frequência dos 200 aos 700Hz, agora.");
        subTemp.subFerramentas.add(subSubTemp);
        

        subSubTemp = new SubFerramenta(temp, "Mental Inferior");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Desativar crenças e padrões limitantes das ideias concretas e das ideias fundamentadas");
        subSubTemp.ações.add("Desinstalar bloqueios a informação e ideias novas");
        subSubTemp.ações.add("Ativar a consolidação da afirmação positiva consciente para benefício da tomada de decisão");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Mental Superior");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Desativar crenças e padrões presentes no campo akáshico que bloqueiam a criatividade");
        subSubTemp.ações.add("Desinstalar bloqueios a informação abstrata e a conceitos não construídos pelo seu campo de referências");
        subSubTemp.ações.add("Ativar a frequência de onda Theta de 4 a 7 Hz por segundo abrindo o mental superior à sintetização das ideias abstratas não referenciais, ancorando o estado de vigília durante o processo");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Búdico");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Desativar crenças e padrões de vidas passadas que bloqueiam a tomada de decisão");
        subSubTemp.ações.add("Desinstalar memórias holográficas degenerativas que desiquilibram os corpos mentais, emocional, etérico e físico");
        subSubTemp.ações.add("Ativar o empoderamento ancorado na experiência passada, transmutando as experiências reconhecidas como negativas e instalando-as como instrumento de evolução");
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "Átmico");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        
        subSubTemp.ações.add("Ativar o empoderamento do reconhecimento da Divindade Interior");
        subSubTemp.ações.add("Ativar a clareza mental, emocional e espiritual perante a anomalia");
        subSubTemp.ações.add("Ativar a frequência de 1000Hz para o impulso definitivo do conhecimento de si mesmo e do campo que o circunda");
        subTemp.subFerramentas.add(subSubTemp);

        temp.subFerramentas.add(subTemp);

        temp.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) peço permissão ao Eu Superior de (nome do consulente) para aceder ao seu campo morfogenético, abrindo o (tipo) (designação) para (ação) e crie impacto na estrutura do DNA, reestruturando e renovando o funcionamento do corpo físico na medida certa e na quantidade exata, dentro do que é divino. Eu sou a ativar agora o equilíbrio de (tipo) (designação) e promovo o alinhamento de todos os chakras e todos os corpos sutis. Pulsa, pulsa, pulsa no campo.";

        Portal3.AddFerramenta(temp);

        temp = new Ferramenta("Ligação Ambientes",Portal3,2);
        temp.type = 1;
        temp.target = Portal1;
        Portal3.AddFerramenta(temp);

        temp = new Ferramenta("Vidas Passadas",Portal3,3);
        
        temp.type = 2;
        temp.resultados.add("Memórias Holográficas");
        temp.resultados.add("Crenças e Padrões");
        temp.resultados.add("Contractos, Pactos, Juramentos, Votos, Acordos");
        temp.resultados.add("Resgates");

        subTemp = new SubFerramenta(temp,"Memórias Holográficas");
        subTemp.multi = true;
        subTemp.resultados.add("Pesadelos");
        subTemp.resultados.add("Traumas");
        subTemp.resultados.add("Saudade");
        subTemp.resultados.add("Culpa");
        subTemp.resultados.add("Fuga");
        subTemp.resultados.add("Luta Interna");
        subTemp.resultados.add("Insegurança");
        subTemp.resultados.add("Raiva");
        subTemp.resultados.add("Medo");
        subTemp.resultados.add("Desespero");
        subTemp.resultados.add("Vingança");
        subTemp.resultados.add("Vergonha");
        subTemp.resultados.add("Rejeição");

        subTemp.ações.add("Transmutar");
        subTemp.ações.add("Diluir");
        subTemp.ações.add("Transmutar");
        subTemp.ações.add("Transmutar");
        subTemp.ações.add("Assumir");
        subTemp.ações.add("Pacificar");
        subTemp.ações.add("Transmutar");
        subTemp.ações.add("Pacificar");
        subTemp.ações.add("Assumir");
        subTemp.ações.add("Transmutar");
        subTemp.ações.add("Perdoar");
        subTemp.ações.add("Diluir");
        subTemp.ações.add("Aceitar");

        subTemp.repeatString = "(ação) o/a (sintoma), ";
        subTemp.ownDecreto = "Activo a frequência da onda violeta para adentrar nas memórias holográficas que causam bloqueios na vida presente de (nome do consulente). Decreto aberto o campo akáshico para que possa (next) fixando o equilíbrio, na medida exata e na quantidade certa. Pulso no campo, pulso no campo, pulso no campo.";

        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp,"Crenças e Padrões");
        subTemp.multi = true;
        subTemp.resultados.add("Escassez");
        subTemp.resultados.add("Não Merecimento");
        subTemp.resultados.add("Punição");
        subTemp.resultados.add("Religiosidade");
        subTemp.resultados.add("Materialismo");
        subTemp.resultados.add("Autoritarismo");

        subTemp.ações.add("Destruir");
        subTemp.ações.add("Apagar");
        subTemp.ações.add("Reconciliar");
        subTemp.ações.add("Transmutar");
        subTemp.ações.add("Transmutar");
        subTemp.ações.add("Pacificar");

        subTemp.repeatString = "(ação) o/a (sintoma), ";
        subTemp.ownDecreto = "Activo a frequência da onda branca para adentrar nas crenças e padrões que causam bloqueios na vida presente de (nome do consulente). Decreto aberto o campo akáshico para que possa (next) fixando o equilíbrio, na medida exata e na quantidade certa. Pulso no campo, pulso no campo, pulso no campo.";

        temp.subFerramentas.add(subTemp);
        
        subTemp = new SubFerramenta(temp,"Contractos, Pactos, Juramentos, Votos, Acordos");
        subTemp.multi = true;
        subTemp.resultados.add("Voto de Pobreza");
        subTemp.resultados.add("Voto de Castidade");
        subTemp.resultados.add("Celibato");
        subTemp.resultados.add("Voto de Obediência");
        subTemp.resultados.add("Amor Eterno");
        subTemp.resultados.add("Voto Silêncio");
        subTemp.resultados.add("Pacto Energético");
        subTemp.resultados.add("Magias");

        subTemp.ações.add("Quebrar");
        subTemp.ações.add("Destruir");
        subTemp.ações.add("Destruir");
        subTemp.ações.add("Quebrar");
        subTemp.ações.add("Desatar");
        subTemp.ações.add("Quebrar");
        subTemp.ações.add("Destruir");
        subTemp.ações.add("Transmutar");

        subTemp.repeatString = "(ação) o/a (sintoma), ";
        subTemp.ownDecreto = "Activo a frequência do vento solar, juntamente com a cruz crística para adentrar nos contratos, pactos, juramentos, votos e acordos, feito no passado e que causam bloqueios na vida presente de (nome do consulente). Decreto aberto o campo akáshico para que possa (next) fixando o equilíbrio, resgatando o (sintoma), na medida exata e na quantidade certa. Pulso no campo, pulso no campo, pulso no campo.";

        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp,"Resgates");
        subTemp.multi = true;
        subTemp.resultados.add("Corpo Físico");
        subTemp.resultados.add("Corpo Etérico");
        subTemp.resultados.add("Corpo Emocional");
        subTemp.resultados.add("Corpo Mental");
        subTemp.resultados.add("Espírito");
        subTemp.resultados.add("Alma");

        subTemp.ações.add("Resgatar");
        subTemp.ações.add("Resgatar");
        subTemp.ações.add("Resgatar");
        subTemp.ações.add("Resgatar");
        subTemp.ações.add("Resgatar");
        subTemp.ações.add("Resgatar");

        subTemp.repeatString = "(ação) o/a (sintoma), ";
        subTemp.ownDecreto = "Activo a frequência do raio azul para adentrar nos resgates do passado e que causam bloqueios na vida presente de (nome do consulente). Decreto aberto o campo akáshico para que possa (next) fixando o equilíbrio, na medida exata e na quantidade certa. Pulso no campo, pulso no campo, pulso no campo.";

        temp.subFerramentas.add(subTemp);

        Portal3.AddFerramenta(temp);

        temp = new Ferramenta("Ferramenta em Branco (Eu Interior)",Portal3,4);
        temp.type = 2;

        temp.resultados.add("Arcanos Maiores");
        temp.resultados.add("72 Nomes de Deus");

        subTemp = new SubFerramenta(temp, "Arcanos Maiores");
        subTemp.offset = 0;
        subTemp.multi = true;
        subTemp.resultados.add("O Louco");
        subTemp.resultados.add("O Mago");
        subTemp.resultados.add("A Sacerdotisa");
        subTemp.resultados.add("A Imperatriz");
        subTemp.resultados.add("O Imperador");
        subTemp.resultados.add("O Papa");
        subTemp.resultados.add("Os Enamorados");
        subTemp.resultados.add("O Carro");
        subTemp.resultados.add("A Justiça");
        subTemp.resultados.add("O Ermita");
        subTemp.resultados.add("A Roda da Fortuna");
        subTemp.resultados.add("A Força");
        subTemp.resultados.add("O Enforcado");
        subTemp.resultados.add("A Morte");
        subTemp.resultados.add("A Temperança");
        subTemp.resultados.add("O Diabo");
        subTemp.resultados.add("A Torre");
        subTemp.resultados.add("A Estrela");
        subTemp.resultados.add("A Lua");
        subTemp.resultados.add("O Sol");
        subTemp.resultados.add("O Julgamento");
        subTemp.resultados.add("O Mundo");


        //ativação
        subTemp.ações.add("Possibilidade");
        subTemp.ações.add("Vontade");
        subTemp.ações.add("Instinto");
        subTemp.ações.add("Criação");
        subTemp.ações.add("Ambição");
        subTemp.ações.add("Padrão Positivo");
        subTemp.ações.add("Conexão");
        subTemp.ações.add("Movimento");
        subTemp.ações.add("Equilíbrio");
        subTemp.ações.add("Isolamento");
        subTemp.ações.add("Propósito");
        subTemp.ações.add("Resistência");
        subTemp.ações.add("Resgate");
        subTemp.ações.add("Metamorfose");
        subTemp.ações.add("Moderação");
        subTemp.ações.add("Servidão");
        subTemp.ações.add("Ruptura");
        subTemp.ações.add("Esperança");
        subTemp.ações.add("Ilusão");
        subTemp.ações.add("Sucesso");
        subTemp.ações.add("Despertar");
        subTemp.ações.add("Plenitude");

        //significado
        subTemp.resultados2.add("Loucura, disparate, extravagância, mente ativa");
        subTemp.resultados2.add("Habilidade, força de vontade, auto-confiança, dualidade");
        subTemp.resultados2.add("Ciência, educação, conhecimento, fertilidade");
        subTemp.resultados2.add("Abundância, criatividade, ação");
        subTemp.resultados2.add("Poder, autoridade, racionalidade, nutrir, adaptação, ordem");
        subTemp.resultados2.add("Empoderamento, Sabedoria");
        subTemp.resultados2.add("Um teste que vai passar com sucesso, um (novo) amor, uma (nova) parceria, adaptação");
        subTemp.resultados2.add("Triunfo, algo em andamento , ousar, calar, saber, querer");
        subTemp.resultados2.add("Equilíbrio, equilíbrio no propósito, sucesso com questões jurídicas ou palingénicas");
        subTemp.resultados2.add("Isolamento introspetivo, avanço iluminativo");
        subTemp.resultados2.add("Bom fluxo, evento palingênico, sucesso");
        subTemp.resultados2.add("Poder de propósito, impulso positivo, dharma");
        subTemp.resultados2.add("Sabedoria através do auto-conhecimento, período de estagnação para desenvolvimento pessoal");
        subTemp.resultados2.add("Evolução, mudança, transformação, fim de ciclo");
        subTemp.resultados2.add("Moderação, intuição, apelo ao Eu Superior");
        subTemp.resultados2.add("Proximidade de evento de mudança no propósito, questões internas promovem desenvolvimento");
        subTemp.resultados2.add("Necessidade de defesa e de proteção, necessidade de se posicionar empoderado");
        subTemp.resultados2.add("Nascimento, renascimento, esperança, futuro brilhante");
        subTemp.resultados2.add("Magia, estudo dos mistérios, fase de vida");
        subTemp.resultados2.add("Felicidade, alegria, sucesso integral");
        subTemp.resultados2.add("Renovações, questões palingénicas, metamorfoses");
        subTemp.resultados2.add("O todo, sucesso garantido, plenitude");
        //significado reverso
        subTemp.resultados2.add("Hesitação, problemas por ignorar a loucura, confusão mental, descuido");
        subTemp.resultados2.add("Uso errado dos talentos, presunção, falta de habilidades");
        subTemp.resultados2.add("Ignorância, falta de conhecimento, passividade, infertilidade");
        subTemp.resultados2.add("Procrastinação, vacilo, perda de poder");
        subTemp.resultados2.add("Emoções imaturas, obstrução a planos, falta de empoderamento, falta de autoridade, anarquia");
        subTemp.resultados2.add("Gentileza excessiva, fraqueza");
        subTemp.resultados2.add("Um teste falhado, um amor ou parceria perdidos, inadaptação");
        subTemp.resultados2.add("Derrota, obstáculo a chegarem rapidamente");
        subTemp.resultados2.add("Desequilíbrio, intolerância, preconceito, fanatismo");
        subTemp.resultados2.add("Medo, isolamento depressivo, atos imprudentes");
        subTemp.resultados2.add("Mau fluxo, doença somatizada, bloqueio");
        subTemp.resultados2.add("Poder Físico, impulso negativo, karma");
        subTemp.resultados2.add("Dependência, tentativa de se enturmar, procrastinação");
        subTemp.resultados2.add("Estagnação, morte, doença, chamada de atenção para evento negativo");
        subTemp.resultados2.add("Confronto de interesses, falta de moderação");
        subTemp.resultados2.add("Proximidade de evento traumático, questões internas promovem bloqueios");
        subTemp.resultados2.add("Dificuldades, bloqueios, crenças limitantes, ruína, catástrofe");
        subTemp.resultados2.add("Expetativa, desapontamento, esterilidade");
        subTemp.resultados2.add("Decepção, inimigos escondidos, influências externas negativas");
        subTemp.resultados2.add("Fluxo normal, sucesso parcial (pode fazer melhor)");
        subTemp.resultados2.add("Contratempos, recuos, atrasos");
        subTemp.resultados2.add("Falência, inércia, compensações envenenadas");


        //chakra associado
        subTemp.funções.add("Coronário");
        subTemp.funções.add("Laríngeo");
        subTemp.funções.add("Frontal");
        subTemp.funções.add("Cardíaco e Sexual");
        subTemp.funções.add("Raiz");
        subTemp.funções.add("Laríngeo");
        subTemp.funções.add("Cardíaco");
        subTemp.funções.add("Laríngeo");
        subTemp.funções.add("Cardíaco");
        subTemp.funções.add("Frontal");
        subTemp.funções.add("Solar");
        subTemp.funções.add("Solar");
        subTemp.funções.add("Frontal");
        subTemp.funções.add("Cardíaco");
        subTemp.funções.add("Solar, Frontal, Coronário");
        subTemp.funções.add("Raiz");
        subTemp.funções.add("Coronário");
        subTemp.funções.add("Coronário");
        subTemp.funções.add("Frontal, Coronário");
        subTemp.funções.add("Solar");
        subTemp.funções.add("Coronário");
        subTemp.funções.add("Raiz");

        subTemp.repeatString = "(designar qual ou quais por ordem de saída), ";
        subTemp.repeatString2 = "(todas as ativações que saírem por ordem), ";
        subTemp.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) peço permissão ao Eu Superior de (nome do consulente) para limpar a informação anómala nos seus campos frequenciais e imprimir a(s) frequência(s) de cura do(s) Arcano(s) Maior(es) (next) com a potência das energias que lhe(s) está (estão) associadas. Ativo agora as potências de (next2) e processo o seu campo de cura para que desbloqueie o sinal anómalo e promova a força de ação dentro do seu propósito.";
        
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "72 Nomes de Deus");
        subTemp.resultados.add("KAF HE KAF");
        subTemp.resultados.add("YOD LAMED YOD");
        subTemp.resultados.add("YEY YOD SAMEKH");
        subTemp.resultados.add("MEM LAMED AYIN");
        subTemp.resultados.add("SHIN HE MEM");
        subTemp.resultados.add("HE LAMED LAMED");
        subTemp.resultados.add("ALEF KAF ALEF");
        subTemp.resultados.add("HE TAV KAF");
        subTemp.resultados.add("HE ZAYIN YOD");
        subTemp.resultados.add("DALET LAMED ALEF");
        subTemp.resultados.add("KAF ALEF LAMED");
        subTemp.resultados.add("AYIN HE HE");
        subTemp.resultados.add("LAMED ZAYIN YOD");
        subTemp.resultados.add("HE BET MEM");
        subTemp.resultados.add("YOD RESH HE");
        subTemp.resultados.add("MEM QOPH HE");
        subTemp.resultados.add("KAF ALEF LAMED");
        subTemp.resultados.add("YOD LAMED KAF");
        subTemp.resultados.add("KAF KAF LAMED");
        subTemp.resultados.add("LAMED HE PE");
        subTemp.resultados.add("KAF LAMED NUN");
        subTemp.resultados.add("YOD YOD YOD");
        subTemp.resultados.add("MEM LAMED HE");
        subTemp.resultados.add("KAF HE HET");
        subTemp.resultados.add("HE TAV NUN");
        subTemp.resultados.add("ALEF ALEF HE");
        subTemp.resultados.add("TAV RESH YOD");
        subTemp.resultados.add("HE ALEF SHIN");
        subTemp.resultados.add("YOD YOD RESH");
        subTemp.resultados.add("MEM KAF ALEF");
        subTemp.resultados.add("BET KAF LAMED");
        subTemp.resultados.add("KAF SHIN RESH");
        subTemp.resultados.add("KAF HET YOD");
        subTemp.resultados.add("HET HE LAMED");
        subTemp.resultados.add("QOPH KAF KAF");
        subTemp.resultados.add("DALET NUN MEM");
        subTemp.resultados.add("YOD NUN ALEF");
        subTemp.resultados.add("MEM AYIN HET");
        subTemp.resultados.add("AYIN HE RESH");
        subTemp.resultados.add("ZAYIN YOD YOD");
        subTemp.resultados.add("HE HE HE");
        subTemp.resultados.add("KAF YOD MEM");
        subTemp.resultados.add("LAMED KAF KAF");
        subTemp.resultados.add("HE LAMED YOD");
        subTemp.resultados.add("LAMED ALEF SAMEKH");
        subTemp.resultados.add("YOD RESH AYIN");
        subTemp.resultados.add("LAMED SHIN AYIN");
        subTemp.resultados.add("HE YOD MEM");
        subTemp.resultados.add("KAF HE KAF");
        subTemp.resultados.add("YOD NUN DALET");
        subTemp.resultados.add("SHIN HET HE");
        subTemp.resultados.add("MEM MEM AYIN");
        subTemp.resultados.add("ALEF NUN NUN");
        subTemp.resultados.add("NUN YOD TAV");
        subTemp.resultados.add("HE BET MEM");
        subTemp.resultados.add("YOD KAF PE");
        subTemp.resultados.add("MEM MEM NUN");
        subTemp.resultados.add("LAMED YOD YOD");
        subTemp.resultados.add("HET RESH HE");
        subTemp.resultados.add("RESH TZADIK MEM");
        subTemp.resultados.add("BET MEM KAF");
        subTemp.resultados.add("HE HE YOD");
        subTemp.resultados.add("KAF NUN AYIN");
        subTemp.resultados.add("YOD HET MEM");
        subTemp.resultados.add("BET MEM DALET");
        subTemp.resultados.add("QOPH NUN MEM");
        subTemp.resultados.add("AYIN YOD ALEF");
        subTemp.resultados.add("KAF BET HET");
        subTemp.resultados.add("HE ALEF RESH");
        subTemp.resultados.add("MEM BET YOD");
        subTemp.resultados.add("YOD YOD HE");
        subTemp.resultados.add("MEM VAM MEM");

        subTemp.resultados2.add("Viagem no Tempo: Como consertar o passado");
        subTemp.resultados2.add("Resgatando as Centelhas: Recarregando quando está esgotado");
        subTemp.resultados2.add("Fazendo Milagres: Uma receita");
        subTemp.resultados2.add("Eliminando Pensamentos Negativos: Quando e como");
        subTemp.resultados2.add("Cura: Meditação para si próprio e para os outros");
        subTemp.resultados2.add("Estado de Sonho: Ativando mensagens do subconsciente");
        subTemp.resultados2.add("DNA da Alma: Recolocando as coisas no seu estado perfeito");
        subTemp.resultados2.add("Neutralizando Energia Negativa e Estresse: Aliviando a pressão");
        subTemp.resultados2.add("Influências Angelicais: Acessando a ajuda divina");
        subTemp.resultados2.add("Olhares Podem Matar: Protegendo-se do mau-olhado");
        subTemp.resultados2.add("Expulsando os Resíduos do Mal: Purificando os lugares");
        subTemp.resultados2.add("Amor Incondicional: Como despertar o amor, principalmente quando você não quer fazê-lo");
        subTemp.resultados2.add("Paraíso na Terra: Criando harmonia dentro e fora.");
        subTemp.resultados2.add("Adeus às Armas: Parando o conflito");
        subTemp.resultados2.add("Visão de Longo Alcance: Vendo o efeito de decisões antes de tomá-las");
        subTemp.resultados2.add("Jogando Fora a Depressão: Como se levantar depois da queda.");
        subTemp.resultados2.add("Grande Fuga: Vencendo os limites do ego.");
        subTemp.resultados2.add("Fertilidade: Quando é difícil engravidar.");
        subTemp.resultados2.add("Disque Deus: Recebendo respostas para suas orações.");
        subTemp.resultados2.add("Vencendo os Vícios: Sobrepujando seu lado negativo.");
        subTemp.resultados2.add("Erradicando a Praga: Efetuando mudanças no mundo físico.");
        subTemp.resultados2.add("Banindo a Atração Fatal: Como parar de atrair as pessoas erradas para sua vida.");
        subTemp.resultados2.add("Compartilhando a Chama: Passando adiante a sabedoria.");
        subTemp.resultados2.add("Ciúme: Desfazendo o caos resultante de seu ciúme antes que ele se manifeste.");
        subTemp.resultados2.add("Fale o que Está Pensando: Para aqueles momentos em que você precisa de ajuda para expressar a verdade");
        subTemp.resultados2.add("Ordem a Partir do Caos: Revertendo a Lei de Murphy.");
        subTemp.resultados2.add("Sócia Silenciosa: Escolhendo a luz como sua sócia");
        subTemp.resultados2.add("Alma Gêmea: Atraindo a pessoa certa.");
        subTemp.resultados2.add("Eliminando o Ódio: Expurgando o veneno");
        subTemp.resultados2.add("Construindo Pontes: Consertando relacionamentos destruídos.");
        subTemp.resultados2.add("Termine o que Começou: Encontrando forças para terminar o que começou.");
        subTemp.resultados2.add("Memórias: Quebrando o ciclo");
        subTemp.resultados2.add("Revelando o Lado Negro: Eliminando os obstáculos que você cria");
        subTemp.resultados2.add("Esqueça Você Mesmo: Abrindo-se para uma outra visão");
        subTemp.resultados2.add("Energia Sexual: Como receber mais de sua experiência sexual");
        subTemp.resultados2.add("(Sem) Medo: Desatando os nós");
        subTemp.resultados2.add("Plano Geral: Vendo o bem oculto em cada desafio");
        subTemp.resultados2.add("Circuito: Compartilhando para poder receber");
        subTemp.resultados2.add("Diamante em Estado Bruto: Transformando o carvão da sua vida em diamantes.");
        subTemp.resultados2.add("Falando as Palavras Certas: Usando a língua para fazer coisas boas acontecerem.");
        subTemp.resultados2.add("Auto-estima: Encontrando forças para se erguer");
        subTemp.resultados2.add("Revelando o Oculto: Vendo a verdade e lidando com ela");
        subTemp.resultados2.add("Desafiando a Gravidade: Realizando o poder da mente sobre a matéria.");
        subTemp.resultados2.add("Amenizando o Julgamento: Desviando-se do bumerangue que você lançou parar o julgamento contra você.");
        subTemp.resultados2.add("O Poder da Prosperidade: O que fazer quando você precisa de dinheiro");
        subTemp.resultados2.add("Certeza Absoluta: O que fazer quando a dúvida surge.");
        subTemp.resultados2.add("Transformação Global: Ajudando a trazer a paz mundial");
        subTemp.resultados2.add("Unidade: Quando há conflito e a única solução é a união");
        subTemp.resultados2.add("Felicidade: Quando você precisa de força para escoher a felicidade.");
        subTemp.resultados2.add("O Suficiente Nunca É Suficiente: Quando você precisa da paixão para não se contentar com menos.");
        subTemp.resultados2.add("Sem Culpa: Eliminando aspectos negativos de sua natureza e reprimindo os danos que eles causaram.");
        subTemp.resultados2.add("Paixão: Despertando o anseio em seu coração");
        subTemp.resultados2.add("Sem Interesse Próprio: Dando sem esperar nada em troca");
        subTemp.resultados2.add("A Morte da Morte: Quando tudo vai bem e você quer que continue assim.");
        subTemp.resultados2.add("Pensamento em Ação: Força para fazer acontecer.");
        subTemp.resultados2.add("Dissipando a Raiva: Derrotando-a antes que ela derrote você.");
        subTemp.resultados2.add("Escutando Sua Alma: Aumentando o volume da suave voz interior");
        subTemp.resultados2.add("Seguindo em Frente: Quando você precisa de força para seguir seu caminho");
        subTemp.resultados2.add("Cordão Umbilical: Conectando-se com a força vital");
        subTemp.resultados2.add("Liberdade: Passando no teste e indo para o próximo nível");
        subTemp.resultados2.add("Água: Removendo negatividade da fonte da vida.");
        subTemp.resultados2.add("Pais - Mestres, Não Pregadores: Quando você precisa ensinar seus filhos.");
        subTemp.resultados2.add("Valorização: Como manter o que você tem e receber mais.");
        subTemp.resultados2.add("Projetando uma Imagem Positiva de Si Mesmo: Revelando o melhor em você");
        subTemp.resultados2.add("Temor a Deus: Quando você precisa se lembrar de que existe um sistema, e de como operá-lo.");
        subTemp.resultados2.add("Responsabilidade: O poder para assumir responsabilidade por sua felicidade e sua vida");
        subTemp.resultados2.add("Grandes Expectativas: Como não se decepcionar mais");
        subTemp.resultados2.add("Contatando Almas que Partiram: Fazendo conexões positivas com pessoas que faleceram.");
        subTemp.resultados2.add("Achados e Perdidos: O que fazer quando você está perdido e confuso");
        subTemp.resultados2.add("Reconhecendo um Projeto por Trás da Desordem: Encontrando a solução no problema.");
        subTemp.resultados2.add("Profecia e Universos Paralelos: Trocando seu universo por um melhor.");
        subTemp.resultados2.add("Purificação Espiritual: Purificando-se de negatividade.");
        
        subTemp.ações.add("Retificar o Passado desde a Semente da Criação e Atrair a felicidade");
        subTemp.ações.add("Resgate da Centelha Divina Recuperar a energia e oportunidades roubadas");
        subTemp.ações.add("Acessar Milagres");
        subTemp.ações.add("Saia do Mundo das Ilusões e Limpe Pensamentos Destrutivo");
        subTemp.ações.add("Curar o Corpo, a Mente e a Alma");
        subTemp.ações.add("Louvor e Viagem Astral");
        subTemp.ações.add("Retifique o DNA de sua Alma");
        subTemp.ações.add("Limpe toda negatividade interna e externa");
        subTemp.ações.add("Atraia Anjos de Luz e a Boa Sorte");
        subTemp.ações.add("Regeneração de Órgãos Doentes ou Danificados e Proteção contra Inveja e Pesadelos");
        subTemp.ações.add("Retirar o Peso da Vida e Retificar o Ego");
        subTemp.ações.add("Ativar o Amor Incondicional e Trazer Alegria");
        subTemp.ações.add("Desperte a Luz do Messias Interior");
        subTemp.ações.add("Paz Interna e Externa");
        subTemp.ações.add("Aconselhe-se com seu Eu Superior intuindo o que vai acontecer");
        subTemp.ações.add("Livre-se da depressão e Anime-se completamente");
        subTemp.ações.add("Retirar o Peso da Vida e Retificar o Ego");
        subTemp.ações.add("Acesse o Recipiente Coletivo e Solucione Problemas com Fertilidade");
        subTemp.ações.add("Falar com Deus Elevar almas a mundos de Luz");
        subTemp.ações.add("Libertar-se dos vícios. Fortalecer a Consciência Espiritual");
        subTemp.ações.add("Superar limites e Fechar-se para ações reativas");
        subTemp.ações.add("Cura mental e psicológica e Para afastar pessoas negativas");
        subTemp.ações.add("Ativar a Luz e o Verbo Divinos e Para atrair alegria");
        subTemp.ações.add("Libertar-se do ciúme, inveja, dor, sofrimento e vícios");
        subTemp.ações.add("Falar e Ouvir a Verdade");
        subTemp.ações.add("Eliminar o Caos de sua vida e Para melhorar a Organização do Tempo");
        subTemp.ações.add("Pacto de Prosperidade com Deus mediante pagamento de dízimo (doações para obras de caridade, preservação da natureza ou de expansão da Luz)");
        subTemp.ações.add("Atrair a Alma Gémea");
        subTemp.ações.add("Para retirar o Ódio e Para Aceitar a Cura Espiritual");
        subTemp.ações.add("Conecte-se a sua centelha divina e atraia a alegria (OM)");
        subTemp.ações.add("Para retirar o carma e a auto-obsessão e para terminar projetos inacabados");
        subTemp.ações.add("Liberte-se daquilo que te aprisiona");
        subTemp.ações.add("Identifique seus pontos fracos");
        subTemp.ações.add("\"Teus pecados foram perdoados, vá e não erres mais\"(Jesus)");
        subTemp.ações.add("Sexo saudável e positivo Aprenda a ser humilde");
        subTemp.ações.add("Ativar a coragem e eliminar o medo");
        subTemp.ações.add("Conectando- se às Bênçãos do Eu Superior");
        subTemp.ações.add("Prosperidade: Compartilhar para Receber e Receber para Compartilhar");
        subTemp.ações.add("Volte a ter Sabor pela vida");
        subTemp.ações.add("Fale as palavras certas, nas ocasiões certas");
        subTemp.ações.add("Atraia a Compaixão e a Misericórdia e Melhore a Auto-Estima");
        subTemp.ações.add("Acessando Segredos");
        subTemp.ações.add("Redenção das almas sob domínio das trevas e Controlando o próprio destino");
        subTemp.ações.add("Amenizando julgamentos carmicos");
        subTemp.ações.add("Atraindo Prosperidade e Sustento Físico e Financeiro");
        subTemp.ações.add("Certeza e Autoconfiança");
        subTemp.ações.add("Acelerar a evolução espiritual");
        subTemp.ações.add("Unindo os opostos");
        subTemp.ações.add("Retificar o Passado desde a Semente da Criação e Atrair a felicidade");
        subTemp.ações.add("Pense Grande: você pode contentar-se com muito");
        subTemp.ações.add("Retirar as Sementes de Culpa");
        subTemp.ações.add("Ativar o Fogo da Paixão Espiritual");
        subTemp.ações.add("Atraindo Proteção, Cura e Amizades Verdadeiras");
        subTemp.ações.add("Atrair o Fluxo da Vida");
        subTemp.ações.add("Transformar o seu Destino");
        subTemp.ações.add("Retirando a raiva e o pensamento de dependência");
        subTemp.ações.add("Acessando os arquivos espirituais e os propósitos de nossa alma");
        subTemp.ações.add("Transformando o Ego negativo num “agente” positivo e construtivo. Derrotar a escuridão interior");
        subTemp.ações.add("Pare de remoer as trevas e seja uma usina da Luz de Deus");
        subTemp.ações.add("Liberte-se da depressão e das limitações físicas e espirituais");
        subTemp.ações.add("Devolva à água o seu poder divino");
        subTemp.ações.add("Melhorando Relacionamentos e laços afetivos");
        subTemp.ações.add("Ativando a Valorização, o Reconhecimento e a Gratidão Interior e Exterior");
        subTemp.ações.add("Afastar a negatividade das críticas destrutivas e Ativar o magnetismo físico e espiritual");
        subTemp.ações.add("Desperte a chama divina em seu coração e no coração de outras pessoas Aceite agir de acordo com a sua alma");
        subTemp.ações.add("Afaste o sentimento de vingança e de vitimismo. Assuma a responsabilidade por seus atos");
        subTemp.ações.add("Gerencie o seu tempo e aprenda a valorizar o que possui A espiritualidade é aqui e agora, em todos os momentos de sua vida");
        subTemp.ações.add("Eleve as almas de pessoas que partiram para a Luz. Acesse conselhos de seres que te amam e partiram");
        subTemp.ações.add("Ativar a clarividência e enxergar a espiritualidade Encontre seu caminho para Deus");
        subTemp.ações.add("Elimine os bloqueios psiquicos do sucesso");
        subTemp.ações.add("Ative o dom da profecia e a sabedoria divina");
        subTemp.ações.add("Ative a Capacidade da Negociação. Purifique seu espírito e ambientes limpando resíduos energéticos");


        subTemp.ownDecreto = "Eu, (nome do terapeuta) peço permissão ao Eu Superior de (nome do consulente) para aceder ao seu campo morfogenético, chakras e corpos sutis que se encontram afetados pela anomalia de (anomalia deus) para que se harmonizaem, equilibrem e criem impacto na estrutura do DNA, reestruturando e renovando o funcionamento do corpo físico na medida certa e na quantidade exata, dentro do que é divino. Eu ativo agora (nome de deus) para que (ação), promovendo a harmonização de todos os chakras e todos os campos sutis. Pulsa no campo, pulsa no campo, pulsa no campo.";
        
        temp.subFerramentas.add(subTemp);

        Portal3.AddFerramenta(temp);

        temp = new Ferramenta("Ligação CQM",Portal3,5);
        temp.type = 1;
        temp.target = Portal4;
        Portal3.AddFerramenta(temp);

        temp = new Ferramenta("Portais Dimensionais",Portal3,6);
        temp.type = 2;

        temp.resultados.add("1ª Dimensão");
        temp.resultados.add("2ª Dimensão");
        temp.resultados.add("3ª Dimensão");
        temp.resultados.add("4ª Dimensão");
        temp.resultados.add("5ª Dimensão");
        temp.resultados.add("6ª Dimensão");
        temp.resultados.add("7ª Dimensão");
        temp.resultados.add("8ª Dimensão");

        subTemp = new SubFerramenta(temp, "1ª Dimensão");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        
        subTemp.ações.add("Ativar o acesso à frequência de conscientização");
        subTemp.ações.add("Desativar a sensação de não pertença ao planeta");
        subTemp.ações.add("Ativar a materialização de projetos de propósito");
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "2ª Dimensão");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        
        subTemp.ações.add("Ativar a vontade de auto-cura celular");
        subTemp.ações.add("Diluir as crenças e padrões acerca de doença");
        subTemp.ações.add("Equilibrar o quantum energético de toda a estrutura DNA");
        subTemp.ações.add("Ativar o o conhecimento do campo mórfico de frequência de informação em Gaya");
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "3ª Dimensão");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        
        subTemp.ações.add("Ativar o conhecimento das três dimensões físicas");
        subTemp.ações.add("Equilibrar o propósito no aqui e agora");
        subTemp.ações.add("Ativar a clareza mental e emocional na tomada de decisão");
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "4ª Dimensão");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        
        subTemp.ações.add("Ativar a busca conhecimento além da matéria");
        subTemp.ações.add("Equilibrar o movimento dos corpos sutis no tempo e no espaço");
        subTemp.ações.add("Desativar crenças e padrões ancestrais");
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "5ª Dimensão");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        
        subTemp.ações.add("Ativar a consciência do espírito no espaço-tempo");
        subTemp.ações.add("Programar o campo morfogenético e reestruturar o DNA para assimilar a informação das densidades superiores");
        subTemp.ações.add("Ativar a sensibilidade e a clareza dos planos sutis. Descalcificar a glândula pineal ativando a amplitude de frequência de 700 a 936Hz, agora");
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "6ª Dimensão");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        
        subTemp.ações.add("Abrir a consciência para as infinitas possibilidades");
        subTemp.ações.add("Transmutar crenças e padrões limitantes e ativar a divindade crística em todos os corpos");
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "7ª Dimensão");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        
        subTemp.ações.add("Ativando a ligação do atma e do chakra coronário com o cosmos.");
        subTemp.ações.add("Facilitar a ativação da inteligência do coração");
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "8ª Dimensão");
        subTemp.resultados.add("");
        
        subTemp.ações.add("Ativar a consciência divina no foco, informação, forma, tempo, espírito, alma, infinito e eternidade");
        temp.subFerramentas.add(subTemp);

        temp.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) peço permissão aos planos mais elevados e ao corpo búdico de (nome do consulente) para abrir a frequência etérica de Metatrão para fixar a informação de (tipo) com a ação de (ação) que causam bloqueios não divinos na existência presente de (nome do consulente). Decreto aberto o campo akáshico para que possa (ação) fixando o equilíbrio, na medida exata e na quantidade certa. Pulso no campo, pulso no campo, pulso no campo.";

        Portal3.AddFerramenta(temp);

        temp = new Ferramenta("Naturopatia",Portal3,7);
        temp.type = 2;
        
        temp.resultados.add("Florais");
        temp.resultados.add("Cepas Homeopáticas");
        temp.resultados.add("Sais de Schuessler");
        temp.resultados.add("Oligoterapia");

        subTemp = new SubFerramenta(temp, "Florais");
        subTemp.resultados.add("Mimulus");
        subTemp.resultados.add("Aspen");
        subTemp.resultados.add("Rock Rose");
        subTemp.resultados.add("Cherry Pum");
        subTemp.resultados.add("Red Chestnut");
        subTemp.resultados.add("Honeysuckle");
        subTemp.resultados.add("Clematis");
        subTemp.resultados.add("Chestnut Bud");
        subTemp.resultados.add("White Chestnut");
        subTemp.resultados.add("Wild Rose");
        subTemp.resultados.add("Mustard");
        subTemp.resultados.add("Olive");
        subTemp.resultados.add("Heather");
        subTemp.resultados.add("Impatiens");
        subTemp.resultados.add("Water Violet");
        subTemp.resultados.add("Hornbearn");
        subTemp.resultados.add("Gentian");
        subTemp.resultados.add("Gorse");
        subTemp.resultados.add("Scleranthus");
        subTemp.resultados.add("Wild Oat");
        subTemp.resultados.add("Cerato");
        subTemp.resultados.add("Star of Bethlehem");
        subTemp.resultados.add("Willow");
        subTemp.resultados.add("Elm");
        subTemp.resultados.add("Pine");
        subTemp.resultados.add("Sweet Chestnut");
        subTemp.resultados.add("Larch");
        subTemp.resultados.add("Oak");
        subTemp.resultados.add("Crab Aplle");
        subTemp.resultados.add("Vine");
        subTemp.resultados.add("Vervain");
        subTemp.resultados.add("Beech");
        subTemp.resultados.add("Chicory");
        subTemp.resultados.add("Rock Water");
        subTemp.resultados.add("Centaury");
        subTemp.resultados.add("Walnut");
        subTemp.resultados.add("Holly");
        subTemp.resultados.add("Agrimony");

        subTemp.ações.add("Coragem");
        subTemp.ações.add("Afirmação");
        subTemp.ações.add("Confiança");
        subTemp.ações.add("Compostura");
        subTemp.ações.add("Paz de Espírito");
        subTemp.ações.add("Presença");
        subTemp.ações.add("Foco");
        subTemp.ações.add("Discernimento");
        subTemp.ações.add("Tranquilidade");
        subTemp.ações.add("Entusiasmo");
        subTemp.ações.add("Alegria");
        subTemp.ações.add("Restaurador");
        subTemp.ações.add("Ser ouvido");
        subTemp.ações.add("Paciência");
        subTemp.ações.add("Conexão");
        subTemp.ações.add("Resolução");
        subTemp.ações.add("Coragem");
        subTemp.ações.add("Esperança");
        subTemp.ações.add("Decisão");
        subTemp.ações.add("Direção");
        subTemp.ações.add("Orientação");
        subTemp.ações.add("Conforto");
        subTemp.ações.add("Positivismo");
        subTemp.ações.add("Apoio");
        subTemp.ações.add("Absolvição");
        subTemp.ações.add("Consolo");
        subTemp.ações.add("Confiança");
        subTemp.ações.add("Força");
        subTemp.ações.add("Purificação");
        subTemp.ações.add("Inspirador");
        subTemp.ações.add("Desligar-se");
        subTemp.ações.add("Tolerância");
        subTemp.ações.add("Liberar");
        subTemp.ações.add("Fluir");
        subTemp.ações.add("Assertividade");
        subTemp.ações.add("Estabilidade");
        subTemp.ações.add("Boa Vontade");
        subTemp.ações.add("Transparência");
        subTemp.ownDecreto="Ativando o Eu Sou de (nome do terapeuta), aciono a frequência dos florais de Bach no campo de (nome do consulente) na informação singular do floral (nome do floral) e decreto que se instale no campo a(s) frequência(s) de cura com o(s) efeito(s) de (ação) com um quantum energético de (medir no biómetro) Angström, para que dilua, desbloqueie e cure toda e qualquer anomalia que não permite que (nome do consulente) avance no seu propósito. Pulsa no campo, pulsa no campo, pulsa no campo.";
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "Cepas Homeopáticas");
        subTemp.resultados.add("ACONITUM NAPELLUS");
        subTemp.resultados.add("ACTAEA RACEMOSA");
        subTemp.resultados.add("ACTAEA SPICATA");
        subTemp.resultados.add("AESCULUS HIPPOCASTANUM");
        subTemp.resultados.add("AETHUSA CYNAPIUM");
        subTemp.resultados.add("AGARICUS MUSCARIUS");
        subTemp.resultados.add("ALLIUM CEPA");
        subTemp.resultados.add("ALUMINA");
        subTemp.resultados.add("AMBRA GRISEA");
        subTemp.resultados.add("AMMONIUM CARBONICUM");
        subTemp.resultados.add("AMMONIUM MURIATICUM");
        subTemp.resultados.add("ANACARDIUM ORIENTALE");
        subTemp.resultados.add("ANAGALIS ARVENSIS");
        subTemp.resultados.add("ANTIMONIUM CRUDUM");
        subTemp.resultados.add("ANTIMONIUM TARTARICUM");
        subTemp.resultados.add("APIS MELLIFICA");
        subTemp.resultados.add("ARALIA RACEMOSA");
        subTemp.resultados.add("ARANEA DIADEMA");
        subTemp.resultados.add("ARGENTUM METALLICUM");
        subTemp.resultados.add("ARGENTUM NITRICUM");
        subTemp.resultados.add("ARNICA MONTANA");
        subTemp.resultados.add("ARSENICUM ALBUM");
        subTemp.resultados.add("ARSENICUM IODATUM");
        subTemp.resultados.add("ARUM TRIPHYLLUM");
        subTemp.resultados.add("ARUM TRIPHYLLUM COMPOSÉ");
        subTemp.resultados.add("ASA FOETIDA");
        subTemp.resultados.add("AURUM METALLICUM");
        subTemp.resultados.add("AVIAIRE");
        subTemp.resultados.add("BARYTA CARBONICA");
        subTemp.resultados.add("BARYTA MURIATICA");
        subTemp.resultados.add("BELLADONNA");
        subTemp.resultados.add("BENZOICUM ACIDUM");
        subTemp.resultados.add("BERBERIS VULGARIS");
        subTemp.resultados.add("BLATTA ORIENTALIS");
        subTemp.resultados.add("BORAX");
        subTemp.resultados.add("BRYONIA");
        subTemp.resultados.add("CACTUS GRANDIFLOR");
        subTemp.resultados.add("CADMIUM SULFURICUM");
        subTemp.resultados.add("CALADIUM SEGUINUM");
        subTemp.resultados.add("CALCAREA CARBONICA OSTREARUM");
        subTemp.resultados.add("CALCAREA FLUORICA");
        subTemp.resultados.add("CALCAREA PHOSPHORICA");
        subTemp.resultados.add("CALCAREA SULFURICA");
        subTemp.resultados.add("CALENDULA OFFICINALIS");
        subTemp.resultados.add("CAMPHORA");
        subTemp.resultados.add("CANTHARIS");
        subTemp.resultados.add("CAPSICUM ANNUUM");
        subTemp.resultados.add("CARBO ANIMALIS");
        subTemp.resultados.add("CARBO VEGETABILIS");
        subTemp.resultados.add("CACTUS GRANDIFLOR");
        subTemp.resultados.add("CADMIUM SULFURICUM");
        subTemp.resultados.add("CALADIUM SEGUINUM");
        subTemp.resultados.add("CALCAREA CARBONICA OSTREARUM");
        subTemp.resultados.add("CALCAREA FLUORICA");
        subTemp.resultados.add("CALCAREA PHOSPHORICA");
        subTemp.resultados.add("CALCAREA SULFURICA");
        subTemp.resultados.add("CALENDULA OFFICINALIS");
        subTemp.resultados.add("CAMPHORA");
        subTemp.resultados.add("CANTHARIS");
        subTemp.resultados.add("CAPSICUM ANNUUM");
        subTemp.resultados.add("CARBO ANIMALIS");
        subTemp.resultados.add("CARBO VEGETABILIS");
        subTemp.resultados.add("CARDUUS MARIANUS");
        subTemp.resultados.add("CARTILAGO");
        subTemp.resultados.add("CAULOPHYLLUM THALICTRIDES");
        subTemp.resultados.add("CAUSTICUM");
        subTemp.resultados.add("CHAMOMILLA VULGARIS");
        subTemp.resultados.add("CHELIDONIUM MAJUS");
        subTemp.resultados.add("CHINA RUBRA");
        subTemp.resultados.add("CHININUM SULFURICUM");
        subTemp.resultados.add("CHOLESTERINUM");
        subTemp.resultados.add("CICUTA VIROSA");
        subTemp.resultados.add("CINA");
        subTemp.resultados.add("CINNABARIS");
        subTemp.resultados.add("COCCULUS INDICUS");
        subTemp.resultados.add("COCCUS CACTI");
        subTemp.resultados.add("COFFEA CRUDA");
        subTemp.resultados.add("COFFEA CRUDA");
        subTemp.resultados.add("COFFEA TOSTA");
        subTemp.resultados.add("COLCHICUM AUTUMNALE");
        subTemp.resultados.add("COLLINSONIA CANADENSIS");
        subTemp.resultados.add("COLOCYNTHIS");
        subTemp.resultados.add("CONDURANGO");
        subTemp.resultados.add("CONIUM MACULATUM");
        subTemp.resultados.add("CORALLIUM RUBRUM");
        subTemp.resultados.add("CORTISONE");
        subTemp.resultados.add("CRATAEGUS OXYACANTHA");
        subTemp.resultados.add("CROTALUS HORRIDUS");
        subTemp.resultados.add("CUPRUM ARSENICOSUM");
        subTemp.resultados.add("CUPRUM METALLICUM");
        subTemp.resultados.add("DIOSCOREA VILLOSA");
        subTemp.resultados.add("DOLICHOS PRURIENS");
        subTemp.resultados.add("DROSERA");
        subTemp.resultados.add("DULCAMARA");
        subTemp.resultados.add("ECHINACEA ANGUSTIFOLIA");
        subTemp.resultados.add("EUGENIA JAMBOSA");
        subTemp.resultados.add("EUPATORIUM PERFOLIATUM");
        subTemp.resultados.add("EUPHRASIA OFFICINIALIS");
        subTemp.resultados.add("FERRUM METALLICUM");
        subTemp.resultados.add("FLUORICUM ACIDUM");
        subTemp.resultados.add("FOLLICULINUM");
        subTemp.resultados.add("FORMICA RUFA");
        subTemp.resultados.add("GELSEMIUM SEMPERVIRENS");
        subTemp.resultados.add("GLONOINUM");
        subTemp.resultados.add("GNAPHALIUM POLYCE");
        subTemp.resultados.add("GRAPHITES");
        subTemp.resultados.add("GRINDELIA ROBUSTA");
        subTemp.resultados.add("HAMAMELIS VIRGINIANA");
        subTemp.resultados.add("HEKLA LAVA");
        subTemp.resultados.add("HELONIAS DIOICA");
        subTemp.resultados.add("HEPAR SULFURIS CALCAREUM");
        subTemp.resultados.add("HISTAMINUM");
        subTemp.resultados.add("HYDROCOTYLE ASIAT");
        subTemp.resultados.add("HYOSCYAMUS NIGER");
        subTemp.resultados.add("HYPERICUM PERFORATUM");
        subTemp.resultados.add("HYPOTHALAMUS");
        subTemp.resultados.add("IGNATIA AMARA");
        subTemp.resultados.add("INFLUENZINUM");
        subTemp.resultados.add("IODUM");
        subTemp.resultados.add("IPECA");
        subTemp.resultados.add("IRIS VERSICOLOR");
        subTemp.resultados.add("KALIUM BICHROMICUM");
        subTemp.resultados.add("KALIUM BROMATUM");
        subTemp.resultados.add("KALIUM CARBONICUM");
        subTemp.resultados.add("KALIUM IODATUM");
        subTemp.resultados.add("KALIUM MURIATICUM");
        subTemp.resultados.add("KALIUM PHOSPHORICUM");
        subTemp.resultados.add("KALIUM SULFURICUM");
        subTemp.resultados.add("KALMIA LATIFOLIA");
        subTemp.resultados.add("KREOSOTUM");
        subTemp.resultados.add("LAC CANINUM");
        subTemp.resultados.add("LACHESIS MUTUS");
        subTemp.resultados.add("LACHNANTHES TINCTORIA");
        subTemp.resultados.add("LAPIS ALBUS");
        subTemp.resultados.add("LEDUM PALUSTRE");
        subTemp.resultados.add("LILIUM TIGRINUM");
        subTemp.resultados.add("LITHIUM CARBONICUM");
        subTemp.resultados.add("LOBELIA INFLATA");
        subTemp.resultados.add("LUTEINUM");
        subTemp.resultados.add("LYCOPODIUM CLAVATUM");
        subTemp.resultados.add("MAGNESIA CARBONICA");
        subTemp.resultados.add("MAGNESIA MURIATICA");
        subTemp.resultados.add("MAGNESIA PHOSPHORICA");
        subTemp.resultados.add("MEDORRHINUM");
        subTemp.resultados.add("MERCURIUS BIODATUS");
        subTemp.resultados.add("MERCURIUS CORROSIVUS");
        subTemp.resultados.add("MERCURIUS CYANATUS");
        subTemp.resultados.add("MERCURIUS DULCIS");
        subTemp.resultados.add("MERCURIUS SOLUBILIS");
        subTemp.resultados.add("MERCURIUS VIVUS");
        subTemp.resultados.add("MONILIA ALBICANS");
        subTemp.resultados.add("MOSCHUS");
        subTemp.resultados.add("MURIATICUM ACIDUM");
        subTemp.resultados.add("NAJA TRIPUDIANS");
        subTemp.resultados.add("NATRUM CARBONICUM");
        subTemp.resultados.add("NATRUM MURIATICUM");
        subTemp.resultados.add("NATRUM SULFURICUM");
        subTemp.resultados.add("NITRICUM ACIDUM");
        subTemp.resultados.add("NUX MOSCHATA");
        subTemp.resultados.add("NUX VOMICA");
        subTemp.resultados.add("OPIUM");
        subTemp.resultados.add("PAEONIA OFFICINALIS");
        subTemp.resultados.add("PASSIFLORA INCARNATA");
        subTemp.resultados.add("PETROLEUM");
        subTemp.resultados.add("PHOSPHORICUM ACIDUM");
        subTemp.resultados.add("PHOSPHORUS");
        subTemp.resultados.add("PHYTOLACCA DECANDRA");
        subTemp.resultados.add("PLATINA");
        subTemp.resultados.add("PLUMBUM METALLICUM");
        subTemp.resultados.add("PODOPHYLLINUM");
        subTemp.resultados.add("PODOPHYLLUM PELTATUM");
        subTemp.resultados.add("POLLENS");
        subTemp.resultados.add("PSORINUM");
        subTemp.resultados.add("PULMO HISTAMINUM");
        subTemp.resultados.add("PULSATILLA");
        subTemp.resultados.add("PYROGENIUM");
        subTemp.resultados.add("RAPHANUS SATIVUS NIGER");
        subTemp.resultados.add("RHODODENDRON CHRYSANTHUM");
        subTemp.resultados.add("RHUS TOXICODENDRON");
        subTemp.resultados.add("RICINUS COMMUNIS");
        subTemp.resultados.add("ROBINIA PSEUDO ACACIA");
        subTemp.resultados.add("RUMEX CRISPUS");
        subTemp.resultados.add("RUTA GRAVEOLENS");
        subTemp.resultados.add("SABADILLA OFFICINARUM");
        subTemp.resultados.add("SABAL SERRULATA");
        subTemp.resultados.add("SABINA");
        subTemp.resultados.add("SAMBUCUS NIGRA");
        subTemp.resultados.add("SECALE CORNUTUM");
        subTemp.resultados.add("SELENIUM METALLICUM");
        subTemp.resultados.add("SEPIA OFFICINALIS");
        subTemp.resultados.add("SERUM YERSIN");
        subTemp.resultados.add("SILICEA");
        subTemp.resultados.add("SOLANUM MALACOXYLON");
        subTemp.resultados.add("SOLIDAGO VIRGA AUREA");
        subTemp.resultados.add("SPONGIA TOSTA");
        subTemp.resultados.add("STANNUM METALLICUM");
        subTemp.resultados.add("STAPHYLOCOCCINUM");
        subTemp.resultados.add("STAPHYSAGRIA");
        subTemp.resultados.add("STICTA PULMONARIA");
        subTemp.resultados.add("STRAMONIUM");
        subTemp.resultados.add("SULFUR");
        subTemp.resultados.add("SULFUR IODATUM");
        subTemp.resultados.add("SULFURICUM ACIDUM");
        subTemp.resultados.add("SYMPHYTUM OFFICINALE");
        subTemp.resultados.add("TABACUM");
        subTemp.resultados.add("TARENTULA HISPANA");
        subTemp.resultados.add("THUYA OCCIDENTALIS");
        subTemp.resultados.add("THYMULINE");
        subTemp.resultados.add("THYROIDINUM");
        subTemp.resultados.add("TUBERCULINUM");
        subTemp.resultados.add("TUBERCULINUM RESIDUUM");
        subTemp.resultados.add("URANIUM NITRICUM");
        subTemp.resultados.add("URTICA URENS");
        subTemp.resultados.add("VACCINOTOXINUM");
        subTemp.resultados.add("VALERIANA OFFICINALIS");
        subTemp.resultados.add("VERATRUM ALBUM");
        subTemp.resultados.add("ZINCUM METALLICUM");
        
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ownDecreto="Ativando o Eu Sou de (nome do terapeuta), aciono a frequência das Cepas Homeopáticas no campo de (nome do consulente) na informação singular da cepa (nome da cepa) e decreto que se instale no campo a frequência de cura com o efeito que lhe está associado, com um quantum energético de (medir no biómetro) Angström, para que dilua, desbloqueie e cure toda e qualquer anomalia que não permite que (nome do consulente) avance no seu propósito. Pulsa no campo, pulsa no campo, pulsa no campo.";
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "Sais de Schuessler");
        subTemp.resultados.add("Fluorica Calcium");
        subTemp.resultados.add("Cálcio Phosphoricum");
        subTemp.resultados.add("Ferrum Phosphoricum");
        subTemp.resultados.add("Cloreto de Potássio");
        subTemp.resultados.add("Potássio Fosfórico");
        subTemp.resultados.add("Sulfato de Potássio");
        subTemp.resultados.add("Magnésio Phosphoricum");
        subTemp.resultados.add("Cloreto de Sódio");
        subTemp.resultados.add("Sódio Fosfórico");
        subTemp.resultados.add("Sulfato de Sódio");
        subTemp.resultados.add("Sílica");
        subTemp.resultados.add("Sulfato de Cálcio");
        
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ownDecreto="Ativando o Eu Sou de (nome do terapeuta), aciono a frequência dos Sais de Schuessler no campo de (nome do consulente) na informação singular do bioquímico (indicação) e decreto que se instale no campo a frequência de cura com o efeito que lhe está associado, com um quantum energético de (medir no biómetro) Angström, para que dilua, desbloqueie e cure toda e qualquer anomalia que não permite que (nome do consulente) avance no seu propósito. Pulsa no campo, pulsa no campo, pulsa no campo.";
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "Oligoterapia");
        subTemp.resultados.add("ALUMÍNIO (Al)");
        subTemp.resultados.add("BISMUTO (Bi)");
        subTemp.resultados.add("COBALTO (Co)");
        subTemp.resultados.add("COBRE (Cu)");
        subTemp.resultados.add("COBRE-OURO-PRATA (Cu-Au-Ag)");
        subTemp.resultados.add("FLÚOR (Fu)");
        subTemp.resultados.add("LITIO (LI)");
        subTemp.resultados.add("MAGNÉSIO (Mg)");
        subTemp.resultados.add("MANGANÊS (Mn)");
        subTemp.resultados.add("MANGANÊS-COBALTO (Mn-Co)");
        subTemp.resultados.add("MANGANÊS-COBRE (Mn-Cu)");
        subTemp.resultados.add("MANGANÊS-COBRE-COBALTO (Mn-Cu-Co)");
        subTemp.resultados.add("NÍQUEL-COBALTO (Ni-Co)");
        subTemp.resultados.add("FÓSFORO (P)");
        subTemp.resultados.add("POTÁSSIO (K)");
        subTemp.resultados.add("SELÊNIO (Se)");
        subTemp.resultados.add("ENXOFRE (S)");
        subTemp.resultados.add("ZINCO (Zn)");
        subTemp.resultados.add("ZINCO-COBRE (Zn-Cu)");
        subTemp.resultados.add("ZINCO-NÍQUEL-COBALTO (Zn-Ni-Co)");
        
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        subTemp.ações.add("");
        
        subTemp.ownDecreto="Ativando o Eu Sou de (nome do terapeuta), aciono a frequência dos Oligoelementos no campo de (nome do consulente) na informação singular do oligoelemento (oligoelemento) e decreto que se instale no campo a frequência de cura com o efeito que lhe está associado, com um quantum energético de (medir no biómetro) Angström, para que dilua, desbloqueie e cure toda e qualquer anomalia que não permite que (nome do consulente) avance no seu propósito. Pulsa no campo, pulsa no campo, pulsa no campo.";
        temp.subFerramentas.add(subTemp);

        Portal3.AddFerramenta(temp);

        temp = new Ferramenta("Ligação Relacionamentos",Portal3,8);
        temp.type = 1;
        temp.target = Portal2;
        Portal3.AddFerramenta(temp);

        temp = new Ferramenta("Cromoterapia",Portal3,9);
        temp.multi = true;
        temp.resultados.add("Vermelho");
        temp.resultados.add("Laranja");
        temp.resultados.add("Amarelo");
        temp.resultados.add("Verde");
        temp.resultados.add("Ciano");
        temp.resultados.add("Azul");
        temp.resultados.add("Violeta");
        
        temp.resultados2.add("480 THz");
        temp.resultados2.add("510 THz");
        temp.resultados2.add("530 THz");
        temp.resultados2.add("600 THz");
        temp.resultados2.add("620 THz");
        temp.resultados2.add("680 THz");
        temp.resultados2.add("790 THz");

        temp.ações.add("Ajudar a colocar-se nas situações com mais firmeza");
        temp.ações.add("Ajudar a sair da procrastinação e falta de ação");
        temp.ações.add("Estimular o intelecto, a clareza mental e a criatividade");
        temp.ações.add("Ativar a cura de todos os corpos e alinhamento dos chakras");
        temp.ações.add("Equilibrar a calma e a paciência em todas as situações");
        temp.ações.add("Ativar o empoderamento pessoal e a proteção energética");
        temp.ações.add("Desenvolver a criatividade na intuição e a autoconfiança");

        temp.repeatString = "a (frequência) de (cor) para (ação) ";
        temp.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta), peço permissão ao Eu Superior de (nome do consulente) para imprimir em todos os seus corpos e todos os chakras (next) para que beneficiem a tomada de decisão. Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal3.AddFerramenta(temp);

        temp = new Ferramenta("Reiki",Portal3,10);
        temp.type = 2;

        temp.resultados.add("Princípio");
        temp.resultados.add("Símbolo");

        subTemp = new SubFerramenta(temp, "Princípio");
        subTemp.multi = true;
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        
        subTemp.ações.add("Facilitar a calma em todas as situações e programar a paciência");
        subTemp.ações.add("Ajudar a afastar a preocupação diária e desprogramar a ansiedade");
        subTemp.ações.add("Intuir a gratidão por tudo o que já manifestou");
        subTemp.ações.add("Facilitar o impulso para o trabalho dedicado em todas as áreas");
        subTemp.ações.add("Ativar a gentileza e amabilidade com todos os seres");
        subTemp.repeatString = "principio (index) para (ação), ";
        subTemp.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) e invocando os mestres ancestrais de Reiki, peço permissão ao Eu Superior de (nome do consulente) para ativar as frequências de equilíbrio e harmonia com o (next) imprimindo essas informações no seu campo morfogenético para que se sinta confortado e empoderado, na medida certa e quantidade exata. Pulsa no campo, pulsa no campo, pulsa no campo.";
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "Símbolo");
        subTemp.multi = true;
        subTemp.resultados.add("Cho-Ku-Rei");
        subTemp.resultados.add("Sei-He-Ki");
        subTemp.resultados.add("Hon-Sha-Zen-Shonen");
        subTemp.resultados.add("Dai-Koo-Myo");
        subTemp.resultados.add("Dumo");
        subTemp.resultados.add("Raku");

        subTemp.ações.add("Potenciar a ação do propósito no campo");
        subTemp.ações.add("Acionar a proteção e a transmutação de energias");
        subTemp.ações.add("Equilibrar todas as energias do passado, presente e futuro");
        subTemp.ações.add("Restaurar o equilíbrio e sinergia entre chakras");
        subTemp.ações.add("Equilibrar a energia do propósito");
        subTemp.ações.add("Acionar a confiança nas múltiplas possibilidades");
        subTemp.repeatString = "simbolo (simbolo) para (ação), ";
        subTemp.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) e invocando os mestres ancestrais de Reiki, peço permissão ao Eu Superior de (nome do consulente) para ativar as frequências de equilíbrio e harmonia com o (next) imprimindo essas informações no seu campo morfogenético para que se sinta confortado e empoderado, na medida certa e quantidade exata. Pulsa no campo, pulsa no campo, pulsa no campo.";
        temp.subFerramentas.add(subTemp);

        temp.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) e invocando os mestres ancestrais de Reiki, peço permissão ao Eu Superior de (nome do consulente) para ativar as frequências de equilíbrio e harmonia com o (simbolo) para (ação) imprimindo essas informações no seu campo morfogenético para que se sinta confortado e empoderado, na medida certa e quantidade exata. Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal3.AddFerramenta(temp);

        //Portal CQM
        temp = new Ferramenta("Cartão Quântico MD®",Portal4,0);
        
        temp.resultados.add("Prosperidade Financeira");
        temp.resultados.add("Prosperidade Familiar");
        temp.resultados.add("Prosperidade Saúde");
        temp.resultados.add("Prosperidade Relacionamentos");
        temp.resultados.add("Cura Akáshica");
        temp.resultados.add("Sistema Esquelético");
        temp.resultados.add("Sistema Muscular");
        temp.resultados.add("Sistema Nervoso Central");
        temp.resultados.add("Sistema Respiratório");
        temp.resultados.add("Sistema Digestivo");
        temp.resultados.add("Sistema Cardíaco");
        temp.resultados.add("Sistema Endócrino");

        temp.ações.add("facilitar a tomada de decisão e ampliar as possibilidades de recursos que o consulente tem para aumentar a sua renda diária, semanal ou mensal");
        temp.ações.add("facilitar a tomada de decisão e ampliar as possibilidades no que respeita às reações mais íntimas do consulente");
        temp.ações.add("facilitar a tomada de decisão e ampliar as possibilidades de ações saudáveis e ampliar a consciência do consulente e a sua clareza mental e emocional");
        temp.ações.add("facilitar a tomada de decisão e ampliar as possibilidades no que respeita às reações sociais do consulente. Ativar o chakra laríngeo para um discurso fácil e claro");
        temp.ações.add("facilitar a tomada de decisão e ampliar as possibilidades de propósito junto de anomalias palingênicas. Identifica as anomalias akáshicas e acionar os chakras cardíaco, frontal e coronário para maior clareza no momento de decisão");
        temp.ações.add("facilitar a tomada de decisão e ampliar as possibilidades de propósito junto de anomalias somatizadoras no esqueleto. Identificar a anomalia e ativar eventos de “limpeza” dos sinais de doença");
        temp.ações.add("facilitar a tomada de decisão e ampliar as possibilidades de propósito junto de anomalias somatizadoras nos músculos. Identificar a anomalia e ativar eventos de “limpeza” dos sinais de doença");
        temp.ações.add("facilitar a tomada de decisão e ampliar as possibilidades de propósito junto de anomalias somatizadoras no SNC. Identificar a anomalia e ativar eventos de “limpeza” dos sinais de doença");
        temp.ações.add("facilitar a tomada de decisão e ampliar as possibilidades de propósito junto de anomalias somatizadoras no SR. Identificar a anomalia e ativar eventos de “limpeza” dos sinais de doença");
        temp.ações.add("facilitar a tomada de decisão e ampliar as possibilidades de propósito junto de anomalias somatizadoras no SD. Identificar a anomalia e ativar eventos de “limpeza” dos sinais de doença");
        temp.ações.add("facilitar a tomada de decisão e ampliar as possibilidades de propósito junto de anomalias somatizadoras no SC. Identificar a anomalia e ativar eventos de “limpeza” dos sinais de doença");
        temp.ações.add("facilitar a tomada de decisão e ampliar as possibilidades de propósito junto de anomalias somatizadoras no SEn. Identificar a anomalia e ativar eventos de “limpeza” dos sinais de doença");

        temp.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método de Cura Quântica Multidimensional pedindo ao Eu Superior de (nome do consulente) permissão para atuar no seu campo morfogenético com o Cartão de Quântico Multidimensional (designação do cartão) para (ação). Lanço na rede todos os seus componentes para que atuem direta e indiretamente no seu propósito e tomada de decisão. Ativo agora as suas frequências de cura para que pulsem (x vezes ao dia) durante o periodo de (dias, semanas, meses) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal4.AddFerramenta(temp);

        temp = new Ferramenta("Matriz Morfogenética",Portal4,1);
        temp.type = 4;
        
        subTemp = new SubFerramenta(temp, "Coordenadas Portal Ambientes");
        subTemp.resultados.add("O início, a liderança, proatividade e autonomia");
        subTemp.resultados.add("A harmonia e o equilíbrio");
        subTemp.resultados.add("A tridimensionalidade e a materialização de eventos");
        subTemp.resultados.add("A ordem, o trabalho e a disciplina");
        subTemp.resultados.add("Liberdade e sentimento de aventura que leva ao crescimento");
        subTemp.resultados.add("Responsabilidades sociais e familiares");
        subTemp.resultados.add("Dominação e realização de projetos");
        subTemp.resultados.add("Gestão, superação e prosperidade");
        subTemp.resultados.add("Segurança e proteção. Fim de ciclo.");
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "Coordenadas Portal Relacionamentos");
        subTemp.resultados.add("A flexibilidade e ponderação. Menos dever e mais prazer");
        subTemp.resultados.add("O equilíbrio entre dar e receber.");
        subTemp.resultados.add("O cair da máscara e a verdade divina");
        subTemp.resultados.add("Chamado para a espontaneidade e viver o aqui e agora");
        subTemp.resultados.add("Sabedoria para se encaixar no momento sem fugir");
        subTemp.resultados.add("Libertação de opinião de terceiros e ação por si mesmo a sua vida");
        subTemp.resultados.add("O equilíbrio entre o lado mental e emocional");
        subTemp.resultados.add("A compreensão e cooperação com todos os intervenientes");
        subTemp.resultados.add("Assumir os conflitos com clareza para resolver. Sentir que é competente");
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "Coordenadas Portal Eu Interior");
        subTemp.resultados.add("Reconhecer a divindade em si");
        subTemp.resultados.add("Emoção, persuasão e organização");
        subTemp.resultados.add("A tríade universal, cosmos, luz e centelha divina");
        subTemp.resultados.add("A afirmação positiva e a solução");
        subTemp.resultados.add("Crescimento e desenvolvimento no propósito de vida");
        subTemp.resultados.add("Equilíbrio entre poder e autoridade");
        subTemp.resultados.add("Libertação do poder pessoal");
        subTemp.resultados.add("O trabalho honrado e honesto contínuo");
        subTemp.resultados.add("A segurança dos corpos emocional, mental inferior e superior");
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "A Soma dos Três Portais");
        subTemp.resultados.add("O início");
        subTemp.resultados.add("Harmonia");
        subTemp.resultados.add("Consciência 3D");
        subTemp.resultados.add("Ordem");
        subTemp.resultados.add("Liberdade");
        subTemp.resultados.add("Responsabilidade");
        subTemp.resultados.add("Realização");
        subTemp.resultados.add("Boa Administração");
        subTemp.resultados.add("Fim de ciclo");
        temp.subFerramentas.add(subTemp);


        temp.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método CQM pedindo ao Eu Superior de (nome do consulente) permissão para atuar no seu campo morfogenético com a Matriz Morfogenética. Lanço na rede as coordenadas morfogenéticas (todas as coordenadas que saírem, não mais de três) para que atuem direta e indiretamente no seu propósito e tomada de decisão. Ativo agora a sua frequência de cura para que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";
        Portal4.AddFerramenta(temp);

        temp = new Ferramenta("Quartzos Quânticos e Cristais",Portal4,2);
        temp.type = 2;

        temp.resultados.add("Quartzos Quânticos");
        temp.resultados.add("Cristais");

        subTemp = new SubFerramenta(temp, "Quartzos Quânticos");
        subTemp.resultados.add("6500");
        subTemp.resultados.add("7000");
        subTemp.resultados.add("8000");
        subTemp.resultados.add("10000");
        subTemp.resultados.add("12500");
        subTemp.resultados.add("15000");
        subTemp.resultados.add("20000");
        subTemp.resultados.add("25000");
        subTemp.resultados.add("30000");
        subTemp.resultados.add("50000");

        subSubTemp = new SubFerramenta(temp, "6500");
        subSubTemp.resultados.add("Cérebro");
        subSubTemp.resultados.add("Pulmão");
        subSubTemp.resultados.add("Diafragma");
        subSubTemp.resultados.add("Coração");
        subSubTemp.resultados.add("Fígado");
        subSubTemp.resultados.add("Estomago");
        subSubTemp.resultados.add("Colon");
        subSubTemp.resultados.add("Intestino Delgado");
        subSubTemp.resultados.add("Orgão Reprodutor (M/F)");
        subSubTemp.resultados.add("Rim");
        subSubTemp.resultados.add("Ureter");
        subSubTemp.resultados.add("Canal Evacuação");

        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subTemp.subFerramentas.add(subSubTemp);
        
        subSubTemp = (SubFerramenta) subSubTemp.clone();
        subSubTemp.prevResult = "7000";
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = (SubFerramenta) subSubTemp.clone();
        subSubTemp.prevResult = "8000";
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = (SubFerramenta) subSubTemp.clone();
        subSubTemp.prevResult = "10000";
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = (SubFerramenta) subSubTemp.clone();
        subSubTemp.prevResult = "12500";
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = (SubFerramenta) subSubTemp.clone();
        subSubTemp.prevResult = "15000";
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = (SubFerramenta) subSubTemp.clone();
        subSubTemp.prevResult = "20000";
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = (SubFerramenta) subSubTemp.clone();
        subSubTemp.prevResult = "25000";
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = (SubFerramenta) subSubTemp.clone();
        subSubTemp.prevResult = "30000";
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = (SubFerramenta) subSubTemp.clone();
        subSubTemp.prevResult = "50000";
        subTemp.subFerramentas.add(subSubTemp);

        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "Cristais");
        subTemp.multi = true;
        subTemp.resultados.add("Turmalina");
        subTemp.resultados.add("Quartzo Branco");
        subTemp.resultados.add("Quartzo Fumê");
        subTemp.resultados.add("Quartzo Verde");
        subTemp.resultados.add("Esmeralda");
        subTemp.resultados.add("Granada");
        subTemp.resultados.add("Citrino");
        subTemp.resultados.add("Topázio");
        subTemp.resultados.add("Lápis Lazuli");
        subTemp.resultados.add("Ametista");
        subTemp.resultados.add("Sodalita");
        subTemp.resultados.add("Olho de Tigre");
        subTemp.resultados.add("Turquesa");
        subTemp.resultados.add("Calcita");
        subTemp.resultados.add("Quartzo Rosa");
        subTemp.resultados.add("Azurita");
        subTemp.resultados.add("Cornalina");
        subTemp.resultados.add("Rubi");
        subTemp.resultados.add("Malaquita");
        subTemp.resultados.add("Hematita");

        subTemp.repeatString = "(nome do cristal), ";
        subTemp.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência da cura pelos cristais pedindo ao Eu Superior de (nome do consulente) permissão para atuar no seu campo morfogenético através da programação de cristal (next). Programo a frequência do cristal (next) com a finalidade de (definir atuação do cristal) com o quantum energético de (medir no biometro) Angstrom para que pulse no campo (x vezes, medir no biometro) por dia, durante (dias, semanas, meses, medir no biometro) para que atuem direta e indiretamente no seu propósito e tomada de decisão. Ativo agora a sua frequência de cura para que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";

        temp.subFerramentas.add(subTemp);

        temp.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método CQM pedindo ao Eu Superior de (nome do consulente) permissão para atuar no seu campo morfogenético com a aplicação da frequência dos quartzos quânticos. Lanço na rede o quantum energético de (# valor) para equilíbrio do (orgão) para que atuem direta e indiretamente no seu propósito e tomada de decisão e consequentemente na regeneração de DNA. Ativo agora a sua frequência de cura para que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal4.AddFerramenta(temp);

        temp = new Ferramenta("Matriz Dimensional",Portal4,3);
        temp.multi = true;
        temp.resultados.add("1ªa Dimensão");
        temp.resultados.add("2ªa Dimensão");
        temp.resultados.add("3ªa Dimensão");
        temp.resultados.add("4ªa Dimensão");
        temp.resultados.add("5ªa Dimensão");
        temp.resultados.add("6ªa Dimensão");
        temp.resultados.add("7ªa Dimensão");
        temp.resultados.add("8ªa Dimensão");
        temp.resultados.add("9ªa Dimensão");

        temp.ações.add("ancoragem, fixação e sustentação");
        temp.ações.add("simbiose entre a 1D e a 2D e criação de formas de cura na 3D");
        temp.ações.add("uso do livre arbítrio, a sua manifestação e a tomada de decisão");
        temp.ações.add("Consciência e a migração espaço-temporal");
        temp.ações.add("ressonância harmónica do amor e do conhecimento");
        temp.ações.add("Luz Crística, formadora de harmonias geometricas");
        temp.ações.add("emissão de códigos de luz e som");
        temp.ações.add("Ordem Cósmica");
        temp.ações.add("modulação da individualidade hiperconsciente");

        temp.repeatString = "Lanço na rede a frequência de (designação) para a/o (ação). ";
        temp.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método de CQM pedindo ao Eu Superior de (nome do consulente) permissão para atuar no seu campo morfogenético com a aplicação da frequência da Matriz Dimensional para que se altere a sua perspectiva de realidade e se adeque à vibração do planeta Terra. (next) Ativo agora a sua frequência de cura para que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal4.AddFerramenta(temp);

        temp = new Ferramenta("Remoção de Chips e Implantes",Portal4,4);
        
        temp.resultados.add("Bio-Influenciador");
        temp.resultados.add("Latência de Informação próximos aos chakras principais");
        temp.resultados.add("Implante Parasita");
        temp.resultados.add("Vampirizadores - Ovóides");
        temp.resultados.add("Imobilizadores de Funções e/ou Emoções");
        temp.resultados.add("Manipuladores de Vontade");

        temp.ações.add("Remover toda a influência nos chakras e corpos sutis e destruir a informação deletéria no campo");
        temp.ações.add("Remover todos os bloqueios nos meridianos de energia e seus apêndices provocados pela instalação de frequências densas de repetição junto dos 7 chakras anexos ao corpo físico e harmonizar os corpos sutis afetados.");
        temp.ações.add("Remover o laço de sintonia do intruso com o hospedeiro, destruir todas as ligações deletérias e prevenir nova instalação, elevando a faixa de sintonia do campo afetado do consulente para os 500Hz");
        temp.ações.add("Ativar o reequilíbrio da Energia Vital do consulente, destruir a informação deletéria e elevar a consciência como prevenção de novas entradas");
        temp.ações.add("Destruir a influência negativa da frequência de passividade, desinteresse e procrastinação e ampliar a consciência a frequências acima dos 350Hz");
        temp.ações.add("Evocar a Consciência Cósmica e a elevação de frequência para que todos os bloqueios de vontade e ação sejam anulados e destruídos");

        temp.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método de CQM e a Matriz das Grandes Esferas da Medicina Quântica pedindo ao Eu Superior de (nome do consulente) permissão para atuar nos seus chakras e corpos sutis. Anulo a frequência de (tipo) e ativo a Matriz das Grandes Esferas da Medicina Quântica para (ação). Ativo agora a sua frequência de cura para que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal4.AddFerramenta(temp);

        temp = new Ferramenta("Geometrias Frequenciais",Portal4,5);
        temp.multi = true;
        temp.resultados.add("Círculo");
        temp.resultados.add("Vesica Piscis");
        temp.resultados.add("Triângulo Equilátero");
        temp.resultados.add("Semente da Vida");
        temp.resultados.add("Toróide");
        temp.resultados.add("Ovo da Vida");
        temp.resultados.add("Árvore da Vida");
        temp.resultados.add("Flor da Vida");
        temp.resultados.add("Cubo de Metatron");
        temp.resultados.add("Tetraedro");
        temp.resultados.add("Cubo");
        temp.resultados.add("Octaedro");
        temp.resultados.add("Icosaedro");
        temp.resultados.add("Dodecaedro");
        temp.resultados.add("Merkabah");
        temp.resultados.add("Phi");
        temp.resultados.add("Malkuth");
        temp.resultados.add("Yesod");
        temp.resultados.add("Nitzach");
        temp.resultados.add("Tipheret");
        temp.resultados.add("Hod");
        temp.resultados.add("Pechod");
        temp.resultados.add("Chesed");
        temp.resultados.add("Binah");
        temp.resultados.add("Chokmah");
        temp.resultados.add("Kether");
        temp.resultados.add("Tesseract");
        temp.resultados.add("Elipse");
        temp.resultados.add("Vórtice");
        temp.resultados.add("Espiral");
        temp.resultados.add("Nó Górdio");
        temp.resultados.add("Flor de Lótus");
        temp.resultados.add("Alowa");
        temp.resultados.add("Amor Alquímico");
        temp.resultados.add("Avalion");
        temp.resultados.add("Bareth");
        temp.resultados.add("Buda Shat");
        temp.resultados.add("Comando Twitan");
        temp.resultados.add("Cho Ku Rei");
        temp.resultados.add("Cristal");
        temp.resultados.add("Dai Ko Mio");
        temp.resultados.add("Dai Ko Wa Sho");
        temp.resultados.add("Dai Ran Yan");
        temp.resultados.add("Dax Hum");
        temp.resultados.add("Emenonfa");
        temp.resultados.add("Emu");
        temp.resultados.add("Eveg");
        temp.resultados.add("Gnosa");
        temp.resultados.add("Halu");
        temp.resultados.add("Haman");
        temp.resultados.add("Hanik");
        temp.resultados.add("Hexin");
        temp.resultados.add("Hart");
        temp.resultados.add("Hon Sha Zen Shonen");
        temp.resultados.add("Sei He Ki");
        temp.resultados.add("Iava");
        temp.resultados.add("Infinex");
        temp.resultados.add("In Sha Sol");
        temp.resultados.add("Ka Me Akque");
        temp.resultados.add("Killet");
        temp.resultados.add("Krash Hum");
        temp.resultados.add("Krya");
        temp.resultados.add("Look Sham Too");
        temp.resultados.add("Mixanan");
        temp.resultados.add("Om Metistica");
        temp.resultados.add("Acaresh");
        temp.resultados.add("Shaalam");
        temp.resultados.add("Melvic");
        temp.resultados.add("Santa Ametista");
        temp.resultados.add("Santa Esmeralda");
        temp.resultados.add("Shamlin");
        temp.resultados.add("Comando Temporal");
        temp.resultados.add("Om Plash");
        temp.resultados.add("Yesh");
        temp.resultados.add("Om Miguel");
        temp.resultados.add("Tan Trim");
        temp.resultados.add("Tesmate");
        temp.resultados.add("Om Cristo");
        temp.resultados.add("Om Maria");
        temp.resultados.add("Yom Too");
        temp.resultados.add("Malatiel");
        temp.resultados.add("Menaton");
        temp.resultados.add("Menshui");
        temp.resultados.add("Meltrix");
        temp.resultados.add("Surilh");
        temp.resultados.add("Ramethom");
        temp.resultados.add("Om Thalom");
        temp.resultados.add("Lian So");
        temp.resultados.add("Talmar");
        temp.resultados.add("Vantil");
        temp.resultados.add("Caloth");
        temp.resultados.add("Tantar");
        temp.resultados.add("Om Micah");
        temp.resultados.add("Zech");
        temp.resultados.add("Acaresh");
        temp.resultados.add("Om Shanti Om");
        temp.resultados.add("Decágono");
        temp.resultados.add("Hiranya");
        temp.resultados.add("Alta Vitalidade");
        temp.resultados.add("Omega-Alfa");
        temp.resultados.add("Keiti");
        temp.resultados.add("SCAP");
        temp.resultados.add("Tri-Círculo");
        temp.resultados.add("Mesa D’Amiens");
        temp.resultados.add("Turbilhão");
        temp.resultados.add("Peggotty Board");
        temp.resultados.add("Telerradiador");
        temp.resultados.add("Compensador Mindtron");
        temp.resultados.add("Cruz Atlante");
        temp.resultados.add("Labirinto D’Amiens");
        temp.resultados.add("Pirâmide Plana");
        temp.resultados.add("Kit-Cromo");
        temp.resultados.add("Baguá");
        temp.resultados.add("Srim-Hrim-Krim-Klim");
        temp.resultados.add("IAVE");
        temp.resultados.add("Anti Magia");
        temp.resultados.add("Nove Círculos");
        temp.resultados.add("Escudo");
        temp.resultados.add("Anti-Dor");
        temp.resultados.add("Desimpregnador");
        temp.resultados.add("Cruz Ansata");
        temp.resultados.add("Ventoinha");
        temp.resultados.add("Transmutador");
        temp.resultados.add("Diafragma");
        
        temp.repeatString = "(tipo), ";
        temp.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método de Cura Quântica Multidimensional e a Ressonância Harmonica das Geometrias Sagradas pedindo ao Eu Superior de (nome do consulente) permissão para atuar e imprimir a frequência de cura no seu campo morfogenético impactando todos os chakras e todos os corpos sutis. Ativo agora a frequência de/do/da (next) para que pulse(m) na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal4.AddFerramenta(temp);

        temp = new Ferramenta("Conexão Arcturiana",Portal4,6);
        temp.type = 2;

        temp.resultados.add("Códigos Arcturianos");
        temp.resultados.add("Cartas de Cura");

        subTemp = new SubFerramenta(temp, "Códigos Arcturianos");
        subTemp.multi = true;
        subTemp.resultados.add("ABERTURA");
        subTemp.resultados.add("ABUNDÂNCIA");
        subTemp.resultados.add("ACEITAÇÃO");
        subTemp.resultados.add("ALEGRIA");
        subTemp.resultados.add("ALTIVEZ");
        subTemp.resultados.add("AMOR INCONDICIONAL");
        subTemp.resultados.add("AMOR PRÓPRIO");
        subTemp.resultados.add("ANCORAGEM");
        subTemp.resultados.add("AQUIESCÊNCIA");
        subTemp.resultados.add("ASCENSÃO");
        subTemp.resultados.add("AUTENTICIDADE");
        subTemp.resultados.add("AUTOCONFIANÇA - SEGURANÇA EM SI MESMO");
        subTemp.resultados.add("AUTOCURA");
        subTemp.resultados.add("AUTO-ESTIMA");
        subTemp.resultados.add("AUTORREFLEXÃO");
        subTemp.resultados.add("AVANÇO - DESCOBERTA");
        subTemp.resultados.add("CAPACITAÇÃO");
        subTemp.resultados.add("CHAMADA");
        subTemp.resultados.add("CHEGADA");
        subTemp.resultados.add("CICLO");
        subTemp.resultados.add("CLAREZA");
        subTemp.resultados.add("CO-CRIAÇÃO");
        subTemp.resultados.add("COMPAIXÃO");
        subTemp.resultados.add("COMUNICAÇÃO");
        subTemp.resultados.add("COMUTAÇÃO");
        subTemp.resultados.add("CONEXÃO");
        subTemp.resultados.add("CONFIRMAÇÃO");
        subTemp.resultados.add("CONHECIMENTO");
        subTemp.resultados.add("CONSCIÊNCIA");
        subTemp.resultados.add("CONSCIÊNCIA CRÍSTICA");
        subTemp.resultados.add("CONSCIÊNCIA DE UNIDADE");
        subTemp.resultados.add("CONSCIÊNCIA INTEGRAL OU DA TOTALIDADE");
        subTemp.resultados.add("CONTATO");
        subTemp.resultados.add("CONVERSÃO - TRANSMUTAÇÃO");
        subTemp.resultados.add("CONVITE");
        subTemp.resultados.add("CRIAÇÃO");
        subTemp.resultados.add("CULPA");
        subTemp.resultados.add("CURA");
        subTemp.resultados.add("DESAPEGO & LIVRAMENTO");
        subTemp.resultados.add("DESDOBRAMENTO");
        subTemp.resultados.add("DESEJO");
        subTemp.resultados.add("DESMASCARAR");
        subTemp.resultados.add("DESPRENDIMENTO");
        subTemp.resultados.add("DEVOÇÃO");
        subTemp.resultados.add("DIREÇÃO");
        subTemp.resultados.add("DUALIDADE");
        subTemp.resultados.add("ECO");
        subTemp.resultados.add("ELEMENTO");
        subTemp.resultados.add("EMERGÊNCIA");
        subTemp.resultados.add("ENTREGA");
        subTemp.resultados.add("EQUILIBRIO");
        subTemp.resultados.add("ESCOLHAS - CAPACIDADE DE ELEGER");
        subTemp.resultados.add("ESSÊNCIA");
        subTemp.resultados.add("EXPANSÃO - DESENVOLVIMENTO");
        subTemp.resultados.add("FÉ - CONFIANÇA");
        subTemp.resultados.add("FLUXO");
        subTemp.resultados.add("FOCO");
        subTemp.resultados.add("FREQUÊNCIA");
        subTemp.resultados.add("GRATIDÃO");
        subTemp.resultados.add("HARMONIA");
        subTemp.resultados.add("ILUMINAÇÃO");
        subTemp.resultados.add("ILUSÃO");
        subTemp.resultados.add("IMPRESSÃO");
        subTemp.resultados.add("INFINITO");
        subTemp.resultados.add("INICIAÇÃO");
        subTemp.resultados.add("INOCÊNCIA");
        subTemp.resultados.add("INTEGRAÇÃO");
        subTemp.resultados.add("INTENÇÃO");
        subTemp.resultados.add("INTUIÇÃO");
        subTemp.resultados.add("LEALDADE");
        subTemp.resultados.add("LIBERAÇÃO");
        subTemp.resultados.add("LIBERDADE");
        subTemp.resultados.add("LIBERTAÇÃO");
        subTemp.resultados.add("LIMITAÇÕES");
        subTemp.resultados.add("MANIFESTAÇÃO");
        subTemp.resultados.add("MESTRE");
        subTemp.resultados.add("MOMENTUM");
        subTemp.resultados.add("MOVIMENTO");
        subTemp.resultados.add("MUDANÇA - MOVIMENTO CONTÍNUO");
        subTemp.resultados.add("MUDANÇA DE TEMPO");
        subTemp.resultados.add("NASCIMENTO");
        subTemp.resultados.add("OPORTUNIDADES");
        subTemp.resultados.add("OPOSTOS");
        subTemp.resultados.add("PACIÊNCIA");
        subTemp.resultados.add("PAIXÃO");
        subTemp.resultados.add("PAZ");
        subTemp.resultados.add("PERDÃO");
        subTemp.resultados.add("PERSEVERANÇA");
        subTemp.resultados.add("PERSPECTIVA");
        subTemp.resultados.add("PLANO DE VIDA");
        subTemp.resultados.add("PLENITUDE");
        subTemp.resultados.add("PODER DE AÇÃO");
        subTemp.resultados.add("PONTO DE INFLEXÃO - MOMENTO CRUCIAL");
        subTemp.resultados.add("PRESENTE - DOM");
        subTemp.resultados.add("PROCESSAMENTO");
        subTemp.resultados.add("PROFUNDO DESPERTAR");
        subTemp.resultados.add("PROJETO");
        subTemp.resultados.add("PROTEÇÃO");
        subTemp.resultados.add("PUREZA");
        subTemp.resultados.add("PURIFICAÇÃO");
        subTemp.resultados.add("REALIZAÇÃO");
        subTemp.resultados.add("RECONHECIMENTO");
        subTemp.resultados.add("RECORDAÇÃO");
        subTemp.resultados.add("REFINAMENTO");
        subTemp.resultados.add("REFORMA");
        subTemp.resultados.add("RENASCIMENTO");
        subTemp.resultados.add("REPETIÇÃO");
        subTemp.resultados.add("RESILIÊNCIA");
        subTemp.resultados.add("RESISTÊNCIA");
        subTemp.resultados.add("RETORNO FINAL");
        subTemp.resultados.add("REVELAÇÃO");
        subTemp.resultados.add("RITMO");
        subTemp.resultados.add("SABEDORIA");
        subTemp.resultados.add("SACRIFÍCIO");
        subTemp.resultados.add("SATISFAÇÃO");
        subTemp.resultados.add("SEM LIMITES");
        subTemp.resultados.add("SEMENTES");
        subTemp.resultados.add("SENSAÇÃO DE SEGURANÇA - BEM-ESTAR");
        subTemp.resultados.add("SENSIBILIDADE");
        subTemp.resultados.add("SEXUALIDADE");
        subTemp.resultados.add("SILÊNCIO");
        subTemp.resultados.add("SINCRONICIDADE");
        subTemp.resultados.add("SINERGIA");
        subTemp.resultados.add("TEMPO NATURAL");
        subTemp.resultados.add("TEMPO DE NASCER DE NOVO");
        subTemp.resultados.add("TERCEIRA ONDA");
        subTemp.resultados.add("TRANSCENDÊNCIA");
        subTemp.resultados.add("TRANSFIGURAÇÃO");
        subTemp.resultados.add("TRANSFORMAÇÃO");
        subTemp.resultados.add("TRANSIÇÃO");
        subTemp.resultados.add("UNIÃO");
        subTemp.resultados.add("UNICIDADE");
        subTemp.resultados.add("VERDADE");
        subTemp.resultados.add("VITÓRIA");
        subTemp.resultados.add("VOZ INTERIOR");
        subTemp.resultados.add("VULNERABILIDADE");

        subTemp.ações.add("'Eu abro meu coração para aspessoas ao meu redor.'");
        subTemp.ações.add("'Eu valorizo o que tenho e estou receptivo para mais.'");
        subTemp.ações.add("'Eu aceito que a mudança precisa ser dividida em etapas.'");
        subTemp.ações.add("'Eu vejo com humor o meu processo.'");
        subTemp.ações.add("'Eu me sinto digno de todas as escolhas que fiz.'");
        subTemp.ações.add("'Eu me amo e estou autorizado a ser.'");
        subTemp.ações.add("'Eu me amo por quem eu sou.'");
        subTemp.ações.add("'Eu aproveito este momento para ancorar o meu crescimento.'");
        subTemp.ações.add("'Este é o tempo de fazer novas escolhas.'");
        subTemp.ações.add("'Eu sou o produtor da minha própria vida.'");
        subTemp.ações.add("'Eu sou um ser especial e único.'");
        subTemp.ações.add("'Eu confio em mim mesmo e nas escolhas que faço.'");
        subTemp.ações.add("Eu posso me curar de tudo.'");
        subTemp.ações.add("'Eu aprecio quem eu sou e o que faço.'");
        subTemp.ações.add("'Eu cresço por ser honesto comigo mesmo sobre o que tenho que mudar.'");
        subTemp.ações.add("'Eu agora escolho pelo meu avanço.'");
        subTemp.ações.add("'Eu tenho a força para realizar o meu sonho.'");
        subTemp.ações.add("'Eu faço as coisas que me dão força agora.'");
        subTemp.ações.add("'Eu tomo o caminho mais curto para o meu destino.'");
        subTemp.ações.add("'Eu estou começando do princípio de um novo ciclo.'");
        subTemp.ações.add("'Eu aponto claramente o que eu quero.'");
        subTemp.ações.add("'Eu e o outro somos um e unidos avançamos.'");
        subTemp.ações.add("'Eu permito aos outros espaço para o processo deles.'");
        subTemp.ações.add("'Eu levo a sério os sinais de meu corpo.'");
        subTemp.ações.add("'Eu sou eu mesmo em todas as situações.'");
        subTemp.ações.add("'Eu me conecto à minha fonte interior de sabedoria.'");
        subTemp.ações.add("'O que eu penso e expresso hoje, será confirmado espontaneamente.'");
        subTemp.ações.add("'Eu confio no conhecimento que está oculto em meu interior.'");
        subTemp.ações.add("'Eu confio que há sempre auxílio quando eu necessito dele.'");
        subTemp.ações.add("'Eu creio nos poderes divinos que eu possuo.'");
        subTemp.ações.add("'Todos nós somos conectados uns aos outros.'");
        subTemp.ações.add("'Eu deixo de lado meu julgamento da situação.'");
        subTemp.ações.add("'Eu faço contato consciente com qual lugar eu quero ir.'");
        subTemp.ações.add("'Eu me apodero de minha liberdade e crio a partir do coração.'");
        subTemp.ações.add("'Eu aceito todos os convites para me desenvolver.'");
        subTemp.ações.add("'Quanto mais estou limpo, mais posso criar tudo que quero.'");
        subTemp.ações.add("'Eu sou responsável apenas pelos meus próprios atos.'");
        subTemp.ações.add("'Eu estou atraindo do espaço o que eu preciso para curar a minha dor.'");
        subTemp.ações.add("'Eu me livro de tudo que restringe meu crescimento.'");
        subTemp.ações.add("'Eu confio as escolhas que faço e aceito os seus frutos.'");
        subTemp.ações.add("'Eu abraço meus desejos e ouso a admiti-los.'");
        subTemp.ações.add("'Eu ouso ser diferente do que é considerado normal.'");
        subTemp.ações.add("'Eu deixo de lado tudo que me sobrecarrega.'");
        subTemp.ações.add("'Eu sou dedicado a mim mesmo.'");
        subTemp.ações.add("'Eu escolho confiante minha própria direção.'");
        subTemp.ações.add("'Eu libero todos os meus julgamentos.'");
        subTemp.ações.add("'Eu percebo com clareza tanto o que transmito quanto o que recebo,através dos ecos da Alma.'");
        subTemp.ações.add("'Eu nasci para o que faço.'");
        subTemp.ações.add("'Eu assumo o desafio de mostrar quem eu realmente sou.'");
        subTemp.ações.add("'Eu abro meu coração, entregando-me inteiramente a ele.'");
        subTemp.ações.add("'Eu estou firme e equilibrado.'");
        subTemp.ações.add("'Eu aceito as consequências das escolhas que fiz.'");
        subTemp.ações.add("'Confio na sabedoria de minha alma.'");
        subTemp.ações.add("'Eu tenho tudo em mim para ser bem sucedido.'");
        subTemp.ações.add("'Eu tenho fé no que sinto se aproximar.'");
        subTemp.ações.add("'Eu entro nas ondas de minha criação.'");
        subTemp.ações.add("'Eu estou focado no que me faz feliz.'");
        subTemp.ações.add("'Eu estou emitindo minha própria frequência.'");
        subTemp.ações.add("'Eu sou grato por tudo que me fez ser quem eu sou.'");
        subTemp.ações.add("'Eu vivo em harmonia com meu Eu Interior e o meu ambiente.'");
        subTemp.ações.add("'Tudo o que eu experimento me ajuda a ficar mais iluminado.'");
        subTemp.ações.add("'Eu estou acima do meu medo da mudança.'");
        subTemp.ações.add("'Eu prezo pelo que tenho alcançado até agora.'");
        subTemp.ações.add("'Meu poder é grande e infinito.'");
        subTemp.ações.add("'Eu vivo em liberdade.'");
        subTemp.ações.add("'Eu estou autorizado a brincar livre como uma criança.'");
        subTemp.ações.add("'Eu faço parte das lições da minha vida diariamente.'");
        subTemp.ações.add("'Eu levo minhas intenções a sério.'");
        subTemp.ações.add("'Eu escuto meus sentimentos e ajo em direção a eles.'");
        subTemp.ações.add("'Eu sou leal a mim mesmo e ao que eu defendo.'");
        subTemp.ações.add("'Eu dou liberdade para a minha criança interior.'");
        subTemp.ações.add("'Eu me dou a liberdade de Ser.'");
        subTemp.ações.add("'Eu me liberto das críticas que faço sobre mim mesmo.'");
        subTemp.ações.add("'Eu continuo o que eu comecei.'");
        subTemp.ações.add("'Eu ouso manifestar o que eu realmente quero.'");
        subTemp.ações.add("'Eu sou o que eu sou, livre para ser.'");
        subTemp.ações.add("'Eu confio que, no momento certo, farei o que tenho que fazer.'");
        subTemp.ações.add("'Eu percorro meu caminho no meu próprio ritmo.'");
        subTemp.ações.add("'Eu me conecto com a energia do momento.'");
        subTemp.ações.add("'Eu tenho tempo suficiente para fazer tudo que eu quero.'");
        subTemp.ações.add("'Hoje eu saúdo meu novo Eu.'");
        subTemp.ações.add("'Eu tenho infinitas possibilidades para alcançar o sucesso.'");
        subTemp.ações.add("'Eu renuncio a julgar.'");
        subTemp.ações.add("'Eu estou deixando passar minhas expectativas e abrindo-me para aquil o que é possível receber.'");
        subTemp.ações.add("'Se eu faço o que eu gosto de fazer, tudo dará certo.'");
        subTemp.ações.add("'Eu crio a paz em mim e na minha vida.'");
        subTemp.ações.add("'Eu me perdoo pelo que eu tenha gostado de fazer de forma diferente.'");
        subTemp.ações.add("'Eu sei o que eu quero e para onde vou.'");
        subTemp.ações.add("'Eu posso transformar qualquer situação a meu favor.'");
        subTemp.ações.add("'Eu creio que minha alma tem acompanhado o plano de vida.'");
        subTemp.ações.add("'Eu reconheço todas as minhas características, boas ou más.'");
        subTemp.ações.add("'Eu converto meus planos em ações.'");
        subTemp.ações.add("'É hora de fazê-lo de forma diferente.'");
        subTemp.ações.add("'Eu reconheço meu dom sem igual.'");
        subTemp.ações.add("'Eu assimilo meu passado em paz e quietude.'");
        subTemp.ações.add("'Eu estou ciente do que me ajuda a avançar e do que me obstrui.'");
        subTemp.ações.add("'Eu confio no plano que me trouxe até aqui.'");
        subTemp.ações.add("'Eu estou emitindo minhas próprias frequências.'");
        subTemp.ações.add("'Eu respondo aos outros com pureza.'");
        subTemp.ações.add("'Eu me curo, tornando-me honesto comigo mesmo.'");
        subTemp.ações.add("'Eu percebo que posso criar o que eu quero.'");
        subTemp.ações.add("'Eu me concedo a oportunidade de cometer erros.'");
        subTemp.ações.add("'Eu me lembro para o que eu nasci.'");
        subTemp.ações.add("'Eu estou autorizado a desfrutar o meu processo de crescimento.'");
        subTemp.ações.add("'Eu estou pronto para realizar a reforma interior que me libertará.'");
        subTemp.ações.add("'Eu me desprendo de tudo o que é velho e me envolvo com o que é novo.'");
        subTemp.ações.add("'Cada repetição é um novo desafio para crescer.'");
        subTemp.ações.add("'Eu também supero os deslizes e recaídas.'");
        subTemp.ações.add("'Eu faço o que eu realmente quero.'");
        subTemp.ações.add("'Eu sou o mestre do meu próprio processo criativo.'");
        subTemp.ações.add("'É hora de mostrar quem eu realmente sou.'");
        subTemp.ações.add("'Eu faço escolhas que ressoam com o ritmo da vida.'");
        subTemp.ações.add("'A resposta para quem eu sou encontra-se dentro de mim.'");
        subTemp.ações.add("'Eu escolho conscientemente alcançar meu objetivo.'");
        subTemp.ações.add("'Eu aumento a qualidade da minha vida.'");
        subTemp.ações.add("'Meu poder é ilimitado.'");
        subTemp.ações.add("'Hoje eu planto as sementes de meus ideais.'");
        subTemp.ações.add("'Eu preciso somente de mim para me sentir seguro.'");
        subTemp.ações.add("'Eu confio em minhas sensações e nos sinais que eu capto.'");
        subTemp.ações.add("'Eu posso me dar amor.'");
        subTemp.ações.add("'Eu me conecto com o silêncio em meu coração.'");
        subTemp.ações.add("'Eu estou alerta aos símbolos que indicam o caminho.'");
        subTemp.ações.add("'Minha cabeça e coração são um.'");
        subTemp.ações.add("'Eu entro em sintonia com o ritmo da natureza.'");
        subTemp.ações.add("'Eu me ofereço a uma nova chance.'");
        subTemp.ações.add("'Eu me responsabilizo por um mundo melhor.'");
        subTemp.ações.add("'Eu transcendo meus medos e limitações.'");
        subTemp.ações.add("'Eu aceito o desafio de mudar.'");
        subTemp.ações.add("'Eu vou ao limite para realizar meu sonho.'");
        subTemp.ações.add("'Eu me entrego ao desconhecido.'");
        subTemp.ações.add("'Eu compartilho meu coração, porque eu sou um desbravador.'");
        subTemp.ações.add("'O que eu penso e sinto são igualmente importantes.'");
        subTemp.ações.add("'Minha verdade é fundamentada no que eu sinto.'");
        subTemp.ações.add("'Eu vou fazê-lo!'");
        subTemp.ações.add("'Eu estou sempre ouvindo a sabedoria de meu coração.'");
        subTemp.ações.add("'Eu ouso mostrar minha vulnerabilidade.'");
        
        

        subTemp.repeatString = "(nº e designação),  ";
        subTemp.repeatString2 = "(simbolo), ";
        subTemp.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método de Cura Quântica Multidimensional pedindo ao Eu Superior de (nome do consulente) permissão para atuar no seu campo morfogenético com as frequências de Cura dos Códigos Arcturianos. Acedendo ao campo cósmico de comunicação estelar e ativando os aparelhos etéreos de aplicação dos códigos. Ativo agora o código (next) na frequência certa e na quantidade exata e ordeno que se fixe no campo morfogenético de (nome do consulente) operando a cura e a transformação interior em todos os corpos e todos os chakras. (next2) Encerro agora a comunicação com o campo cósmico de comunicação estelar e todos os aparelhos etéreos de aplicação. Fechando o campo morfogenético e a Merkabah Pessoal de (nome completo do consulente) e ordeno que se fixem todas as frequências de cura, agora.";
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp, "Cartas de Cura");
        subTemp.multi = true;
        subTemp.resultados.add("Conexão Arcturiana");
        subTemp.resultados.add("Regeneração DNA");
        subTemp.resultados.add("Sincronização 13:20");
        subTemp.resultados.add("Assinatura Galáctica");
        subTemp.resultados.add("Chip Noosférico");
        subTemp.resultados.add("Evento Inevitável");
        subTemp.resultados.add("Hólon");
        subTemp.resultados.add("Mente Arco-Íris");
        subTemp.resultados.add("Radiossónica");
        subTemp.repeatString = "(nº e designação), ";
        subTemp.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método de Cura Quântica Multidimensional pedindo ao Eu Superior de (nome do consulente) permissão para atuar no seu campo morfogenético com as frequências de Cura dos Códigos Arcturianos. Acedendo ao campo cósmico de comunicação estelar e ativando os aparelhos etéreos de aplicação dos códigos. Ativo agora a(s) Carta(s) de Cura (next) na frequência certa e na quantidade exata e ordeno que se fixe no campo morfogenético de (nome do consulente) operando a cura e a transformação na transição planetária. Encerrandoi agora a comunicação com o campo cósmico de comunicação estelar e todos os aparelhos etéreos de aplicação. Fechando o campo morfogenético e a Merkabah Pessoal de (nome completo do consulente) e ordeno que se fixem todas as frequências de cura, agora.";
        temp.subFerramentas.add(subTemp);


        Portal4.AddFerramenta(temp);

        temp = new Ferramenta("Matriz Bioenergética e Meridional",Portal4,7);
        temp.type = 2;
        
        temp.resultados.add("Matriz Bioenergética");
        temp.resultados.add("Tabela Funções Shu");
        temp.resultados.add("Tabela Periódica dos Elementos");

        subTemp = new SubFerramenta(temp, "Matriz Bioenergética");
        subTemp.resultados.add("Da rede cósmica de entrelaçamento");
        subTemp.resultados.add("Da informação holográfica");
        subTemp.resultados.add("Do direcionamento da informação");
        subTemp.resultados.add("Da reconstrução embrionária do campo");
        subTemp.resultados.add("Da influência dos corpos sutis");
        subTemp.resultados.add("Das formas pensamento como influenciadoras energéticas");
        subTemp.resultados.add("Da somatização emocional e mental no corpo físico");
        subTemp.resultados.add("Da projeção do campo na saúde");
        subTemp.resultados.add("Da memória da água na cura");
        subTemp.resultados.add("Da homeostase do corpo físico através do campo");
        
        subTemp.ações.add("Unir as consciências");
        subTemp.ações.add("Reconstrução Física");
        subTemp.ações.add("Foco na Cura");
        subTemp.ações.add("Retornar o DNA ao propósito");
        subTemp.ações.add("Reestruturação dos corpos sutis");
        subTemp.ações.add("Ativar pensamentos de cura");
        subTemp.ações.add("Limpar todos os registros energéticos negativos dos corpos sutis");
        subTemp.ações.add("Regenerar o campo bioenergético");
        subTemp.ações.add("Programar a matriz química da água no corpo e no ambiente para a cura");
        subTemp.ações.add("Auto-regeneração do corpo físico");

        subTemp.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método de Cura Quântica Multidimensional e a Matriz da Bioenergética Sutil pedindo ao Eu Superior de (nome do consulente) permissão para atuar nos seus campos, chakras e corpos sutis. Ativo agora a frequência do Princípio (princípio) para (ação). Que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";
        temp.subFerramentas.add(subTemp);

        subTemp = new SubFerramenta(temp,"Tabela Funções Shu");
        subTemp.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método de Cura Quântica Multidimensional e a Matriz dos Meridianos Energéticos com a função de equilibrar as funções Shu, pedindo ao Eu Superior de (nome do consulente) permissão para atuar nos seus campos, chakras e corpos sutis. Ativo agora a frequência do ponto (ponto) na localização (canal). Que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo";
        subTemp.resultados.add("P");
        subTemp.resultados.add("MC");
        subTemp.resultados.add("C");
        subTemp.resultados.add("ID");
        subTemp.resultados.add("TA");
        subTemp.resultados.add("IG");
        subTemp.resultados.add("B");
        subTemp.resultados.add("VB");
        subTemp.resultados.add("E");
        subTemp.resultados.add("R");
        subTemp.resultados.add("BP");
        subTemp.resultados.add("F");

        subSubTemp = new SubFerramenta(temp, "P");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");

        subSubTemp.ações.add("11");
        subSubTemp.ações.add("10");
        subSubTemp.ações.add("9");
        subSubTemp.ações.add("8");
        subSubTemp.ações.add("5");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);
        subSubTemp = new SubFerramenta(temp, "MC");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("9");
        subSubTemp.ações.add("8");
        subSubTemp.ações.add("7");
        subSubTemp.ações.add("5");
        subSubTemp.ações.add("3");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);
        subSubTemp = new SubFerramenta(temp, "C");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("9");
        subSubTemp.ações.add("8");
        subSubTemp.ações.add("7");
        subSubTemp.ações.add("4");
        subSubTemp.ações.add("3");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);
        subSubTemp = new SubFerramenta(temp, "ID");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("1");
        subSubTemp.ações.add("2");
        subSubTemp.ações.add("3");
        subSubTemp.ações.add("5");
        subSubTemp.ações.add("8");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);
        subSubTemp = new SubFerramenta(temp, "TA");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("1");
        subSubTemp.ações.add("2");
        subSubTemp.ações.add("3");
        subSubTemp.ações.add("6");
        subSubTemp.ações.add("10");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);
        subSubTemp = new SubFerramenta(temp, "IG");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("1");
        subSubTemp.ações.add("2");
        subSubTemp.ações.add("3");
        subSubTemp.ações.add("5");
        subSubTemp.ações.add("11");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);
        subSubTemp = new SubFerramenta(temp, "B");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("67");
        subSubTemp.ações.add("66");
        subSubTemp.ações.add("65");
        subSubTemp.ações.add("60");
        subSubTemp.ações.add("40");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);
        subSubTemp = new SubFerramenta(temp, "VB");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("44");
        subSubTemp.ações.add("43");
        subSubTemp.ações.add("41");
        subSubTemp.ações.add("38");
        subSubTemp.ações.add("34");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);
        subSubTemp = new SubFerramenta(temp, "E");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("45");
        subSubTemp.ações.add("44");
        subSubTemp.ações.add("43");
        subSubTemp.ações.add("41");
        subSubTemp.ações.add("36");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);
        subSubTemp = new SubFerramenta(temp, "R");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("1");
        subSubTemp.ações.add("2");
        subSubTemp.ações.add("3");
        subSubTemp.ações.add("7");
        subSubTemp.ações.add("10");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);
        subSubTemp = new SubFerramenta(temp, "BP");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("1");
        subSubTemp.ações.add("2");
        subSubTemp.ações.add("3");
        subSubTemp.ações.add("5");
        subSubTemp.ações.add("9");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);
        subSubTemp = new SubFerramenta(temp, "F");
        subSubTemp.resultados.add("Ting");
        subSubTemp.resultados.add("Iong");
        subSubTemp.resultados.add("Iu");
        subSubTemp.resultados.add("King");
        subSubTemp.resultados.add("Ho");
        subSubTemp.ações.add("1");
        subSubTemp.ações.add("2");
        subSubTemp.ações.add("3");
        subSubTemp.ações.add("4");
        subSubTemp.ações.add("8");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);
        
        temp.subFerramentas.add(subTemp);
        subTemp = new SubFerramenta(temp, "Tabela Periódica dos Elementos");
        subTemp.ownDecreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método de Cura Quântica Multidimensional e a Matriz da Tabela Periódica com a função de equilibrar as funções do elemento nos campos atuantes e pedindo ao Eu Superior de (nome do consulente) permissão para atuar nos seus campos, chakras e corpos sutis. Ativo agora a frequência do elemento (nome do elemento) para que se fixe na harmonização do propósito do consulente. Que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";
        
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");
        subTemp.resultados.add("");

        //1
        subSubTemp = new SubFerramenta(temp, "");
        subSubTemp.resultados.add("Hidrogénio");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("Hélio");
        
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);

        //2
        subSubTemp = new SubFerramenta(temp, "");
        subSubTemp.resultados.add("Lítio");
        subSubTemp.resultados.add("Berílio");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("Boro");
        subSubTemp.resultados.add("Carbono");
        subSubTemp.resultados.add("Nitrogénio");
        subSubTemp.resultados.add("Oxigénio");
        subSubTemp.resultados.add("Flúor");
        subSubTemp.resultados.add("Neon");
        
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "");
        subSubTemp.resultados.add("Sódio");
        subSubTemp.resultados.add("Magnésio");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("Alumínio");
        subSubTemp.resultados.add("Silício");
        subSubTemp.resultados.add("Fósforo");
        subSubTemp.resultados.add("Enxofre");
        subSubTemp.resultados.add("Cloro");
        subSubTemp.resultados.add("Árgon");
        
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "");
        subSubTemp.resultados.add("Potássio");
        subSubTemp.resultados.add("Cálcio");
        subSubTemp.resultados.add("Escândio");
        subSubTemp.resultados.add("Titânio");
        subSubTemp.resultados.add("Vanádio");
        subSubTemp.resultados.add("Cromo");
        subSubTemp.resultados.add("Manganês");
        subSubTemp.resultados.add("Ferro");
        subSubTemp.resultados.add("Cobalto");
        subSubTemp.resultados.add("Níquel");
        subSubTemp.resultados.add("Cobre");
        subSubTemp.resultados.add("Zinco");
        subSubTemp.resultados.add("Gálio");
        subSubTemp.resultados.add("Germânio");
        subSubTemp.resultados.add("Arsénio");
        subSubTemp.resultados.add("Selénio");
        subSubTemp.resultados.add("Bromo");
        subSubTemp.resultados.add("Cripton");
        
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "");
        subSubTemp.resultados.add("Rubídio");
        subSubTemp.resultados.add("Estrôncio");
        subSubTemp.resultados.add("Ítrio");
        subSubTemp.resultados.add("Zircônio");
        subSubTemp.resultados.add("Nióbio");
        subSubTemp.resultados.add("Molibdénio");
        subSubTemp.resultados.add("Tenécio");
        subSubTemp.resultados.add("Ruténio");
        subSubTemp.resultados.add("Ródio");
        subSubTemp.resultados.add("Paládio");
        subSubTemp.resultados.add("Prata");
        subSubTemp.resultados.add("Cádmio");
        subSubTemp.resultados.add("Índio");
        subSubTemp.resultados.add("Estanho");
        subSubTemp.resultados.add("Antimónio");
        subSubTemp.resultados.add("Telúrio");
        subSubTemp.resultados.add("Iodo");
        subSubTemp.resultados.add("Xénon");
        
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "");
        subSubTemp.resultados.add("Césio");
        subSubTemp.resultados.add("Bário");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("Háfnio");
        subSubTemp.resultados.add("Tântalo");
        subSubTemp.resultados.add("Tungsténio");
        subSubTemp.resultados.add("Rénio");
        subSubTemp.resultados.add("Ósmio");
        subSubTemp.resultados.add("Irídio");
        subSubTemp.resultados.add("Platina");
        subSubTemp.resultados.add("Ouro");
        subSubTemp.resultados.add("Mercúrio");
        subSubTemp.resultados.add("Tálio");
        subSubTemp.resultados.add("Chumbo");
        subSubTemp.resultados.add("Bismuto");
        subSubTemp.resultados.add("Polónio");
        subSubTemp.resultados.add("Ástato");
        subSubTemp.resultados.add("Rádon");
        
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "");
        subSubTemp.resultados.add("Frâncio");
        subSubTemp.resultados.add("Rádio");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("Rutherfórdio");
        subSubTemp.resultados.add("Dúbnio");
        subSubTemp.resultados.add("Seabórgio");
        subSubTemp.resultados.add("Bóhrio");
        subSubTemp.resultados.add("Hássio");
        subSubTemp.resultados.add("Meitnério");
        subSubTemp.resultados.add("Darmstácio");
        subSubTemp.resultados.add("Roentgénio");
        subSubTemp.resultados.add("Copernício");
        subSubTemp.resultados.add("Nipónio");
        subSubTemp.resultados.add("Fleróvio");
        subSubTemp.resultados.add("Moscóvio");
        subSubTemp.resultados.add("Livermório");
        subSubTemp.resultados.add("Tenesso");
        subSubTemp.resultados.add("Oganésson");
        
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("Lantânio");
        subSubTemp.resultados.add("Cério");
        subSubTemp.resultados.add("Praseodímio");
        subSubTemp.resultados.add("Neodímio");
        subSubTemp.resultados.add("Promécio");
        subSubTemp.resultados.add("Samário");
        subSubTemp.resultados.add("Európio");
        subSubTemp.resultados.add("Gadolínio");
        subSubTemp.resultados.add("Térbio");
        subSubTemp.resultados.add("Disprósio");
        subSubTemp.resultados.add("Hólmio");
        subSubTemp.resultados.add("Érbio");
        subSubTemp.resultados.add("Túlio");
        subSubTemp.resultados.add("Itérbio");
        subSubTemp.resultados.add("Lutécio");
        
        
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);

        subSubTemp = new SubFerramenta(temp, "");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("");
        subSubTemp.resultados.add("Actínio");
        subSubTemp.resultados.add("Tório");
        subSubTemp.resultados.add("Protactínio");
        subSubTemp.resultados.add("Urânio");
        subSubTemp.resultados.add("Neptúnio");
        subSubTemp.resultados.add("Plutónio");
        subSubTemp.resultados.add("Amerício");
        subSubTemp.resultados.add("Cúrio");
        subSubTemp.resultados.add("Berkélio");
        subSubTemp.resultados.add("Califórnio");
        subSubTemp.resultados.add("Einsténio");
        subSubTemp.resultados.add("Férmio");
        subSubTemp.resultados.add("Mendelévio");
        subSubTemp.resultados.add("Nobélio");
        subSubTemp.resultados.add("Lawrêncio");
        
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ações.add("");
        subSubTemp.ownDecreto = subTemp.ownDecreto;
        subTemp.subFerramentas.add(subSubTemp);


        temp.subFerramentas.add(subTemp);

        Portal4.AddFerramenta(temp);

        temp = new Ferramenta("Matriz CQM",Portal4,8);
        
        temp.resultados.add("Do Equilíbrio");
        temp.resultados.add("Do Entrelaçamento");
        temp.resultados.add("Da Vibração");
        temp.resultados.add("Da Harmonia");
        temp.resultados.add("Da Sincronicidade");

        temp.ações.add("Quebrar todas as crenças de escassez e evocar o Equilíbrio do Propósito de Vida");
        temp.ações.add("Acessar a todas as memórias holográficas, locais remotos, manifestações espaço-tempo, em todas as dimensões, todos os sistemas e todos os Universos que sejam benéficas para o alinhamento da Consciência");
        temp.ações.add("Construir e fortalecer a Vibração pessoal em harmonia com o Propósito de Vida");
        temp.ações.add("Desprogramar e todos os estados de latência, desordem e caos e evocar a Harmonia em todos os planos de vida");
        temp.ações.add("Sintonizar todos os eventos síncrones registrados no campo morfogenético e manifestar o alinhamento de consciência no Propósito de Vida");

        temp.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) abro a frequência do método de Cura Quântica Multidimensional e a Matriz CQM, evocando todas as egrégorasegrégora e pedindo ao Eu Superior de (nome do consulente) permissão para atuar nos seus campos, chakras e corpos sutis dentro do que é divino ao seu propósito de vida. Ativo agora a frequência do Princípio (princípio) para que (nome do consulente) possa (ação). Que pulsem na harmonia e alinhamento de consciência de (nome do consulente) na condução da melhor tomada de decisão para que manifeste toda a sua divindade no propósito de vida, na quantidade certa e na medida exata. Pulsa no campo, pulsa no campo, pulsa no campo.";

        Portal4.AddFerramenta(temp);
        
        portais.add(Portal1);
        portais.add(Portal2);
        portais.add(Portal3);
        portais.add(Portal4);
    }
}
