package com.projetopoo.instrumentos.impl;

import com.projetopoo.Nota;
import com.projetopoo.instrumentos.InstrumentoDeCorda;

import java.util.ArrayList;
import java.util.List;

public class Guitarra extends InstrumentoDeCorda {

    private final ArrayList<Nota> notas = new ArrayList<>();

    public Guitarra() {
        super("Guitarra", 6);
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
