package com.portais.Ferramentas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.portais.Portal;

@TestInstance(Lifecycle.PER_CLASS)
public class AromaterapiaTest extends TemplateFerramentaTest{
    private Aromaterapia ferramenta = new Aromaterapia(new Portal("Portal de Ambientes",0), 10);

    @Test
    void onlyManjericãoSelected(){
        //when
        input = new ArrayList<>();
        input.add(0);
        String decree = ferramenta.Decreto(input, cliente);

        //then
        assertEquals("Eu ativo a Matriz de Aromaterapia para que reconstrua a informação no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Ativando a reconstrução do ambiente e regeneração da informação de equilíbrio. Ativo o óleo essencial <b style=\"color:blue;\">Manjericão</b>, enviando para o campo a frequência de <b style=\"color:blue;\">52 MHz</b> para <b style=\"color:blue;\">Higienizar o ambiente</b>,  reconstruindo e harmonizando o campo anómalo, assim como a consciência de mudança de <b style=\"color:blue;\">Test Nome</b>. Ativado agora. Pulsa no campo, pulsa no campo, pulsa no campo.", decree);

    }
}
