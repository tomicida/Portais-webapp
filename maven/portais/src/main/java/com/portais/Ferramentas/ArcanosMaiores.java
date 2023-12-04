package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;

public class ArcanosMaiores extends Ferramenta{
    public ArcanosMaiores(Portal portal, int id){
        super("Arcanos Maiores", portal, id);
        this.offset = 0;
        this.multi = true;
        this.resultados.add("O Louco");
        this.resultados.add("O Mago");
        this.resultados.add("A Sacerdotisa");
        this.resultados.add("A Imperatriz");
        this.resultados.add("O Imperador");
        this.resultados.add("O Papa");
        this.resultados.add("Os Enamorados");
        this.resultados.add("O Carro");
        this.resultados.add("A Justiça");
        this.resultados.add("O Ermita");
        this.resultados.add("A Roda da Fortuna");
        this.resultados.add("A Força");
        this.resultados.add("O Enforcado");
        this.resultados.add("A Morte");
        this.resultados.add("A Temperança");
        this.resultados.add("O Diabo");
        this.resultados.add("A Torre");
        this.resultados.add("A Estrela");
        this.resultados.add("A Lua");
        this.resultados.add("O Sol");
        this.resultados.add("O Julgamento");
        this.resultados.add("O Mundo");


        //ativação
        this.ações.add("Possibilidade");
        this.ações.add("Vontade");
        this.ações.add("Instinto");
        this.ações.add("Criação");
        this.ações.add("Ambição");
        this.ações.add("Padrão Positivo");
        this.ações.add("Conexão");
        this.ações.add("Movimento");
        this.ações.add("Equilíbrio");
        this.ações.add("Isolamento");
        this.ações.add("Propósito");
        this.ações.add("Resistência");
        this.ações.add("Resgate");
        this.ações.add("Metamorfose");
        this.ações.add("Moderação");
        this.ações.add("Servidão");
        this.ações.add("Ruptura");
        this.ações.add("Esperança");
        this.ações.add("Ilusão");
        this.ações.add("Sucesso");
        this.ações.add("Despertar");
        this.ações.add("Plenitude");

        //significado
        this.resultados2.add("Loucura, disparate, extravagância, mente ativa");
        this.resultados2.add("Habilidade, força de vontade, auto-confiança, dualidade");
        this.resultados2.add("Ciência, educação, conhecimento, fertilidade");
        this.resultados2.add("Abundância, criatividade, ação");
        this.resultados2.add("Poder, autoridade, racionalidade, nutrir, adaptação, ordem");
        this.resultados2.add("Empoderamento, Sabedoria");
        this.resultados2.add("Um teste que vai passar com sucesso, um (novo) amor, uma (nova) parceria, adaptação");
        this.resultados2.add("Triunfo, algo em andamento , ousar, calar, saber, querer");
        this.resultados2.add("Equilíbrio, equilíbrio no propósito, sucesso com questões jurídicas ou palingénicas");
        this.resultados2.add("Isolamento introspetivo, avanço iluminativo");
        this.resultados2.add("Bom fluxo, evento palingênico, sucesso");
        this.resultados2.add("Poder de propósito, impulso positivo, dharma");
        this.resultados2.add("Sabedoria através do auto-conhecimento, período de estagnação para desenvolvimento pessoal");
        this.resultados2.add("Evolução, mudança, transformação, fim de ciclo");
        this.resultados2.add("Moderação, intuição, apelo ao Eu Superior");
        this.resultados2.add("Proximidade de evento de mudança no propósito, questões internas promovem desenvolvimento");
        this.resultados2.add("Necessidade de defesa e de proteção, necessidade de se posicionar empoderado");
        this.resultados2.add("Nascimento, renascimento, esperança, futuro brilhante");
        this.resultados2.add("Magia, estudo dos mistérios, fase de vida");
        this.resultados2.add("Felicidade, alegria, sucesso integral");
        this.resultados2.add("Renovações, questões palingénicas, metamorfoses");
        this.resultados2.add("O todo, sucesso garantido, plenitude");
        //significado reverso
        this.resultados2.add("Hesitação, problemas por ignorar a loucura, confusão mental, descuido");
        this.resultados2.add("Uso errado dos talentos, presunção, falta de habilidades");
        this.resultados2.add("Ignorância, falta de conhecimento, passividade, infertilidade");
        this.resultados2.add("Procrastinação, vacilo, perda de poder");
        this.resultados2.add("Emoções imaturas, obstrução a planos, falta de empoderamento, falta de autoridade, anarquia");
        this.resultados2.add("Gentileza excessiva, fraqueza");
        this.resultados2.add("Um teste falhado, um amor ou parceria perdidos, inadaptação");
        this.resultados2.add("Derrota, obstáculo a chegarem rapidamente");
        this.resultados2.add("Desequilíbrio, intolerância, preconceito, fanatismo");
        this.resultados2.add("Medo, isolamento depressivo, atos imprudentes");
        this.resultados2.add("Mau fluxo, doença somatizada, bloqueio");
        this.resultados2.add("Poder Físico, impulso negativo, karma");
        this.resultados2.add("Dependência, tentativa de se enturmar, procrastinação");
        this.resultados2.add("Estagnação, morte, doença, chamada de atenção para evento negativo");
        this.resultados2.add("Confronto de interesses, falta de moderação");
        this.resultados2.add("Proximidade de evento traumático, questões internas promovem bloqueios");
        this.resultados2.add("Dificuldades, bloqueios, crenças limitantes, ruína, catástrofe");
        this.resultados2.add("Expetativa, desapontamento, esterilidade");
        this.resultados2.add("Decepção, inimigos escondidos, influências externas negativas");
        this.resultados2.add("Fluxo normal, sucesso parcial (pode fazer melhor)");
        this.resultados2.add("Contratempos, recuos, atrasos");
        this.resultados2.add("Falência, inércia, compensações envenenadas");


        //chakra associado
        this.funções.add("Coronário");
        this.funções.add("Laríngeo");
        this.funções.add("Frontal");
        this.funções.add("Cardíaco e Sexual");
        this.funções.add("Raiz");
        this.funções.add("Laríngeo");
        this.funções.add("Cardíaco");
        this.funções.add("Laríngeo");
        this.funções.add("Cardíaco");
        this.funções.add("Frontal");
        this.funções.add("Solar");
        this.funções.add("Solar");
        this.funções.add("Frontal");
        this.funções.add("Cardíaco");
        this.funções.add("Solar, Frontal, Coronário");
        this.funções.add("Raiz");
        this.funções.add("Coronário");
        this.funções.add("Coronário");
        this.funções.add("Frontal, Coronário");
        this.funções.add("Solar");
        this.funções.add("Coronário");
        this.funções.add("Raiz");

        this.repeatString = "(designar qual ou quais por ordem de saída), ";
        this.repeatString2 = "(todas as ativações que saírem por ordem), ";
        this.Decreto = "Na divina presença do Eu Sou de (nome do terapeuta) peço permissão ao Eu Superior de (nome do consulente) para limpar a informação anómala nos seus campos frequenciais e imprimir a(s) frequência(s) de cura do(s) Arcano(s) Maior(es) (next) com a potência das energias que lhe(s) está (estão) associadas. Ativo agora as potências de (next2) e processo o seu campo de cura para que desbloqueie o sinal anómalo e promova a força de ação dentro do seu propósito.";
        
    }
}
