/**
 *  Classe abstrata que extende a classe Instrumento.
 *  @author Caio Nery e Luca Argolo
 *  @version final
 */

package com.projetopoo.instrumentos;

public abstract class InstrumentoDeSopro extends Instrumento {

    public InstrumentoDeSopro(String nome) {
        super(nome, Tipo.SOPRO);
    }

}
