package com.projetopoo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaixaDeInstrumentos extends JFrame{

    public CaixaDeInstrumentos() {
        super("Caixa de Música"); //chama o construtor do JFrame e passa o nome da janela

        criarMenu(); //chama a função pra criar a barra de menu
        criarOpcoes(); //chama a função para crias as opções de com.projetopoo.instrumentos
    }

    private void criarMenu() {
        JMenu menuAjuda = new JMenu("Ajuda"); //cria a opção no menu com nome Ajuda

        SobreAction sobreAction = new SobreAction(); //objeto que faz a ação
        ComoUsarAction comoUsarAction = new ComoUsarAction(); //objeto que faz a ação

        JMenuItem menuItemComoUsar = new JMenuItem("Como usar"); //cria um item na opção Ajuda
        menuItemComoUsar.addActionListener(comoUsarAction); //objeto ajudaAction faz açao
        menuAjuda.add(menuItemComoUsar); //adiciona o item na opção Ajuda

        JMenuItem menuItemSobre = new JMenuItem("Sobre..."); //cria um item na opção Ajuda
        menuItemSobre.addActionListener(sobreAction); //objeto ajudaAction faz açao
        menuAjuda.add(menuItemSobre); //adiciona o item na opção Ajuda

        JMenuBar barra = new JMenuBar(); //cria uma barra de menu
        setJMenuBar(barra); //define a barra como a que foi criada
        barra.add(menuAjuda); //adiciona a opção Ajuda na barra
    }

    private void criarOpcoes() {
        setLayout(new BorderLayout()); //escolhe o layout

        JPanel panelTitulo = new JPanel(); //cria o primeiro painel que será para o titulo
        panelTitulo.setLayout(new FlowLayout()); //escolhe o layout para o painel criado

        JLabel titulo = new JLabel("Caixa de Música"); //cria um label
        titulo.setFont(new Font("Verdana", Font.PLAIN, 24)); //escolhe a fonte do tipo verdana, regular, de tamanho 16

        panelTitulo.add(titulo); //adiciona no painel o label titulo

        JPanel panelDados = new JPanel(); //cria o painel que vai ter o preenchimento de dados
        panelDados.setLayout(new BoxLayout(panelDados, BoxLayout.Y_AXIS)); //boxlayout ordenando pelo eixo y

        JPanel panelaux1 = new JPanel(); //cria o painel que vai ter o preenchimento de dados
        panelaux1.setLayout(new BorderLayout()); //escolhe o layout para o painel criado

        JPanel panelaux2 = new JPanel(); //cria o painel que vai ter o preenchimento de dados
        panelaux2.setLayout(new BorderLayout()); //escolhe o layout para o painel criado

        JPanel panelaux3 = new JPanel(); //cria o painel que vai ter o preenchimento de dados
        panelaux3.setLayout(new BorderLayout()); //escolhe o layout para o painel criado

        JPanel panelaux4 = new JPanel(); //cria o painel que vai ter o preenchimento de dados
        panelaux4.setLayout(new BorderLayout()); //escolhe o layout para o painel criado


        GuitarraAction guitarraAction = new GuitarraAction();
        JButton botaoGuitarra = new JButton("Guitarra"); //cria o botao OK
        botaoGuitarra.setPreferredSize(new Dimension(280,25)); //mudar o tamanho do botão - 280/23 com menu
        botaoGuitarra.addActionListener(guitarraAction); //objeto ajudaAction faz açao

        ViolaoAction violaoAction = new ViolaoAction();
        JButton botaoViolao = new JButton("Violão"); //cria o botao OK
        botaoViolao.setPreferredSize(new Dimension(280,25)); //mudar o tamanho do botão - 280/23 com menu
        botaoViolao.addActionListener(violaoAction); //objeto ajudaAction faz açao

        ViolinoAction violinoAction = new ViolinoAction();
        JButton botaoViolino = new JButton("Violino"); //cria o botao OK
        botaoViolino.setPreferredSize(new Dimension(280,25)); //mudar o tamanho do botão - 280/23 com menu
        botaoViolino.addActionListener(violinoAction); //objeto ajudaAction faz açao

        BaixoAction baixoAction = new BaixoAction();
        JButton botaoBaixo = new JButton("Baixo"); //cria o botao OK
        botaoBaixo.setPreferredSize(new Dimension(280,25)); //mudar o tamanho do botão - 280/23 com menu
        botaoBaixo.addActionListener(baixoAction); //objeto ajudaAction faz açao

        FlautaAction flautaAction = new FlautaAction();
        JButton botaoFlauta = new JButton("Flauta"); //cria o botao OK
        botaoFlauta.setPreferredSize(new Dimension(280,25)); //mudar o tamanho do botão - 280/23 com menu
        botaoFlauta.addActionListener(flautaAction); //objeto ajudaAction faz açao

        SaxofoneAction saxofoneAction = new SaxofoneAction();
        JButton botaoSaxofone = new JButton("Saxofone"); //cria o botao OK
        botaoSaxofone.setPreferredSize(new Dimension(280,25)); //mudar o tamanho do botão - 280/23 com menu
        botaoSaxofone.addActionListener(saxofoneAction); //objeto ajudaAction faz açao

        panelaux1.add(botaoGuitarra, BorderLayout.WEST); //adiciona no painel o label no canto esquerdo
        panelaux1.add(botaoViolao, BorderLayout.EAST); //adiciona no panel o campo no canto direito
        panelaux2.add(botaoBaixo, BorderLayout.WEST);
        panelaux2.add(botaoViolino, BorderLayout.EAST);
        panelaux3.add(botaoFlauta, BorderLayout.WEST);
        panelaux3.add(botaoSaxofone, BorderLayout.EAST);

        panelDados.add(panelaux1); //adiciona os 4 paineis na vertical no boxlayout para ficarem ordenados
        panelDados.add(panelaux2);
        panelDados.add(panelaux3);
        panelDados.add(panelaux4);

        JPanel panelBotao = new JPanel(); //cria o painel do botao
        panelBotao.setLayout(new BorderLayout()); //define o layout do painel

        add(panelTitulo, BorderLayout.NORTH); //adiciona o painel no norte
        add(panelDados, BorderLayout.CENTER); //adiciona o painel no centro
    }

    private static class SobreAction implements ActionListener { //classe pra criar o objeto que ira fazer a ação
        @Override
        public void actionPerformed(ActionEvent e) { //recebe um evento
            JOptionPane.showMessageDialog(null, "Projeto POO - Caixa de Instrumentos\nAlunos: Caio Nery e Luca Argolo", "Sobre", JOptionPane.PLAIN_MESSAGE);
        }
    }

    private static class ComoUsarAction implements ActionListener { //classe pra criar o objeto que ira fazer a ação
        @Override
        public void actionPerformed(ActionEvent e) { //recebe um evento
            JOptionPane.showMessageDialog(null, "1. Clique no instrumento de sua preferência\n2. Na nova janela aberta, escolha a nota que gostaria de escutar", "Como Usar", JOptionPane.PLAIN_MESSAGE);
        }
    }

    private static class GuitarraAction implements ActionListener{ //classe pra criar o objeto que ira fazer a ação
        @Override
        public void actionPerformed(ActionEvent e) {
            GuitarraFrame f = new GuitarraFrame();
            f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            f.setSize(300,300);
            f.setVisible(true);        }
    }

    private static class ViolaoAction implements ActionListener{ //classe pra criar o objeto que ira fazer a ação
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Som de violão", "Violão", JOptionPane.PLAIN_MESSAGE);
        }
    }

    private static class ViolinoAction implements ActionListener{ //classe pra criar o objeto que ira fazer a ação
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Som de violino", "Violino", JOptionPane.PLAIN_MESSAGE);
        }
    }

    private static class BaixoAction implements ActionListener{ //classe pra criar o objeto que ira fazer a ação
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Som de baixo", "Baixo", JOptionPane.PLAIN_MESSAGE);
        }
    }

    private static class SaxofoneAction implements ActionListener{ //classe pra criar o objeto que ira fazer a ação
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Som de saxofone", "Saxofone", JOptionPane.PLAIN_MESSAGE);
        }
    }

    private static class FlautaAction implements ActionListener{ //classe pra criar o objeto que ira fazer a ação
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(null, "Som de flauta", "Flauta", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
