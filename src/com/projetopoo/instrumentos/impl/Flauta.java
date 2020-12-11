package com.projetopoo.instrumentos.impl;

import com.projetopoo.instrumentos.InstrumentoDeSopro;

public class Flauta extends InstrumentoDeSopro {

    public Flauta() {
        super("Flauta");
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
