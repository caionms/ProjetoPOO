package com.projetopoo.instrumentos.impl;

import com.projetopoo.instrumentos.InstrumentoDeCorda;

public class Violao extends InstrumentoDeCorda {

    public Violao() {
        super("Violão", 6);
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
