/**
 *  Classe para prencher a janela do instrumento com as opções de nota.
 *  @author Caio Nery e Luca Argolo
 *  @version final
 */

package com.projetopoo;

import com.projetopoo.instrumentos.Instrumento;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.atomic.AtomicInteger;

public class InstrumentoFrame extends JFrame {

    private final Instrumento instrumento;

    public InstrumentoFrame(Instrumento instrumento) {
        super(instrumento.getNome()); //chama o construtor do JFrame e passa o nome da janela
        this.instrumento = instrumento;
        this.criarMenu();
        this.criarOpcoes(); //chama a função para crias as opções de notas
    }

    private void criarMenu() {
        JMenu menuAjuda = new JMenu("Ajuda"); //cria a opção no menu com nome Ajuda

        SobreAction sobreAction = new SobreAction(this.instrumento); //objeto que faz a ação

        JMenuItem menuItemSobre = new JMenuItem("Sobre o instrumento"); //cria um item na opção Ajuda
        menuItemSobre.addActionListener(sobreAction); //objeto ajudaAction faz açao
        menuAjuda.add(menuItemSobre); //adiciona o item na opção Ajuda

        JMenuBar barra = new JMenuBar(); //cria uma barra de menu
        setJMenuBar(barra); //define a barra como a que foi criada
        barra.add(menuAjuda); //adiciona a opção Ajuda na barra
    }

    private void criarOpcoes(){
        setLayout(new BorderLayout()); //escolhe o layout

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

        add(panelDados, BorderLayout.CENTER);
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

    private static class SobreAction implements ActionListener { //classe pra criar o objeto que ira fazer a ação

        private final Instrumento instrumento;

        public SobreAction(Instrumento instrumento) {
            this.instrumento = instrumento;
        }

        @Override
        public void actionPerformed(ActionEvent e) { //recebe um evento
            String message;
            try {
                message = Instrumento.getInstrumentData(this.instrumento);
            }catch (Exception error) {
                error.printStackTrace();
                message = error.getMessage();
            }
            JOptionPane.showMessageDialog(null, "<html><body><p style='width: 200px;'>"+message+"</p></body></html>", "Sobre", JOptionPane.PLAIN_MESSAGE);
        }
    }

}
