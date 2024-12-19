package Panels.Team;

import Panels.Team.Teams.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



public class TeamsPanel extends JPanel {
    //declaring attributes
    private CardLayout teamsSwitch;
    private JPanel teamPanelToSwitch;
    private JPanel teamsButtonPanel;
    private JPanel overviewPanel;
    private JPanel kasanomaPanel;
    private JPanel elitePanel;
    private JPanel northSidePanel;
    private JPanel redArmyPanel;
    private JPanel highlandersPanel;
    private JScrollPane teamButtonScrollPane;


    //Constructor
    public TeamsPanel() {
        this.teamsSwitch = new CardLayout();
        this.teamPanelToSwitch = new JPanel();
        this.teamsButtonPanel = new JPanel();
        this.overviewPanel = new JPanel();
        this.kasanomaPanel = new JPanel();
        this.elitePanel = new JPanel();
        this.northSidePanel = new JPanel();
        this.redArmyPanel = new JPanel();
        this.highlandersPanel = new JPanel();
        this.teamButtonScrollPane = new JScrollPane();

        showTeamsPanel();//calling method to actually show the teams panel
    }


    //defining the method
    public void showTeamsPanel() {
        //initializing the attributes
        teamsSwitch = new CardLayout();
        teamPanelToSwitch = new JPanel(teamsSwitch);
        teamPanelToSwitch.setBackground(Color.LIGHT_GRAY);

        //setting the layout
        setLayout(new BorderLayout());

        //panel to place the buttons for the teams
        teamsButtonPanel = new JPanel();
        teamsButtonPanel.setLayout(new BoxLayout(teamsButtonPanel, BoxLayout.Y_AXIS));//setting the layout to be along the y-axis in a box


        //panel for the overview
        overviewPanel = new Overview();
        teamPanelToSwitch.add(overviewPanel, "Overview");

        JButton overviewButton = new JButton("Overview");
        overviewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teamsSwitch.show(teamPanelToSwitch, "Overview");
            }
        });
        teamsButtonPanel.add(overviewButton);



        //panel for the Kasanoma team
        kasanomaPanel = new KasanomaDetail();
        teamPanelToSwitch.add(kasanomaPanel, "kasanomaPanel");
        JButton kasanomaButton = new JButton("Kasanoma");
        kasanomaButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teamsSwitch.show(teamPanelToSwitch, "kasanomaPanel");
            }
        });
        teamsButtonPanel.add(kasanomaButton);



        //panel for the Northside team
        northSidePanel = new NorthSideDetail();
        teamPanelToSwitch.add(northSidePanel, "northSidePanel");
        JButton northSideButton = new JButton("North Side");
        northSideButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teamsSwitch.show(teamPanelToSwitch, "northSidePanel");
            }
        });
        teamsButtonPanel.add(northSideButton);



        //panel for the Elite team
        elitePanel = new EliteDetail();
        teamPanelToSwitch.add(elitePanel, "elitePanel");
        JButton eliteButton = new JButton("Elite");
        eliteButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teamsSwitch.show(teamPanelToSwitch, "elitePanel");
            }
        });
        teamsButtonPanel.add(eliteButton);



        //panel for the Red Army team
        redArmyPanel = new RedArmyDetail();
        teamPanelToSwitch.add(redArmyPanel, "redArmyPanel");
        JButton redArmyButton = new JButton("Red Army");
        redArmyButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teamsSwitch.show(teamPanelToSwitch, "redArmyPanel");
            }
        });
        teamsButtonPanel.add(redArmyButton);


        //panel for the Highlanders
        highlandersPanel = new HighlandersDetail();
        teamPanelToSwitch.add(highlandersPanel, "highlandersPanel");
        JButton highlandersButton = new JButton("Highlanders");
        highlandersButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                teamsSwitch.show(teamPanelToSwitch, "highlandersPanel");
            }
        });
        teamsButtonPanel.add(highlandersButton);

        //creating a scroll pane for the button panel
        teamButtonScrollPane = new JScrollPane(teamsButtonPanel);
        add(teamButtonScrollPane, BorderLayout.EAST);//placing the pane at the right

        add(teamPanelToSwitch, BorderLayout.CENTER);//adding the panel to the center

    }

}
