package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;
import com.portais.SubFerramenta;

public class ChakrasECorposSutis extends Ferramenta{
    public ChakrasECorposSutis(Portal portal,int id){
        super("Chakras e Corpos Sutis", portal, id);

        SubFerramenta intermedFerramenta;
        SubFerramenta intermedSubFerramenta;

        this.type = 2;
        
        this.resultados.add("Chakra");
        this.resultados.add("Corpo Sutil");

        intermedFerramenta = new SubFerramenta(this, "Chakra");
        intermedFerramenta.resultados.add("Básico");
        intermedFerramenta.resultados.add("Umbilical");
        intermedFerramenta.resultados.add("Solar");
        intermedFerramenta.resultados.add("Cardíaco");
        intermedFerramenta.resultados.add("Laríngeo");
        intermedFerramenta.resultados.add("Frontal");
        intermedFerramenta.resultados.add("Coronário");

        intermedSubFerramenta = new SubFerramenta(this, "Básico");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        
        intermedSubFerramenta.ações.add("Ativar a segurança e a materialização");
        intermedSubFerramenta.ações.add("Equilibrar o funcionamento das glândulas supra-renais");
        intermedSubFerramenta.ações.add("Desativar a sensação de que não pertence ao lugar, não sabe onde pertence de solidão, insegurança, abandono, desconexão, não merece existir,");
        intermedSubFerramenta.ações.add("Desinstalar a informação de desconfiança, incredulidade, consciência pobre, possessibilidade e avareza. Quebrar o vínculo constante ao passado, se sentindo, vítima, desconfortável com o corpo, agitado");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Umbilical");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        
        intermedSubFerramenta.ações.add("Ativar a criatividade e o prazer");
        intermedSubFerramenta.ações.add("Equilibrar o funcionamento das gónadas, ovários, testículos e próstata");
        intermedSubFerramenta.ações.add("Desativar ansiedade, vergonha, abandono e raiva tristeza, dualidade desequilibrada, frustração, confusão");
        intermedSubFerramenta.ações.add("Desinstalar a informação de procrastinação na decisão, ciume, racionalidade excessiva, ilusões grandiosas, corpo rígido, medo de comunicar, compulsão sexual.");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Solar");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        
        intermedSubFerramenta.ações.add("Ativar o poder social e as relações interpessoais");
        intermedSubFerramenta.ações.add("Equilibrar o funcionamento do pâncreas");
        intermedSubFerramenta.ações.add("Desativar Irresponsabilidade social, isolamento, egoísmo, fraqueza de caráter, agitação, raiva, desejo de poder e de ser o melhor sem escrúpulos");
        intermedSubFerramenta.ações.add("Desinstalar a informação de sentimento de superioridade e reatividade, stress, compulsividade, indisciplina, sentimento de vítima, salvador ou algoz.");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Cardíaco");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        
        intermedSubFerramenta.ações.add("Ativar a coerência e o amor");
        intermedSubFerramenta.ações.add("Equilibrar a glândula do timo");
        intermedSubFerramenta.ações.add("Desativar a alienação e apego, masoquismo e dependência, tristeza e solidão, amedrontamento e sentimento depressivo.");
        intermedSubFerramenta.ações.add("Desinstalar a informação de não confiar em ninguém, fanatismo compulsivo e a postura corporal ruim");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Laríngeo");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        
        intermedSubFerramenta.ações.add("Ativar a comunicação, a vontade e o conhecimento");
        intermedSubFerramenta.ações.add("Equilibrar o funcionamento da tiroide e paratiróide");
        intermedSubFerramenta.ações.add("Desativar orgulho e medo, não conseguir dizer a verdade, medo de comunicar, mania de superioridade, stress, incapacidade de relaxar, hiperatividade, dissimulação, hesitação em interações");
        intermedSubFerramenta.ações.add("Desinstalar a informação de ser dono de um conhecimento e consciência usados só em proveito próprio, usar de esperteza para tirar proveito, hedonismo, tentar se mostrar envolvido apenas teoricamente.");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Frontal");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        
        intermedSubFerramenta.ações.add("Ativar a inspiração, a intuição e a visão interior");
        intermedSubFerramenta.ações.add("Equilibrar o funcionamento da glândula pituitária");
        intermedSubFerramenta.ações.add("Desativar peso na mente racional, confusão e frieza, paranóia, cisma e preocupação, necessidade de ver para crer, questionamento e negação da realidade subjetiva");
        intermedSubFerramenta.ações.add("Desinstalar a informação não presente no corpo físico, pseudo intelectual, exacerbação de conceitos materiais, comportamento manipulativo e calculista.");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Coronário");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        
        intermedSubFerramenta.ações.add("Ativar a percepção etérica, a transcendência e a cura espiritual");
        intermedSubFerramenta.ações.add("Equilibrar o funcionamento da glândula pineal");
        intermedSubFerramenta.ações.add("Desativar dúvida, depressão, apatia com o mundo e pessoas, negação da existência de vibrações superiores, dificuldade de aprender e conhecer além do racional de referência");
        intermedSubFerramenta.ações.add("Desinstalar a informação de necessidade de controlar tudo, dominar, de ser endoutrinável, uma vez que teme o desconhecido e a negação da sua personalidade.");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "Corpo Sutil");
        
        intermedFerramenta.resultados.add("Físico");
        intermedFerramenta.resultados.add("Etérico");
        intermedFerramenta.resultados.add("Emocional");
        intermedFerramenta.resultados.add("Mental Inferior");
        intermedFerramenta.resultados.add("Mental Superior");
        intermedFerramenta.resultados.add("Búdico");
        intermedFerramenta.resultados.add("Átmico");

        intermedSubFerramenta = new SubFerramenta(this, "Físico");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        
        intermedSubFerramenta.ações.add("Desativar as crenças e padrões que levam à rejeição do corpo físico");
        intermedSubFerramenta.ações.add("Desinstalar memórias holográficas akáshicas de desestruturação de DNA");
        intermedSubFerramenta.ações.add("Ativar a recetividade de fluído cósmico em benefício de todas as células do corpo físico. Programar a memória da água presente no corpo físico para a ativação da frequência de 528Hz");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Etérico");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        
        intermedSubFerramenta.ações.add("Desativar crenças e padrões de não empoderamento do campo de proteção pessoal");
        intermedSubFerramenta.ações.add("Transmutar todas as formas energia de frequências densas e enviá-las em benefício do campo morfogenético do hospedeiro");
        intermedSubFerramenta.ações.add("Desinstalar todas as formas pensamento, cismas e implantações energéticas densas que degeneram o corpo etérico. Ativar a frequência de cura de 741Hz para limpeza e regeneração do corpo etérico");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Emocional");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        
        intermedSubFerramenta.ações.add("Desativar crenças e padrões akáshicos e/ou geracionais emocionais que transportam a informação de culpa");
        intermedSubFerramenta.ações.add("Desinstalar todo o sentimento não divino e não coerente com a manifestação da Divindade Interna");
        intermedSubFerramenta.ações.add("Ativar o empoderamento das emoções positivas abrindo a amplitude de frequência dos 200 aos 700Hz, agora.");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);
        

        intermedSubFerramenta = new SubFerramenta(this, "Mental Inferior");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        
        intermedSubFerramenta.ações.add("Desativar crenças e padrões limitantes das ideias concretas e das ideias fundamentadas");
        intermedSubFerramenta.ações.add("Desinstalar bloqueios a informação e ideias novas");
        intermedSubFerramenta.ações.add("Ativar a consolidação da afirmação positiva consciente para benefício da tomada de decisão");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Mental Superior");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        
        intermedSubFerramenta.ações.add("Desativar crenças e padrões presentes no campo akáshico que bloqueiam a criatividade");
        intermedSubFerramenta.ações.add("Desinstalar bloqueios a informação abstrata e a conceitos não construídos pelo seu campo de referências");
        intermedSubFerramenta.ações.add("Ativar a frequência de onda Theta de 4 a 7 Hz por segundo abrindo o mental superior à sintetização das ideias abstratas não referenciais, ancorando o estado de vigília durante o processo");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Búdico");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        
        intermedSubFerramenta.ações.add("Desativar crenças e padrões de vidas passadas que bloqueiam a tomada de decisão");
        intermedSubFerramenta.ações.add("Desinstalar memórias holográficas degenerativas que desiquilibram os corpos mentais, emocional, etérico e físico");
        intermedSubFerramenta.ações.add("Ativar o empoderamento ancorado na experiência passada, transmutando as experiências reconhecidas como negativas e instalando-as como instrumento de evolução");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Átmico");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        intermedSubFerramenta.resultados.add("");
        
        intermedSubFerramenta.ações.add("Ativar o empoderamento do reconhecimento da Divindade Interior");
        intermedSubFerramenta.ações.add("Ativar a clareza mental, emocional e espiritual perante a anomalia");
        intermedSubFerramenta.ações.add("Ativar a frequência de 1000Hz para o impulso definitivo do conhecimento de si mesmo e do campo que o circunda");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        this.subFerramentas.add(intermedFerramenta);

        this.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) peço permissão ao Eu Superior de (nome do consulente) para aceder ao seu campo morfogenético, abrindo o (resultado) (designação) para (ação) e crie impacto na estrutura do DNA, reestruturando e renovando o funcionamento do corpo físico na medida certa e na quantidade exata, dentro do que é divino. Eu sou a ativar agora o equilíbrio de (resultado) (designação) e promovo o alinhamento de todos os chakras e todos os corpos sutis. Pulsa, pulsa, pulsa no campo.";

    }
}
