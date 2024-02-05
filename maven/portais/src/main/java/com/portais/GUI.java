package com.portais;
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

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

    String configNomeTerapeuta = "NomeDoTerapeuta";
    int configFonteTamanho = 12;
    Font configFonte;

    public GUI() throws FileNotFoundException{
        readConfig();
        writeConfig();

        root = new TreeRoot();

        frame = new JFrame("Portais");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(1920,1080);
        frame.setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);

        JMenuBar menuBar = menu();
        frame.getContentPane().add(BorderLayout.NORTH, menuBar);
        
        currentClient = new Cliente();
        currentClient.nomeTerapeuta = configNomeTerapeuta;

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

    public void readConfig(){
        try{
            File configFile = new File("portais/config.txt");
            Scanner sc = new Scanner(configFile, "ISO-8859-1");
            while(sc.hasNextLine()){
                String tempLine = sc.nextLine();
                Matcher matcher = Pattern.compile("'(.*)'").matcher(tempLine);
                if(tempLine.contains("nomeTerapeuta")){
                    if(matcher.find()){
                        setConfigNomeTerapeuta(matcher.group().replace("'", ""));
                    }
                }
                if(tempLine.contains("fonteTamanho")){
                    if(matcher.find()){
                        setConfigFontSize(matcher.group().replace("'", ""));
                    }
                }
            }

            updateFont();
            sc.close();
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }

    public void updateFont(){
        configFonte = new Font("Roboto", Font.PLAIN, configFonteTamanho);
    }

    public void writeConfig(){
        
        try{
            File configFile = new File("portais/config.txt");
            configFile.createNewFile();

            FileWriter fileWriter = new FileWriter("portais/config.txt");
            fileWriter.write("nomeTerapeuta: '"+configNomeTerapeuta+"'\n");
            fileWriter.write("fonteTamanho: '"+configFonteTamanho+"'");
            fileWriter.close();
        }
        catch(IOException e){
            e.printStackTrace();
        }

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
        JMenuItem m16 = new JMenuItem("Configurações");
        m16.addActionListener(e -> configEditWindow());
        JMenuItem m17 = new JMenuItem("Sair");
        m17.addActionListener(e -> Close());
        mb.add(m1);
        m1.add(m11);
        m1.add(m12);
        m1.add(m13);
        m1.add(m14);
        m1.add(m15);
        m1.add(m16);
        m1.add(m17);

        JMenu m2 = new JMenu("Decretos");
        JMenuItem m21 = new JMenuItem("Ativação da Mesa Radionica CQM");
        m21.addActionListener(e ->decretoWindowAtivação());
        JMenuItem m22 = new JMenuItem("Decreto de Abertura");
        m22.addActionListener(e -> decretoWindowAbertura());
        JMenuItem m23 = new JMenuItem("Decreto de Encerramento");
        m23.addActionListener(e -> decretoWindowEncerramento());

        JMenuItem m24 = new JMenuItem("Decreto de Programação de Ferramentas");
        m24.addActionListener(e -> decretoWindowProgramaçãoFerramentas());
        JMenuItem m25 = new JMenuItem("Decreto de Programação de Portais");
        m25.addActionListener(e -> decretoWindowProgramaçãoPortais());
        JMenuItem m26 = new JMenuItem("Decreto de Programação da Mesa");
        m26.addActionListener(e -> decretoWindowProgramaçãoMesa());
        JMenuItem m27 = new JMenuItem("Decreto de Lançamento da Mesa no Campo");
        m27.addActionListener(e -> decretoWindowLançamentoMesa());
        JMenuItem m28 = new JMenuItem("Decreto de Ancoragem de Ferramentas");
        m28.addActionListener(e -> decretoWindowAncoragemFerramentas());

        JMenuItem m29 = new JMenuItem("Decreto de Conexão à Mesa Radionica CQM");
        m29.addActionListener(e -> decretoWindowConexãoMesa());
        JMenuItem m210 = new JMenuItem("Decreto de Conexão do Consulente à Mesa Radionica CQM");
        m210.addActionListener(e -> decretoWindowConexãoMesaConsulente());
        

        mb.add(m2);
        m2.add(m21);
        m2.add(m22);
        m2.add(m23);
        m2.addSeparator();
        m2.add(m24);
        m2.add(m25);
        m2.add(m26);
        m2.add(m27);
        m2.add(m28);
        m2.addSeparator();
        m2.add(m29);
        m2.add(m210);

        return mb;
    }

    private void configEditWindow() {
        JFrame configWindow = new JFrame("Configurações");
        configWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        JPanel biggestPanel = new JPanel(new BorderLayout());
        JPanel choicesPanel = new JPanel(new GridLayout(2,1));
        JPanel buttonsPanel = new JPanel(new GridLayout(1,2));

        JPanel terapeutaNomePanel = new JPanel(new GridLayout(1,2));
        JLabel terapeutaNomeLabel = new JLabel("Nome do Terapeuta");
        JTextField terapeutaNomeField = new JTextField(configNomeTerapeuta);
        terapeutaNomePanel.add(terapeutaNomeLabel);
        terapeutaNomePanel.add(terapeutaNomeField);

        JPanel fontSizePanel = new JPanel(new GridLayout(1,2));
        JLabel fontSizeLabel = new JLabel("Tamanho do Texto");
        JTextField fontSizeField = new JTextField("" +configFonteTamanho);
        fontSizePanel.add(fontSizeLabel);
        fontSizePanel.add(fontSizeField);

        choicesPanel.add(terapeutaNomePanel);
        choicesPanel.add(fontSizePanel);

        JButton cancelarButton = new JButton("Cancelar");
        cancelarButton.addActionListener(e -> configWindow.dispatchEvent(new WindowEvent(configWindow,  WindowEvent.WINDOW_CLOSING)));
        JButton gravarButton = new JButton("Gravar");
        gravarButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                setConfigNomeTerapeuta(terapeutaNomeField.getText());
                setConfigFontSize(fontSizeField.getText());
                writeConfig();
                configWindow.dispatchEvent(new WindowEvent(configWindow,  WindowEvent.WINDOW_CLOSING));
            }
        });

        buttonsPanel.add(cancelarButton);
        buttonsPanel.add(gravarButton);

        biggestPanel.add(choicesPanel,BorderLayout.CENTER);
        biggestPanel.add(buttonsPanel,BorderLayout.SOUTH);

        configWindow.add(biggestPanel);

        configWindow.pack();
        configWindow.setLocationRelativeTo(null);
        configWindow.setVisible(true);
    }

    private void setConfigNomeTerapeuta(String text) {
        if(text != null && text.length()>0)
            configNomeTerapeuta = text;
    }

    private void setConfigFontSize(String text) {
        int newSize = (int) Integer.parseInt(text);
        configFonteTamanho = newSize;
        updateFont();
    }

    public void openFile(){
        try {
            JFileChooser fileChooser = new JFileChooser("portais/data/");

            int result = fileChooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION){
                leitura = Leitura.fromFile(fileChooser.getSelectedFile().getPath().toString());
                currentClient = leitura.cliente;
                replacePanel(editPanel());
            } 
            
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
            textLabel = new JLabel(""+leitura.cliente.influenNegInt1);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.influenNegInt1, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(11), smallers2.get(11),"Influências Neg. Int./1ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.influenNegInt1 = Integer.parseInt(textFields.get(11).getText());
                    labels.get(11).setText(""+leitura.cliente.influenNegInt1);
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
            textLabel = new JLabel(""+leitura.cliente.influenNegInt2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.influenNegInt2, 4);
            textFields.add(textField);
            smaller2.add(textField);
            button = new JButton(new ImageIcon(editPicture));
            button.addActionListener(e -> switch1to2(smalls.get(19), smallers2.get(19),"Influências Neg. Int./2ª"));
            smaller1.add(button);
            button = new JButton(new ImageIcon(savePicture));
            button.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.cliente.influenNegInt2 = Integer.parseInt(textFields.get(19).getText());
                    labels.get(19).setText(""+leitura.cliente.influenNegInt2);
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
            textLabel = new JLabel(""+leitura.cliente.chakraCardíaco2);
            labels.add(textLabel);
            smaller1.add(textLabel);
            textField = new JTextField(""+leitura.cliente.chakraCardíaco2, 4);
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
            JLabel resultadoLabel = new JLabel(portal.name + " "+ferramenta.name+" "+leitura.historico.get(i).subList(2, leitura.historico.get(i).size()).stream().map(number -> number + ferramenta.offset).collect(Collectors.toList()));
            subSubPanel.add(resultadoLabel);
            JButton deletButton = new JButton(new ImageIcon(deletPicture));
            int newi = i;
            deletButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    leitura.historico.remove(newi);
                    leitura.Save();
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

        File folder = new File("portais/data/");
        File[] listOfFiles = folder.listFiles();

        JPanel listPanel = new JPanel(new GridLayout(rownum,1));
        
        for (int i = listOfFiles.length - 1; i >= Math.max(listOfFiles.length-rownum,0);i--) {
            File file = listOfFiles[i];
            JButton listElement = new JButton(file.getName());
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
        panel.add(titleLabel,BorderLayout.NORTH);

        return panel;
    }

    public void decretoWindow(String title, String decreto){
        JFrame decretoWindow = new JFrame(title);

        decretoWindow.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        JLabel decretoLabel = new JLabel("<html><div WIDTH=1000>"+decreto+"</div></html>");
        decretoLabel.setFont(configFonte);
        decretoWindow.getContentPane().add(BorderLayout.CENTER,decretoLabel);
        
        decretoWindow.pack();
        decretoWindow.setLocationRelativeTo(null);
        decretoWindow.setVisible(true);
    }

    public void decretoWindowAtivação(){
        String title = "Ativação da Mesa Radionica CQM";
        String decreto = "EU SOU (nome do terapeuta), a Supraconsciência EU SOU em toda a minha divindade\r\n" + //
                "revelada na da conexão com a Mesa Radiônica de Cura Quântica Multidimensional e suas\r\n" + //
                "energias. Desse momento em diante a minha consciência escolhe se conectar com a minha\r\n" + //
                "consciência Divina, para que a sabedoria e o conhecimento fluam naturalmente, e, dessa\r\n" + //
                "forma, eu possa cumprir a minha missão! Eu Sou ativar a conexão com a Divina presença\r\n" + //
                "de (nome do terapeuta) e apelo à egrégora do Arcanjo Miguel, para que sele e proteja\r\n" + //
                "completamente o trabalho no propósito de cura. Agora apelo ao Círculo de Segurança das\r\n" + //
                "dimensões mais elevadas para que selem, protejam e aumentem completamente o escudo\r\n" + //
                "de Miguel, assim como para que removam qualquer coisa que não seja de natureza divina\r\n" + //
                "e que exista atualmente dentro deste campo. Apelo aos Mestres Ascensionados e a nossos\r\n" + //
                "assistentes Crísticos e Extraplanetários, para que removam e dissolvam completamente,\r\n" + //
                "todos e cada um dos implantes e suas energias semeadas, parasitas, armas espirituais e\r\n" + //
                "dispositivos de limitação auto-impostos, tanto conhecidos como desconhecidos para que\r\n" + //
                "com a minha cura eu possa facilitar a cura do Outro. Aciono a Matriz Morfogenética para\r\n" + //
                "que daqui em diante, com toda a clareza do raio amarelo, possa desempenhar e intuir a\r\n" + //
                "melhor resposta para o meu consulente e o raio verde, com o Mestre Hilarion e a presença\r\n" + //
                "do Arcanjo Rafael, para ativar e amplificar no meu campo as frequências de Cura e\r\n" + //
                "Regeneração de Harmonia e Equilíbrio. Uma vez completado isso, apelo pela completa\r\n" + //
                "restauração e reparação do campo de energia original, infundido com a energia dourada\r\n" + //
                "de da Luz Crística de sexta Dimensão. Me declaro, aqui e agora, pronto e a serviço da\r\n" + //
                "Egrégora da Cura Quântica Multidimensional.";

        decreto = decreto.replace("(nome do terapeuta)", "<b style=\"color:blue;\">"+configNomeTerapeuta+"</b>");

        decretoWindow(title, decreto);
    }

    public void decretoWindowAbertura(){
        String title = "Decreto de Abertura";
        String decreto = "Na divina presença do Eu Sou de (nome do terapeuta), evoco a frequência da Egrégora da\r\n" + //
                "Cura Quântica Multidimensional para que me assista, proteja e intua na tomada de decisão\r\n" + //
                "em relação ao trabalho aqui iniciado. Com a proteção do Arcanjo Miguel, a sabedoria do\r\n" + //
                "Arcanjo Jofiel e a cura do Arcanjo Rafael, ativo todos os portais e todas as ferramentas da\r\n" + //
                "Mesa Radionica de Cura Quantica Multidimensional para que pulsem com a Flor da Vida\r\n" + //
                "na sintonização do campo morfogenético do consulente que aqui se apresenta. Declaro\r\n" + //
                "assim aberta a sessão.";

        decreto = decreto.replace("(nome do terapeuta)", "<b style=\"color:blue;\">"+configNomeTerapeuta+"</b>");

        decretoWindow(title, decreto);
    }

    public void decretoWindowEncerramento(){
        String title = "Decreto de Encerramento";
        String decreto = "Na divina presença do Eu Sou de (nome do terapeuta), evoco a excelsa frequência de\r\n" + //
                "Metatrão para que entregue todas as frequências de cura aqui acionadas através das\r\n" + //
                "ferramentas e portais da Mesa Radionica de Cura Quântica Multidimensional no Grande\r\n" + //
                "Campo Mórfico. Que pulsem na medida certa e na quantidade exata para o bem maior de\r\n" + //
                "todos os intervenientes em todos os planos e todas as dimensões. Selo e entrego o trabalho\r\n" + //
                "de (nome do consulente), harmonizado e equilibrado para que encontre o seu propósito e\r\n" + //
                "declaro encerrada a sessão.";

        decreto = decreto.replace("(nome do terapeuta)", "<b style=\"color:blue;\">"+configNomeTerapeuta+"</b>");
        decreto = decreto.replace("(nome do consulente)", "<b style=\"color:blue;\">"+currentClient.nome+"</b>");


        decretoWindow(title, decreto);
    }

    public void decretoWindowProgramaçãoFerramentas(){
        String title = "Decreto de Programação de Ferramentas";
        String decreto = "Ativando a divina presença do EU SOU de (nome do programador), acedo ao campo\r\n" + //
                "quântico programando a ferramenta (nome da ferramenta) e todas as suas tabelas de ação\r\n" + //
                "para que ao ser acionada possa enviar o sinal de frequência de cura, dentro do que é divino\r\n" + //
                "e atuando diretamente no que eu agora decreto como testemunho, onde manifestarei a\r\n" + //
                "frequência pessoal do beneficiário através do seu nome completo, data de nascimento e\r\n" + //
                "local de residência, assim como o tema a equilibrar e todos os subtemas em benefício do\r\n" + //
                "mesmo. Ancoro na frequência da programação quântica que lhe é provida, esta ferramenta\r\n" + //
                "ao Portal (nome do portal). Pulso em sintonia com a harmonia dos 1000Hz, expandindo a\r\n" + //
                "ferramenta (nome da ferramenta) no Portal (nome do portal) por todos os campos\r\n" + //
                "morfogenéticos que se lhe ligarem e em expansão, todos os campos mórficos até à 12ª\r\n" + //
                "Dimensão, deste ou de outros Universos. Pulso, pulso, pulso, ancoro, ancoro, ancoro,\r\n" + //
                "expando, expando, expando. Na divina presença do EU SOU de (nome do programador),\r\n" + //
                "declaro ancorada a ferramenta (nome da ferramenta) no Portal (nome do portal).";

        decreto = decreto.replace("(nome do programador)", "<b style=\"color:blue;\">"+configNomeTerapeuta+"</b>");
        decreto = decreto.replace("(nome da ferramenta)", "<b style=\"color:red;\">(nome da ferramenta)</b>");
        decreto = decreto.replace("(nome do portal)", "<b style=\"color:red;\">(nome do portal)</b>");

        decretoWindow(title, decreto);
    }

    public void decretoWindowProgramaçãoPortais(){
        String title = "Decreto de Programação de Portais";
        String decreto = "Ativando a divina presença do EU SOU de (nome do programador), acedo ao campo\r\n" + //
                "quântico programando Portal (nome do portal) e todas as suas ferramentas de ação para\r\n" + //
                "que ao ser acionado possa enviar o sinal de frequência de cura, dentro do que é divino e\r\n" + //
                "atuando diretamente no que eu agora decreto como testemunho, onde manifestarei a\r\n" + //
                "frequência pessoal do beneficiário através do seu nome completo, data de nascimento e\r\n" + //
                "local de residência, assim como o tema a equilibrar e todos os subtemas em benefício do\r\n" + //
                "mesmo. Ancoro na frequência da programação quântica que lhe é provida, este Portal\r\n" + //
                "(nome do portal). Pulso em sintonia com a harmonia dos 1000Hz, expandindo o Portal\r\n" + //
                "(nome do portal) e todas as ferramentas que lhe estão conectadas, por todos os campos\r\n" + //
                "morfogenéticos que se lhe ligarem e em expansão, todos os campos mórficos até à 12ª\r\n" + //
                "Dimensão, deste ou de outros Universos. Pulso, pulso, pulso, ancoro, ancoro, ancoro,\r\n" + //
                "expando, expando, expando. Na divina presença do EU SOU de (nome do programador),\r\n" + //
                "declaro ancorado o Portal (nome do portal) na Mesa Radionica (nome da mesa).";

        decreto = decreto.replace("(nome do programador)", "<b style=\"color:blue;\">"+configNomeTerapeuta+"</b>");
        decreto = decreto.replace("(nome do portal)", "<b style=\"color:red;\">(nome do portal)</b>");
                decreto = decreto.replace("(nome da mesa)", "<b style=\"color:red;\">(nome da mesa)</b>");


        decretoWindow(title, decreto);
    }

    public void decretoWindowProgramaçãoMesa(){
        String title = "Decreto de Programação da Mesa";
        String decreto = "Ativando a divina presença do EU SOU de (nome do programador), acedo ao campo\r\n" + //
                "quântico programando a Mesa Radionica (nome da mesa), todos os seus portais e todas\r\n" + //
                "as suas ferramentas de ação para que ao ser acionada possa enviar o sinal de frequência\r\n" + //
                "de cura, dentro do que é divino e atuando diretamente no que eu agora decreto como\r\n" + //
                "testemunho, onde manifestarei a frequência pessoal do beneficiário através do seu nome\r\n" + //
                "completo, data de nascimento e local de residência, assim como o tema a equilibrar e todos\r\n" + //
                "os subtemas em benefício do mesmo. Ancoro na frequência da programação quântica que\r\n" + //
                "lhe é provida, esta Mesa Radionica (nome da mesa). Pulso em sintonia com a harmonia\r\n" + //
                "dos 1000Hz, expandindo a Mesa Radionica (nome da mesa), todos os portais e todas as\r\n" + //
                "ferramentas que lhe estão conectadas, por todos os campos morfogenéticos que se lhe\r\n" + //
                "ligarem e em expansão, todos os campos mórficos até à 12ª Dimensão, deste ou de outros\r\n" + //
                "Universos. Pulso, pulso, pulso, ancoro, ancoro, ancoro, expando, expando, expando. Na\r\n" + //
                "divina presença do EU SOU de (nome do programador), declaro ancorada a Mesa\r\n" + //
                "Radionica (nome da mesa) na facilitação da cura de todas as anomalias do que designo\r\n" + //
                "como testemunho.";

        decreto = decreto.replace("(nome do programador)", "<b style=\"color:blue;\">"+configNomeTerapeuta+"</b>");
        decreto = decreto.replace("(nome da mesa)", "<b style=\"color:red;\">(nome da mesa)</b>");


        decretoWindow(title, decreto);
    }

    public void decretoWindowLançamentoMesa(){
        String title = "Decreto de Lançamento da Mesa no Campo";
        String decreto = "Ativando a divina presença do EU SOU de (nome do programador), acedo ao campo\r\n" + //
                "quântico programando a Mesa Radionica (nome da mesa), todos os seus portais e todas\r\n" + //
                "as suas ferramentas de ação para que ao ser acionada possa enviar o sinal de frequência\r\n" + //
                "de cura, dentro do que é divino e atuando diretamente no que eu agora decreto como\r\n" + //
                "testemunho, onde manifestarei a frequência pessoal do beneficiário através do seu nomecompleto, data de nascimento e local de residência, assim como o tema a equilibrar e todos\r\n" + //
                "os subtemas em benefício do mesmo. Ancoro na frequência da programação quântica que\r\n" + //
                "lhe é provida, esta Mesa Radionica (nome da mesa). Pulso em sintonia com a harmonia\r\n" + //
                "dos 1000Hz, expandindo a Mesa Radionica (nome da mesa), todos os portais e todas as\r\n" + //
                "ferramentas que lhe estão conectadas, por todos os campos morfogenéticos que se lhe\r\n" + //
                "ligarem e em expansão, todos os campos mórficos até à 12ª Dimensão, deste ou de outros\r\n" + //
                "Universos. Pulso, pulso, pulso, ancoro, ancoro, ancoro, expando, expando, expando. Na\r\n" + //
                "divina presença do EU SOU de (nome do programador), declaro ancorada a Mesa\r\n" + //
                "Radionica (nome da mesa) na egrégora do nosso planeta Terra, no nosso Sistema Solar,\r\n" + //
                "na nossa galáxia, sob a influência do Grande Sol Central de Alcione, da primeira à décima\r\n" + //
                "segunda dimensão e em expansão a todos os Universos onde se cruze a influência do\r\n" + //
                "Grande Campo Mórfico, de todas as Harmonias e todas as Sincronicidades.";

        decreto = decreto.replace("(nome do programador)", "<b style=\"color:blue;\">"+configNomeTerapeuta+"</b>");
        decreto = decreto.replace("(nome da mesa)", "<b style=\"color:red;\">(nome da mesa)</b>");

        decretoWindow(title, decreto);
    }

    public void decretoWindowAncoragemFerramentas(){
        String title = "Decreto de Ancoragem de Ferramentas";
        String decreto = "Na Divina Presença do Eu Sou de (nome do terapeuta) eu ancoro na Mesa Radiônica\r\n" + //
                "Quântica Multidimensional a ferramenta (identificação da ferramenta) com o número\r\n" + //
                "(número na tabela de identificação) para que sirva de extensão ao propósito da facilitação\r\n" + //
                "da Cura no Portal (Tipo de Portal). Fixo e ancoro, pulsando a frequência de onda violeta e\r\n" + //
                "branca, fixando os 700Hz e expandindo para os 1000Hz. Declaro ancorada a (identificação da ferramenta)\r\n" + //
                " na Mesa Radiônica Quântica Multidimensional, assim como todas as\r\n" + //
                "egrégoras que lhe estão anexas.";

        decreto = decreto.replace("(nome do terapeuta)", "<b style=\"color:blue;\">"+configNomeTerapeuta+"</b>");
        decreto = decreto.replace("(identificação da ferramenta)", "<b style=\"color:red;\">(identificação da ferramenta)</b>");
        decreto = decreto.replace("(Tipo de Portal)", "<b style=\"color:red;\">(Tipo de Portal)</b>");
        decreto = decreto.replace("(número na tabela de identificação)", "<b style=\"color:red;\">(número na tabela de identificação)</b>");


        decretoWindow(title, decreto);
    }

    public void decretoWindowConexãoMesa(){
        String title = "Decreto de Conexão à Mesa Radionica CQM";
        String decreto = "Por Decreto da MINHA Presença Divina, do Equilíbrio, da Vibração, do Entrelaçamento\r\n" + //
                "Quântico, da Coerência e Hamonia e da Sincronicidade, ordeno e invoco a criação ativa\r\n" + //
                "programando Agora a minha conexão à Mesa Radionica CQM, para um alcance pleno a\r\n" + //
                "todos os corpos sutis, em todos os níveis multidimensionais, em todo o tempo e todo o\r\n" + //
                "espaço. Conectando, conectanto, conectando.";

        decretoWindow(title, decreto);
    }

    public void decretoWindowConexãoMesaConsulente(){
        String title = "Decreto de Conexão do Consulente à Mesa Radionica CQM";
        String decreto = "Por Decreto da MINHA Presença Divina, do Equilíbrio, da Vibração, do Entrelaçamento\r\n" + //
                "Quântico, da Coerência e Hamonia e da Sincronicidade, ordeno e invoco a conexão de\r\n" + //
                "(nome do consulente) programando Agora a conexão à Mesa Radionica CQM, para um\r\n" + //
                "alcance pleno a todos os corpos sutis, em todos os níveis multidimensionais, em todo o\r\n" + //
                "tempo e todo o espaço. Conectando, conectanto, conectando.";

        decreto = decreto.replace("(nome do consulente)", "<b style=\"color:blue;\">"+currentClient.nome+"</b>");

        decretoWindow(title, decreto);
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
        currentClient.nomeTerapeuta = configNomeTerapeuta;

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
        tempTextField = new JTextField(""+currentClient.planoFisico2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Plano Mental:");
        tempTextField = new JTextField(""+currentClient.planoMental2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Plano Emocional:");
        tempTextField = new JTextField(""+currentClient.planoEmocional2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Plano Espiritual:");
        tempTextField = new JTextField(""+currentClient.planoEspiritual2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Plano Profissional:");
        tempTextField = new JTextField(""+currentClient.planoProfissional2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Plano Financeiro:");
        tempTextField = new JTextField(""+currentClient.planoFinanceiro2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Influências Neg. Ext:");
        tempTextField = new JTextField(""+currentClient.influenNegExt2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Influências Neg. Int.:");
        tempTextField = new JTextField(""+currentClient.influenNegInt2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        panel.add(section);

        section = new JPanel(new GridLayout(8,1));

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Chakra Coronário:");
        tempTextField = new JTextField(""+currentClient.chakraCoronário2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Chakra Frontal:");
        tempTextField = new JTextField(""+currentClient.chakraFrontal2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Chakra Laríngeo:");
        tempTextField = new JTextField(""+currentClient.chakraLaríngeo2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Chakra Cardíaco:");
        tempTextField = new JTextField(""+currentClient.chakraCardíaco2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Chakra Solar:");
        tempTextField = new JTextField(""+currentClient.chakraSolar2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Chakra Umbilical:");
        tempTextField = new JTextField(""+currentClient.chakraUmbilical2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        tempPanel = new JPanel(new GridLayout(2,1));
        tempLabel = new JLabel("Chakra Raiz:");
        tempTextField = new JTextField(""+currentClient.chakraRaiz2);
        fields.add(tempTextField);
        tempPanel.add(tempLabel);
        tempPanel.add(tempTextField);
        section.add(tempPanel);

        panel.add(section);

        panel = new JPanel();
        tempPanel = new JPanel(new BorderLayout());
        tempLabel = new JLabel("Observações:");
        tempTextField = new JTextField(""+leitura.observations,40);
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
                currentClient.nomeTerapeuta = configNomeTerapeuta;

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
                button.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) { 
                        page = 0;
                        replacePanel(subFerramentaPanel(subFerramenta.subFerramentas.get(newi), newIndexArray));
                    }
                });
            }

            resultadosPanel.add(smaller);
        }

        if(subFerramenta.type == 1){
            JTextField textField = new JTextField(32);
            resultadosPanel.add(textField);
            confirmButton.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e){
                    if(!textField.getText().isEmpty()){
                        indexArray.add(leitura.strings.size());
                        leitura.strings.add(textField.getText());
                        currentResult.addAll(indexArray);
                        leitura.historico.add(currentResult);
                        leitura.Save();
                        replacePanel(resultadosPanel(subFerramenta.mainFerramenta));
                    }
                }
            });
            resultadosPanel.add(confirmButton);
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
        String decreto = ferramenta.Decreto(index,currentClient);
        int i=0, j=0 ,k=0;
        JLabel labelDecreto = new JLabel();
        labelDecreto.setFont(configFonte);
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

            temp.add(i);
            temp.add(j);
            temp.add(k);

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
            label.setFont(configFonte);
            smaller.add(label);

            label = new JLabel("Coordenadas Portal Relacionamentos: "+(j)+ " - " + ferramenta.subFerramentas.get(1).resultados.get(j-1));
            label.setFont(configFonte);
            smaller.add(label);

            label = new JLabel("Coordenadas Portal Eu Interior: "+(k)+ " - " + ferramenta.subFerramentas.get(2).resultados.get(k-1));
            label.setFont(configFonte);
            smaller.add(label);

            label = new JLabel("A Soma dos Três Portais: "+(temp.get(8))+ " - " + ferramenta.subFerramentas.get(3).resultados.get(temp.get(8)-1));
            label.setFont(configFonte);
            smaller.add(label);

            centerJPanel.add(smaller,BorderLayout.NORTH);
        }

        if(ferramenta.multi)
            decreto = ferramenta.Decreto(multiResultsArray, currentClient);

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
                String timeStrings[]={"meses","semanas","dias","horas"};
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
                        labelDecreto.setText("<html><div WIDTH=1600>" + ferramenta.Decreto(index, currentClient).replace("<b style=\"color:red;\">(medir no relógio de mensuração) </b>", newD) + "</div></html>");
                        confirmButton.setEnabled(true);
                    }
                });
                topPanel.add(topButton,BorderLayout.SOUTH);
                centerJPanel.add(topPanel,BorderLayout.NORTH);
            }else if(ferramenta.id == 4){
                topPanel = new JPanel();
                topPanel.setLayout(new BoxLayout(topPanel,BoxLayout.Y_AXIS));
                JPanel setPanel = new JPanel(new GridLayout(1,5));
                setPanel.add(new JLabel());
                setPanel.add(new JLabel("Significado"));
                setPanel.add(new JLabel("Significado Reverso"));
                setPanel.add(new JLabel("Ativação na mesa"));
                setPanel.add(new JLabel("Chakras Associados"));
                topPanel.add(setPanel);
                for(int result = 0;result<multiResultsArray.size() ;result++){
                    setPanel = new JPanel(new GridLayout(1,5));
                    JLabel label = new JLabel(ferramenta.resultados.get(multiResultsArray.get(result)));
                    label.setFont(configFonte);
                    setPanel.add(label);
                    label = new JLabel("<html><div WIDTH=200>"+ferramenta.resultados2.get(multiResultsArray.get(result))+"</div></html>");
                    label.setFont(configFonte);
                    setPanel.add(label);
                    label = new JLabel("<html><div WIDTH=200>"+ferramenta.resultados2.get(multiResultsArray.get(result)+ferramenta.resultados.size())+"</div></html>");
                    label.setFont(configFonte);
                    setPanel.add(label);
                    label = new JLabel(ferramenta.ações.get(multiResultsArray.get(result)));
                    label.setFont(configFonte);
                    setPanel.add(label);
                    label = new JLabel(ferramenta.funções.get(multiResultsArray.get(result)));
                    label.setFont(configFonte);
                    setPanel.add(label);
                    topPanel.add(setPanel);
                }
                centerJPanel.add(topPanel,BorderLayout.NORTH);
            }
        }else if (ferramenta.portal.id == 3){
            if (ferramenta.id==0){
                confirmButton.setEnabled(false);
                temp.add(0);
                temp.add(0);
                temp.add(0);
                temp.add(0);
                topPanel = new JPanel();
                JLabel instructLabel = new JLabel("Medir no Biometro");
                topPanel.add(instructLabel,BorderLayout.NORTH);
                JPanel capsule = new JPanel(new GridLayout(4,1));
                JTextField numberField = new JTextField(4);
                capsule.add(numberField);
                JTextField numberField2 = new JTextField(4);
                capsule.add(numberField2);
                JTextField numberField3 = new JTextField(4);
                capsule.add(numberField3);
                JTextField numberField4 = new JTextField(4);
                capsule.add(numberField4);
                topPanel.add(capsule, BorderLayout.CENTER);
                JButton topButton = new JButton("Confirmar Medições");
                topButton.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        temp.set(3, Integer.parseInt(numberField.getText()));
                        temp.set(4, Integer.parseInt(numberField2.getText()));
                        temp.set(5, Integer.parseInt(numberField3.getText()));
                        temp.set(6, Integer.parseInt(numberField4.getText()));
                        String newD = "<b style=\"color:blue;\">"+ numberField.getText()+" vezes ao dia, durante o periodo de "+numberField2.getText()+" dias, "+numberField3.getText()+" semanas, "+numberField4.getText()+" meses </b>";
                        labelDecreto.setText("<html><div WIDTH=1600>" + ferramenta.Decreto(index, currentClient).replace("<b style=\"color:red;\">(x vezes ao dia) </b> durante o periodo de <b style=\"color:red;\">(dias, semanas, meses) </b>", newD) + "</div></html>");
                        confirmButton.setEnabled(true);
                    }
                });
                topPanel.add(topButton,BorderLayout.SOUTH);
                centerJPanel.add(topPanel,BorderLayout.NORTH);
            }
        }
        
        

        labelDecreto.setSize(1000, 700);
        labelDecreto.setText("<html><div WIDTH=1600>"+decreto+"</div></html>");
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
        labelDecreto.setFont(configFonte);
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
            decreto = subFerramenta.Decreto(indexArray,currentClient,multiResultsArray,resultIndex);
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
        if (subFerramenta.mainFerramenta.portal.id == 2){
            if(subFerramenta.mainFerramenta.id == 4 && subFerramenta.prevResult=="Arcanos Maiores"){
                topPanel = new JPanel();
                topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
                JPanel setPanel = new JPanel(new GridLayout(1,5));
                setPanel.add(new JLabel());
                setPanel.add(new JLabel("Significado"));
                setPanel.add(new JLabel("Significado Reverso"));
                setPanel.add(new JLabel("Ativação na mesa"));
                setPanel.add(new JLabel("Chakras Associados"));
                topPanel.add(setPanel);
                for(int result = 0;result<multiResultsArray.size() ;result++){
                    setPanel = new JPanel(new GridLayout(1,5));
                    JLabel label = new JLabel(subFerramenta.resultados.get(multiResultsArray.get(result)));
                    label.setFont(configFonte);
                    setPanel.add(label);
                    label = new JLabel("<html><div WIDTH=200>"+subFerramenta.resultados2.get(multiResultsArray.get(result))+"</div></html>");
                    label.setFont(configFonte);
                    setPanel.add(label);
                    label = new JLabel("<html><div WIDTH=200>"+subFerramenta.resultados2.get(multiResultsArray.get(result)+subFerramenta.resultados.size())+"</div></html>");
                    label.setFont(configFonte);
                    setPanel.add(label);
                    label = new JLabel(subFerramenta.ações.get(multiResultsArray.get(result)));
                    label.setFont(configFonte);
                    setPanel.add(label);
                    label = new JLabel(subFerramenta.funções.get(multiResultsArray.get(result)));
                    label.setFont(configFonte);
                    setPanel.add(label);
                    topPanel.add(setPanel);
                }
                centerJPanel.add(topPanel,BorderLayout.NORTH);
            } else if(subFerramenta.mainFerramenta.id == 0 && subFerramenta.prevResult=="Tabela de Vitaminas e Minerais"){
                topPanel = new JPanel();
                topPanel.setLayout(new BoxLayout(topPanel, BoxLayout.Y_AXIS));
                JPanel setPanel = new JPanel(new GridLayout(1,2));
                setPanel.add(new JLabel("Designação"));
                setPanel.add(new JLabel("Função"));
                topPanel.add(setPanel);
                for(int result = 0;result<multiResultsArray.size() ;result++){
                    setPanel = new JPanel(new GridLayout(1,2));
                    JLabel label = new JLabel(subFerramenta.resultados.get(multiResultsArray.get(result)));
                    label.setFont(configFonte);
                    setPanel.add(label);
                    label = new JLabel("<html><div WIDTH=500>"+subFerramenta.ações.get(multiResultsArray.get(result))+"</div></html>");
                    label.setFont(configFonte);
                    setPanel.add(label);
                    topPanel.add(setPanel);
                }
                centerJPanel.add(topPanel,BorderLayout.NORTH);
            } else if (subFerramenta.mainFerramenta.id == 7){
                confirmButton.setEnabled(false);
                temp.add(0);

                topPanel = new JPanel();
                JLabel instructLabel = new JLabel("Medir no Biometro");
                topPanel.add(instructLabel,BorderLayout.NORTH);

                JTextField numberField = new JTextField(6);
                topPanel.add(numberField, BorderLayout.CENTER);

                JButton topButton = new JButton("Confirmar Medições");
                topButton.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        temp.set(temp.size()-1, Integer.parseInt(numberField.getText()));
                        String newD = "<b style=\"color:blue;\">"+ numberField.getText()+" </b>";
                        labelDecreto.setText("<html><div WIDTH=1600>" + subFerramenta.Decreto(indexArray, currentClient).replace("<b style=\"color:red;\">(medir no biometro) </b>", newD) + "</div></html>");
                        confirmButton.setEnabled(true);
                    }
                });
                topPanel.add(topButton,BorderLayout.SOUTH);

                centerJPanel.add(topPanel,BorderLayout.NORTH);
            }
        }

        labelDecreto.setSize(1000, 700);
        labelDecreto.setText("<html><div WIDTH=1600>"+decreto+"</div></html>");
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