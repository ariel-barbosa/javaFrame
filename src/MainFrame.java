import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.*;
import javax.swing.plaf.DimensionUIResource;

public class MainFrame extends JFrame {


    JTextField primeiroNome, segundoNome;
    JLabel labelBemVindo;
    
    public void inicializar() {

        Font mainFont = new Font("Concert_One", Font.BOLD, 18);

        // parte de cima do painel é o FORM
        JLabel nome = new JLabel("Primeiro Nome");
        nome.setFont(mainFont);
        JLabel sobrenome = new JLabel("Sobrenome");
        sobrenome.setFont(mainFont);

        primeiroNome = new JTextField();
        primeiroNome.setFont(mainFont);

        segundoNome = new JTextField();
        segundoNome.setFont(mainFont);

        JPanel formPanel = new JPanel();
        formPanel.setLayout(new GridLayout(4, 1, 5, 5));
        formPanel.add(nome);
        formPanel.add(sobrenome);
        formPanel.add(primeiroNome);
        formPanel.add(segundoNome);


        // Bem Vindo Label
        labelBemVindo = new JLabel();
        labelBemVindo.setFont(mainFont);



        // botoes do Painel
        JButton btnOK = new JButton("OK");
        btnOK.setFont(mainFont);
        btnOK.addActionListener((ActionEvent e) -> {
            String nomeStr = primeiroNome.getText();
            String sobrenomeStr = segundoNome.getText();
            labelBemVindo.setText("Bem-Vindo " + nomeStr + " " + sobrenomeStr);
        } // add ação do botão | O que acontece quando aperto o botão
        );

        JButton btnClear = new JButton("LIMPAR");
        btnClear.setFont(mainFont);
        btnClear.addActionListener(e -> {
            primeiroNome.setText(" ");
            segundoNome.setText(" ");
            labelBemVindo.setText(" ");
        });

        JPanel botoes = new JPanel();
        botoes.setLayout(new GridLayout(1, 2, 5, 5));
        botoes.add(btnOK);
        botoes.add(btnClear);


        // main panel
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());
        mainPanel.setBackground(new Color(128, 128, 255));
        mainPanel.add(formPanel, BorderLayout.NORTH);
        mainPanel.add(labelBemVindo, BorderLayout.CENTER);
        mainPanel.add(botoes, BorderLayout.SOUTH);

        add(mainPanel);

        // atributos iniciais para o JFrame
        setTitle("JFrame");
        setSize(500,600);
        setMinimumSize(new DimensionUIResource(300, 400));
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        
    }

    public static void main(String[] args) {
        MainFrame tela = new MainFrame();
        tela.inicializar();
    }
}
