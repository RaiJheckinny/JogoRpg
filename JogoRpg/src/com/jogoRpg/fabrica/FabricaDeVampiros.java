package com.jogoRpg.fabrica;

import com.jogoRpg.inimigo.Inimigo;
import com.jogoRpg.inimigo.Vampiro;

public class FabricaDeVampiros implements FabricaDeInimigos{
    @Override
    public Inimigo gerarInimigos() {
        return new Vampiro();
    }
}
