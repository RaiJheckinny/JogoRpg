package com.jogoRpg.fabrica;

import com.jogoRpg.inimigo.Inimigo;
import com.jogoRpg.inimigo.Zumbi;

public class FabricaDeZumbis implements FabricaDeInimigos{
    @Override
    public Inimigo gerarInimigos() {
        return new Zumbi();
    }
}
