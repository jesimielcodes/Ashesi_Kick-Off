package Panels.Team.Teams;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//implementation has been explained in the EliteDetail class
public class HighlandersDetail extends JPanel{
    private CardLayout switchPanel;
    private JPanel panelToSwitch;
    private JLayeredPane layeredPane;
    private JPanel highlandersmain;
    private ImageIcon highlanderspic;
    private JLabel header;
    private JLabel text;
    private JPanel topPanel;
    private JPanel remainingPanel;
    private JTextArea descriptionField;
    private JPanel bottomPanel;

    public HighlandersDetail(){
        this.switchPanel = new CardLayout();
        this.panelToSwitch = new JPanel();
        this.layeredPane = new JLayeredPane();
        this.highlandersmain = new JPanel();
        this.highlanderspic = new ImageIcon();
        this.header = new JLabel();
        this.text = new JLabel();
        this.topPanel = new JPanel();
        this.remainingPanel = new JPanel();
        this.descriptionField = new JTextArea();
        this.bottomPanel = new JPanel();
        showHighlandersDetail();


    }
    public void showHighlandersDetail(){
        setLayout(new BorderLayout());

        switchPanel = new CardLayout();
        panelToSwitch = new JPanel(switchPanel);
        panelToSwitch.setPreferredSize(new Dimension(800,600));

        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(800, 300));

        highlandersmain = new JPanel();
        highlandersmain.setLayout(new BorderLayout());

        highlanderspic = new ImageIcon("src/assets/Screenshot 2024-11-24 112637.png");
        header = new JLabel();
        header.setIcon(highlanderspic);
        header.setBounds(0, 0, 800, 200);
        layeredPane.add(header, Integer.valueOf(0));


        text = new JLabel("HIGHLANDERS");
        text.setForeground(Color.white);
        text.setFont(new Font("Serif", Font.PLAIN, 40));
        text.setBounds(10,10,300,40);
        layeredPane.add(text, Integer.valueOf(1));

        topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setPreferredSize(new Dimension(800, 200));
        topPanel.add(layeredPane, BorderLayout.CENTER);
        highlandersmain.add(topPanel, BorderLayout.NORTH);


        remainingPanel = new JPanel();
        remainingPanel.setLayout(new BorderLayout());
        remainingPanel.setPreferredSize(new Dimension(800, 200));
        remainingPanel.setBackground(Color.black);

        descriptionField = new JTextArea();
        descriptionField.setEditable(false);
        descriptionField.setForeground(Color.lightGray);
        descriptionField.setBackground(Color.darkGray);
        descriptionField.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        descriptionField.setText("Name:  Highlanders\nCoach: John Doe\nMember Size: 21\nEstablished:  2019\nNote:  Reigning champions since 2021.\nMotto:  Still waiting for a challenge");
        remainingPanel.add(descriptionField, BorderLayout.CENTER);
        highlandersmain.add(remainingPanel, BorderLayout.CENTER);



        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2,11));
        bottomPanel.setBackground(Color.darkGray);
        bottomPanel.setForeground(Color.white);
        bottomPanel.setPreferredSize(new Dimension(800, 200));

        JButton player1 = new JButton("#1");
        player1.setBackground(Color.lightGray);
        player1.setForeground(Color.darkGray);
        player1.setFont(new Font("Chalkboard", Font.PLAIN, 16));
        JButton player2 = new JButton("#2");
        player2.setBackground(Color.lightGray);
        player2.setForeground(Color.white);
        player2.setFont(new Font("Chalkboard", Font.PLAIN, 16));
        JButton player3 = new JButton("#3");
        player3.setBackground(Color.lightGray);
        player3.setForeground(Color.WHITE);
        player3.setFont(new Font("Chalkboard", Font.PLAIN, 16));
        JButton player4 = new JButton("#4");
        player4.setBackground(Color.lightGray);
        player4.setForeground(Color.white);
        player4.setFont(new Font("Chalkboard", Font.PLAIN, 16));
        JButton player5 = new JButton("#5");
        player5.setBackground(Color.lightGray);
        player5.setForeground(Color.WHITE);
        JButton player6 = new JButton("#6");
        player6.setBackground(Color.lightGray);
        player6.setForeground(Color.white);
        JButton player7 = new JButton("#7");
        player7.setBackground(Color.lightGray);
        player7.setForeground(Color.WHITE);
        JButton player8 = new JButton("#8");
        player8.setBackground(Color.lightGray);
        player8.setForeground(Color.white);
        JButton player9 = new JButton("#9");
        player9.setBackground(Color.lightGray);
        player9.setForeground(Color.WHITE);
        JButton player10 = new JButton("#10");
        player10.setBackground(Color.lightGray);
        player10.setForeground(Color.white);
        JButton player11 = new JButton("#11");
        player11.setBackground(Color.lightGray);
        player11.setForeground(Color.WHITE);
        JButton player12 = new JButton("#12");
        player12.setBackground(Color.lightGray);
        player12.setForeground(Color.white);
        JButton player13 = new JButton("#13");
        player13.setBackground(Color.lightGray);
        player13.setForeground(Color.WHITE);
        JButton player14 = new JButton("#14");
        player14.setBackground(Color.lightGray);
        player14.setForeground(Color.white);
        JButton player15 = new JButton("#15");
        player15.setBackground(Color.lightGray);
        player15.setForeground(Color.WHITE);
        JButton player16 = new JButton("#16");
        player16.setBackground(Color.lightGray);
        player16.setForeground(Color.white);
        JButton player17 = new JButton("#17");
        player17.setBackground(Color.lightGray);
        player17.setForeground(Color.WHITE);
        JButton player18 = new JButton("#18");
        player18.setBackground(Color.lightGray);
        player18.setForeground(Color.white);
        JButton player19 = new JButton("#19");
        player19.setBackground(Color.lightGray);
        player19.setForeground(Color.WHITE);
        JButton player20 = new JButton("#20");
        player20.setBackground(Color.lightGray);
        player20.setForeground(Color.white);
        JButton player21 = new JButton("#21");
        player21.setBackground(Color.lightGray);
        player21.setForeground(Color.WHITE);


        bottomPanel.add(player1);
        bottomPanel.add(player2);
        bottomPanel.add(player3);
        bottomPanel.add(player4);
        bottomPanel.add(player5);
        bottomPanel.add(player6);
        bottomPanel.add(player7);
        bottomPanel.add(player8);
        bottomPanel.add(player9);
        bottomPanel.add(player10);
        bottomPanel.add(player11);
        bottomPanel.add(player12);
        bottomPanel.add(player13);
        bottomPanel.add(player14);
        bottomPanel.add(player15);
        bottomPanel.add(player16);
        bottomPanel.add(player17);
        bottomPanel.add(player18);
        bottomPanel.add(player19);
        bottomPanel.add(player20);
        bottomPanel.add(player21);

        highlandersmain.add(bottomPanel, BorderLayout.SOUTH);
        panelToSwitch.add(highlandersmain, "Highlanders");
        add(panelToSwitch, BorderLayout.CENTER);


        //details for player1
        JPanel player1panel = new JPanel();
        player1panel.setLayout(new BorderLayout());
        player1panel.setBackground(Color.white);
        player1panel.setBorder(new TitledBorder("Player 1"));
        JTextArea player1details = new JTextArea();
        player1details.setForeground(Color.decode("#E0FFFF"));
        player1details.setBackground(Color.decode("#2F4F4F"));
        player1details.setEditable(false);
        player1details.setFont(new Font("Serif", Font.PLAIN, 16));
        player1details.setText("Name: \nDescription:  \nPosition:  \nHeight:  ");
        player1panel.add(player1details, BorderLayout.CENTER);
        JLabel playerPic = new JLabel();
        playerPic.setPreferredSize(new Dimension(200, 600));
        playerPic.setBounds(20,20, 200, 600 );
        playerPic.setIcon(highlanderspic);
        player1panel.add(playerPic, BorderLayout.EAST);
        panelToSwitch.add(player1panel, "Player1");
        JButton back1 = new JButton("Back");
        back1.setSize(50, 50);
        back1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "Highlanders");
            }
        });
        player1panel.add(back1, BorderLayout.SOUTH);
        player1.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        switchPanel.show(panelToSwitch, "Player1");
                    }
                }
        );


        //details for player 2
        JPanel player2panel = new JPanel();
        player2panel.setLayout(new BorderLayout());
        player2panel.setBackground(Color.white);
        player2panel.setBorder(new TitledBorder("Player 2"));
        JTextArea player2details = new JTextArea();
        player2details.setForeground(Color.decode("#E0FFFF"));
        player2details.setBackground(Color.decode("#2F4F4F"));
        player2details.setEditable(false);
        player2details.setFont(new Font("Serif", Font.PLAIN, 16));
        player2details.setText("Name: \nDescription:  \nPosition:  \nHeight:  ");
        player2panel.add(player2details, BorderLayout.CENTER);
        JLabel player2Pic = new JLabel();
        player2Pic.setPreferredSize(new Dimension(200, 600));
        player2Pic.setBounds(20,20, 200, 600 );
        player2Pic.setIcon(highlanderspic);
        player2panel.add(player2Pic, BorderLayout.EAST);
        panelToSwitch.add(player2panel, "Player2");
        JButton back2 = new JButton("Back");
        back2.setSize(50, 50);
        back2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "Highlanders");
            }
        });
        player2panel.add(back2, BorderLayout.SOUTH);
        player2.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        switchPanel.show(panelToSwitch, "Player2");
                    }
                }
        );


        //details for player 3
        JPanel player3panel = new JPanel();
        player3panel.setLayout(new BorderLayout());
        player3panel.setBackground(Color.white);
        player3panel.setBorder(new TitledBorder("Player 3"));
        JTextArea player3details = new JTextArea();
        player3details.setForeground(Color.decode("#E0FFFF"));
        player3details.setBackground(Color.decode("#2F4F4F"));
        player3details.setEditable(false);
        player3details.setFont(new Font("Serif", Font.PLAIN, 16));
        player3details.setText("Name: \nDescription:  \nPosition:  \nHeight:  ");
        player3panel.add(player3details, BorderLayout.CENTER);
        JLabel player3Pic = new JLabel();
        player3Pic.setPreferredSize(new Dimension(200, 600));
        player3Pic.setBounds(20,20, 200, 600 );
        player3Pic.setIcon(highlanderspic);
        player3panel.add(player3Pic, BorderLayout.EAST);
        panelToSwitch.add(player3panel, "Player3");
        JButton back3 = new JButton("Back");
        back3.setSize(50, 50);
        back3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "Highlanders");
            }
        });
        player3panel.add(back3, BorderLayout.SOUTH);
        player3.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        switchPanel.show(panelToSwitch, "Player3");
                    }
                }
        );


        //details for Panels.Players.Player 4
        JPanel player4panel = new JPanel();
        player4panel.setLayout(new BorderLayout());
        player4panel.setBackground(Color.white);
        player4panel.setBorder(new TitledBorder("Player 3"));
        JTextArea player4details = new JTextArea();
        player4details.setForeground(Color.decode("#E0FFFF"));
        player4details.setBackground(Color.decode("#2F4F4F"));
        player4details.setEditable(false);
        player4details.setFont(new Font("Serif", Font.PLAIN, 16));
        player4details.setText("Name: \nDescription:  \nPosition:  \nHeight:  ");
        player4panel.add(player4details, BorderLayout.CENTER);
        JLabel player4Pic = new JLabel();
        player4Pic.setPreferredSize(new Dimension(200, 600));
        player4Pic.setBounds(20,20, 200, 600 );
        player4Pic.setIcon(highlanderspic);
        player4panel.add(player4Pic, BorderLayout.EAST);
        panelToSwitch.add(player4panel, "Player4");
        JButton back4 = new JButton("Back");
        back4.setSize(50, 50);
        back4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "Highlanders");
            }
        });
        player4panel.add(back4, BorderLayout.SOUTH);
        player4.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        switchPanel.show(panelToSwitch, "Player4");
                    }
                }
        );


        //details for player 5
        JPanel player5panel = new JPanel();
        player5panel.setLayout(new BorderLayout());
        player5panel.setBackground(Color.white);
        player5panel.setBorder(new TitledBorder("Player 5"));
        JTextArea player5details = new JTextArea();
        player5details.setForeground(Color.decode("#E0FFFF"));
        player5details.setBackground(Color.decode("#2F4F4F"));
        player5details.setEditable(false);
        player5details.setFont(new Font("Serif", Font.PLAIN, 16));
        player5details.setText("Name: \nDescription:  \nPosition:  \nHeight:  ");
        player5panel.add(player3details, BorderLayout.CENTER);
        JLabel player5Pic = new JLabel();
        player5Pic.setPreferredSize(new Dimension(200, 600));
        player5Pic.setBounds(20,20, 200, 600 );
        player5Pic.setIcon(highlanderspic);
        player5panel.add(player5Pic, BorderLayout.EAST);
        panelToSwitch.add(player5panel, "Player5");
        JButton back5 = new JButton("Back");
        back5.setSize(50, 50);
        back5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "Highlanders");
            }
        });
        player5panel.add(back5, BorderLayout.SOUTH);
        player5.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        switchPanel.show(panelToSwitch, "Player5");
                    }
                }
        );

        //details for player 6
        JPanel player6panel = new JPanel();
        player6panel.setLayout(new BorderLayout());
        player6panel.setBackground(Color.white);
        player6panel.setBorder(new TitledBorder("Player 6"));
        JTextArea player6details = new JTextArea();
        player6details.setForeground(Color.decode("#E0FFFF"));
        player6details.setBackground(Color.decode("#2F4F4F"));
        player6details.setEditable(false);
        player6details.setFont(new Font("Serif", Font.PLAIN, 16));
        player6details.setText("Name: \nDescription:\nPosition:  \nHeight:  ");
        player6panel.add(player3details, BorderLayout.CENTER);
        JLabel player6Pic = new JLabel();
        player6Pic.setPreferredSize(new Dimension(200, 600));
        player6Pic.setBounds(20,20, 200, 600 );
        player6Pic.setIcon(highlanderspic);
        player6panel.add(player6Pic, BorderLayout.EAST);
        panelToSwitch.add(player6panel, "Player6");
        JButton back6 = new JButton("Back");
        back6.setSize(50, 50);
        back6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "Highlanders");
            }
        });
        player6panel.add(back6, BorderLayout.SOUTH);
        player6.addActionListener(
                new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        switchPanel.show(panelToSwitch, "Player6");
                    }
                }
        );


        switchPanel.show(panelToSwitch, "Highlanders");
    }
}
