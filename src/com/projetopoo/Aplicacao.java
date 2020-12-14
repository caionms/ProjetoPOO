package com.projetopoo;

import javax.swing.*;

public class Aplicacao {

    public static void main(String[] args){
        CaixaDeInstrumentos c1 = new CaixaDeInstrumentos();

        c1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //define o padrão de fechamento da janela
        c1.setSize(240,360); //define o tamanho da janela
        c1.setVisible(true); //define que a janela é visivel
    }

}
