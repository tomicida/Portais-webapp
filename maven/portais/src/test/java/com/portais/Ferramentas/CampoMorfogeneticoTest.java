package com.portais.Ferramentas;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;

import com.portais.Portal;

@TestInstance(Lifecycle.PER_CLASS)
public class CampoMorfogeneticoTest extends TemplateFerramentaTest{
    private CampoMorfogenetico ferramenta = new CampoMorfogenetico(new Portal("Portal de Ambientes", 0), 6);

    @Test
    void campoMórficoPassadoSelected(){
        //when
        int subFerramentaChosen = 0;
        int resultChosen = 0;
        ArrayList<Integer> resultsList = new ArrayList<>();
        resultsList.add(subFerramentaChosen);
        resultsList.add(resultChosen);
        String decree = ferramenta.subFerramentas.get(subFerramentaChosen).Decreto(resultsList, cliente);

        //then
        assertEquals("Eu ativo a Matriz do Campo Mórfico para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Removendo, destruindo e transmutando todas as frequências de má informação da anomalia do <b style=\"color:blue;\">Campo Mórfico; 1 Passado</b> e promovendo <b style=\"color:blue;\"></b> . Fixo agora no <b style=\"color:blue;\">Campo Mórfico</b> a ação de <b style=\"color:blue;\"></b>. Pulsa no campo, pulsa no campo, pulsa no campo.", decree);

    }

    @Test
    void campoMórficoEmocionalSelected(){
        //when
        int subFerramentaChosen = 0;
        int resultChosen = 3;
        ArrayList<Integer> resultsList = new ArrayList<>();
        resultsList.add(subFerramentaChosen);
        resultsList.add(resultChosen);
        String decree = ferramenta.subFerramentas.get(subFerramentaChosen).Decreto(resultsList, cliente);

        //then
        assertEquals("Eu ativo a Matriz do Campo Mórfico para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Removendo, destruindo e transmutando todas as frequências de má informação da anomalia do <b style=\"color:blue;\">Campo Mórfico; 4 Emocional</b> e promovendo <b style=\"color:blue;\">Limpar, reconstruir, equilibrar e harmonizar</b> . Fixo agora no <b style=\"color:blue;\">Campo Mórfico</b> a ação de <b style=\"color:blue;\">Limpar, reconstruir, equilibrar e harmonizar</b>. Pulsa no campo, pulsa no campo, pulsa no campo.", decree);

    }

    @Test
    void campoMorfogenéticoPresenteSelected(){
        //when
        int subFerramentaChosen = 1;
        int resultChosen = 1;
        ArrayList<Integer> resultsList = new ArrayList<>();
        resultsList.add(subFerramentaChosen);
        resultsList.add(resultChosen);
        String decree = ferramenta.subFerramentas.get(subFerramentaChosen).Decreto(resultsList, cliente);

        //then
        assertEquals("Eu ativo a Matriz do Campo Morfogenético para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Removendo, destruindo e transmutando todas as frequências de má informação da anomalia do <b style=\"color:blue;\">Campo Morfogenético; 2 Presente</b> e promovendo <b style=\"color:blue;\"></b> . Fixo agora no <b style=\"color:blue;\">Campo Morfogenético</b> a ação de <b style=\"color:blue;\"></b>. Pulsa no campo, pulsa no campo, pulsa no campo.", decree);

    }

    @Test
    void campoMorfogenéticoEspiritualSelected(){
        //when
        int subFerramentaChosen = 1;
        int resultChosen = 5;
        ArrayList<Integer> resultsList = new ArrayList<>();
        resultsList.add(subFerramentaChosen);
        resultsList.add(resultChosen);
        String decree = ferramenta.subFerramentas.get(subFerramentaChosen).Decreto(resultsList, cliente);

        //then
        assertEquals("Eu ativo a Matriz do Campo Morfogenético para que limpe a informação anomala no ambiente de <b style=\"color:blue;\">Test Nome</b> e todos os seus registros no campo morfogenético e mórfico. Removendo, destruindo e transmutando todas as frequências de má informação da anomalia do <b style=\"color:blue;\">Campo Morfogenético; 6 Espiritual</b> e promovendo <b style=\"color:blue;\">Abrir a expansão de consciência</b> . Fixo agora no <b style=\"color:blue;\">Campo Morfogenético</b> a ação de <b style=\"color:blue;\">Abrir a expansão de consciência</b>. Pulsa no campo, pulsa no campo, pulsa no campo.", decree);

    }
}
