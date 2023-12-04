package com.portais;

import java.util.ArrayList;

import com.portais.Ferramentas.*;

public class TreeRoot {
    public ArrayList<Portal> portais;

    public Portal Portal1;
    public Portal Portal2;
    public Portal Portal3;
    public Portal Portal4;

    public TreeRoot(){
        Ferramenta temp;
        SubFerramenta subTemp;
        portais = new ArrayList<Portal>();

        Portal1 = new Portal("Portal de Ambientes",0);
        Portal2 = new Portal("Portal de Relacionamentos",1);
        Portal3 = new Portal("Portal do Eu Interior",2);
        Portal4 = new Portal("Portal CQM",3);

        //Portal de Ambientes

        temp = new Cromoterapia(Portal1, 0);
        Portal1.AddFerramenta(temp);

        temp = new EscalaDeSolfeggio(Portal1, 1);
        Portal1.AddFerramenta(temp);

        temp = new Ferramenta("Ligação Relações",Portal1,2);
        temp.type = 1;
        temp.target = Portal2;
        Portal1.AddFerramenta(temp);

        temp = new FrequênciasDeCura(Portal1, 3);
        Portal1.AddFerramenta(temp);

        temp = new Ferramenta("Ferramenta em Branco (Ambientes)",Portal1,4);
        temp.type = 2;
        temp.resultados.add("Geobiologia");
        temp.resultados.add("Reiki");

        subTemp = new Geobiologia(temp);
        temp.subFerramentas.add(subTemp);
        subTemp = new Reiki(temp);
        temp.subFerramentas.add(subTemp);

        Portal1.AddFerramenta(temp);

        temp = new Ferramenta("Ligação CQM",Portal1,5);
        temp.type = 1;
        temp.target = Portal4;
        Portal1.AddFerramenta(temp);

        temp = new CampoMorfogenético(Portal1, 6);
        Portal1.AddFerramenta(temp);

        temp = new FengShui(Portal1, 7);
        Portal1.AddFerramenta(temp);

        temp = new Ferramenta("Ligação Eu Interior",Portal1,8);
        temp.type = 1;
        temp.target = Portal3;
        Portal1.AddFerramenta(temp);

        temp = new Cristaloterapia(Portal1, 9);
        Portal1.AddFerramenta(temp);

        temp = new Aromaterapia(Portal1,10);
        Portal1.AddFerramenta(temp);

        //Portal de Relacionamentos

        //TODO - Change Name (Graficos Radiestesicos -> Cartões Radiónicos)?
        temp = new GráficosRadiestesicos(Portal2, 0);
        Portal2.AddFerramenta(temp);

        temp = new HooponoponoELeisHuna(Portal2, 1);
        Portal2.AddFerramenta(temp);

        temp = new Ferramenta("Ligação Eu Interior",Portal2,2);
        temp.type = 1;
        temp.target = Portal3;
        Portal2.AddFerramenta(temp);

        temp = new VidasPassadas(Portal2, 3);
        Portal2.AddFerramenta(temp);

        temp = new ArcanosMaiores(Portal2,4);
        temp.name = "Ferramenta em Branco (Relacionamentos)";
        Portal2.AddFerramenta(temp);

        temp = new Ferramenta("Ligação CQM",Portal2,5);
        temp.type = 1;
        temp.target = Portal4;
        Portal2.AddFerramenta(temp);

        temp = new CampoMorfogenético(Portal2, 6);
        Portal2.AddFerramenta(temp);

        temp = new CuraEgipcia(Portal2,7);
        Portal2.AddFerramenta(temp);

        temp = new Ferramenta("Ligação Ambientes",Portal2,8);
        temp.type = 1;
        temp.target = Portal1;
        Portal2.AddFerramenta(temp);

        temp = new YinYang(Portal2,9);
        Portal2.AddFerramenta(temp);

        temp = new ConstelaçãoFamiliar(Portal2,10);
        Portal2.AddFerramenta(temp);

        //Portal do Eu Interior
        temp = new RegeneraçãoDeDNA(Portal3,0);
        Portal3.AddFerramenta(temp);

        temp = new ChakrasECorposSutis(Portal3,1);
        Portal3.AddFerramenta(temp);

        temp = new Ferramenta("Ligação Ambientes",Portal3,2);
        temp.type = 1;
        temp.target = Portal1;
        Portal3.AddFerramenta(temp);

        //TODO Change Name? (Vidas Passadas -> CURA PALINGENICA)
        temp = new VidasPassadas(Portal3,3);
        Portal3.AddFerramenta(temp);

        temp = new Ferramenta("Ferramenta em Branco (Eu Interior)",Portal3,4);
        temp.type = 2;

        temp.resultados.add("Arcanos Maiores");
        temp.resultados.add("72 Nomes de Deus");

        subTemp = new ArcanosMaioresSub(temp);
        temp.subFerramentas.add(subTemp);

        subTemp = new NomesDeDeus72(temp);
        temp.subFerramentas.add(subTemp);

        Portal3.AddFerramenta(temp);

        temp = new Ferramenta("Ligação CQM",Portal3,5);
        temp.type = 1;
        temp.target = Portal4;
        Portal3.AddFerramenta(temp);

        temp = new PortaisDimensionais(Portal3,6);
        Portal3.AddFerramenta(temp);

        temp = new Naturopatia(Portal3,7);
        Portal3.AddFerramenta(temp);

        temp = new Ferramenta("Ligação Relacionamentos",Portal3,8);
        temp.type = 1;
        temp.target = Portal2;
        Portal3.AddFerramenta(temp);

        temp = new CromoterapiaFreq(Portal3,9);
        Portal3.AddFerramenta(temp);

        temp = new ReikiMain(Portal3,10);
        Portal3.AddFerramenta(temp);

        //Portal CQM
        temp = new CartãoQuanticoMD(Portal4,0);
        Portal4.AddFerramenta(temp);

        temp = new MatrizMorfogenética(Portal4,1);
        Portal4.AddFerramenta(temp);

        temp = new QuartzosQuânticosECristais(Portal4,2);
        Portal4.AddFerramenta(temp);

        temp = new MatrizDimensional(Portal4,3);
        Portal4.AddFerramenta(temp);

        temp = new RemoçãoDeChipsEImplantes(Portal4,4);
        Portal4.AddFerramenta(temp);

        temp = new GeometriasFrequenciais(Portal4,5);
        Portal4.AddFerramenta(temp);

        temp = new Ferramenta("Conexão Arcturiana",Portal4,6);
        temp.type = 2;

        //TODO change codigos arcturianos -> activar conexao arcturiana ?
        temp.resultados.add("Códigos Arcturianos");
        temp.resultados.add("Cartas de Cura");

        subTemp = new CódigosArcturianos(temp);
        temp.subFerramentas.add(subTemp);

        subTemp = new CartasDeCura(temp);
        temp.subFerramentas.add(subTemp);

        Portal4.AddFerramenta(temp);

        temp = new MatrizBioenergéticaEMeridional(Portal4,7);
        Portal4.AddFerramenta(temp);

        temp = new MatrizCQM(Portal4,8);
        Portal4.AddFerramenta(temp);
        
        portais.add(Portal1);
        portais.add(Portal2);
        portais.add(Portal3);
        portais.add(Portal4);
    }
}
