/**
 *  Classe que representa um saxofone e que extende a classe InstrumentoDeSopro.
 *  @author Caio Nery e Luca Argolo
 *  @version final
 */

package com.projetopoo.instrumentos.impl;

import com.projetopoo.Nota;
import com.projetopoo.instrumentos.InstrumentoDeSopro;

import java.util.ArrayList;
import java.util.List;

public class Saxofone extends InstrumentoDeSopro {

    private final ArrayList<Nota> notas = new ArrayList<>();

    public Saxofone() {
        super("Saxofone");
        notas.add(new Nota("Ab3"));
        notas.add(new Nota("A3"));
        notas.add(new Nota("Bb3"));
        notas.add(new Nota("B3"));
        notas.add(new Nota("Db3"));
        notas.add(new Nota("D3"));
        notas.add(new Nota("Eb3"));
        notas.add(new Nota("E3"));
        notas.add(new Nota("F3"));
        notas.add(new Nota("Gb3"));
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
        notas.add(new Nota("Ab5"));
        notas.add(new Nota("C5"));
        notas.add(new Nota("Db5"));
        notas.add(new Nota("D5"));
        notas.add(new Nota("Eb5"));
        notas.add(new Nota("E5"));
        notas.add(new Nota("F5"));
        notas.add(new Nota("G5"));
        notas.add(new Nota("Gb5"));
    }

    @Override
    public List<Nota> getNotes() {
        return this.notas;
    }

    @Override
    public String getAudioPath() {
        return "/saxophone";
    }
}
