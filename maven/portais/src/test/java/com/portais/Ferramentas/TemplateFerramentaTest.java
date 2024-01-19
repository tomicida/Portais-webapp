package com.portais.Ferramentas;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeAll;

import com.portais.Cliente;

public class TemplateFerramentaTest {
    Cliente cliente = new Cliente();
    ArrayList<Integer> input;

    @BeforeAll
    void PrepareCliente(){
        //given
        cliente.setNome("Test Nome");
        cliente.setNomeEspaço("Test Nome Espaço");
        cliente.setMorada("Test Morada");
        cliente.setNomeTerapeuta("Test Nome Terapeuta");
    }
}
