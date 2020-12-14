/**
 *  Classe abstrata que representa uma nota.
 *  @author Caio Nery e Luca Argolo
 *  @version final
 */

package com.projetopoo;

public class Nota {

    private final String label;

    public Nota(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

}
