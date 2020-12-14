/**
 *  Classe que representa um violino e que extende a classe InstrumentoDeCorda.
 *  @author Caio Nery e Luca Argolo
 *  @version final
 */

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

    public String getViolinoInfo() {
        return "O violino é um instrumento musical, classificado como instrumento de cordas friccionadas. É o menor e mais agudo dos instrumentos de sua família (que ainda possui a viola, o violoncelo e o contrabaixo, correspondendo ao Soprano da voz humana). O violino possui quatro cordas, com afinação da mais aguda à mais grave: O timbre do violino é agudo, brilhante e estridente, mas dependendo do encordamento utilizado e da forma que é tocado, podem-se produzir timbres mais aveludados. O som geralmente é produzido pela ação de friccionar as cerdas de um arco de madeira sobre as cordas.";
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
