package com.projetopoo;

import com.projetopoo.instrumentos.impl.Saxofone;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class SaxofoneFrame extends JFrame{
    public SaxofoneFrame() {
        super("Saxofone"); //chama o construtor do JFrame e passa o nome da janela
        criarOpcoes(); //chama a função para crias as opções de notas
    }

    private void criarOpcoes(){
        Saxofone s = new Saxofone();
        List<Nota>  l = s.getNotes();

        setLayout(new FlowLayout()); //escolhe o layout

        JPanel panelDados = new JPanel(); //cria o painel que vai ter o preenchimento de dados
        panelDados.setLayout(new FlowLayout()); //boxlayout ordenando pelo eixo

        NotaAction notaAction = new NotaAction();
        JButton botaoNota = new JButton("Nota"); //cria o botao Nota
        botaoNota.setPreferredSize(new Dimension(130,40)); //mudar o tamanho do botão
        botaoNota.addActionListener(notaAction); //objeto ajudaAction faz açao

        panelDados.add(botaoNota);
        add(panelDados);
    }

    private static class NotaAction implements ActionListener { //classe pra criar o objeto que ira fazer a ação
        @Override
        public void actionPerformed(ActionEvent e) {
            //tocar som
        }
    }

}
