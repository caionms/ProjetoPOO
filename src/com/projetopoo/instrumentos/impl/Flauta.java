package com.projetopoo.instrumentos.impl;

import com.projetopoo.Nota;
import com.projetopoo.instrumentos.InstrumentoDeSopro;

import java.util.ArrayList;
import java.util.List;

public class Flauta extends InstrumentoDeSopro {
    private final ArrayList<Nota> notas = new ArrayList<>();

    public Flauta() {
        super("Flauta");
    }

    @Override
    public List<Nota> getNotes() {
        return this.notas;
    }

    @Override
    public String getAudioPath() {
        return null;
    }

}
