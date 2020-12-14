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

    public String getViolaoInfo() {
        return "A guitarra clássica (conhecida no Brasil como violão) é uma guitarra acústica com cordas de nylon, aço ou tendões de animais, concebida inicialmente para a interpretação de peças de música erudita. O corpo é oco e chato, em forma de oito, e feito de várias madeiras diferentes. O braço possui trastes que a tornam um instrumento temperado. As versões mais comuns possuem seis cordas de nylon, mas há violões com outras configurações, como o violão de sete cordas e o violão baixo, com 4 cordas, afinadas uma oitava abaixo das 4 cordas mais graves do violão/viola.";
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
