package Panels.Team.Teams;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EliteDetail extends JPanel{
    //declaring variables
    private CardLayout switchPanel;
    private JPanel panelToSwitch;
    private JLayeredPane layeredPane;
    private JPanel elitemain;
    private ImageIcon elitepic;
    private JLabel header;
    private JLabel text;
    private JPanel topPanel;
    private JPanel remainingPanel;
    private JTextArea descriptionField;
    private JPanel bottomPanel;


    //Constructor
    public EliteDetail(){
        this.switchPanel = new CardLayout();
        this.panelToSwitch = new JPanel();
        this.layeredPane = new JLayeredPane();
        this.elitemain = new JPanel();
        this.elitepic = new ImageIcon();
        this.header = new JLabel();
        this.text = new JLabel();
        this.topPanel = new JPanel();
        this.remainingPanel = new JPanel();
        this.descriptionField = new JTextArea();
        this.bottomPanel = new JPanel();

        showEliteDetail();//calling the method to actually show the details for the elite team
    }

    //defining the method to show the Elite team
    public void showEliteDetail(){
        //setting teh border layout
        setLayout(new BorderLayout());

        //initializing the cardlayout and panel used to switch between players
        switchPanel = new CardLayout();
        panelToSwitch = new JPanel(switchPanel);
        panelToSwitch.setPreferredSize(new Dimension(800,600));//setting size

        //creating layered pane to layer the team picture and team text
        layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(800, 300));//setting the size

        //initializing the main panel for the elite team
        elitemain = new JPanel();
        elitemain.setLayout(new BorderLayout());//setting the layout

        //initializing the team picture
        elitepic = new ImageIcon("src/assets/Screenshot 2024-11-24 112637.png");
        header = new JLabel();//setting a header for the team Page
        header.setIcon(elitepic);//setting the team pic as the header
        header.setBounds(0, 0, 800, 200);//setting bounds of the header
        layeredPane.add(header, Integer.valueOf(0));//placing the header on the first layer of the layered pane


        text = new JLabel("ELITE");//setting the text
        text.setForeground(Color.white);
        text.setFont(new Font("Serif", Font.PLAIN, 40));
        text.setBounds(10,10,250,40);
        layeredPane.add(text, Integer.valueOf(1));//placing the text on the second layer, on top of the picture

        //making the toppanel and adding the layered pane
        topPanel = new JPanel();
        topPanel.setLayout(new BorderLayout());
        topPanel.setPreferredSize(new Dimension(800, 200));
        topPanel.add(layeredPane, BorderLayout.CENTER);
        elitemain.add(topPanel, BorderLayout.NORTH);

        //making the remaining panel and adding a description field to display info on the team
        remainingPanel = new JPanel();
        remainingPanel.setLayout(new BorderLayout());
        remainingPanel.setPreferredSize(new Dimension(800, 200));
        remainingPanel.setBackground(Color.black);

        descriptionField = new JTextArea();
        descriptionField.setEditable(false);
        descriptionField.setForeground(Color.white);
        descriptionField.setBackground(Color.black);
        descriptionField.setFont(new Font("Times New Roman", Font.ITALIC, 15));
        descriptionField.setText("Name:  Elite\nCoach: John Doe\nMember Size: 21\nEstablished:  2019\nNote:  Reigning champions since 2021.\nMotto:  Still waiting for a challenge");
        remainingPanel.add(descriptionField, BorderLayout.CENTER);
        elitemain.add(remainingPanel, BorderLayout.CENTER);



        //making the bottom panel where all the players buttons will be situated
        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(2,11));
        bottomPanel.setBackground(Color.white);
        bottomPanel.setForeground(Color.white);
        bottomPanel.setPreferredSize(new Dimension(800, 200));

        //making the buttons
        JButton player1 = new JButton("#1");
        player1.setBackground(Color.black);
        player1.setForeground(Color.white);
        player1.setFont(new Font("Chalkboard", Font.PLAIN, 16));
        JButton player2 = new JButton("#2");
        player2.setBackground(Color.white);
        player2.setForeground(Color.black);
        player2.setFont(new Font("Chalkboard", Font.PLAIN, 16));
        JButton player3 = new JButton("#3");
        player3.setBackground(Color.black);
        player3.setForeground(Color.WHITE);
        player3.setFont(new Font("Chalkboard", Font.PLAIN, 16));
        JButton player4 = new JButton("#4");
        player4.setBackground(Color.white);
        player4.setForeground(Color.black);
        player4.setFont(new Font("Chalkboard", Font.PLAIN, 16));
        JButton player5 = new JButton("#5");
        player5.setBackground(Color.black);
        player5.setForeground(Color.WHITE);
        JButton player6 = new JButton("#6");
        player6.setBackground(Color.white);
        player6.setForeground(Color.black);
        JButton player7 = new JButton("#7");
        player7.setBackground(Color.black);
        player7.setForeground(Color.WHITE);
        JButton player8 = new JButton("#8");
        player8.setBackground(Color.white);
        player8.setForeground(Color.black);
        JButton player9 = new JButton("#9");
        player9.setBackground(Color.black);
        player9.setForeground(Color.WHITE);
        JButton player10 = new JButton("#10");
        player10.setBackground(Color.white);
        player10.setForeground(Color.black);
        JButton player11 = new JButton("#11");
        player11.setBackground(Color.black);
        player11.setForeground(Color.WHITE);
        JButton player12 = new JButton("#12");
        player12.setBackground(Color.white);
        player12.setForeground(Color.black);
        JButton player13 = new JButton("#13");
        player13.setBackground(Color.black);
        player13.setForeground(Color.WHITE);
        JButton player14 = new JButton("#14");
        player14.setBackground(Color.white);
        player14.setForeground(Color.black);
        JButton player15 = new JButton("#15");
        player15.setBackground(Color.black);
        player15.setForeground(Color.WHITE);
        JButton player16 = new JButton("#16");
        player16.setBackground(Color.white);
        player16.setForeground(Color.black);
        JButton player17 = new JButton("#17");
        player17.setBackground(Color.black);
        player17.setForeground(Color.WHITE);
        JButton player18 = new JButton("#18");
        player18.setBackground(Color.white);
        player18.setForeground(Color.black);
        JButton player19 = new JButton("#19");
        player19.setBackground(Color.black);
        player19.setForeground(Color.WHITE);
        JButton player20 = new JButton("#20");
        player20.setBackground(Color.white);
        player20.setForeground(Color.black);
        JButton player21 = new JButton("#21");
        player21.setBackground(Color.black);
        player21.setForeground(Color.WHITE);


        //adding the buttons to the bottom panel
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

        //adding the bottom panel to the elite page and add the elite page to the cardlayout for switching
        elitemain.add(bottomPanel, BorderLayout.SOUTH);
        panelToSwitch.add(elitemain, "Elite");
        add(panelToSwitch, BorderLayout.CENTER);


        //details for all player pages including back buttons to the main elite page
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
        playerPic.setIcon(elitepic);
        player1panel.add(playerPic, BorderLayout.EAST);
        panelToSwitch.add(player1panel, "Player1");
        JButton back1 = new JButton("Back");
        back1.setSize(50, 50);
        back1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "Elite");
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
        player2Pic.setIcon(elitepic);
        player2panel.add(player2Pic, BorderLayout.EAST);
        panelToSwitch.add(player2panel, "Player2");
        JButton back2 = new JButton("Back");
        back2.setSize(50, 50);
        back2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "Elite");
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
        player3Pic.setIcon(elitepic);
        player3panel.add(player3Pic, BorderLayout.EAST);
        panelToSwitch.add(player3panel, "Player3");
        JButton back3 = new JButton("Back");
        back3.setSize(50, 50);
        back3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "Elite");
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
        player4panel.setBorder(new TitledBorder("Player 4"));
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
        player4Pic.setIcon(elitepic);
        player4panel.add(player4Pic, BorderLayout.EAST);
        panelToSwitch.add(player4panel, "Player4");
        JButton back4 = new JButton("Back");
        back4.setSize(50, 50);
        back4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "Elite");
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
        player5Pic.setIcon(elitepic);
        player5panel.add(player5Pic, BorderLayout.EAST);
        panelToSwitch.add(player5panel, "Player5");
        JButton back5 = new JButton("Back");
        back5.setSize(50, 50);
        back5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "Elite");
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
        player6Pic.setIcon(elitepic);
        player6panel.add(player6Pic, BorderLayout.EAST);
        panelToSwitch.add(player6panel, "Player6");
        JButton back6 = new JButton("Back");
        back6.setSize(50, 50);
        back6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                switchPanel.show(panelToSwitch, "Elite");
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


        switchPanel.show(panelToSwitch, "Elite");
    }
}
