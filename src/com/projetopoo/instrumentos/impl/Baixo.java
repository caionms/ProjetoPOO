package com.projetopoo.instrumentos.impl;

import com.projetopoo.Nota;
import com.projetopoo.Playable;
import com.projetopoo.instrumentos.InstrumentoDeCorda;

import java.util.ArrayList;
import java.util.List;

public class Baixo extends InstrumentoDeCorda implements Playable {

    private final ArrayList<Nota> notas = new ArrayList<>();

    public Baixo() {
        super("Baixo", 4);
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
