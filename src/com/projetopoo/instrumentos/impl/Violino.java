package com.projetopoo.instrumentos.impl;

import com.projetopoo.Nota;
import com.projetopoo.instrumentos.InstrumentoDeCorda;

import java.util.ArrayList;
import java.util.List;

public class Violino extends InstrumentoDeCorda {

    private final ArrayList<Nota> notas = new ArrayList<>();

    public Violino() {
        super("Violino", 4);
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
