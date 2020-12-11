package com.projetopoo.instrumentos.impl;

import com.projetopoo.instrumentos.InstrumentoDeCorda;

public class Violino extends InstrumentoDeCorda {

    public Violino() {
        super("Violino", 4);
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
