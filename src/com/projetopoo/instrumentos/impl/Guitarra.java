package com.projetopoo.instrumentos.impl;

import com.projetopoo.instrumentos.InstrumentoDeCorda;

public class Guitarra extends InstrumentoDeCorda {

    public Guitarra() {
        super("Guitarra", 6);
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
