package com.projetopoo.instrumentos.impl;

import com.projetopoo.instrumentos.InstrumentoDeSopro;

public class Saxofone extends InstrumentoDeSopro {

    public Saxofone() {
        super("Saxofone");
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
