/**
 *  Classe que representa uma flauta e que extende a classe InstrumentoDeSopro.
 *  @author Caio Nery e Luca Argolo
 *  @version final
 */

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
        notas.add(new Nota("F#2"));
        notas.add(new Nota("A#3"));
        notas.add(new Nota("C3"));
        notas.add(new Nota("D3"));
        notas.add(new Nota("F#3"));
        notas.add(new Nota("A#4"));
        notas.add(new Nota("C4"));
        notas.add(new Nota("D4"));
        notas.add(new Nota("F#4"));
    }

    public String getFlautaInfo() {
        return "A flauta é o instrumento instrumento musical de sopro feito de diversos tipos de madeiras com formato de um tubo oco com orifícios. É um aerofone que, a partir do fluxo de ar dirigido a uma aresta que vibra com a passagem do ar, emite som. Bastante antigo, a execução de tal instrumento consiste no ato de soprar o interior do tubo ao mesmo tempo em que se tapam e/ou destapam os orifícios com os dedos.";
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
