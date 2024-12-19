package Panels.Team.Teams;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

//implementation has been explained in the EliteDetail class
public class NorthSideDetail extends JPanel{
    private CardLayout switchPanel;
    private JPanel panelToSwitch;
    private JLayeredPane layeredPane;
    private JPanel northsidemain;
    private ImageIcon northsidepic;
    private JLabel header;
    private JLabel text;
    private JPanel topPanel;
    private JPanel remainingPanel;
    private JTextArea descriptionField;
    private JPanel bottomPanel;

    public NorthSideDetail(){
        this.switchPanel = new CardLayout();
        this.panelToSwitch = new JPanel();
        this.layeredPane = new JLayeredPane();
        this.northsidemain = new JPanel();
        this.header = new JLabel();
        this.text = new JLabel();
        this.topPanel = new JPanel();
        this.remainingPanel = new JPanel();
        this.descriptionField = new JTextArea();
        this.bottomPanel = new JPanel();
        showNorthSideDetail();

    }
    public void showNorthSideDetail(){
        setLayout(new BorderLayout());

        switchPanel = new CardLayout();
        panelToSwitch = new JPanel(switchPanel);
        panelToSwitch.setPreferredSize(new Dimension(800,600));

        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(800, 300));

        northsidemain = new JPanel();
        northsidemain.setLayout(new BorderLayout());

        northsidepic = new ImageIcon("src/assets/Screenshot 2024-11-24 112637.png");
        header = new JLabel();
        header.setIcon(northsidepic);
        header.setBounds(0, 0, 800, 200);
        layeredPane.add(header, Integer.valueOf(0));


        text = new JLabel("NORTHSIDE");
        text.setForeground(Color.white);
        text.setFont(new Font("Serif", Font.PLAIN, 40));
        text.setBounds(10,10,250,40);
        layeredPane.add(text, Integer.valueOf(1));

        topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setPreferredSize(new Dimension(800, 200));
        topPanel.add(layeredPane, BorderLayout.CENTER);
        northsidemain.add(topPanel, BorderLayout.NORTH);


        remainingPanel = new JPanel();
        remainingPanel.setLayout(new BorderLayout());
        remainingPanel.setPreferredSize(new Dimension(800, 200));
        remainingPanel.setBackground(Color.black);

        descriptionField = new JTextArea();
        descriptionField.setEditable(false);
        descriptionField.setForeground(Color.decode("#2F4F4F"));
        descriptionField.setBackground(Color.decode("#DCDCDC"));
        descriptionField.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        descriptionField.setText("Name:  Northside\nCoach: John Doe\nMember Size: 21\nEstablished:  2019\nNote:  Reigning champions since 2021.\nMotto:  Still waiting for a challenge");
        remainingPanel.add(descriptionField, BorderLayout.CENTER);
        northsidemain.add(remainingPanel, BorderLayout.CENTER);



        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2,11));
        bottomPanel.setBackground(Color.decode("#DCDCDC"));
        bottomPanel.setForeground(Color.white);
        bottomPanel.setPreferredSize(new Dimension(800, 200));

        JButton player1 = new JButton("#1");
        player1.setBackground(Color.decode("#DCDCDC"));
        player1.setForeground(Color.decode("#2F4F4F"));
        player1.setFont(new Font("Chalkboard", Font.PLAIN, 16));
        JButton player2 = new JButton("#2");
        player2.setBackground(Color.decode("#DCDCDC"));
        player2.setForeground(Color.decode("#2F4F4F"));
        player2.setFont(new Font("Chalkboard", Font.PLAIN, 16));
        JButton player3 = new JButton("#3");
        player3.setBackground(Color.decode("#DCDCDC"));
        player3.setForeground(Color.decode("#2F4F4F"));
        player3.setFont(new Font("Chalkboard", Font.PLAIN, 16));
        JButton player4 = new JButton("#4");
        player4.setBackground(Color.decode("#DCDCDC"));
        player4.setForeground(Color.decode("#2F4F4F"));
        player4.setFont(new Font("Chalkboard", Font.PLAIN, 16));
        JButton player5 = new JButton("#5");
        player5.setBackground(Color.decode("#DCDCDC"));
        player5.setForeground(Color.decode("#2F4F4F"));
        JButton player6 = new JButton("#6");
        player6.setBackground(Color.decode("#DCDCDC"));
        player6.setForeground(Color.decode("#2F4F4F"));
        JButton player7 = new JButton("#7");
        player7.setBackground(Color.decode("#DCDCDC"));
        player7.setForeground(Color.decode("#2F4F4F"));
        JButton player8 = new JButton("#8");
        player8.setBackground(Color.decode("#DCDCDC"));
        player8.setForeground(Color.decode("#2F4F4F"));
        JButton player9 = new JButton("#9");
        player9.setBackground(Color.decode("#DCDCDC"));
        player9.setForeground(Color.decode("#2F4F4F"));
        JButton player10 = new JButton("#10");
        player10.setBackground(Color.decode("#DCDCDC"));
        player10.setForeground(Color.decode("#2F4F4F"));
        JButton player11 = new JButton("#11");
        player11.setBackground(Color.decode("#DCDCDC"));
        player11.setForeground(Color.decode("#2F4F4F"));
        JButton player12 = new JButton("#12");
        player12.setBackground(Color.decode("#DCDCDC"));
        player12.setForeground(Color.decode("#2F4F4F"));
        JButton player13 = new JButton("#13");
        player13.setBackground(Color.decode("#DCDCDC"));
        player13.setForeground(Color.decode("#2F4F4F"));
        JButton player14 = new JButton("#14");
        player14.setBackground(Color.decode("#DCDCDC"));
        player14.setForeground(Color.decode("#2F4F4F"));
        JButton player15 = new JButton("#15");
        player15.setBackground(Color.decode("#DCDCDC"));
        player15.setForeground(Color.decode("#2F4F4F"));
        JButton player16 = new JButton("#16");
        player16.setBackground(Color.decode("#DCDCDC"));
        player16.setForeground(Color.decode("#2F4F4F"));
        JButton player17 = new JButton("#17");
        player17.setBackground(Color.decode("#DCDCDC"));
        player17.setForeground(Color.decode("#2F4F4F"));
        JButton player18 = new JButton("#18");
        player18.setBackground(Color.decode("#DCDCDC"));
        player18.setForeground(Color.decode("#2F4F4F"));
        JButton player19 = new JButton("#19");
        player19.setBackground(Color.decode("#DCDCDC"));
        player19.setForeground(Color.decode("#2F4F4F"));
        JButton player20 = new JButton("#20");
        player20.setBackground(Color.decode("#DCDCDC"));
        player20.setForeground(Color.decode("#2F4F4F"));
        JButton player21 = new JButton("#21");
        player21.setBackground(Color.decode("#DCDCDC"));
        player21.setForeground(Color.decode("#2F4F4F"));


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


        northsidemain.add(bottomPanel, BorderLayout.SOUTH);
        panelToSwitch.add(northsidemain, "NorthSide");
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
        playerPic.setIcon(northsidepic);
        player1panel.add(playerPic, BorderLayout.EAST);
        panelToSwitch.add(player1panel, "Player1");
        JButton back1 = new JButton("Back");
        back1.setSize(50, 50);
        back1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "NorthSide");
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
        player2Pic.setIcon(northsidepic);
        player2panel.add(player2Pic, BorderLayout.EAST);
        panelToSwitch.add(player2panel, "Player2");
        JButton back2 = new JButton("Back");
        back2.setSize(50, 50);
        back2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "NorthSide");
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
        player3Pic.setIcon(northsidepic);
        player3panel.add(player3Pic, BorderLayout.EAST);
        panelToSwitch.add(player3panel, "Player3");
        JButton back3 = new JButton("Back");
        back3.setSize(50, 50);
        back3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "NorthSide");
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
        player4Pic.setIcon(northsidepic);
        player4panel.add(player4Pic, BorderLayout.EAST);
        panelToSwitch.add(player4panel, "Player4");
        JButton back4 = new JButton("Back");
        back4.setSize(50, 50);
        back4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "NorthSide");
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
        player5Pic.setIcon(northsidepic);
        player5panel.add(player5Pic, BorderLayout.EAST);
        panelToSwitch.add(player5panel, "Player5");
        JButton back5 = new JButton("Back");
        back5.setSize(50, 50);
        back5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "NorthSide");
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
        player6Pic.setIcon(northsidepic);
        player6panel.add(player6Pic, BorderLayout.EAST);
        panelToSwitch.add(player6panel, "Player6");
        JButton back6 = new JButton("Back");
        back6.setSize(50, 50);
        back6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "NorthSide");
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


        switchPanel.show(panelToSwitch, "NorthSide");

    }
}
