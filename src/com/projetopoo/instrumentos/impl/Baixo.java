package com.projetopoo.instrumentos.impl;

import com.projetopoo.Playable;
import com.projetopoo.instrumentos.InstrumentoDeCorda;

public class Baixo extends InstrumentoDeCorda implements Playable {

    public Baixo() {
        super("Baixo", 4);
    }

    @Override
    public int getNotes() {
        return 0;
    }

    @Override
    public String getAudioPath() {
        return null;
    }
}
