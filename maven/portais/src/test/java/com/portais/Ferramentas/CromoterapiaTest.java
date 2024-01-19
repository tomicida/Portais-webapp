package com.portais.Ferramentas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.portais.Portal;

@TestInstance(Lifecycle.PER_CLASS)
public class CromoterapiaTest extends TemplateFerramentaTest{

    private Cromoterapia ferramenta = new Cromoterapia(new Portal("Portal de Ambientes",0), 0);

    @Test
    void onlyBrancoSelected() {
        //when
        input = new ArrayList<>();
        input.add(0);
        String decree = ferramenta.Decreto(input, cliente);

        //then
        assertEquals("Eu ativo a Matriz de Cromoterapia para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela frequência da cor <b style=\"color:blue;\">Branco</b>, promovendo <b style=\"color:blue;\">Potenciamento de todas as cores e a elevação de frequência ao máximo do campo mórfico</b>,  na quantidade certa e na medida exata, reconstruindo e fortalecendo, reconstruindo e fortalecendo, reconstruindo e fortalecendo o campo anómalo, assim como a consciência de mudança de <b style=\"color:blue;\">Test Nome</b>.", decree);

    }

    @Test
    void onlyVerdeSelected() {
        //when
        input = new ArrayList<>();
        input.add(1);
        String decree = ferramenta.Decreto(input, cliente);

        //then
        assertEquals("Eu ativo a Matriz de Cromoterapia para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela frequência da cor <b style=\"color:blue;\">Verde</b>, promovendo <b style=\"color:blue;\">A energia da natureza, na força equilibrada dos sentidos no ambiente. Baixo no ambiente a frequência da esperança, da satisfação e da saúde</b>,  na quantidade certa e na medida exata, reconstruindo e fortalecendo, reconstruindo e fortalecendo, reconstruindo e fortalecendo o campo anómalo, assim como a consciência de mudança de <b style=\"color:blue;\">Test Nome</b>.", decree);

    }

    @Test
    void onlyVioletaSelected() {
        //when
        input = new ArrayList<>();
        input.add(2);
        String decree = ferramenta.Decreto(input, cliente);

        //then
        assertEquals("Eu ativo a Matriz de Cromoterapia para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela frequência da cor <b style=\"color:blue;\">Violeta</b>, promovendo <b style=\"color:blue;\">A purificação, transformando e transmutando todas as energias negativas em positivas no campo mórfico</b>,  na quantidade certa e na medida exata, reconstruindo e fortalecendo, reconstruindo e fortalecendo, reconstruindo e fortalecendo o campo anómalo, assim como a consciência de mudança de <b style=\"color:blue;\">Test Nome</b>.", decree);

    }

    @Test
    void onlyLaranjaSelected() {
        //when
        input = new ArrayList<>();
        input.add(3);
        String decree = ferramenta.Decreto(input, cliente);

        //then
        assertEquals("Eu ativo a Matriz de Cromoterapia para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela frequência da cor <b style=\"color:blue;\">Laranja</b>, promovendo <b style=\"color:blue;\">O auxílio da mente a assimilar novas ideias, estimular os sentidos, a criatividade e a comunicação no campo mórfico</b>,  na quantidade certa e na medida exata, reconstruindo e fortalecendo, reconstruindo e fortalecendo, reconstruindo e fortalecendo o campo anómalo, assim como a consciência de mudança de <b style=\"color:blue;\">Test Nome</b>.", decree);

    }

    @Test
    void onlyVermelhoSelected() {
        //when
        input = new ArrayList<>();
        input.add(4);
        String decree = ferramenta.Decreto(input, cliente);

        //then
        assertEquals("Eu ativo a Matriz de Cromoterapia para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela frequência da cor <b style=\"color:blue;\">Vermelho</b>, promovendo <b style=\"color:blue;\">Activação e estimulação das relações interpessoais, com energia sexual de ação e a criatividade e estimulando o apetite e a fala direta</b>,  na quantidade certa e na medida exata, reconstruindo e fortalecendo, reconstruindo e fortalecendo, reconstruindo e fortalecendo o campo anómalo, assim como a consciência de mudança de <b style=\"color:blue;\">Test Nome</b>.", decree);

    }

    @Test
    void onlyAzulSelected() {
        //when
        input = new ArrayList<>();
        input.add(5);
        String decree = ferramenta.Decreto(input, cliente);

        //then
        assertEquals("Eu ativo a Matriz de Cromoterapia para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela frequência da cor <b style=\"color:blue;\">Azul</b>, promovendo <b style=\"color:blue;\">Transmissão de calma e serenidade e acionando o seu poder asséptico. Ativando tranquilidade aos ambientes</b>,  na quantidade certa e na medida exata, reconstruindo e fortalecendo, reconstruindo e fortalecendo, reconstruindo e fortalecendo o campo anómalo, assim como a consciência de mudança de <b style=\"color:blue;\">Test Nome</b>.", decree);

    }

    @Test
    void onlyAmareloSelected() {
        //when
        input = new ArrayList<>();
        input.add(6);
        String decree = ferramenta.Decreto(input, cliente);

        //then
        assertEquals("Eu ativo a Matriz de Cromoterapia para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela frequência da cor <b style=\"color:blue;\">Amarelo</b>, promovendo <b style=\"color:blue;\">A ativação da mente, os pensamentos, o ânimo, inspiração e estimulação do raciocínio no auto-controle</b>,  na quantidade certa e na medida exata, reconstruindo e fortalecendo, reconstruindo e fortalecendo, reconstruindo e fortalecendo o campo anómalo, assim como a consciência de mudança de <b style=\"color:blue;\">Test Nome</b>.", decree);

    }

    @Test
    void onlyIndigoSelected() {
        //when
        input = new ArrayList<>();
        input.add(7);
        String decree = ferramenta.Decreto(input, cliente);

        //then
        assertEquals("Eu ativo a Matriz de Cromoterapia para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela frequência da cor <b style=\"color:blue;\">Indigo</b>, promovendo <b style=\"color:blue;\">Auxílio em todos os casos em que as tensões e restrições do meio produzem estado de má saúde física, emocional ou mental</b>,  na quantidade certa e na medida exata, reconstruindo e fortalecendo, reconstruindo e fortalecendo, reconstruindo e fortalecendo o campo anómalo, assim como a consciência de mudança de <b style=\"color:blue;\">Test Nome</b>.", decree);

    }

    @Test
    void BrancoAndVerdeSelected() {
        //when
        input = new ArrayList<>();
        input.add(0);
        input.add(1);
        String decree = ferramenta.Decreto(input, cliente);

        //then
        assertEquals("Eu ativo a Matriz de Cromoterapia para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela frequência da cor <b style=\"color:blue;\">Branco</b>, promovendo <b style=\"color:blue;\">Potenciamento de todas as cores e a elevação de frequência ao máximo do campo mórfico</b>, <b style=\"color:blue;\">Verde</b>, promovendo <b style=\"color:blue;\">A energia da natureza, na força equilibrada dos sentidos no ambiente. Baixo no ambiente a frequência da esperança, da satisfação e da saúde</b>,  na quantidade certa e na medida exata, reconstruindo e fortalecendo, reconstruindo e fortalecendo, reconstruindo e fortalecendo o campo anómalo, assim como a consciência de mudança de <b style=\"color:blue;\">Test Nome</b>.", decree);

    }

    @Test
    void BrancoBrancoAndVerdeSelected() {
        //when
        input = new ArrayList<>();
        input.add(0);
        input.add(0);
        input.add(1);
        String decree = ferramenta.Decreto(input, cliente);

        //then
        assertEquals("Eu ativo a Matriz de Cromoterapia para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela frequência da cor <b style=\"color:blue;\">Branco</b>, promovendo <b style=\"color:blue;\">Potenciamento de todas as cores e a elevação de frequência ao máximo do campo mórfico</b>, <b style=\"color:blue;\">Branco</b>, promovendo <b style=\"color:blue;\">Potenciamento de todas as cores e a elevação de frequência ao máximo do campo mórfico</b>, <b style=\"color:blue;\">Verde</b>, promovendo <b style=\"color:blue;\">A energia da natureza, na força equilibrada dos sentidos no ambiente. Baixo no ambiente a frequência da esperança, da satisfação e da saúde</b>,  na quantidade certa e na medida exata, reconstruindo e fortalecendo, reconstruindo e fortalecendo, reconstruindo e fortalecendo o campo anómalo, assim como a consciência de mudança de <b style=\"color:blue;\">Test Nome</b>.", decree);

    }

    @Test 
    void AllOptionsSelectedOnceAscending(){
        //when
        input = new ArrayList<>();
        input.add(0);
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        input.add(6);
        input.add(7);
        String decree = ferramenta.Decreto(input, cliente);

        //then
        assertEquals("Eu ativo a Matriz de Cromoterapia para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Ativando, limpando e fortalecendo, limpando e fortalecendo, limpando e fortalecendo. Baixo a intensidade contrária à anomalia para que se restabeleça o equilíbrio, representada pela frequência da cor <b style=\"color:blue;\">Branco</b>, promovendo <b style=\"color:blue;\">Potenciamento de todas as cores e a elevação de frequência ao máximo do campo mórfico</b>, <b style=\"color:blue;\">Verde</b>, promovendo <b style=\"color:blue;\">A energia da natureza, na força equilibrada dos sentidos no ambiente. Baixo no ambiente a frequência da esperança, da satisfação e da saúde</b>, <b style=\"color:blue;\">Violeta</b>, promovendo <b style=\"color:blue;\">A purificação, transformando e transmutando todas as energias negativas em positivas no campo mórfico</b>, <b style=\"color:blue;\">Laranja</b>, promovendo <b style=\"color:blue;\">O auxílio da mente a assimilar novas ideias, estimular os sentidos, a criatividade e a comunicação no campo mórfico</b>, <b style=\"color:blue;\">Vermelho</b>, promovendo <b style=\"color:blue;\">Activação e estimulação das relações interpessoais, com energia sexual de ação e a criatividade e estimulando o apetite e a fala direta</b>, <b style=\"color:blue;\">Azul</b>, promovendo <b style=\"color:blue;\">Transmissão de calma e serenidade e acionando o seu poder asséptico. Ativando tranquilidade aos ambientes</b>, <b style=\"color:blue;\">Amarelo</b>, promovendo <b style=\"color:blue;\">A ativação da mente, os pensamentos, o ânimo, inspiração e estimulação do raciocínio no auto-controle</b>, <b style=\"color:blue;\">Indigo</b>, promovendo <b style=\"color:blue;\">Auxílio em todos os casos em que as tensões e restrições do meio produzem estado de má saúde física, emocional ou mental</b>,  na quantidade certa e na medida exata, reconstruindo e fortalecendo, reconstruindo e fortalecendo, reconstruindo e fortalecendo o campo anómalo, assim como a consciência de mudança de <b style=\"color:blue;\">Test Nome</b>.", decree);

    }

}
