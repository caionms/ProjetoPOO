/**
 *  Classe que representa um violão e que extende a classe InstrumentoDeCorda.
 *  @author Caio Nery e Luca Argolo
 *  @version final
 */

package com.projetopoo.instrumentos.impl;

import com.projetopoo.Nota;
import com.projetopoo.instrumentos.InstrumentoDeCorda;

import java.util.ArrayList;
import java.util.List;

public class Violao extends InstrumentoDeCorda {

    private final ArrayList<Nota> notas = new ArrayList<>();

    public Violao() {
        super("Violão", 6);
        notas.add(new Nota("A2A3"));
        notas.add(new Nota("B2"));
        notas.add(new Nota("E2"));
        notas.add(new Nota("F2"));
        notas.add(new Nota("F2F3"));
        notas.add(new Nota("A3"));
        notas.add(new Nota("B3"));
        notas.add(new Nota("C#3"));
        notas.add(new Nota("D3"));
        notas.add(new Nota("B3B4"));
        notas.add(new Nota("B4"));
        notas.add(new Nota("C#3C#4"));
        notas.add(new Nota("C#4"));
        notas.add(new Nota("D#4"));
        notas.add(new Nota("E4"));
        notas.add(new Nota("D5"));
    }

    @Override
    public List<Nota> getNotes() {
        return this.notas;
    }

    @Override
    public String getAudioPath() {
        return "/guitar";
    }
}
