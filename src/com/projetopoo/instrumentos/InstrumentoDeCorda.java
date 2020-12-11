package com.projetopoo.instrumentos;

public abstract class InstrumentoDeCorda extends Instrumento {

    protected int numeroDeCordas;

    public InstrumentoDeCorda(String nome, int numeroDeCordas) {
        super(nome, Tipo.CORDAS);
        this.numeroDeCordas = numeroDeCordas;
    }

    public void setNumeroDeCordas(int numeroDeCordas) {
        this.numeroDeCordas = numeroDeCordas;
    }

    public int getNumeroDeCordas() {
        return numeroDeCordas;
    }

}
