import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CaixaDeMusicaGUI extends JFrame{

    public CaixaDeMusicaGUI(){
        super("Caixa de Música"); //chama o construtor do JFrame e passa o nome da janela

        criarMenu(); //chama a função pra criar a barra de menu
        //criarOpcoes(); //chama a função para crias as opções de instrumentos
    }

    private void criarMenu(){
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

    private class SobreAction implements ActionListener { //classe pra criar o objeto que ira fazer a ação

        @Override
        public void actionPerformed(ActionEvent e) { //recebe um evento
            JOptionPane.showMessageDialog(null, "Projeto POO - Caixa de Instrumentos\nAlunos: Caio Nery e Luca Argolo", "Sobre", JOptionPane.PLAIN_MESSAGE);
        }
    }

    private class ComoUsarAction implements ActionListener { //classe pra criar o objeto que ira fazer a ação

        @Override
        public void actionPerformed(ActionEvent e) { //recebe um evento
            JOptionPane.showMessageDialog(null, "1. Clique no instrumento de sua preferência\n2. Na nova janela aberta, escolha a nota que gostaria de escutar", "Como Usar", JOptionPane.PLAIN_MESSAGE);
        }
    }
}
