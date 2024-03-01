package com.portais.Ferramentas;

import com.portais.Portal;
import com.portais.SubFerramenta;
import com.portais.Ferramenta;

public class CampoMorfogenético extends Ferramenta{
    public CampoMorfogenético (Portal portal, int id){
        super("Campo Morfogenético", portal, id);
        
        SubFerramenta intermedFerramenta;
        SubFerramenta intermedSubFerramenta;
        

        this.type = 2;

        this.resultados.add("Campo Mórfico");
        this.resultados.add("Campo Morfogenético");

        intermedFerramenta = new SubFerramenta(this,"Campo Mórfico");
        intermedFerramenta.ownDecreto="Eu ativo a Matriz do Campo Mórfico para que limpe a informação anomala no ambiente de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Removendo, destruindo e transmutando todas as frequências de má informação da anomalia do (campo, número, ligação) e promovendo (ação) . Fixo agora no (resultado) a ação de (ação). Pulsa no campo, pulsa no campo, pulsa no campo.";
        intermedFerramenta.resultados.add("Passado");
        intermedFerramenta.resultados.add("Presente");
        intermedFerramenta.resultados.add("Futuro");
        intermedFerramenta.resultados.add("Emocional");
        intermedFerramenta.resultados.add("Mental");
        intermedFerramenta.resultados.add("Espiritual");

        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("Limpar, reconstruir, equilibrar e harmonizar");
        intermedFerramenta.ações.add("Limpar, reconstruir, equilibrar e harmonizar");
        intermedFerramenta.ações.add("Abrir a expansão de consciência");
        intermedSubFerramenta = new SubFerramenta(this,"Passado");
        intermedSubFerramenta.ownDecreto = intermedFerramenta.ownDecreto;
        intermedSubFerramenta.resultados.add("Social");
        intermedSubFerramenta.resultados.add("Familiar");
        intermedSubFerramenta.resultados.add("Conjugal");
        intermedSubFerramenta.resultados.add("Profissional");
        intermedSubFerramenta.ações.add("Limpar e harmonizar");
        intermedSubFerramenta.ações.add("Reconciliar e Harmonizar");
        intermedSubFerramenta.ações.add("Equilibrar e Harmonizar");
        intermedSubFerramenta.ações.add("Limpar e Harmonizar");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this,"Presente");
        intermedSubFerramenta.ownDecreto = intermedFerramenta.ownDecreto;
        intermedSubFerramenta.resultados.add("Social");
        intermedSubFerramenta.resultados.add("Familiar");
        intermedSubFerramenta.resultados.add("Conjugal");
        intermedSubFerramenta.resultados.add("Profissional");
        intermedSubFerramenta.ações.add("Limpar e harmonizar");
        intermedSubFerramenta.ações.add("Reconciliar e Harmonizar");
        intermedSubFerramenta.ações.add("Equilibrar e Harmonizar");
        intermedSubFerramenta.ações.add("Limpar e Harmonizar");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this,"Futuro");
        intermedSubFerramenta.ownDecreto = intermedFerramenta.ownDecreto;
        intermedSubFerramenta.resultados.add("Social");
        intermedSubFerramenta.resultados.add("Familiar");
        intermedSubFerramenta.resultados.add("Conjugal");
        intermedSubFerramenta.resultados.add("Profissional");
        intermedSubFerramenta.ações.add("Intuir e Congregar");
        intermedSubFerramenta.ações.add("Congregar e Clarificar");
        intermedSubFerramenta.ações.add("Clarificar e Harmonizar");
        intermedSubFerramenta.ações.add("Clarificar e Harmonizar");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Emocional");
        intermedSubFerramenta.ownDecreto = intermedFerramenta.ownDecreto;
        intermedSubFerramenta.inactive = true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Mental");
        intermedSubFerramenta.ownDecreto = intermedFerramenta.ownDecreto;
        intermedSubFerramenta.inactive = true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Espiritual");
        intermedSubFerramenta.ownDecreto = intermedFerramenta.ownDecreto;
        intermedSubFerramenta.inactive = true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this,"Campo Morfogenético");
        intermedFerramenta.ownDecreto="Eu ativo a Matriz do Campo Morfogenético para que limpe a informação anomala no ambiente de (nome do consulente) e todos os seus registros no campo morfogenético e mórfico. Removendo, destruindo e transmutando todas as frequências de má informação da anomalia do (campo, número, ligação) e promovendo (ação) . Fixo agora no (resultado) a ação de (ação). Pulsa no campo, pulsa no campo, pulsa no campo.";
        intermedFerramenta.resultados.add("Passado");
        intermedFerramenta.resultados.add("Presente");
        intermedFerramenta.resultados.add("Futuro");
        intermedFerramenta.resultados.add("Emocional");
        intermedFerramenta.resultados.add("Mental");
        intermedFerramenta.resultados.add("Espiritual");

        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("Limpar, reconstruir, equilibrar e harmonizar");
        intermedFerramenta.ações.add("Limpar, reconstruir, equilibrar e harmonizar");
        intermedFerramenta.ações.add("Abrir a expansão de consciência");
        intermedSubFerramenta = new SubFerramenta(this,"Passado");
        intermedSubFerramenta.ownDecreto = intermedFerramenta.ownDecreto;
        intermedSubFerramenta.resultados.add("Social");
        intermedSubFerramenta.resultados.add("Familiar");
        intermedSubFerramenta.resultados.add("Conjugal");
        intermedSubFerramenta.resultados.add("Profissional");
        intermedSubFerramenta.ações.add("Limpar e harmonizar");
        intermedSubFerramenta.ações.add("Reconciliar e Harmonizar");
        intermedSubFerramenta.ações.add("Equilibrar e Harmonizar");
        intermedSubFerramenta.ações.add("Limpar e Harmonizar");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this,"Presente");
        intermedSubFerramenta.ownDecreto = intermedFerramenta.ownDecreto;
        intermedSubFerramenta.resultados.add("Social");
        intermedSubFerramenta.resultados.add("Familiar");
        intermedSubFerramenta.resultados.add("Conjugal");
        intermedSubFerramenta.resultados.add("Profissional");
        intermedSubFerramenta.ações.add("Limpar e harmonizar");
        intermedSubFerramenta.ações.add("Reconciliar e Harmonizar");
        intermedSubFerramenta.ações.add("Equilibrar e Harmonizar");
        intermedSubFerramenta.ações.add("Limpar e Harmonizar");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this,"Futuro");
        intermedSubFerramenta.ownDecreto = intermedFerramenta.ownDecreto;
        intermedSubFerramenta.resultados.add("Social");
        intermedSubFerramenta.resultados.add("Familiar");
        intermedSubFerramenta.resultados.add("Conjugal");
        intermedSubFerramenta.resultados.add("Profissional");
        intermedSubFerramenta.ações.add("Intuir e Congregar");
        intermedSubFerramenta.ações.add("Congregar e Clarificar");
        intermedSubFerramenta.ações.add("Clarificar e Harmonizar");
        intermedSubFerramenta.ações.add("Clarificar e Harmonizar");
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Emocional");
        intermedSubFerramenta.ownDecreto = intermedFerramenta.ownDecreto;
        intermedSubFerramenta.inactive = true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Mental");
        intermedSubFerramenta.ownDecreto = intermedFerramenta.ownDecreto;
        intermedSubFerramenta.inactive = true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        intermedSubFerramenta = new SubFerramenta(this, "Espiritual");
        intermedSubFerramenta.ownDecreto = intermedFerramenta.ownDecreto;
        intermedSubFerramenta.inactive = true;
        intermedFerramenta.subFerramentas.add(intermedSubFerramenta);

        this.subFerramentas.add(intermedFerramenta);
    }
}
