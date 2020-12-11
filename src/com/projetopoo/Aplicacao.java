package com.projetopoo;

import com.projetopoo.instrumentos.InstrumentoDeCorda;
import com.projetopoo.instrumentos.InstrumentoDeSopro;
import com.projetopoo.instrumentos.impl.*;

import javax.swing.*;
import java.util.ArrayList;

public class Aplicacao {

    private static final ArrayList<InstrumentoDeCorda> listaInstrumentosDeCorda = new ArrayList<>();
    private static final ArrayList<InstrumentoDeSopro> listaInstrumentosDeSopro = new ArrayList<>();

    public static void main(String[] args){
        CaixaDeInstrumentos c1 = new CaixaDeInstrumentos();

        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define o padrão de fechamento da janela
        c1.setSize(700,360); //define o tamanho da janela
        c1.setVisible(true); //define que a janela é visivel
    }

    public void preencherInstrumentos() {
        criarInstrumentoDeCorda();
        criarInstrumentoDeSopro();
    }

    public void criarInstrumentoDeCorda() {
        Violao i1   = new Violao();
        Violino i2  = new Violino();
        Guitarra i3 = new Guitarra();
        listaInstrumentosDeCorda.add(i1);
        listaInstrumentosDeCorda.add(i2);
        listaInstrumentosDeCorda.add(i3);
    }

    public void criarInstrumentoDeSopro() {
        Flauta i1   = new Flauta();
        Saxofone i2 = new Saxofone();
        listaInstrumentosDeSopro.add(i1);
        listaInstrumentosDeSopro.add(i2);
    }

    public void mostrarInstrumentos() {
        System.out.println("Instrumentos de corda: ");
        if(listaInstrumentosDeCorda.size() == 0){
            System.out.println("\tNo momento não há instrumentos de corda.");
        }
        else{
            for(int i = 0 ; i < listaInstrumentosDeCorda.size(); i++) {
                System.out.println("\t"+(i+1)+". "+listaInstrumentosDeCorda.get(i).getNome());
            }
        }
        System.out.println("Instrumentos de sopro: ");
        if(listaInstrumentosDeSopro.size() == 0) {
            System.out.println("\tNo momento não há cinstrumentos de sopro.");
        }
        else{
            for(int i = 0; i < listaInstrumentosDeSopro.size(); i++) {
                System.out.println("\t"+(i+1)+". "+listaInstrumentosDeSopro.get(i).getNome());
            }
        }
    }
}
