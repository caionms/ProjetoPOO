package com.projetopoo;

import com.projetopoo.instrumentos.Instrumento;
import com.projetopoo.instrumentos.impl.Flauta;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class InstrumentoFrame extends JFrame {

    private final Instrumento instrumento;

    public InstrumentoFrame(Instrumento instrumento) {
        super(instrumento.getNome()); //chama o construtor do JFrame e passa o nome da janela
        this.instrumento = instrumento;
        this.criarOpcoes(); //chama a função para crias as opções de notas
    }

    private void criarOpcoes(){
        Flauta f = new Flauta();
        List<Nota>  l = f.getNotes();

        setLayout(new FlowLayout()); //escolhe o layout

        JPanel panelDados = new JPanel(); //cria o painel que vai ter o preenchimento de dados
        panelDados.setLayout(new FlowLayout()); //boxlayout ordenando pelo eixo

        AtomicInteger index = new AtomicInteger();
        this.instrumento.getNotes().forEach(nota -> {
            NotaAction notaAction = new NotaAction(this.instrumento, index.getAndIncrement());
            JButton botaoNota = new JButton(nota.getLabel()); //cria o botao Nota
            botaoNota.setPreferredSize(new Dimension(130,40)); //mudar o tamanho do botão
            botaoNota.addActionListener(notaAction); //objeto ajudaAction faz açao
            panelDados.add(botaoNota);
        });

        add(panelDados);
    }

    private static class NotaAction implements ActionListener { //classe pra criar o objeto que ira fazer a ação

        private final Instrumento instrumento;
        private final int indexNota;

        public NotaAction(Instrumento instrumento, int indexNota) {
            this.instrumento = instrumento;
            this.indexNota = indexNota;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            this.instrumento.play(this.indexNota);
        }
    }

}
