package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.SubFerramenta;

public class Geobiologia extends SubFerramenta{
    public Geobiologia(Ferramenta mainFerramenta){
        super(mainFerramenta, "Geobiologia");

        SubFerramenta intermedFerramenta;
        SubFerramenta intermedSubFerramenta;

        this.resultados.add("Linhas Hartmann");
        this.resultados.add("Linha Curry");
        this.resultados.add("Geopatia Geográfica");
        this.resultados.add("Geopatia Sutil");
        this.resultados.add("Geopatia Anatómica");

        intermedFerramenta=new SubFerramenta(mainFerramenta, "Linhas Hartmann");
        intermedFerramenta.type = 1;
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta=new SubFerramenta(mainFerramenta, "Linha Curry");
        intermedFerramenta.type = 1;
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta=new SubFerramenta(mainFerramenta, "Geopatia Geográfica");
        intermedFerramenta.resultados.add("C.E.M.");
        intermedFerramenta.resultados.add("C.E.M.");
        intermedFerramenta.resultados.add("Aparelhos Domésticos");
        intermedFerramenta.resultados.add("Aparelhos Domésticos");
        intermedFerramenta.resultados.add("Aparelhos Domésticos");
        intermedFerramenta.resultados.add("Aparelhos Domésticos");
        intermedFerramenta.resultados.add("Ondas de Forma");
        intermedFerramenta.resultados.add("Ondas de Forma");
        intermedFerramenta.resultados.add("Ondas de Forma");
        intermedFerramenta.resultados.add("Abstratas");
        intermedFerramenta.resultados.add("Abstratas");
        intermedFerramenta.resultados.add("Abstratas");
        intermedFerramenta.resultados.add("Má Localização");
        intermedFerramenta.resultados.add("Má Localização");
        intermedFerramenta.resultados.add("Construção");
        intermedFerramenta.resultados.add("Construção");
        intermedFerramenta.resultados.add("Construção");
        intermedFerramenta.resultados.add("Construção");
        intermedFerramenta.resultados.add("Poluição Ar");
        intermedFerramenta.resultados.add("Poluição Ar");
        intermedFerramenta.resultados.add("Geologia");
        intermedFerramenta.resultados.add("Geologia");

        intermedFerramenta.resultados2.add("Campos EM Internos");
        intermedFerramenta.resultados2.add("Campos EM Externo");
        intermedFerramenta.resultados2.add("Televisor");
        intermedFerramenta.resultados2.add("Roteador Wi-Fi");
        intermedFerramenta.resultados2.add("Microondas");
        intermedFerramenta.resultados2.add("Computador");
        intermedFerramenta.resultados2.add("Objetos");
        intermedFerramenta.resultados2.add("Cores");
        intermedFerramenta.resultados2.add("Construção");
        intermedFerramenta.resultados2.add("Campo Mórfico");
        intermedFerramenta.resultados2.add("Memórias Holográficas");
        intermedFerramenta.resultados2.add("Interferências Externas");
        intermedFerramenta.resultados2.add("Geográfica");
        intermedFerramenta.resultados2.add("Geológica");
        intermedFerramenta.resultados2.add("Ondas de Informação Esgoto");
        intermedFerramenta.resultados2.add("Materiais Tóxicos");
        intermedFerramenta.resultados2.add("Materiais Radioativos");
        intermedFerramenta.resultados2.add("Materiais Não Harmónicos");
        intermedFerramenta.resultados2.add("Interior");
        intermedFerramenta.resultados2.add("Exterior");
        intermedFerramenta.resultados2.add("Lençol Freático");
        intermedFerramenta.resultados2.add("Fratura na Rocha");
        
        intermedFerramenta.ações.add("Ativar a frequência Keiti em todos os cómodos afetados para diminuir o efeito nocivo");
        intermedFerramenta.ações.add("Ativar a frequência Keiti em todos os pontos cardeais para diminuir o efeito nocivo");
        intermedFerramenta.ações.add("Ativar a frequência Keiti na área de influência do aparelho para diminuir o efeito nocivo");
        intermedFerramenta.ações.add("Ativar a frequência Keiti na área de influência do aparelho para diminuir o efeito nocivo");
        intermedFerramenta.ações.add("Ativar a frequência Keiti na área de influência do aparelho para diminuir o efeito nocivo");
        intermedFerramenta.ações.add("Ativar a frequência Keiti na área de influência do aparelho para diminuir o efeito nocivo");
        intermedFerramenta.ações.add("Ativar a frequência do Labirinto de Amiens para transmutar o efeito nocivo da onda de forma");
        intermedFerramenta.ações.add("Ativar a frequência do Labirinto de Amiens para transmutar o efeito nocivo da onda de forma");
        intermedFerramenta.ações.add("Ativar a frequência do Labirinto de Amiens para transmutar o efeito nocivo da onda de forma");
        intermedFerramenta.ações.add("Desinstalar todas as informações nocivas e ativar a ressignificação do sinal anómalo");
        intermedFerramenta.ações.add("Desinstalar todas as informações nocivas e ativar a ressignificação do sinal anómalo");
        intermedFerramenta.ações.add("Ativar o campo de força de proteção do consulente, ativando a requência apométrica CQM da P.E.I.");
        intermedFerramenta.ações.add("Ajustar a georeferência terrestre com os vórtices e portais etéricos para eliminação de forças magnéticas nocivas");
        intermedFerramenta.ações.add("Ajustar a georeferência terrestre com os vórtices e portais etéricos para eliminação de forças telúricas nocivas");
        intermedFerramenta.ações.add("Ativar as frequências das geometrias Exodin, Phtah, Dispersor e Multioscilador para eliminar informações nocivas");
        intermedFerramenta.ações.add("Ativar as frequências das geometrias Exodin, Phtah, Dispersor e Programador Físico para eliminar informações nocivas");
        intermedFerramenta.ações.add("Ativar as frequências das geometrias Exodin, Phtah, Dispersor e Programador Físico para eliminar informações nocivas");
        intermedFerramenta.ações.add("Ativar as frequências das geometrias Exodin, Phtah, Dispersor e Multioscilador para eliminar informações nocivas");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Multioscilador e Programador Físico para que transformem e purifiquem e informação do espaço");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Multioscilador e Programador Físico para que transformem e purifiquem e informação do espaço");
        intermedFerramenta.ações.add("Ajustar a georeferência terrestre com os vórtices e portais etéricos para eliminação de forças telúricas nocivas");
        intermedFerramenta.ações.add("Ajustar a georeferência terrestre com os vórtices e portais etéricos para eliminação de forças telúricas nocivas");
        
        intermedFerramenta.ownDecreto = "Ativando o acesso ao Atma de (nome do terapeuta) e a todos os corpos sutis participantes no processo de regeneração ambiental sito em (morada) de (nome do consulente), pedindo permissão para ação corretiva no espaço aqui tratado. Retificando a anomalia mórfica de (tipo geo) com a informação de (geopatias) e abrindo campo de cura para (ação). Pulsa no campo, pulsa no campo, pulsa no campo.";

        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta=new SubFerramenta(mainFerramenta, "Geopatia Sutil");
        intermedFerramenta.resultados.add("Antigo Cemitério");
        intermedFerramenta.resultados.add("Local de Práticas Frequência Densa");
        intermedFerramenta.resultados.add("Interferência Externa Negativa");
        intermedFerramenta.resultados.add("Frequência Densa Direcionada");
        intermedFerramenta.resultados.add("Móveis e/ou Objetos Impregnados");
        intermedFerramenta.resultados.add("Presença de Entidades Negativas");
        intermedFerramenta.resultados.add("Objetos Condicionadores de Vontade");
        intermedFerramenta.resultados.add("Memórias Acrónicas");
        intermedFerramenta.resultados.add("Radiações Etéricas Nocivas");
        intermedFerramenta.resultados.add("Miasmas");
        intermedFerramenta.resultados.add("Vampirizadores Energéticos");
        intermedFerramenta.resultados.add("Energia Sexual Desequilibrada");
        intermedFerramenta.resultados.add("Condicionadores Negativos");
        intermedFerramenta.resultados.add("Inimigos Ocultos");
        intermedFerramenta.resultados.add("Ataques Psíquicos");
        intermedFerramenta.resultados.add("Pactos Energéticos");
        intermedFerramenta.resultados.add("Contratos Energéticos");
        intermedFerramenta.resultados.add("Forma Pensamento Densas");
        intermedFerramenta.resultados.add("Sacrifício Humano/Animal");
        intermedFerramenta.resultados.add("Egrégoras Negativas");
        intermedFerramenta.resultados.add("Ganchos Energéticos");
        
        
        intermedFerramenta.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta");
        intermedFerramenta.ações.add("Transmutar a informação espaço-temporal com a frequência da cor violeta");
        intermedFerramenta.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar a Geometria Exodin de proteção");
        intermedFerramenta.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar a Geometria Exodin de proteção");
        intermedFerramenta.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta");
        intermedFerramenta.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar a Geometria Exodin de proteção, enviando a forma frequencial para zonas de frequência análoga.");
        intermedFerramenta.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta");
        intermedFerramenta.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta e a frequência da cor verde para limpeza e eterização espacial");
        intermedFerramenta.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar a Geometria Exodin de proteção");
        intermedFerramenta.ações.add("Transmutar a informação espaço-temporal com a frequência da cor violeta");
        intermedFerramenta.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar as Geometrias Exodin de proteção e Labirinto de Amiens para sustentação da proteção");
        intermedFerramenta.ações.add("Ativar a frequência do equilíbrio Yin/Yang para promover a cura do espaço. Ativar a frequência da geometria programador físico com a sintonia do equilíbrio da energia");
        intermedFerramenta.ações.add("Transmutar a informação espaço-temporal com a frequência da cor violeta");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar as Geometrias Exodin de proteção e Labirinto de Amiens para sustentação da proteção");
        intermedFerramenta.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta");
        intermedFerramenta.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta");
        intermedFerramenta.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta");
        intermedFerramenta.ações.add("Remover todo o vínculo de informação nocivo e transmutar com a frequência da cor violeta");
        intermedFerramenta.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar as Geometrias Exodin de proteção e Dispersor para afastar as energias nocivas");
        intermedFerramenta.ações.add("Ativar a frequência da geometria Phtah para cortar todo o vínculo de informação nocivo, Dispersor para remover e transmutar com a frequência da cor violeta");
        
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Antigo Cemitério");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Local de Práticas Frequência Densa");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Interferência Externa Negativa");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Frequência Densa Direcionada");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Móveis e/ou Objetos Impregnados");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Presença de Entidades Negativas");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Objetos Condicionadores de Vontade");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Memórias Acrónicas");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Radiações Etéricas Nocivas");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Miasmas");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Vampirizadores Energéticos");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Energia Sexual Desequilibrada");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Condicionadores Negativos");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Inimigos Ocultos");
        intermedSubFerramenta.resultados.add("Físicos");
        intermedSubFerramenta.resultados.add("Etéricos");

        intermedSubFerramenta.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar as Geometrias Exodin de proteção e Dispersor para afastar as energias nocivas");
        intermedSubFerramenta.ações.add("Remover todas as informações de frequências nocivas ao ambiente e ativar as Geometrias Exodin de proteção e Dispersor para afastar as energias nocivas");
        intermedSubFerramenta.ownDecreto = "Ativando o acesso ao Atma de (nome do terapeuta) e a todos os corpos sutis participantes no processo de regeneração ambiental sito em (morada) de (nome do consulente), pedindo permissão para ação corretiva no espaço aqui tratado. Retificando a anomalia mórfica de com a informação de (geopatia) e abrindo campo de cura para (ação). Pulsa no campo, pulsa no campo, pulsa no campo.";
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Ataques Psíquicos");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Pactos Energéticos");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Contratos Energéticos");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Forma Pensamento Densas");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Sacrifício Humano/Animal");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Egrégoras Negativas");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        intermedSubFerramenta = new SubFerramenta(mainFerramenta,"Ganchos Energéticos");
        intermedSubFerramenta.inactive=true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);


        intermedFerramenta.ownDecreto = "Ativando o acesso ao Atma de (nome do terapeuta) e a todos os corpos sutis participantes no processo de regeneração ambiental sito em (morada) de (nome do consulente), pedindo permissão para ação corretiva no espaço aqui tratado. Retificando a anomalia mórfica de com a informação de (geopatia) e abrindo campo de cura para (ação). Pulsa no campo, pulsa no campo, pulsa no campo.";
        
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta=new SubFerramenta(mainFerramenta, "Geopatia Anatómica");
        intermedFerramenta.multi = true;
        intermedFerramenta.resultados.add("Tumor");
        intermedFerramenta.resultados.add("Neoplasia");
        intermedFerramenta.resultados.add("Hipotensão");
        intermedFerramenta.resultados.add("Hipertensão");
        intermedFerramenta.resultados.add("Sepsis");
        intermedFerramenta.resultados.add("Hipoxia");
        intermedFerramenta.resultados.add("Anoxia");
        intermedFerramenta.resultados.add("Necrose");
        intermedFerramenta.resultados.add("Isquemia");
        intermedFerramenta.resultados.add("Inflamação");
        intermedFerramenta.resultados.add("Infecção");
        intermedFerramenta.resultados.add("Trombose");
        intermedFerramenta.resultados.add("Hipoglicémia");
        intermedFerramenta.resultados.add("Hiperglicémia");
        intermedFerramenta.resultados.add("Desequilíbrio Hormonal");
        intermedFerramenta.resultados.add("Hipovolemia");
        intermedFerramenta.resultados.add("Hipofunção");
        intermedFerramenta.resultados.add("Obstrução");
        intermedFerramenta.resultados.add("Cálculos");
        intermedFerramenta.resultados.add("Anemia");
        intermedFerramenta.resultados.add("Degeneração DNA");

        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        intermedFerramenta.ações.add("Ativar as frequências das Geometrias Phtah, Exodin e Labirinto de Amiens para limpeza, reestruturação, equilíbrio e proteção do espaço-tempo e de Programador Físico e Multioscilador para imprimir o estado de equilíbrio de saúde nos envolvidos com a anomalia do campo mórfico.");
        
        intermedFerramenta.repeatString = "(geopatia), ";
        intermedFerramenta.ownDecreto = "Ativando o acesso ao Atma de (nome do terapeuta) e a todos os corpos sutis participantes no processo de regeneração ambiental sito em (morada) de (nome do consulente), pedindo permissão para ação corretiva no espaço aqui tratado. Retificando a anomalia mórfica de com a informação de (next) e abrindo campo de cura para (ação). Pulsa no campo, pulsa no campo, pulsa no campo.";
        
        this.subFerramentas.add(intermedFerramenta);

    }
}
