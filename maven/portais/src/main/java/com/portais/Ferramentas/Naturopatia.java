package com.portais.Ferramentas;

import com.portais.Ferramenta;
import com.portais.Portal;
import com.portais.SubFerramenta;

public class Naturopatia extends Ferramenta{
    public Naturopatia (Portal portal, int id){
        super("Naturopatia", portal, id);

        SubFerramenta intermedFerramenta;

        this.type = 2;

        this.resultados.add("Florais");
        this.resultados.add("Cepas Homeopáticas");
        this.resultados.add("Sais de Schuessler");
        this.resultados.add("Oligoterapia");

        intermedFerramenta = new SubFerramenta(this, "Florais");
        intermedFerramenta.resultados.add("Mimulus");
        intermedFerramenta.resultados.add("Aspen");
        intermedFerramenta.resultados.add("Rock Rose");
        intermedFerramenta.resultados.add("Cherry Plum");
        intermedFerramenta.resultados.add("Red Chestnut");
        intermedFerramenta.resultados.add("Honeysuckle");
        intermedFerramenta.resultados.add("Clematis");
        intermedFerramenta.resultados.add("Chestnut Bud");
        intermedFerramenta.resultados.add("White Chestnut");
        intermedFerramenta.resultados.add("Wild Rose");
        intermedFerramenta.resultados.add("Mustard");
        intermedFerramenta.resultados.add("Olive");
        intermedFerramenta.resultados.add("Heather");
        intermedFerramenta.resultados.add("Impatiens");
        intermedFerramenta.resultados.add("Water Violet");
        intermedFerramenta.resultados.add("Hornbearn");
        intermedFerramenta.resultados.add("Gentian");
        intermedFerramenta.resultados.add("Gorse");
        intermedFerramenta.resultados.add("Scleranthus");
        intermedFerramenta.resultados.add("Wild Oat");
        intermedFerramenta.resultados.add("Cerato");
        intermedFerramenta.resultados.add("Star of Bethlehem");
        intermedFerramenta.resultados.add("Willow");
        intermedFerramenta.resultados.add("Elm");
        intermedFerramenta.resultados.add("Pine");
        intermedFerramenta.resultados.add("Sweet Chestnut");
        intermedFerramenta.resultados.add("Larch");
        intermedFerramenta.resultados.add("Oak");
        intermedFerramenta.resultados.add("Crab Aplle");
        intermedFerramenta.resultados.add("Vine");
        intermedFerramenta.resultados.add("Vervain");
        intermedFerramenta.resultados.add("Beech");
        intermedFerramenta.resultados.add("Chicory");
        intermedFerramenta.resultados.add("Rock Water");
        intermedFerramenta.resultados.add("Centaury");
        intermedFerramenta.resultados.add("Walnut");
        intermedFerramenta.resultados.add("Holly");
        intermedFerramenta.resultados.add("Agrimony");

        intermedFerramenta.ações.add("Coragem");
        intermedFerramenta.ações.add("Afirmação");
        intermedFerramenta.ações.add("Confiança");
        intermedFerramenta.ações.add("Compostura");
        intermedFerramenta.ações.add("Paz de Espírito");
        intermedFerramenta.ações.add("Presença");
        intermedFerramenta.ações.add("Foco");
        intermedFerramenta.ações.add("Discernimento");
        intermedFerramenta.ações.add("Tranquilidade");
        intermedFerramenta.ações.add("Entusiasmo");
        intermedFerramenta.ações.add("Alegria");
        intermedFerramenta.ações.add("Restaurador");
        intermedFerramenta.ações.add("Ser ouvido");
        intermedFerramenta.ações.add("Paciência");
        intermedFerramenta.ações.add("Conexão");
        intermedFerramenta.ações.add("Resolução");
        intermedFerramenta.ações.add("Coragem");
        intermedFerramenta.ações.add("Esperança");
        intermedFerramenta.ações.add("Decisão");
        intermedFerramenta.ações.add("Direção");
        intermedFerramenta.ações.add("Orientação");
        intermedFerramenta.ações.add("Conforto");
        intermedFerramenta.ações.add("Positivismo");
        intermedFerramenta.ações.add("Apoio");
        intermedFerramenta.ações.add("Absolvição");
        intermedFerramenta.ações.add("Consolo");
        intermedFerramenta.ações.add("Confiança");
        intermedFerramenta.ações.add("Força");
        intermedFerramenta.ações.add("Purificação");
        intermedFerramenta.ações.add("Inspirador");
        intermedFerramenta.ações.add("Desligar-se");
        intermedFerramenta.ações.add("Tolerância");
        intermedFerramenta.ações.add("Liberar");
        intermedFerramenta.ações.add("Fluir");
        intermedFerramenta.ações.add("Assertividade");
        intermedFerramenta.ações.add("Estabilidade");
        intermedFerramenta.ações.add("Boa Vontade");
        intermedFerramenta.ações.add("Transparência");
        intermedFerramenta.ownDecreto="Ativando o Eu Sou de (nome do terapeuta), aciono a frequência dos florais de Bach no campo de (nome do consulente) na informação singular do floral (nome do floral) e decreto que se instale no campo a(s) frequência(s) de cura com o(s) efeito(s) de (ação) com um quantum energético de (medir no biómetro) Angström, para que dilua, desbloqueie e cure toda e qualquer anomalia que não permite que (nome do consulente) avance no seu propósito. Pulsa no campo, pulsa no campo, pulsa no campo.";
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "Cepas Homeopáticas");
        intermedFerramenta.resultados.add("ACONITUM NAPELLUS");
        intermedFerramenta.resultados.add("ACTAEA RACEMOSA");
        intermedFerramenta.resultados.add("ACTAEA SPICATA");
        intermedFerramenta.resultados.add("AESCULUS HIPPOCASTANUM");
        intermedFerramenta.resultados.add("AETHUSA CYNAPIUM");
        intermedFerramenta.resultados.add("AGARICUS MUSCARIUS");
        intermedFerramenta.resultados.add("ALLIUM CEPA");
        intermedFerramenta.resultados.add("ALUMINA");
        intermedFerramenta.resultados.add("AMBRA GRISEA");
        intermedFerramenta.resultados.add("AMMONIUM CARBONICUM");
        intermedFerramenta.resultados.add("AMMONIUM MURIATICUM");
        intermedFerramenta.resultados.add("ANACARDIUM ORIENTALE");
        intermedFerramenta.resultados.add("ANAGALIS ARVENSIS");
        intermedFerramenta.resultados.add("ANTIMONIUM CRUDUM");
        intermedFerramenta.resultados.add("ANTIMONIUM TARTARICUM");
        intermedFerramenta.resultados.add("APIS MELLIFICA");
        intermedFerramenta.resultados.add("ARALIA RACEMOSA");
        intermedFerramenta.resultados.add("ARANEA DIADEMA");
        intermedFerramenta.resultados.add("ARGENTUM METALLICUM");
        intermedFerramenta.resultados.add("ARGENTUM NITRICUM");
        intermedFerramenta.resultados.add("ARNICA MONTANA");
        intermedFerramenta.resultados.add("ARSENICUM ALBUM");
        intermedFerramenta.resultados.add("ARSENICUM IODATUM");
        intermedFerramenta.resultados.add("ARUM TRIPHYLLUM");
        intermedFerramenta.resultados.add("ARUM TRIPHYLLUM COMPOSÉ");
        intermedFerramenta.resultados.add("ASA FOETIDA");
        intermedFerramenta.resultados.add("AURUM METALLICUM");
        intermedFerramenta.resultados.add("AVIAIRE");
        intermedFerramenta.resultados.add("BARYTA CARBONICA");
        intermedFerramenta.resultados.add("BARYTA MURIATICA");
        intermedFerramenta.resultados.add("BELLADONNA");
        intermedFerramenta.resultados.add("BENZOICUM ACIDUM");
        intermedFerramenta.resultados.add("BERBERIS VULGARIS");
        intermedFerramenta.resultados.add("BLATTA ORIENTALIS");
        intermedFerramenta.resultados.add("BORAX");
        intermedFerramenta.resultados.add("BRYONIA");
        intermedFerramenta.resultados.add("CACTUS GRANDIFLOR");
        intermedFerramenta.resultados.add("CADMIUM SULFURICUM");
        intermedFerramenta.resultados.add("CALADIUM SEGUINUM");
        intermedFerramenta.resultados.add("CALCAREA CARBONICA OSTREARUM");
        intermedFerramenta.resultados.add("CALCAREA FLUORICA");
        intermedFerramenta.resultados.add("CALCAREA PHOSPHORICA");
        intermedFerramenta.resultados.add("CALCAREA SULFURICA");
        intermedFerramenta.resultados.add("CALENDULA OFFICINALIS");
        intermedFerramenta.resultados.add("CAMPHORA");
        intermedFerramenta.resultados.add("CANTHARIS");
        intermedFerramenta.resultados.add("CAPSICUM ANNUUM");
        intermedFerramenta.resultados.add("CARBO ANIMALIS");
        intermedFerramenta.resultados.add("CARBO VEGETABILIS");
        intermedFerramenta.resultados.add("CACTUS GRANDIFLOR");
        intermedFerramenta.resultados.add("CADMIUM SULFURICUM");
        intermedFerramenta.resultados.add("CALADIUM SEGUINUM");
        intermedFerramenta.resultados.add("CALCAREA CARBONICA OSTREARUM");
        intermedFerramenta.resultados.add("CALCAREA FLUORICA");
        intermedFerramenta.resultados.add("CALCAREA PHOSPHORICA");
        intermedFerramenta.resultados.add("CALCAREA SULFURICA");
        intermedFerramenta.resultados.add("CALENDULA OFFICINALIS");
        intermedFerramenta.resultados.add("CAMPHORA");
        intermedFerramenta.resultados.add("CANTHARIS");
        intermedFerramenta.resultados.add("CAPSICUM ANNUUM");
        intermedFerramenta.resultados.add("CARBO ANIMALIS");
        intermedFerramenta.resultados.add("CARBO VEGETABILIS");
        intermedFerramenta.resultados.add("CARDUUS MARIANUS");
        intermedFerramenta.resultados.add("CARTILAGO");
        intermedFerramenta.resultados.add("CAULOPHYLLUM THALICTRIDES");
        intermedFerramenta.resultados.add("CAUSTICUM");
        intermedFerramenta.resultados.add("CHAMOMILLA VULGARIS");
        intermedFerramenta.resultados.add("CHELIDONIUM MAJUS");
        intermedFerramenta.resultados.add("CHINA RUBRA");
        intermedFerramenta.resultados.add("CHININUM SULFURICUM");
        intermedFerramenta.resultados.add("CHOLESTERINUM");
        intermedFerramenta.resultados.add("CICUTA VIROSA");
        intermedFerramenta.resultados.add("CINA");
        intermedFerramenta.resultados.add("CINNABARIS");
        intermedFerramenta.resultados.add("COCCULUS INDICUS");
        intermedFerramenta.resultados.add("COCCUS CACTI");
        intermedFerramenta.resultados.add("COFFEA CRUDA");
        intermedFerramenta.resultados.add("COFFEA CRUDA");
        intermedFerramenta.resultados.add("COFFEA TOSTA");
        intermedFerramenta.resultados.add("COLCHICUM AUTUMNALE");
        intermedFerramenta.resultados.add("COLLINSONIA CANADENSIS");
        intermedFerramenta.resultados.add("COLOCYNTHIS");
        intermedFerramenta.resultados.add("CONDURANGO");
        intermedFerramenta.resultados.add("CONIUM MACULATUM");
        intermedFerramenta.resultados.add("CORALLIUM RUBRUM");
        intermedFerramenta.resultados.add("CORTISONE");
        intermedFerramenta.resultados.add("CRATAEGUS OXYACANTHA");
        intermedFerramenta.resultados.add("CROTALUS HORRIDUS");
        intermedFerramenta.resultados.add("CUPRUM ARSENICOSUM");
        intermedFerramenta.resultados.add("CUPRUM METALLICUM");
        intermedFerramenta.resultados.add("DIOSCOREA VILLOSA");
        intermedFerramenta.resultados.add("DOLICHOS PRURIENS");
        intermedFerramenta.resultados.add("DROSERA");
        intermedFerramenta.resultados.add("DULCAMARA");
        intermedFerramenta.resultados.add("ECHINACEA ANGUSTIFOLIA");
        intermedFerramenta.resultados.add("EUGENIA JAMBOSA");
        intermedFerramenta.resultados.add("EUPATORIUM PERFOLIATUM");
        intermedFerramenta.resultados.add("EUPHRASIA OFFICINIALIS");
        intermedFerramenta.resultados.add("FERRUM METALLICUM");
        intermedFerramenta.resultados.add("FLUORICUM ACIDUM");
        intermedFerramenta.resultados.add("FOLLICULINUM");
        intermedFerramenta.resultados.add("FORMICA RUFA");
        intermedFerramenta.resultados.add("GELSEMIUM SEMPERVIRENS");
        intermedFerramenta.resultados.add("GLONOINUM");
        intermedFerramenta.resultados.add("GNAPHALIUM POLYCE");
        intermedFerramenta.resultados.add("GRAPHITES");
        intermedFerramenta.resultados.add("GRINDELIA ROBUSTA");
        intermedFerramenta.resultados.add("HAMAMELIS VIRGINIANA");
        intermedFerramenta.resultados.add("HEKLA LAVA");
        intermedFerramenta.resultados.add("HELONIAS DIOICA");
        intermedFerramenta.resultados.add("HEPAR SULFURIS CALCAREUM");
        intermedFerramenta.resultados.add("HISTAMINUM");
        intermedFerramenta.resultados.add("HYDROCOTYLE ASIAT");
        intermedFerramenta.resultados.add("HYOSCYAMUS NIGER");
        intermedFerramenta.resultados.add("HYPERICUM PERFORATUM");
        intermedFerramenta.resultados.add("HYPOTHALAMUS");
        intermedFerramenta.resultados.add("IGNATIA AMARA");
        intermedFerramenta.resultados.add("INFLUENZINUM");
        intermedFerramenta.resultados.add("IODUM");
        intermedFerramenta.resultados.add("IPECA");
        intermedFerramenta.resultados.add("IRIS VERSICOLOR");
        intermedFerramenta.resultados.add("KALIUM BICHROMICUM");
        intermedFerramenta.resultados.add("KALIUM BROMATUM");
        intermedFerramenta.resultados.add("KALIUM CARBONICUM");
        intermedFerramenta.resultados.add("KALIUM IODATUM");
        intermedFerramenta.resultados.add("KALIUM MURIATICUM");
        intermedFerramenta.resultados.add("KALIUM PHOSPHORICUM");
        intermedFerramenta.resultados.add("KALIUM SULFURICUM");
        intermedFerramenta.resultados.add("KALMIA LATIFOLIA");
        intermedFerramenta.resultados.add("KREOSOTUM");
        intermedFerramenta.resultados.add("LAC CANINUM");
        intermedFerramenta.resultados.add("LACHESIS MUTUS");
        intermedFerramenta.resultados.add("LACHNANTHES TINCTORIA");
        intermedFerramenta.resultados.add("LAPIS ALBUS");
        intermedFerramenta.resultados.add("LEDUM PALUSTRE");
        intermedFerramenta.resultados.add("LILIUM TIGRINUM");
        intermedFerramenta.resultados.add("LITHIUM CARBONICUM");
        intermedFerramenta.resultados.add("LOBELIA INFLATA");
        intermedFerramenta.resultados.add("LUTEINUM");
        intermedFerramenta.resultados.add("LYCOPODIUM CLAVATUM");
        intermedFerramenta.resultados.add("MAGNESIA CARBONICA");
        intermedFerramenta.resultados.add("MAGNESIA MURIATICA");
        intermedFerramenta.resultados.add("MAGNESIA PHOSPHORICA");
        intermedFerramenta.resultados.add("MEDORRHINUM");
        intermedFerramenta.resultados.add("MERCURIUS BIODATUS");
        intermedFerramenta.resultados.add("MERCURIUS CORROSIVUS");
        intermedFerramenta.resultados.add("MERCURIUS CYANATUS");
        intermedFerramenta.resultados.add("MERCURIUS DULCIS");
        intermedFerramenta.resultados.add("MERCURIUS SOLUBILIS");
        intermedFerramenta.resultados.add("MERCURIUS VIVUS");
        intermedFerramenta.resultados.add("MONILIA ALBICANS");
        intermedFerramenta.resultados.add("MOSCHUS");
        intermedFerramenta.resultados.add("MURIATICUM ACIDUM");
        intermedFerramenta.resultados.add("NAJA TRIPUDIANS");
        intermedFerramenta.resultados.add("NATRUM CARBONICUM");
        intermedFerramenta.resultados.add("NATRUM MURIATICUM");
        intermedFerramenta.resultados.add("NATRUM SULFURICUM");
        intermedFerramenta.resultados.add("NITRICUM ACIDUM");
        intermedFerramenta.resultados.add("NUX MOSCHATA");
        intermedFerramenta.resultados.add("NUX VOMICA");
        intermedFerramenta.resultados.add("OPIUM");
        intermedFerramenta.resultados.add("PAEONIA OFFICINALIS");
        intermedFerramenta.resultados.add("PASSIFLORA INCARNATA");
        intermedFerramenta.resultados.add("PETROLEUM");
        intermedFerramenta.resultados.add("PHOSPHORICUM ACIDUM");
        intermedFerramenta.resultados.add("PHOSPHORUS");
        intermedFerramenta.resultados.add("PHYTOLACCA DECANDRA");
        intermedFerramenta.resultados.add("PLATINA");
        intermedFerramenta.resultados.add("PLUMBUM METALLICUM");
        intermedFerramenta.resultados.add("PODOPHYLLINUM");
        intermedFerramenta.resultados.add("PODOPHYLLUM PELTATUM");
        intermedFerramenta.resultados.add("POLLENS");
        intermedFerramenta.resultados.add("PSORINUM");
        intermedFerramenta.resultados.add("PULMO HISTAMINUM");
        intermedFerramenta.resultados.add("PULSATILLA");
        intermedFerramenta.resultados.add("PYROGENIUM");
        intermedFerramenta.resultados.add("RAPHANUS SATIVUS NIGER");
        intermedFerramenta.resultados.add("RHODODENDRON CHRYSANTHUM");
        intermedFerramenta.resultados.add("RHUS TOXICODENDRON");
        intermedFerramenta.resultados.add("RICINUS COMMUNIS");
        intermedFerramenta.resultados.add("ROBINIA PSEUDO ACACIA");
        intermedFerramenta.resultados.add("RUMEX CRISPUS");
        intermedFerramenta.resultados.add("RUTA GRAVEOLENS");
        intermedFerramenta.resultados.add("SABADILLA OFFICINARUM");
        intermedFerramenta.resultados.add("SABAL SERRULATA");
        intermedFerramenta.resultados.add("SABINA");
        intermedFerramenta.resultados.add("SAMBUCUS NIGRA");
        intermedFerramenta.resultados.add("SECALE CORNUTUM");
        intermedFerramenta.resultados.add("SELENIUM METALLICUM");
        intermedFerramenta.resultados.add("SEPIA OFFICINALIS");
        intermedFerramenta.resultados.add("SERUM YERSIN");
        intermedFerramenta.resultados.add("SILICEA");
        intermedFerramenta.resultados.add("SOLANUM MALACOXYLON");
        intermedFerramenta.resultados.add("SOLIDAGO VIRGA AUREA");
        intermedFerramenta.resultados.add("SPONGIA TOSTA");
        intermedFerramenta.resultados.add("STANNUM METALLICUM");
        intermedFerramenta.resultados.add("STAPHYLOCOCCINUM");
        intermedFerramenta.resultados.add("STAPHYSAGRIA");
        intermedFerramenta.resultados.add("STICTA PULMONARIA");
        intermedFerramenta.resultados.add("STRAMONIUM");
        intermedFerramenta.resultados.add("SULFUR");
        intermedFerramenta.resultados.add("SULFUR IODATUM");
        intermedFerramenta.resultados.add("SULFURICUM ACIDUM");
        intermedFerramenta.resultados.add("SYMPHYTUM OFFICINALE");
        intermedFerramenta.resultados.add("TABACUM");
        intermedFerramenta.resultados.add("TARENTULA HISPANA");
        intermedFerramenta.resultados.add("THUYA OCCIDENTALIS");
        intermedFerramenta.resultados.add("THYMULINE");
        intermedFerramenta.resultados.add("THYROIDINUM");
        intermedFerramenta.resultados.add("TUBERCULINUM");
        intermedFerramenta.resultados.add("TUBERCULINUM RESIDUUM");
        intermedFerramenta.resultados.add("URANIUM NITRICUM");
        intermedFerramenta.resultados.add("URTICA URENS");
        intermedFerramenta.resultados.add("VACCINOTOXINUM");
        intermedFerramenta.resultados.add("VALERIANA OFFICINALIS");
        intermedFerramenta.resultados.add("VERATRUM ALBUM");
        intermedFerramenta.resultados.add("ZINCUM METALLICUM");
        
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ownDecreto="Ativando o Eu Sou de (nome do terapeuta), aciono a frequência das Cepas Homeopáticas no campo de (nome do consulente) na informação singular da cepa (nome da cepa) e decreto que se instale no campo a frequência de cura com o efeito que lhe está associado, com um quantum energético de (medir no biómetro) Angström, para que dilua, desbloqueie e cure toda e qualquer anomalia que não permite que (nome do consulente) avance no seu propósito. Pulsa no campo, pulsa no campo, pulsa no campo.";
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "Sais de Schuessler");
        intermedFerramenta.resultados.add("Fluorica Calcium");
        intermedFerramenta.resultados.add("Cálcio Phosphoricum");
        intermedFerramenta.resultados.add("Ferrum Phosphoricum");
        intermedFerramenta.resultados.add("Cloreto de Potássio");
        intermedFerramenta.resultados.add("Potássio Fosfórico");
        intermedFerramenta.resultados.add("Sulfato de Potássio");
        intermedFerramenta.resultados.add("Magnésio Phosphoricum");
        intermedFerramenta.resultados.add("Cloreto de Sódio");
        intermedFerramenta.resultados.add("Sódio Fosfórico");
        intermedFerramenta.resultados.add("Sulfato de Sódio");
        intermedFerramenta.resultados.add("Sílica");
        intermedFerramenta.resultados.add("Sulfato de Cálcio");
        
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ownDecreto="Ativando o Eu Sou de (nome do terapeuta), aciono a frequência dos Sais de Schuessler no campo de (nome do consulente) na informação singular do bioquímico (indicação) e decreto que se instale no campo a frequência de cura com o efeito que lhe está associado, com um quantum energético de (medir no biómetro) Angström, para que dilua, desbloqueie e cure toda e qualquer anomalia que não permite que (nome do consulente) avance no seu propósito. Pulsa no campo, pulsa no campo, pulsa no campo.";
        this.subFerramentas.add(intermedFerramenta);

        intermedFerramenta = new SubFerramenta(this, "Oligoterapia");
        intermedFerramenta.resultados.add("ALUMÍNIO (Al)");
        intermedFerramenta.resultados.add("BISMUTO (Bi)");
        intermedFerramenta.resultados.add("COBALTO (Co)");
        intermedFerramenta.resultados.add("COBRE (Cu)");
        intermedFerramenta.resultados.add("COBRE-OURO-PRATA (Cu-Au-Ag)");
        intermedFerramenta.resultados.add("FLÚOR (Fu)");
        intermedFerramenta.resultados.add("LITIO (LI)");
        intermedFerramenta.resultados.add("MAGNÉSIO (Mg)");
        intermedFerramenta.resultados.add("MANGANÊS (Mn)");
        intermedFerramenta.resultados.add("MANGANÊS-COBALTO (Mn-Co)");
        intermedFerramenta.resultados.add("MANGANÊS-COBRE (Mn-Cu)");
        intermedFerramenta.resultados.add("MANGANÊS-COBRE-COBALTO (Mn-Cu-Co)");
        intermedFerramenta.resultados.add("NÍQUEL-COBALTO (Ni-Co)");
        intermedFerramenta.resultados.add("FÓSFORO (P)");
        intermedFerramenta.resultados.add("POTÁSSIO (K)");
        intermedFerramenta.resultados.add("SELÊNIO (Se)");
        intermedFerramenta.resultados.add("ENXOFRE (S)");
        intermedFerramenta.resultados.add("ZINCO (Zn)");
        intermedFerramenta.resultados.add("ZINCO-COBRE (Zn-Cu)");
        intermedFerramenta.resultados.add("ZINCO-NÍQUEL-COBALTO (Zn-Ni-Co)");
        
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        intermedFerramenta.ações.add("");
        
        intermedFerramenta.ownDecreto="Ativando o Eu Sou de (nome do terapeuta), aciono a frequência dos Oligoelementos no campo de (nome do consulente) na informação singular do oligoelemento (oligoelemento) e decreto que se instale no campo a frequência de cura com o efeito que lhe está associado, com um quantum energético de (medir no biómetro) Angström, para que dilua, desbloqueie e cure toda e qualquer anomalia que não permite que (nome do consulente) avance no seu propósito. Pulsa no campo, pulsa no campo, pulsa no campo.";
        this.subFerramentas.add(intermedFerramenta);

        
    }
}
