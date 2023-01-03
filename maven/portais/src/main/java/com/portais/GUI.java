package com.portais;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.io.File;
import java.util.ArrayList;

class GUI{
    public TreeRoot root;
    JFrame frame;
    JPanel centerPanel;
    JPanel bottomPanel;
    JPanel sidePanel;
    Cliente currentClient;
    ArrayList<Integer> currentResult;
    public ArrayList<Integer> indexArray;
    public ArrayList<Integer> multiResultsArray;
    Leitura leitura;
    int page = 0;
    int maxPage = 0;
    int offset = 0;

    public GUI(){
        root = new TreeRoot();

        frame = new JFrame("Portais");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
        frame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

        JMenuBar menuBar = menu();
        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        
        currentClient = new Cliente();

        centerPanel = new JPanel();
        frame.getContentPane().add(BorderLayout.CENTER, centerPanel);

        multiResultsArray = new ArrayList<Integer>();
        sidePanel = new JPanel();
        sidePanel();
        frame.getContentPane().add(BorderLayout.EAST, sidePanel);
        frame.getContentPane().add(BorderLayout.WEST, new JLabel(" "));
        
        
        bottomPanel = bottomPanel();
        frame.getContentPane().add(BorderLayout.SOUTH, bottomPanel);
        
    }

    public void Show(){
        frame.setVisible(true);
    }

    public void Close(){
        frame.setVisible(false);
        frame.dispose();
        System.exit(0);
    }

    public JMenuBar menu(){
        JMenuBar mb = new JMenuBar();

        JMenu m1 = new JMenu("Opções");
        JMenuItem m11 = new JMenuItem("Novo");
        m11.addActionListener(e -> replacePanel(newClientePanel()));
        JMenuItem m12 = new JMenuItem("Abrir");
        m12.addActionListener(e -> openFile());
        JMenuItem m13 = new JMenuItem("Perfil de Cliente");
        m13.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(currentClient.nome!=null)
                    replacePanel(editPanel());
            }
        });
        JMenuItem m14 = new JMenuItem("Exportar Relatório (PDF)");
        m14.addActionListener(e -> new GeneratePDF(leitura, root));
        JMenuItem m15 = new JMenuItem("Histórico");
        m15.addActionListener(e -> replacePanel(historyPanel()));
        JMenuItem m16 = new JMenuItem("Sair");
        m16.addActionListener(e -> Close());
        mb.add(m1);
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(m15);
        m1.add(m16);
        

        return mb;
    }

    public void openFile(){
        try {
            JFileChooser fileChooser = new JFileChooser("portais/data/");

            int result = fileChooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION)
                leitura = Leitura.fromFile(fileChooser.getSelectedFile().getPath().toString());

            replacePanel(editPanel());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public JPanel editPanel(){
        JPanel biggest = new JPanel(new BorderLayout());
        JPanel bigger = new JPanel(new GridLayout(1,4));
        JPanel panel = new JPanel(new GridLayout(4,1));
        JPanel small, smaller1, smaller2;
        JLabel textLabel;
        JButton button;
        JTextField textField;
        ArrayList<JPanel> smalls = new ArrayList<JPanel>();
        ArrayList<JPanel> smallers1 = new ArrayList<JPanel>();
        ArrayList<JPanel> smallers2 = new ArrayList<JPanel>();
        ArrayList<JTextField> textFields = new ArrayList<JTextField>();
        ArrayList<JLabel> labels = new ArrayList<JLabel>();

        try{
            BufferedImage savePicture = ImageIO.read(new File("portais/assets/save.png"));
            BufferedImage editPicture = ImageIO.read(new File("portais/assets/edit.png"));

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Nome do Cliente");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(leitura.cliente.nome);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(leitura.cliente.nome, 16);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(0), smallers2.get(0),"Nome do Cliente"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.nome = textFields.get(0).getText();
                    labels.get(0).setText(leitura.cliente.nome);
                    switch1to2(smalls.get(0), smallers1.get(0),"Nome do Cliente");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Morada");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(leitura.cliente.morada);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(leitura.cliente.morada, 16);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(1), smallers2.get(1),"Morada"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.morada = textFields.get(1).getText();
                    labels.get(1).setText(leitura.cliente.morada);
                    switch1to2(smalls.get(1), smallers1.get(1),"Morada");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Nome do Terapeuta");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(leitura.cliente.nomeTerapeuta);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(leitura.cliente.nomeTerapeuta, 16);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(2), smallers2.get(2),"Nome do Terapeuta"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.nomeTerapeuta = textFields.get(2).getText();
                    labels.get(2).setText(leitura.cliente.nomeTerapeuta);
                    switch1to2(smalls.get(2), smallers1.get(2),"Nome do Terapeuta");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Nome do Espaço");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(leitura.cliente.nomeEspaço);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(leitura.cliente.nomeEspaço, 16);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(3), smallers2.get(3),"Nome do Espaço"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.nomeEspaço = textFields.get(3).getText();
                    labels.get(3).setText(leitura.cliente.nomeEspaço);
                    switch1to2(smalls.get(3), smallers1.get(3),"Nome do Espaço");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            bigger.add(panel);

            JPanel newBigger = new JPanel(new BorderLayout());

            newBigger.add(bigger,BorderLayout.CENTER);



            biggest.add(newBigger,BorderLayout.NORTH);
            bigger = new JPanel(new GridLayout(1,4));

            //Planos 1ª
            panel = new JPanel(new GridLayout(8,2));

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Plano Físico/1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.planoFisico1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.planoFisico1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(4), smallers2.get(4),"Plano Físico/1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.planoFisico1 = Integer.parseInt(textFields.get(4).getText());
                    labels.get(4).setText(""+leitura.cliente.planoFisico1);
                    switch1to2(smalls.get(4), smallers1.get(4),"Plano Físico/1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Plano Mental/1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.planoMental1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.planoMental1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(5), smallers2.get(5),"Plano Mental/1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.planoMental1 = Integer.parseInt(textFields.get(5).getText());
                    labels.get(5).setText(""+leitura.cliente.planoMental1);
                    switch1to2(smalls.get(5), smallers1.get(5),"Plano Mental/1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Plano Emocional/1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.planoEmocional1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.planoEmocional1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(6), smallers2.get(6),"Plano Emocional/1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.planoEmocional1 = Integer.parseInt(textFields.get(6).getText());
                    labels.get(6).setText(""+leitura.cliente.planoEmocional1);
                    switch1to2(smalls.get(6), smallers1.get(6),"Plano Emocional/1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Plano Espiritual/1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.planoEspiritual1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.planoEspiritual1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(7), smallers2.get(7),"Plano Espiritual/1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.planoEspiritual1 = Integer.parseInt(textFields.get(7).getText());
                    labels.get(7).setText(""+leitura.cliente.planoEspiritual1);
                    switch1to2(smalls.get(7), smallers1.get(7),"Plano Espiritual/1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Plano Profissional/1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.planoProfissional1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.planoProfissional1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(8), smallers2.get(8),"Plano Profissional/1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.planoProfissional1 = Integer.parseInt(textFields.get(8).getText());
                    labels.get(8).setText(""+leitura.cliente.planoProfissional1);
                    switch1to2(smalls.get(8), smallers1.get(8),"Plano Profissional/1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Plano Financeiro/1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.planoFinanceiro1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.planoFinanceiro1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(9), smallers2.get(9),"Plano Financeiro/1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.planoFinanceiro1 = Integer.parseInt(textFields.get(9).getText());
                    labels.get(9).setText(""+leitura.cliente.planoFinanceiro1);
                    switch1to2(smalls.get(9), smallers1.get(9),"Plano Financeiro/1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Influências Neg. Ext./1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.influenNegExt1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.influenNegExt1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(10), smallers2.get(10),"Influências Neg. Ext./1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.influenNegExt1 = Integer.parseInt(textFields.get(10).getText());
                    labels.get(10).setText(""+leitura.cliente.influenNegExt1);
                    switch1to2(smalls.get(10), smallers1.get(10),"Influências Neg. Ext./1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Influências Neg. Int./1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.influenNegExt1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.influenNegExt1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(11), smallers2.get(11),"Influências Neg. Int./1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.influenNegExt1 = Integer.parseInt(textFields.get(11).getText());
                    labels.get(11).setText(""+leitura.cliente.influenNegExt1);
                    switch1to2(smalls.get(11), smallers1.get(11),"Influências Neg. Int./1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            bigger.add(panel);

            //Planos 2ª Leitura
            panel = new JPanel(new GridLayout(8,2));

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Plano Físico/2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.planoFisico2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.planoFisico2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(12), smallers2.get(12),"Plano Físico/2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.planoFisico2 = Integer.parseInt(textFields.get(12).getText());
                    labels.get(12).setText(""+leitura.cliente.planoFisico2);
                    switch1to2(smalls.get(12), smallers1.get(12),"Plano Físico/2ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Plano Mental/2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.planoMental2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.planoMental2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(13), smallers2.get(13),"Plano Mental/2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.planoMental2 = Integer.parseInt(textFields.get(13).getText());
                    labels.get(13).setText(""+leitura.cliente.planoMental2);
                    switch1to2(smalls.get(13), smallers1.get(13),"Plano Mental/2ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Plano Emocional/2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.planoEmocional2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.planoEmocional2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(14), smallers2.get(14),"Plano Emocional/2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.planoEmocional2 = Integer.parseInt(textFields.get(14).getText());
                    labels.get(14).setText(""+leitura.cliente.planoEmocional2);
                    switch1to2(smalls.get(14), smallers1.get(14),"Plano Emocional/2ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Plano Espiritual/2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.planoEspiritual2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.planoEspiritual2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(15), smallers2.get(15),"Plano Espiritual/2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.planoEspiritual2 = Integer.parseInt(textFields.get(15).getText());
                    labels.get(15).setText(""+leitura.cliente.planoEspiritual2);
                    switch1to2(smalls.get(15), smallers1.get(15),"Plano Espiritual/2ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Plano Profissional/2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.planoProfissional2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.planoProfissional2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(16), smallers2.get(16),"Plano Profissional/2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.planoProfissional2 = Integer.parseInt(textFields.get(16).getText());
                    labels.get(16).setText(""+leitura.cliente.planoProfissional2);
                    switch1to2(smalls.get(16), smallers1.get(16),"Plano Profissional/2ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Plano Financeiro/2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.planoFinanceiro2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.planoFinanceiro2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(17), smallers2.get(17),"Plano Financeiro/2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.planoFinanceiro2 = Integer.parseInt(textFields.get(17).getText());
                    labels.get(17).setText(""+leitura.cliente.planoFinanceiro2);
                    switch1to2(smalls.get(17), smallers1.get(17),"Plano Financeiro/2ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Influências Neg. Ext./2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.influenNegExt2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.influenNegExt2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(18), smallers2.get(18),"Influências Neg. Ext./2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.influenNegExt2 = Integer.parseInt(textFields.get(18).getText());
                    labels.get(18).setText(""+leitura.cliente.influenNegExt2);
                    switch1to2(smalls.get(18), smallers1.get(18),"Influências Neg. Ext./2ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Influências Neg. Int./2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.influenNegExt2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.influenNegExt2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(19), smallers2.get(19),"Influências Neg. Int./2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.influenNegExt2 = Integer.parseInt(textFields.get(19).getText());
                    labels.get(19).setText(""+leitura.cliente.influenNegExt2);
                    switch1to2(smalls.get(19), smallers1.get(19),"Influências Neg. Int./2ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            bigger.add(panel);
            
            //////////////////////////////////////////////////////////////////////////////////////////////////////////////Chakra 1ª
            panel = new JPanel(new GridLayout(8,2));

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Chakra Coronário/1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.chakraCoronário1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraCoronário1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(20), smallers2.get(20),"Chakra Coronário/1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.chakraCoronário1 = Integer.parseInt(textFields.get(20).getText());
                    labels.get(20).setText(""+leitura.cliente.chakraCoronário1);
                    switch1to2(smalls.get(20), smallers1.get(20),"Chakra Coronário/1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Chakra Frontal/1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.chakraFrontal1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraFrontal1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(21), smallers2.get(21),"Chakra Frontal/1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.chakraFrontal1 = Integer.parseInt(textFields.get(21).getText());
                    labels.get(21).setText(""+leitura.cliente.chakraFrontal1);
                    switch1to2(smalls.get(21), smallers1.get(21),"Chakra Frontal/1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Chakra Laríngeo/1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.chakraLaríngeo1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraLaríngeo1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(22), smallers2.get(22),"Chakra Laríngeo/1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.chakraLaríngeo1 = Integer.parseInt(textFields.get(22).getText());
                    labels.get(22).setText(""+leitura.cliente.chakraLaríngeo1);
                    switch1to2(smalls.get(22), smallers1.get(22),"Chakra Laríngeo/1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Chakra Cardíaco/1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.chakraCardíaco1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraCardíaco1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(23), smallers2.get(23),"Chakra Cardíaco/1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.chakraCardíaco1 = Integer.parseInt(textFields.get(23).getText());
                    labels.get(23).setText(""+leitura.cliente.chakraCardíaco1);
                    switch1to2(smalls.get(23), smallers1.get(23),"Chakra Cardíaco/1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Chakra Solar/1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.chakraSolar1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraSolar1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(24), smallers2.get(24),"Chakra Solar/1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.chakraSolar1 = Integer.parseInt(textFields.get(24).getText());
                    labels.get(24).setText(""+leitura.cliente.chakraSolar1);
                    switch1to2(smalls.get(24), smallers1.get(24),"Chakra Solar/1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Chakra Umbilical/1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.chakraUmbilical1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraUmbilical1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(25), smallers2.get(25),"Chakra Umbilical/1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.chakraUmbilical1 = Integer.parseInt(textFields.get(25).getText());
                    labels.get(25).setText(""+leitura.cliente.chakraUmbilical1);
                    switch1to2(smalls.get(25), smallers1.get(25),"Chakra Umbilical/1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Chakra Raiz/1ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.chakraRaiz1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraRaiz1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(26), smallers2.get(26),"Chakra Raiz/1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.chakraRaiz1 = Integer.parseInt(textFields.get(26).getText());
                    labels.get(26).setText(""+leitura.cliente.chakraRaiz1);
                    switch1to2(smalls.get(26), smallers1.get(26),"Chakra Raiz/1ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            bigger.add(panel);
            //Chakra 2ª
            panel = new JPanel(new GridLayout(8,2));

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Chakra Coronário/2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.chakraCoronário2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraCoronário2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(27), smallers2.get(27),"Chakra Coronário/2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.chakraCoronário2 = Integer.parseInt(textFields.get(27).getText());
                    labels.get(27).setText(""+leitura.cliente.chakraCoronário2);
                    switch1to2(smalls.get(27), smallers1.get(27),"Chakra Coronário/2ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Chakra Frontal/2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.chakraFrontal2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraFrontal2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(28), smallers2.get(28),"Chakra Frontal/2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.chakraFrontal2 = Integer.parseInt(textFields.get(28).getText());
                    labels.get(28).setText(""+leitura.cliente.chakraFrontal2);
                    switch1to2(smalls.get(28), smallers1.get(28),"Chakra Frontal/2ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Chakra Laríngeo/2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.chakraLaríngeo2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraLaríngeo2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(29), smallers2.get(29),"Chakra Laríngeo/2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.chakraLaríngeo2 = Integer.parseInt(textFields.get(29).getText());
                    labels.get(29).setText(""+leitura.cliente.chakraLaríngeo2);
                    switch1to2(smalls.get(29), smallers1.get(29),"Chakra Laríngeo/2ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Chakra Cardíaco/2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.chakraCardíaco1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraCardíaco1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(30), smallers2.get(30),"Chakra Cardíaco/2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.chakraCardíaco2 = Integer.parseInt(textFields.get(30).getText());
                    labels.get(30).setText(""+leitura.cliente.chakraCardíaco2);
                    switch1to2(smalls.get(30), smallers1.get(30),"Chakra Cardíaco/2ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Chakra Solar/2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.chakraSolar2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraSolar2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(31), smallers2.get(31),"Chakra Solar/2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.chakraSolar2 = Integer.parseInt(textFields.get(31).getText());
                    labels.get(31).setText(""+leitura.cliente.chakraSolar2);
                    switch1to2(smalls.get(31), smallers1.get(31),"Chakra Solar");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Chakra Umbilical/2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.chakraUmbilical2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraUmbilical2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(32), smallers2.get(32),"Chakra Umbilical/2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.chakraUmbilical2 = Integer.parseInt(textFields.get(32).getText());
                    labels.get(32).setText(""+leitura.cliente.chakraUmbilical2);
                    switch1to2(smalls.get(32), smallers1.get(32),"Chakra Umbilical/2ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Chakra Raiz/2ª");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel(""+leitura.cliente.chakraRaiz2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraRaiz2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(33), smallers2.get(33),"Chakra Raiz/2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.chakraRaiz2 = Integer.parseInt(textFields.get(33).getText());
                    labels.get(33).setText(""+leitura.cliente.chakraRaiz2);
                    switch1to2(smalls.get(33), smallers1.get(33),"Chakra Raiz/2ª");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            panel.add(small);

            bigger.add(panel);

            //Observations  (out of order)
            small = new JPanel(new GridLayout(1,2));
            smalls.add(small);
            textLabel = new JLabel("Observações");
            small.add(textLabel);
            smaller1 = new JPanel();
            smallers1.add(smaller1);
            smaller2 = new JPanel();
            smallers2.add(smaller2);
            textLabel = new JLabel("<html><div WIDTH=850>"+leitura.observations+"</div></html>");
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(leitura.observations, 75);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(34), smallers2.get(34),"Observações"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.observations = textFields.get(34).getText();
                    labels.get(34).setText("<html><div WIDTH=850>"+leitura.observations+"</div></html>");
                    switch1to2(smalls.get(34), smallers1.get(34),"Observações");
                    leitura.Save();
                }
            });
            smaller2.add(button);
            small.add(smaller1);
            newBigger.add(small,BorderLayout.SOUTH);

            biggest.add(bigger,BorderLayout.CENTER);

        }catch (Exception e){
            e.printStackTrace();
        }

        page=0;
        maxPage=0;

        bigger = new JPanel();
        button = new JButton("Ver Resultados");
        button.addActionListener(e -> replacePanel(editResultsPanel()));
        bigger.add(button);
        button = new JButton("Continuar Leitura");
        button.addActionListener(e -> replacePanel(mainPanel()));
        bigger.add(button);
        biggest.add(bigger,BorderLayout.SOUTH);


        return biggest;
    }

    public JPanel editResultsPanel(){
        JPanel panel= new JPanel(new BorderLayout());
        int rownum = 10;
        

        if (rownum < leitura.historico.size()){
            maxPage = leitura.historico.size()/rownum;
        }else
            maxPage = 0;

        JPanel subPanel = new JPanel();
        JLabel titleLabel = new JLabel("Resultados de Leitura - "+leitura.cliente.nome);
        subPanel.add(titleLabel);
        panel.add(subPanel, BorderLayout.NORTH);
        
        subPanel = new JPanel(new GridLayout(rownum,1));
        try{
        BufferedImage deletPicture = ImageIO.read(new File("portais/assets/delet.png"));
        for(int i = rownum*page; i < Math.min(rownum*(page+1), leitura.historico.size()); i++){
            JPanel subSubPanel = new JPanel();
            Portal portal = root.portais.get(leitura.historico.get(i).get(0));
            Ferramenta ferramenta = portal.ferramentas.get(leitura.historico.get(i).get(1));
            JLabel resultadoLabel = new JLabel(portal.name + " "+ferramenta.name+" "+leitura.historico.get(i).subList(2, leitura.historico.get(i).size()));
            subSubPanel.add(resultadoLabel);
            JButton deletButton = new JButton(new ImageIcon(deletPicture));
            int newi = i;
            deletButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.historico.remove(newi);
                    page = 0;
                    replacePanel(editResultsPanel());
                }
            });
            subSubPanel.add(deletButton);
            subPanel.add(subSubPanel);
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        panel.add(subPanel, BorderLayout.CENTER);

        subPanel = new JPanel();
        JButton backButton = new JButton("Voltar");
        backButton.addActionListener(e -> replacePanel(editPanel()));
        subPanel.add(backButton);

        JButton prevPageButton = new JButton("◄");
        prevPageButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(page>0)
                    page--;
                replacePanel(editResultsPanel());
            }
        });

        if(maxPage!=0 && page>0)
            prevPageButton.setEnabled(true);
        else
            prevPageButton.setEnabled(false);

        subPanel.add(prevPageButton);

        JButton nextPageButton = new JButton("►");
        nextPageButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                if(page<maxPage)
                    page++;
                replacePanel(editResultsPanel());
            }
        });
        subPanel.add(nextPageButton);

        if(maxPage!=0 && page<maxPage)
            nextPageButton.setEnabled(true);
        else
            nextPageButton.setEnabled(false);

        panel.add(subPanel,BorderLayout.SOUTH);

        return panel;
    }

    public JPanel historyPanel(){
        JPanel panel= new JPanel(new BorderLayout());
        int rownum = 20;

        System.out.println(rownum);

        File folder = new File("./data/");
        File[] listOfFiles = folder.listFiles();
        System.out.println(listOfFiles);

        JPanel listPanel = new JPanel(new GridLayout(rownum,1));
        
        for (int i = listOfFiles.length - 1; i >= Math.max(listOfFiles.length-rownum,0);i--) {
            File file = listOfFiles[i];
            JButton listElement = new JButton(file.getName());
            System.out.println(listElement.getText());
            listElement.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura = Leitura.fromFile(file.getPath().toString());
                    replacePanel(editPanel());
                }
            });
            listPanel.add(listElement);
        }

        panel.add(listPanel,BorderLayout.CENTER);

        JLabel titleLabel = new JLabel("Histórico", JLabel.CENTER);
        System.out.println(titleLabel.getText());
        panel.add(titleLabel,BorderLayout.NORTH);

        return panel;
    }

    public void switch1to2(JPanel container,JPanel newPanel, String string){
        container.removeAll();
        container.add(new JLabel(string));
        container.add(newPanel);
        frame.repaint();
        frame.revalidate();
    }

    public JPanel newClientePanel(){
        JPanel panel = new JPanel(new BorderLayout());
        JPanel section = new JPanel();
        JPanel tempPanel;
        JLabel tempLabel;
        JTextField tempTextField ;
        ArrayList <JTextField> fields= new ArrayList<JTextField>();
        currentClient = new Cliente();

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Nome do Cliente:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Morada:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Nome do Terapeuta:");
        tempTextField = new JTextField(currentClient.nomeTerapeuta, 20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Nome do Espaço:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        panel.add(section,BorderLayout.NORTH);

        section = new JPanel(new GridLayout(9,1));

        section.add(new JLabel("1ª Leitura", JLabel.CENTER));


        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Plano Físico:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Plano Mental:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Plano Emocional:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Plano Espiritual:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Plano Profissional:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Plano Financeiro:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Influências Neg. Ext:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Influências Neg. Int.:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        panel.add(section,BorderLayout.WEST);

        section = new JPanel(new GridLayout(9,1));

        section.add(new JLabel("1ª Leitura", JLabel.CENTER));


        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Chakra Coronário:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Chakra Frontal:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Chakra Laríngeo:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Chakra Cardíaco:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Chakra Solar:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Chakra Umbilical:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(1,2));
        tempLabel = new JLabel("Chakra Raiz:");
        tempTextField = new JTextField(12);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        panel.add(section,BorderLayout.EAST);
        
        JPanel finalPanel = new JPanel(new BorderLayout());

        finalPanel.add(panel, BorderLayout.CENTER);

        JButton createButton = new JButton("Criar");
        createButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                currentClient.setNome(fields.get(0).getText());
                currentClient.setMorada(fields.get(1).getText());
                currentClient.setNomeTerapeuta(fields.get(2).getText());
                currentClient.setNomeEspaço(fields.get(3).getText());

                currentClient.setPlanoFisico1(Integer.parseInt(fields.get(4).getText()));
                currentClient.setPlanoMental1(Integer.parseInt(fields.get(5).getText()));
                currentClient.setPlanoEmocional1(Integer.parseInt(fields.get(6).getText()));
                currentClient.setPlanoEspiritual1(Integer.parseInt(fields.get(7).getText()));
                currentClient.setPlanoProfissional1(Integer.parseInt(fields.get(8).getText()));
                currentClient.setPlanoFinanceiro1(Integer.parseInt(fields.get(9).getText()));
                currentClient.setInfluenNegExt1(Integer.parseInt(fields.get(10).getText()));
                currentClient.setInfluenNegInt1(Integer.parseInt(fields.get(11).getText()));

                currentClient.setChakraCoronário1(Integer.parseInt(fields.get(12).getText()));
                currentClient.setChakraFrontal1(Integer.parseInt(fields.get(13).getText()));
                currentClient.setChakraLaríngeo1(Integer.parseInt(fields.get(14).getText()));
                currentClient.setChakraCardíaco1(Integer.parseInt(fields.get(15).getText()));
                currentClient.setChakraSolar1(Integer.parseInt(fields.get(16).getText()));
                currentClient.setChakraUmbilical1(Integer.parseInt(fields.get(17).getText()));
                currentClient.setChakraRaiz1(Integer.parseInt(fields.get(18).getText()));
                
                leitura = new Leitura(currentClient);

                bottomPanel.removeAll();
                bottomPanel.add(bottomPanel());

                replacePanel(mainPanel());
                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });
        finalPanel.add(createButton,BorderLayout.SOUTH);

        return finalPanel;
    }

    public JPanel bottomPanel(){
        JPanel bP = new JPanel();

        if(leitura != null){
            JButton homeButton = new JButton("Menu Principal");
            homeButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    page = 0;
                    maxPage = 0;
                    replacePanel(mainPanel());
                }
            } );
            bP.add(homeButton);

            
            JButton prevPageButton = new JButton("◄");
            prevPageButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(page>0)
                        page--;
                    if(currentResult.size()==2 && indexArray.isEmpty()){
                        replacePanel(resultadosPanel(root.portais.get(currentResult.get(0)).ferramentas.get(currentResult.get(1))));
                    }
                    if(indexArray.size()==1){
                        replacePanel(subFerramentaPanel(root.portais.get(currentResult.get(0)).ferramentas.get(currentResult.get(1)).subFerramentas.get(indexArray.get(0)),indexArray));
                    }
                    if(indexArray.size()==2){
                        replacePanel(subFerramentaPanel(root.portais.get(currentResult.get(0)).ferramentas.get(currentResult.get(1)).subFerramentas.get(indexArray.get(0)).subFerramentas.get(indexArray.get(1)),indexArray));
                    }
                    if(indexArray.size()==3){
                        replacePanel(subFerramentaPanel(root.portais.get(currentResult.get(0)).ferramentas.get(currentResult.get(1)).subFerramentas.get(indexArray.get(0)).subFerramentas.get(indexArray.get(1)).subFerramentas.get(indexArray.get(2)),indexArray));
                    }
                }
            });

            if(maxPage!=0 && page>0)
                prevPageButton.setEnabled(true);
            else
                prevPageButton.setEnabled(false);

            bP.add(prevPageButton);



            JButton nextPageButton = new JButton("►");
            nextPageButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(page<maxPage)
                        page++;
                    if(currentResult.size()==2 && indexArray.isEmpty()){
                        replacePanel(resultadosPanel(root.portais.get(currentResult.get(0)).ferramentas.get(currentResult.get(1))));
                    }
                    if(indexArray.size()==1){
                        replacePanel(subFerramentaPanel(root.portais.get(currentResult.get(0)).ferramentas.get(currentResult.get(1)).subFerramentas.get(indexArray.get(0)),indexArray));
                    }
                    if(indexArray.size()==2){
                        replacePanel(subFerramentaPanel(root.portais.get(currentResult.get(0)).ferramentas.get(currentResult.get(1)).subFerramentas.get(indexArray.get(0)).subFerramentas.get(indexArray.get(1)),indexArray));
                    }
                    if(indexArray.size()==3){
                        replacePanel(subFerramentaPanel(root.portais.get(currentResult.get(0)).ferramentas.get(currentResult.get(1)).subFerramentas.get(indexArray.get(0)).subFerramentas.get(indexArray.get(1)).subFerramentas.get(indexArray.get(2)),indexArray));
                    }
                }
            });
            bP.add(nextPageButton);

            if(maxPage!=0 && page<maxPage)
                nextPageButton.setEnabled(true);
            else
                nextPageButton.setEnabled(false);

            JButton endButton = new JButton("Finalizar Leitura");
            endButton.addActionListener(e -> replacePanel(endPanel()));
            bP.add(endButton);
        }

        return bP;
    }

    public void sidePanel(){
        JPanel panel = new JPanel(new GridLayout(25,1));

        for (Integer i : multiResultsArray) {
            panel.add(new JLabel(""+(i+offset)));
        }

        sidePanel.removeAll();
        sidePanel.add(panel);
        frame.repaint();
        frame.revalidate();
    }

    public JPanel endPanel(){
        JPanel biggerPanel = new JPanel(new GridLayout(2,1));
        JPanel panel = new JPanel(new GridLayout(1,2));
        biggerPanel.add(panel);
        JPanel section = new JPanel(new GridLayout(8,1));
        JPanel tempPanel;
        JLabel tempLabel;
        JTextField tempTextField ;
        ArrayList <JTextField> fields= new ArrayList<JTextField>();

        bottomPanel.removeAll();
        frame.repaint();
        frame.revalidate();

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Plano Físico:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Plano Mental:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Plano Emocional:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Plano Espiritual:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Plano Profissional:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Plano Financeiro:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Influências Neg. Ext:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Influências Neg. Int.:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        panel.add(section);

        section = new JPanel(new GridLayout(8,1));

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Chakra Coronário:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Chakra Frontal:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Chakra Laríngeo:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Chakra Cardíaco:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Chakra Solar:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Chakra Umbilical:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Chakra Raiz:");
        tempTextField = new JTextField(20);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        panel.add(section);

        panel = new JPanel();
        tempPanel = new JPanel(new BorderLayout());
        tempLabel = new JLabel("Observações:");
        tempTextField = new JTextField(40);
        fields.add(tempTextField);
        tempPanel.add(tempLabel,BorderLayout.NORTH);
        tempPanel.add(tempTextField,BorderLayout.CENTER);
        panel.add(tempPanel);

        biggerPanel.add(panel);

        JPanel finalPanel = new JPanel(new BorderLayout());


        finalPanel.add(biggerPanel, BorderLayout.CENTER);

        JLabel label = new JLabel("Fim de Sessão - 2ª Leitura", JLabel.CENTER);
        finalPanel.add(label, BorderLayout.NORTH);

        section = new JPanel();
        JButton backButton = new JButton("Voltar");
        backButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                bottomPanel.add(bottomPanel());
                replacePanel(mainPanel());
            }
        });
        JButton endButton = new JButton("Terminar Leitura");
        endButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                currentClient.setPlanoFisico2(Integer.parseInt(fields.get(0).getText()));
                currentClient.setPlanoMental2(Integer.parseInt(fields.get(1).getText()));
                currentClient.setPlanoEmocional2(Integer.parseInt(fields.get(2).getText()));
                currentClient.setPlanoEspiritual2(Integer.parseInt(fields.get(3).getText()));
                currentClient.setPlanoProfissional2(Integer.parseInt(fields.get(4).getText()));
                currentClient.setPlanoFinanceiro2(Integer.parseInt(fields.get(5).getText()));
                currentClient.setInfluenNegExt2(Integer.parseInt(fields.get(6).getText()));
                currentClient.setInfluenNegInt2(Integer.parseInt(fields.get(7).getText()));

                currentClient.setChakraCoronário2(Integer.parseInt(fields.get(8).getText()));
                currentClient.setChakraFrontal2(Integer.parseInt(fields.get(9).getText()));
                currentClient.setChakraLaríngeo2(Integer.parseInt(fields.get(10).getText()));
                currentClient.setChakraCardíaco2(Integer.parseInt(fields.get(11).getText()));
                currentClient.setChakraSolar2(Integer.parseInt(fields.get(12).getText()));
                currentClient.setChakraUmbilical2(Integer.parseInt(fields.get(13).getText()));
                currentClient.setChakraRaiz2(Integer.parseInt(fields.get(14).getText()));

                leitura.observations = fields.get(15).getText();

                leitura.Save();

                new GeneratePDF(leitura,root);

                bottomPanel.removeAll();
                replacePanel(new JPanel());

                leitura = null;
                currentClient = new Cliente();

                }catch(Exception ex){
                    ex.printStackTrace();
                }
            }
        });

        section.add(backButton);
        section.add(endButton);

        finalPanel.add(section,BorderLayout.SOUTH);

        return finalPanel;
    }

    public JPanel mainPanel(){
        JPanel mainPanel = new JPanel();
        BufferedImage myPicture;

        currentClient = leitura.cliente;

        for (Portal portal : root.portais) {
            try {
                JPanel jPanel = new JPanel(new BorderLayout());
                File file = new File("portais/assets/" + portal.name + ".png");
                myPicture = ImageIO.read(file);
                JButton picButton = new JButton(new ImageIcon(myPicture));
                picButton.addActionListener(e -> replacePanel(ferramentasPanel(portal)));

                JLabel picLabel = new JLabel(""+portal.name, JLabel.CENTER);

                jPanel.add(BorderLayout.CENTER, picButton);
                jPanel.add(BorderLayout.SOUTH, picLabel);

                mainPanel.add(jPanel);
            } catch (Exception e) {
                System.out.println(portal.name);
                System.out.println(e);
                e.printStackTrace();
            }
        }

        bottomPanel.removeAll();
        bottomPanel.add(bottomPanel());

        return mainPanel;
    }

    public JPanel ferramentasPanel(Portal portal){
        int i = 0;
        multiResultsArray = new ArrayList<Integer>();
        sidePanel();
        JPanel ferramentasPanel = new JPanel(new GridLayout(20 ,1));

        JLabel label = new JLabel(portal.name, JLabel.CENTER);
        ferramentasPanel.add(label);

        for (Ferramenta ferramenta : portal.ferramentas) {
            JButton button = new JButton(ferramenta.id+1 + " - "+ferramenta.name);
            button.addActionListener(e -> ferramentaButtonClicked(resultadosPanel(ferramenta),ferramenta));
            ferramentasPanel.add(button);
            i++;
        }

        JButton button = new JButton(i+1 + " - FIM DE TURNO");

        button.addActionListener(e -> replacePanel(mainPanel()));

        ferramentasPanel.add(button);

        page=0;
        maxPage=0;
        currentResult=new ArrayList<Integer>();
        bottomPanel.removeAll();
        bottomPanel.add(bottomPanel());

        return ferramentasPanel;
    }

    public void ferramentaButtonClicked(JPanel panel, Ferramenta ferramenta){
        if(ferramenta.type != 1){
            replacePanel(panel);
        }else{
            replacePanel(ferramentasPanel(ferramenta.target));
        }
    }

    public JPanel resultadosPanel(Ferramenta ferramenta){
        indexArray = new ArrayList<Integer>();   
        currentResult=new ArrayList<Integer>();
        currentResult.add(ferramenta.portal.id);
        currentResult.add(ferramenta.id);
        int rownum = Math.min(ferramenta.optionPerPage, ferramenta.resultados.size());
        int pagesize = rownum;
        if(ferramenta.multi)
            pagesize++;

        offset = ferramenta.offset;
        sidePanel();

        if (ferramenta.optionPerPage < ferramenta.resultados.size()){
            maxPage = ferramenta.resultados.size()/rownum;
        }else
            maxPage = 0;

        bottomPanel.removeAll();
        bottomPanel.add(bottomPanel());

        BufferedImage myPicture;
        JPanel containerJPanel = new JPanel(new BorderLayout());
        JPanel resultadosPanel = new JPanel(new GridLayout(pagesize,1));
        JButton confirmButton = new JButton("Confirmar Resultados");

        if(ferramenta.type == 0){
            for (int i = page*rownum;i<(page+1)*rownum && i<ferramenta.resultados.size();i++) {
                JPanel smaller = new JPanel();
                JButton button = new JButton(i+ferramenta.offset+" - "+ferramenta.resultados.get(i));
                smaller.add(button);
                int newi = i;

                if(!ferramenta.multi)
                    button.addActionListener(e -> replacePanel(protocoloPanel(ferramenta, newi)));
                else
                    button.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            multiResultsArray.add(newi);
                            confirmButton.setEnabled(true);
                            sidePanel();
                        }
                    });

                resultadosPanel.add(smaller);
            }     
        }else if(ferramenta.type == 2){
            for (int i = page*rownum;i<(page+1)*rownum && i<ferramenta.resultados.size();i++) {
                JPanel smaller = new JPanel();
                JButton button = new JButton(i+ferramenta.offset+" - "+ferramenta.resultados.get(i));
                smaller.add(button);
                ArrayList<Integer> newIndexArray = new ArrayList<>();
                int newix = i;
                newIndexArray.add(i);
                System.out.println(newIndexArray.toString());

                if(!ferramenta.subFerramentas.get(i).inactive)
                    button.addActionListener(e -> subFerramentaChosen(ferramenta, newIndexArray));
                else
                    button.addActionListener(e -> replacePanel(protocoloPanel(ferramenta, newix)));

                resultadosPanel.add(smaller);
            }
        }else if(ferramenta.type == 3){
            resultadosPanel = new JPanel(new GridLayout(5,8));
            for (int i = 0;i<ferramenta.resultados.size();i++) {
                JPanel smaller = new JPanel(new BorderLayout());
                try {
                    myPicture = ImageIO.read(new File("portais/assets/" + ferramenta.resultados.get(i) + ".png"));
                    JButton button = new JButton(new ImageIcon(myPicture));
                    smaller.add(button,BorderLayout.CENTER);
                    int newi = i;
                    button.addActionListener(e -> replacePanel(protocoloPanel(ferramenta, newi)));
                } catch (Exception e) {
                    e.printStackTrace();
                    System.out.println("error");
                }

                JLabel label = new JLabel(i+ferramenta.offset+" - "+ferramenta.resultados.get(i), JLabel.CENTER);
                smaller.add(label,BorderLayout.SOUTH);

                resultadosPanel.add(smaller);
            }
        }else if (ferramenta.type == 4){
            resultadosPanel = new JPanel(new GridLayout(4,1));
            JTextField textField1 = new JTextField(3);
            JTextField textField2 = new JTextField(3);
            JTextField textField3 = new JTextField(3);

            resultadosPanel.add(textField1);
            resultadosPanel.add(textField2);
            resultadosPanel.add(textField3);

            JButton button = new JButton("Calcular");
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    currentResult.add(Integer.parseInt(textField1.getText()));
                    currentResult.add(Integer.parseInt(textField2.getText()));
                    currentResult.add(Integer.parseInt(textField3.getText()));
                    
                    replacePanel(protocoloPanel(ferramenta, 0));
                }
            });
            resultadosPanel.add(button);

        }

        if(ferramenta.multi){
            if(multiResultsArray.isEmpty())
                confirmButton.setEnabled(false);
            confirmButton.addActionListener(e -> replacePanel(protocoloPanel(ferramenta, multiResultsArray.get(0))));
            resultadosPanel.add(confirmButton);
        }
        
        JLabel labelTitle = new JLabel(ferramenta.name, JLabel.CENTER);
        containerJPanel.add(labelTitle,BorderLayout.PAGE_START);

        containerJPanel.add(resultadosPanel, BorderLayout.CENTER);

        JButton button = new JButton("Voltar");
        button.addActionListener(e -> replacePanel(ferramentasPanel(ferramenta.portal)));
        containerJPanel.add(button, BorderLayout.SOUTH);

        return containerJPanel;
    }

    public void subFerramentaChosen(Ferramenta ferramenta, ArrayList<Integer> indexArray){
        replacePanel(subFerramentaPanel(ferramenta.subFerramentas.get(indexArray.get(0)), indexArray));
    }

    public JPanel subFerramentaPanel(SubFerramenta subFerramenta, ArrayList<Integer> indexArray){
        int rownum = Math.min(subFerramenta.optionPerPage, subFerramenta.resultados.size());
        int pagesize = rownum;
        if(subFerramenta.multi)
            pagesize++;
        JPanel containerJPanel = new JPanel(new BorderLayout());

        if (subFerramenta.optionPerPage < subFerramenta.resultados.size()){
            maxPage = subFerramenta.resultados.size()/rownum;
        }else
            maxPage = 0;

        this.indexArray =indexArray;

        offset = subFerramenta.offset;
        bottomPanel.removeAll();
        bottomPanel.add(bottomPanel());
        sidePanel();

        JLabel labelTitle = new JLabel(subFerramenta.mainFerramenta.name, JLabel.CENTER);
        containerJPanel.add(labelTitle,BorderLayout.PAGE_START);

        JPanel resultadosPanel = new JPanel(new GridLayout(pagesize,1));
        JButton confirmButton = new JButton("Confirmar Resultados");

        for (int i = page*rownum;i < (page+1)*rownum && i<subFerramenta.resultados.size();i++) {
            JPanel smaller = new JPanel();
            JButton button = new JButton(i+subFerramenta.offset+" - "+subFerramenta.resultados.get(i));
            smaller.add(button);
            ArrayList<Integer> newIndexArray = (ArrayList<Integer>) indexArray.clone();
            newIndexArray.add(i);
            System.out.println(newIndexArray);
            int newi = i;

            if(subFerramenta.subFerramentas.isEmpty() || subFerramenta.subFerramentas.get(i).inactive){
                if(!subFerramenta.multi)
                    button.addActionListener(e -> replacePanel(protocoloPanel(subFerramenta, newIndexArray)));
                else
                    button.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            multiResultsArray.add(newi);
                            confirmButton.setEnabled(true);
                            sidePanel();
                        }
                    });
            }
            else{
                button.addActionListener(e -> replacePanel(subFerramentaPanel(subFerramenta.subFerramentas.get(newi), newIndexArray)));
            }

            // if(!subFerramenta.subFerramentas.isEmpty()){
            //     if(!subFerramenta.subFerramentas.get(i).inactive)
            //         button.addActionListener(e -> replacePanel(subFerramentaPanel(subFerramenta.subFerramentas.get(newi), newIndexArray)));
            //     else
            //         button.addActionListener(e -> replacePanel(protocoloPanel(subFerramenta, newIndexArray)));
            // }else
            //     button.addActionListener(e -> replacePanel(protocoloPanel(subFerramenta, newIndexArray)));
            resultadosPanel.add(smaller);
        }

        if(subFerramenta.multi){
            if(multiResultsArray.isEmpty())
                confirmButton.setEnabled(false);
            confirmButton.addActionListener(e -> replacePanel(protocoloPanel(subFerramenta, indexArray)));
            resultadosPanel.add(confirmButton);
        }

        containerJPanel.add(resultadosPanel, BorderLayout.CENTER);

        return containerJPanel;
    }

    public JPanel protocoloPanel(Ferramenta ferramenta, int index){
        ArrayList<Integer> temp = ( ArrayList<Integer>) currentResult.clone();
        int tempIndex = index;
        String decreto = ferramenta.Decreto(tempIndex,currentClient);
        int i=0, j=0 ,k=0;
        JLabel labelDecreto = new JLabel();
        JButton confirmButton = new JButton("Confirmar");

        if(ferramenta.type==4){
            for (char c : (""+temp.get(2)).toCharArray()) {
                i+=Integer.parseInt(""+c);
                while(i>9)
                    i=i%10+i/10;
            }
            for (char c : (""+temp.get(3)).toCharArray()) {
                j+=Integer.parseInt(""+c);
                while(j>9)
                    j=j%10+j/10;
            }
            for (char c : (""+temp.get(4)).toCharArray()) {
                k+=Integer.parseInt(""+c);
                while(k>9)
                    k=k%10+k/10;
            }

            tempIndex=i+j+k;
            while(tempIndex>9)
                tempIndex=tempIndex%10+tempIndex/10;

            decreto = decreto.replace("(todas as coordenadas que saírem, não mais de três)", "<b style=\"color:blue;\">" +temp.get(2)+"."+temp.get(3)+"."+temp.get(4)+ "</b>");
        }
        

        temp.add(tempIndex);

        JPanel panel = new JPanel(new BorderLayout());

        JLabel labelTitle = new JLabel(ferramenta.name, JLabel.CENTER);
        panel.add(labelTitle,BorderLayout.NORTH);
        
        JPanel centerJPanel = new JPanel(new BorderLayout());

        if(ferramenta.type==4){
            JPanel smaller= new JPanel(new GridLayout(4,1));

            JLabel label = new JLabel("Coordenadas Portal Ambientes: "+(i)+ " - " + ferramenta.subFerramentas.get(0).resultados.get(i-1));
            smaller.add(label);

            label = new JLabel("Coordenadas Portal Relacionamentos: "+(j)+ " - " + ferramenta.subFerramentas.get(1).resultados.get(j-1));
            smaller.add(label);

            label = new JLabel("Coordenadas Portal Eu Interior: "+(k)+ " - " + ferramenta.subFerramentas.get(2).resultados.get(k-1));
            smaller.add(label);

            label = new JLabel("A Soma dos Três Portais: "+temp.get(5)+ " - " + ferramenta.subFerramentas.get(3).resultados.get(temp.get(5)-1));
            smaller.add(label);

            centerJPanel.add(smaller);
        }

        JPanel topPanel;
        if(ferramenta.portal.id == 1){
            if(ferramenta.id == 0 || ferramenta.id == 1){
                confirmButton.setEnabled(false);
                temp.add(0);
                temp.add(0);
                topPanel = new JPanel();
                JLabel instructLabel = new JLabel("Medir no Biometro");
                topPanel.add(instructLabel,BorderLayout.NORTH);
                JPanel capsule = new JPanel(new GridLayout(2,1));
                JTextField numberField = new JTextField();
                capsule.add(numberField);
                String timeStrings[]={"meses","dias","horas"};
                JComboBox<String> unitBox = new JComboBox<String>(timeStrings);
                unitBox.addActionListener(e -> temp.set(4,unitBox.getSelectedIndex()));
                capsule.add(unitBox);
                topPanel.add(capsule, BorderLayout.CENTER);
                JButton topButton = new JButton("Confirmar Medições");
                topButton.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        temp.set(3, Integer.parseInt(numberField.getText()));
                        temp.set(4,unitBox.getSelectedIndex());
                        String newD = "<b style=\"color:blue;\">"+ numberField.getText()+" "+unitBox.getSelectedItem()+" </b>";
                        labelDecreto.setText("<html><div WIDTH=1000>" + ferramenta.Decreto(index, currentClient).replace("<b style=\"color:red;\">(medir no relógio de mensuração) </b>", newD) + "</div></html>");
                        confirmButton.setEnabled(true);
                    }
                });
                topPanel.add(topButton,BorderLayout.SOUTH);
                centerJPanel.add(topPanel,BorderLayout.NORTH);
            }else if(ferramenta.id == 4){
                topPanel = new JPanel(new GridLayout(multiResultsArray.size()+1,5));
                topPanel.add(new JLabel());
                topPanel.add(new JLabel("Significado"));
                topPanel.add(new JLabel("Significado Reverso"));
                topPanel.add(new JLabel("Ativação na mesa"));
                topPanel.add(new JLabel("Chakras Associados"));
                for(int result = 0;result<multiResultsArray.size() ;result++){
                    JLabel label = new JLabel(ferramenta.resultados.get(multiResultsArray.get(result)));
                    topPanel.add(label);
                    label = new JLabel("<html><div WIDTH=200>"+ferramenta.resultados2.get(multiResultsArray.get(result))+"</div></html>");
                    topPanel.add(label);
                    label = new JLabel("<html><div WIDTH=200>"+ferramenta.resultados2.get(multiResultsArray.get(result)+ferramenta.resultados.size())+"</div></html>");
                    topPanel.add(label);
                    label = new JLabel(ferramenta.ações.get(multiResultsArray.get(result)));
                    topPanel.add(label);
                    label = new JLabel(ferramenta.funções.get(multiResultsArray.get(result)));
                    topPanel.add(label);
                }
                centerJPanel.add(topPanel,BorderLayout.NORTH);
            }
        }else if (ferramenta.portal.id == 0){
            if(ferramenta.id == 9){
                confirmButton.setEnabled(false);
                topPanel = new JPanel();

                JPanel labPanel = new JPanel(new GridLayout(2,1));
                JLabel instructLabel = new JLabel("Tipo de Ambiente");
                labPanel.add(instructLabel);
                JLabel effectLabel = new JLabel("Efeito");
                labPanel.add(effectLabel);
                topPanel.add(labPanel,BorderLayout.NORTH);

                JPanel capsule = new JPanel(new GridLayout(2,1));
                String tipoAmbiente[]={"casa","empresa"};
                JComboBox<String> unitBox = new JComboBox<String>(tipoAmbiente);
                capsule.add(unitBox);

                JTextField effectField = new JTextField(20);
                capsule.add(effectField);
                topPanel.add(capsule, BorderLayout.CENTER);

                JButton topButton = new JButton("Ajustar decreto");
                topButton.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        temp.add(unitBox.getSelectedIndex());
                        currentClient.efeito = effectField.getText();
                        String newD;
                        if(unitBox.getSelectedIndex()==0){
                            newD = "<b style=\"color:blue;\">"+ currentClient.morada +" </b>";
                        }else{
                            newD = "<b style=\"color:blue;\">"+ currentClient.nomeEspaço +" </b>";
                        }
                        labelDecreto.setText("<html><div WIDTH=1000>" + ferramenta.Decreto(multiResultsArray, currentClient).replace("<b style=\"color:red;\"> (tipo de ambiente) </b>", newD) + "</div></html>");
                        confirmButton.setEnabled(true);
                    }
                });
                topPanel.add(topButton,BorderLayout.SOUTH);

                centerJPanel.add(topPanel,BorderLayout.NORTH);
            }
        }else if (ferramenta.portal.id == 3){
            if (ferramenta.id==0){
                confirmButton.setEnabled(false);
                temp.add(0);
                temp.add(0);
                temp.add(0);
                topPanel = new JPanel();
                JLabel instructLabel = new JLabel("Medir no Biometro");
                topPanel.add(instructLabel,BorderLayout.NORTH);
                JPanel capsule = new JPanel(new GridLayout(3,1));
                JTextField numberField = new JTextField();
                capsule.add(numberField);
                JTextField numberField2 = new JTextField();
                capsule.add(numberField2);
                String timeStrings[]={"dias","semanas","meses"};
                JComboBox<String> unitBox = new JComboBox<String>(timeStrings);
                unitBox.addActionListener(e -> temp.set(5,unitBox.getSelectedIndex()));
                capsule.add(unitBox);
                topPanel.add(capsule, BorderLayout.CENTER);
                JButton topButton = new JButton("Confirmar Medições");
                topButton.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        temp.set(3, Integer.parseInt(numberField.getText()));
                        temp.set(4, Integer.parseInt(numberField2.getText()));
                        temp.set(5, unitBox.getSelectedIndex());
                        String newD = "<b style=\"color:blue;\">"+ numberField.getText()+" vezes ao dia, durante o periodo de "+numberField2.getText()+" "+unitBox.getSelectedItem()+" </b>";
                        labelDecreto.setText("<html><div WIDTH=1000>" + ferramenta.Decreto(index, currentClient).replace("<b style=\"color:red;\">(x vezes ao dia) </b> durante o periodo de <b style=\"color:red;\">(dias, semanas, meses) </b>", newD) + "</div></html>");
                        confirmButton.setEnabled(true);
                    }
                });
                topPanel.add(topButton,BorderLayout.SOUTH);
                centerJPanel.add(topPanel,BorderLayout.NORTH);
            }
        }
        
        if(ferramenta.multi)
            decreto = ferramenta.Decreto(multiResultsArray, currentClient);

        labelDecreto.setSize(1000, 700);
        labelDecreto.setText("<html><div WIDTH=1000>"+decreto+"</div></html>");
        centerJPanel.add(labelDecreto,BorderLayout.CENTER);

        panel.add(centerJPanel,BorderLayout.CENTER);

        JPanel buttons = new JPanel();
        JButton cancelButton = new JButton("Cancelar");
        cancelButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                multiResultsArray = new ArrayList<Integer>();
                sidePanel();
                replacePanel(resultadosPanel(ferramenta));
            }
        });
        confirmButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(ferramenta.multi){
                    int result=0;
                    do{
                        ArrayList<Integer> temp2 = ( ArrayList<Integer>) currentResult.clone();
                        temp2.add(multiResultsArray.get(result));
                        leitura.historico.add(temp2);
                        leitura.Save();
                        result++;
                    }while(result<multiResultsArray.size());
                    multiResultsArray = new ArrayList<Integer>();
                    sidePanel();
                }
                else{
                    leitura.historico.add(temp);
                    leitura.Save();
                }
                replacePanel(resultadosPanel(ferramenta));
            }
        });
        buttons.add(cancelButton);
        buttons.add(confirmButton);
        panel.add(buttons,BorderLayout.SOUTH);

        maxPage=0;
        page=0;
        bottomPanel.removeAll();
        bottomPanel.add(bottomPanel());

        return panel;
    }

    public JPanel protocoloPanel(SubFerramenta subFerramenta, ArrayList<Integer> indexArray){
        JLabel labelDecreto = new JLabel();
        String decreto;
        JButton confirmButton = new JButton("Confirmar");
        ArrayList<Integer> temp = ( ArrayList<Integer>) currentResult.clone();
        
        if(subFerramenta.multi){
            indexArray.add(multiResultsArray.get(0));
        }
        
        for (Integer integer : indexArray) {
            temp.add(integer);
        }

        int resultIndex = temp.size()-1;

        if(subFerramenta.multi)
            decreto = subFerramenta.Decreto(indexArray,currentClient,multiResultsArray,resultIndex);//ferramenta.Decreto(multiResultsArray, currentClient);
        else
            decreto = subFerramenta.Decreto(indexArray, currentClient);

        

        this.indexArray = new ArrayList<Integer>();

        maxPage=0;
        page=0;
        bottomPanel.removeAll();
        bottomPanel.add(bottomPanel());

        JPanel panel = new JPanel(new BorderLayout());

        JLabel labelTitle = new JLabel(subFerramenta.mainFerramenta.name, JLabel.CENTER);
        panel.add(labelTitle,BorderLayout.NORTH);

        JPanel centerJPanel = new JPanel(new BorderLayout());

        JPanel topPanel;
        if(subFerramenta.mainFerramenta.portal.id == 3){
            if(subFerramenta.mainFerramenta.id == 2 ){
                if(subFerramenta.prevResult == "Cristais"){
                    confirmButton.setEnabled(false);
                    temp.add(0);
                    temp.add(0);
                    temp.add(0);
                    temp.add(0);
                    topPanel = new JPanel();

                    JPanel labPanel = new JPanel(new GridLayout(5,1));
                    JLabel instructLabel1 = new JLabel("Atuação do cristal");
                    labPanel.add(instructLabel1);
                    JLabel instructLabel2 = new JLabel("Quantum energético");
                    labPanel.add(instructLabel2);
                    JLabel instructLabel3 = new JLabel("Frequência diária");
                    labPanel.add(instructLabel3);
                    JLabel instructLabel4 = new JLabel("Duração");
                    labPanel.add(instructLabel4);
                    JLabel instructLabel5 = new JLabel("Unidade de Duração");
                    labPanel.add(instructLabel5);
                    topPanel.add(labPanel,BorderLayout.WEST);

                    JPanel capsule = new JPanel(new GridLayout(5,1));
                    JTextField effectField = new JTextField(20);
                    capsule.add(effectField);
                    JTextField quantumField = new JTextField(20);
                    capsule.add(quantumField);
                    JTextField freqField = new JTextField(20);
                    capsule.add(freqField);
                    JTextField durationField = new JTextField(20);
                    capsule.add(durationField);
                    String timeStrings[]={"dias","semanas","meses"};
                    JComboBox<String> unitBox = new JComboBox<String>(timeStrings);
                    unitBox.addActionListener(e -> temp.set(7,unitBox.getSelectedIndex()));
                    capsule.add(unitBox);
                    topPanel.add(capsule, BorderLayout.CENTER);

                    JButton topButton = new JButton("Confirmar Medições");
                    topButton.addActionListener(new ActionListener(){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            String newD;
                            temp.set(4, Integer.parseInt(quantumField.getText()));
                            temp.set(5, Integer.parseInt(freqField.getText()));
                            temp.set(6, Integer.parseInt(durationField.getText()));
                            temp.set(7, unitBox.getSelectedIndex());
                            currentClient.efeito2 = effectField.getText();
                            String s1 = "<b style=\"color:blue;\">"+ effectField.getText() +" </b>";
                            newD = subFerramenta.Decreto(indexArray,currentClient,multiResultsArray,resultIndex).replace("<b style=\"color:red;\">(definir atuação do cristal) </b>", s1);
                            s1 = "<b style=\"color:blue;\">"+ quantumField.getText() +" </b>";
                            newD = newD.replace("<b style=\"color:red;\">(medir no biometro) </b>", s1);
                            s1 = "<b style=\"color:blue;\">"+ freqField.getText() +" vezes </b>";
                            newD = newD.replace("<b style=\"color:red;\">(x vezes, medir no biometro) </b>", s1);
                            s1 = "<b style=\"color:blue;\">"+ durationField.getText() + " " + unitBox.getSelectedItem() +" </b>";
                            newD = newD.replace("<b style=\"color:red;\">(dias, semanas, meses, medir no biometro) </b>", s1);
                            labelDecreto.setText("<html><div WIDTH=1000>" + newD + "</div></html>");
                            confirmButton.setEnabled(true);
                        }
                    });
                    topPanel.add(topButton,BorderLayout.EAST);

                    centerJPanel.add(topPanel,BorderLayout.NORTH);
                }
            }
        }else if (subFerramenta.mainFerramenta.portal.id == 2){
            if(subFerramenta.mainFerramenta.id == 4 && subFerramenta.prevResult=="Arcanos Maiores"){
                topPanel = new JPanel(new GridLayout(multiResultsArray.size()+1,5));
                topPanel.add(new JLabel());
                topPanel.add(new JLabel("Significado"));
                topPanel.add(new JLabel("Significado Reverso"));
                topPanel.add(new JLabel("Ativação na mesa"));
                topPanel.add(new JLabel("Chakras Associados"));
                for(int result = 0;result<multiResultsArray.size() ;result++){
                    JLabel label = new JLabel(subFerramenta.resultados.get(multiResultsArray.get(result)));
                    topPanel.add(label);
                    label = new JLabel("<html><div WIDTH=200>"+subFerramenta.resultados2.get(multiResultsArray.get(result))+"</div></html>");
                    topPanel.add(label);
                    label = new JLabel("<html><div WIDTH=200>"+subFerramenta.resultados2.get(multiResultsArray.get(result)+subFerramenta.resultados.size())+"</div></html>");
                    topPanel.add(label);
                    label = new JLabel(subFerramenta.ações.get(multiResultsArray.get(result)));
                    topPanel.add(label);
                    label = new JLabel(subFerramenta.funções.get(multiResultsArray.get(result)));
                    topPanel.add(label);
                }
                centerJPanel.add(topPanel,BorderLayout.NORTH);
            }
        }

        System.out.println(indexArray);

        labelDecreto.setSize(1000, 700);
        labelDecreto.setText("<html><div WIDTH=1000>"+decreto+"</div></html>");
        centerJPanel.add(labelDecreto,BorderLayout.CENTER);
        panel.add(centerJPanel);

        JPanel buttons = new JPanel();
        JButton cancelButton = new JButton("Cancelar");
        cancelButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                multiResultsArray = new ArrayList<Integer>();
                sidePanel();
                replacePanel(resultadosPanel(subFerramenta.mainFerramenta));
            }
        });
        confirmButton.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                replacePanel(resultadosPanel(subFerramenta.mainFerramenta));

                if(subFerramenta.multi){
                    int result=0;
                    do{
                        ArrayList<Integer> temp2 = ( ArrayList<Integer>) temp.clone();
                        temp2.set(resultIndex,multiResultsArray.get(result));
                        leitura.historico.add(temp2);
                        leitura.Save();
                        result++;
                    }while(result<multiResultsArray.size());
                    multiResultsArray = new ArrayList<Integer>();
                    sidePanel();
                }
                else{
                    leitura.historico.add(temp);
                    leitura.Save();
                }

            }
        });
        buttons.add(cancelButton);
        buttons.add(confirmButton);
        panel.add(buttons,BorderLayout.SOUTH);

        return panel;
    }

    public void replacePanel(JPanel newPanel){
        centerPanel.removeAll();
        centerPanel.add(newPanel,BorderLayout.CENTER);
        frame.repaint();
        frame.revalidate();
    }
}