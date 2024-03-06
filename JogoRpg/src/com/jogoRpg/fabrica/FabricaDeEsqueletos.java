package com.jogoRpg.fabrica;

import com.jogoRpg.inimigo.Esqueleto;
import com.jogoRpg.inimigo.Inimigo;

public class FabricaDeEsqueletos implements FabricaDeInimigos{
    @Override
    public Inimigo gerarInimigos() {
        return new Esqueleto();
    }
}
