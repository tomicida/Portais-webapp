package com.portais.Ferramentas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.portais.Portal;

@TestInstance(Lifecycle.PER_CLASS)
public class ArcanosMaioresTest extends TemplateFerramentaTest{
    private ArcanosMaiores ferramenta = new ArcanosMaiores(new Portal("Portal de Relacionamentos",1), 4);

    @BeforeAll
    void AdjustToolName(){
        ferramenta.name = "Ferramenta em Branco (Relacionamentos)";
    }

    @Test
    void onlyOLoucoSelected(){
        //when
        input = new ArrayList<>();
        input.add(0);
        String decree = ferramenta.Decreto(input, cliente);

        //then
        assertEquals("Na divina presença do Eu Sou de <b style=\"color:blue;\">Test Nome Terapeuta</b> peço permissão ao Eu Superior de <b style=\"color:blue;\">Test Nome</b> para limpar a informação anómala nos seus campos frequenciais e imprimir a(s) frequência(s) de cura do(s) Arcano(s) Maior(es) <b style=\"color:blue;\">O Louco</b>,  com a potência das energias que lhe(s) está (estão) associadas. Ativo agora as potências de <b style=\"color:blue;\">Possibilidade</b>,  e processo o seu campo de cura para que desbloqueie o sinal anómalo e promova a força de ação dentro do seu propósito.", decree);

    }
}
