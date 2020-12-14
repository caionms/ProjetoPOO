package com.projetopoo;

import com.projetopoo.instrumentos.Instrumento;
import com.projetopoo.instrumentos.impl.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class CaixaDeInstrumentos extends JFrame {

    public static Instrumento BAIXO = new Baixo();
    public static Instrumento FLAUTA = new Flauta();
    public static Instrumento GUITARRA = new Guitarra();
    public static Instrumento SAXOFONE = new Saxofone();
    public static Instrumento VIOLAO = new Violao();
    public static Instrumento VIOLINO = new Violino();

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

        //Icon guitarraIcon = new ImageIcon("/home/caio/ProjetoPOO/resources/icons/guitarra.jpeg");
        Icon guitarraIcon = null, violaoIcon = null, violinoIcon = null, baixoIcon = null, flautaIcon = null, saxofoneIcon = null;
        try {
            Image imgGuitarra = new ImageIcon(ImageIO.read(Aplicacao.class.getResourceAsStream("/icons/guitarra.jpeg"))).getImage();
            Image newimgGuitarra = imgGuitarra.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
            guitarraIcon = new ImageIcon(newimgGuitarra);
            Image imgViolao = new ImageIcon(ImageIO.read(Aplicacao.class.getResourceAsStream("/icons/violao.jpeg"))).getImage();
            Image newimgViolao = imgViolao.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
            violaoIcon = new ImageIcon(newimgViolao);
            Image imgViolino = new ImageIcon(ImageIO.read(Aplicacao.class.getResourceAsStream("/icons/violino.jpeg"))).getImage();
            Image newimgViolino = imgViolino.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
            violinoIcon = new ImageIcon(newimgViolino);
            Image imgBaixo = new ImageIcon(ImageIO.read(Aplicacao.class.getResourceAsStream("/icons/baixo.jpeg"))).getImage();
            Image newimgBaixo = imgBaixo.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
            baixoIcon = new ImageIcon(newimgBaixo);
            Image imgFlauta = new ImageIcon(ImageIO.read(Aplicacao.class.getResourceAsStream("/icons/flauta.jpeg"))).getImage();
            Image newimgFlauta = imgFlauta.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
            flautaIcon = new ImageIcon(newimgFlauta);
            Image imgSaxofone = new ImageIcon(ImageIO.read(Aplicacao.class.getResourceAsStream("/icons/saxofone.jpeg"))).getImage();
            Image newimgSaxofone = imgSaxofone.getScaledInstance(70, 70, java.awt.Image.SCALE_SMOOTH);
            saxofoneIcon = new ImageIcon(newimgSaxofone);
        } catch (IOException e) {
            e.printStackTrace();
        }

        InstrumentoAction guitarraAction = new InstrumentoAction(GUITARRA);
        JButton botaoGuitarra = new JButton(guitarraIcon); //cria o botao OK
        //botaoGuitarra.setPreferredSize(new Dimension(280,25)); //mudar o tamanho do botão - 280/23 com menu
        botaoGuitarra.addActionListener(guitarraAction); //objeto ajudaAction faz açao

        InstrumentoAction violaoAction = new InstrumentoAction(VIOLAO);
        JButton botaoViolao = new JButton(violaoIcon); //cria o botao OK
        //botaoViolao.setPreferredSize(new Dimension(280,25)); //mudar o tamanho do botão - 280/23 com menu
        botaoViolao.addActionListener(violaoAction); //objeto ajudaAction faz açao

        InstrumentoAction violinoAction = new InstrumentoAction(VIOLINO);
        JButton botaoViolino = new JButton(violinoIcon); //cria o botao OK
        //botaoViolino.setPreferredSize(new Dimension(280,25)); //mudar o tamanho do botão - 280/23 com menu
        botaoViolino.addActionListener(violinoAction); //objeto ajudaAction faz açao

        InstrumentoAction baixoAction = new InstrumentoAction(BAIXO);
        JButton botaoBaixo = new JButton(baixoIcon); //cria o botao OK
        //botaoBaixo.setPreferredSize(new Dimension(280,25)); //mudar o tamanho do botão - 280/23 com menu
        botaoBaixo.addActionListener(baixoAction); //objeto ajudaAction faz açao

        InstrumentoAction flautaAction = new InstrumentoAction(FLAUTA);
        JButton botaoFlauta = new JButton(flautaIcon); //cria o botao OK
        //botaoFlauta.setPreferredSize(new Dimension(280,25)); //mudar o tamanho do botão - 280/23 com menu
        botaoFlauta.addActionListener(flautaAction); //objeto ajudaAction faz açao

        InstrumentoAction saxofoneAction = new InstrumentoAction(SAXOFONE);
        JButton botaoSaxofone = new JButton(saxofoneIcon); //cria o botao OK
        //botaoSaxofone.setPreferredSize(new Dimension(280,25)); //mudar o tamanho do botão - 280/23 com menu
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

    private static class InstrumentoAction implements ActionListener{ //classe pra criar o objeto que ira fazer a ação

        private Instrumento instrumento;

        public InstrumentoAction(Instrumento instrumento) {
            this.instrumento = instrumento;
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            InstrumentoFrame f = new InstrumentoFrame(this.instrumento);
            f.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
            f.setSize(300,310);
            f.setVisible(true);
        }
    }
}
