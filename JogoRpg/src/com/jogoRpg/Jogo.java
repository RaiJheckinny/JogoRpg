package com.jogoRpg;

import com.jogoRpg.fabrica.FabricaDeEsqueletos;
import com.jogoRpg.fabrica.FabricaDeInimigos;
import com.jogoRpg.fabrica.FabricaDeVampiros;
import com.jogoRpg.fabrica.FabricaDeZumbis;
import com.jogoRpg.inimigo.Inimigo;

public class Jogo {
    public static void main(String args []){
        FabricaDeInimigos fabrica1 = new FabricaDeEsqueletos();
        Inimigo inimigo1 = fabrica1.gerarInimigos();
        inimigo1.atacar();

        FabricaDeInimigos fabrica2 = new FabricaDeVampiros();
        Inimigo inimigo2 = fabrica2.gerarInimigos();
        inimigo2.atacar();

        FabricaDeInimigos fabrica3 = new FabricaDeZumbis();
        Inimigo inimigo3 = fabrica3.gerarInimigos();
        inimigo3.atacar();
    }
}
