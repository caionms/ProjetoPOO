package com.projetopoo.instrumentos.impl;

import com.projetopoo.Nota;
import com.projetopoo.instrumentos.InstrumentoDeCorda;

import java.util.ArrayList;
import java.util.List;

public class Violino extends InstrumentoDeCorda {

    private final ArrayList<Nota> notas = new ArrayList<>();

    public Violino() {
        super("Violino", 4);
        notas.add(new Nota("Ab3"));
        notas.add(new Nota("A3"));
        notas.add(new Nota("Bb3"));
        notas.add(new Nota("B3"));
        notas.add(new Nota("G3"));
        notas.add(new Nota("Ab4"));
        notas.add(new Nota("A4"));
        notas.add(new Nota("Bb4"));
        notas.add(new Nota("B4"));
        notas.add(new Nota("C4"));
        notas.add(new Nota("Db4"));
        notas.add(new Nota("D4"));
        notas.add(new Nota("Eb4"));
        notas.add(new Nota("E4"));
        notas.add(new Nota("F4"));
        notas.add(new Nota("Gb4"));
        notas.add(new Nota("G4"));
        notas.add(new Nota("C5"));
        notas.add(new Nota("Db5"));
        notas.add(new Nota("D5"));
    }

    @Override
    public List<Nota> getNotes() {
        return this.notas;
    }

    @Override
    public String getAudioPath() {
        return "/violin";
    }
}
