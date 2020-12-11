package com.projetopoo.instrumentos.impl;

import com.projetopoo.Nota;
import com.projetopoo.instrumentos.InstrumentoDeSopro;

import java.util.ArrayList;
import java.util.List;

public class Flauta extends InstrumentoDeSopro {

    private final ArrayList<Nota> notas = new ArrayList<>();

    public Flauta() {
        super("Flauta");
        notas.add(new Nota("A2"));
        notas.add(new Nota("C2"));
        notas.add(new Nota("D2"));
        notas.add(new Nota("F2"));
        notas.add(new Nota("A3"));
        notas.add(new Nota("C3"));
        notas.add(new Nota("D3"));
        notas.add(new Nota("F3"));
        notas.add(new Nota("A4"));
        notas.add(new Nota("C4"));
        notas.add(new Nota("D4"));
        notas.add(new Nota("F4"));
    }

    @Override
    public List<Nota> getNotes() {
        return this.notas;
    }

    @Override
    public String getAudioPath() {
        return "/flute";
    }

}
