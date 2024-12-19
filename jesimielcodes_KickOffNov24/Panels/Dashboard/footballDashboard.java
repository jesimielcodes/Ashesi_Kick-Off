package Panels.Dashboard;

import Panels.Announcements.AnnouncementsPanel;
import Panels.Leagues.LeaguesPanel;
import Panels.Players.PlayersPanel;
import Panels.RecentMatches.RecentMatchesPanel;
import Panels.UpcomingMatches.UpcomingMatchesPanel;
import Panels.Team.TeamsPanel;

import javax.swing.*;
import java.awt.*;

public class footballDashboard {
    //declaring attributes
    private JFrame mainframe;
    private CardLayout panelSwitch;
    private JPanel PanelToSwitch;
    private JPanel topPanel;
    private JPanel bottomPanel;
    private JPanel announcementsPanel;
    private JPanel playerspanel;
    private JPanel teamsPanel;
    private JPanel leaguesPanel;
    private JPanel upcomingPanel;
    private JPanel recentsPanel;
    private JButton main;
    private JButton announcementsButton;
    private JButton teamsButton;
    private JButton allPlayersButton;
    private JButton leaguesButton;
    private JButton upcomingButton;
    private JButton recentsButton;

    //Constructor
    public footballDashboard() {
        this.mainframe = new JFrame("Football Dashboard");
        this.panelSwitch = new CardLayout();
        this.PanelToSwitch = new JPanel();
        this.topPanel = new JPanel();
        this.bottomPanel = new JPanel();
        this.announcementsPanel = new JPanel();
        this.playerspanel = new JPanel();
        this.teamsPanel = new JPanel();
        this.leaguesPanel = new JPanel();
        this.upcomingPanel = new JPanel();
        this.recentsPanel = new JPanel();
        this.main = new JButton("Main");
        this.announcementsButton = new JButton("Announcements");
        this.teamsButton = new JButton("Teams");
        this.allPlayersButton = new JButton("All Players");
        this.leaguesButton = new JButton("Leagues");
        this.upcomingButton = new JButton("Upcoming");
        this.recentsButton = new JButton("Recents");

        showDashboard();//calling method to actually show the dashboard

    }


    //creating method to show dashboard
    private void showDashboard(){
        //this is the main frame, or the actual window that opens when the code is run

        mainframe = new JFrame("Football Dashboard");//initializing it and setting the title
        mainframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//setting what will happen when the close button is clicked
        mainframe.setSize(800, 600);//setting default size
        mainframe.setLocationRelativeTo(null);//setting it to open in the middle of the window
        mainframe.setLayout(new BorderLayout());//setting layout to borderlayout so items can be placed at North, South, East, West and Center

        panelSwitch = new CardLayout(); //initializing a CardLayout so that the panel can be switched, so if a button is clicked a particular page is switched to
        PanelToSwitch = new JPanel(panelSwitch); //initializing the panel where the switching will be taking place



        //initializing the various panels/pages of the various sections of the app
        topPanel = new HighlightsPanel();
        announcementsPanel = new AnnouncementsPanel();
        playerspanel = new PlayersPanel();
        teamsPanel = new TeamsPanel();
        leaguesPanel = new LeaguesPanel();
        upcomingPanel = new UpcomingMatchesPanel();
        recentsPanel = new RecentMatchesPanel();

        //initializing the bottom panel

        bottomPanel = new JPanel();
        bottomPanel.setLayout(new GridLayout(1,6,10,10));//setting layout to GridLayout, so objects can be put in a grid with rows 1, columns 6, horizontal gap 10, vertical gap 10

        //creating buttons for the various sections of the app
        main = new JButton("Dashboard");//
        announcementsButton = new JButton("Announcements");
        teamsButton = new JButton("Teams");
        allPlayersButton = new JButton("All Players");
        leaguesButton = new JButton("Leagues");
        upcomingButton = new JButton("Upcoming");
        recentsButton = new JButton("Recents");

        //adding all the buttons to the bottom panel
        bottomPanel.add(main);
        bottomPanel.add(teamsButton);
        bottomPanel.add(leaguesButton);
        bottomPanel.add(allPlayersButton);
        bottomPanel.add(recentsButton);
        bottomPanel.add(upcomingButton);
        bottomPanel.add(announcementsButton);


         //adding the various panels to the cardLayout panel so they can be switched to when their buttons are clicked
        PanelToSwitch.add(topPanel, "Highlights");
        PanelToSwitch.add(announcementsPanel, "Announcements");
        PanelToSwitch.add(playerspanel, "All Players");
        PanelToSwitch.add(teamsPanel, "Teams");
        PanelToSwitch.add(leaguesPanel, "Leagues");
        PanelToSwitch.add(upcomingPanel, "Upcoming");
        PanelToSwitch.add(recentsPanel, "Recents");

        //adding the switching panel and the bottom panel to the main window so it can actually be seen
        mainframe.add(PanelToSwitch, BorderLayout.CENTER);//placing the switching panel in the middle
        mainframe.add(bottomPanel, BorderLayout.SOUTH);//placing the bottom panel south of the window


        //lambda expressions of the different button functions
        //when a button is clicked, the corresponding panel that has been add ed to the cardLayout will be shown
        main.addActionListener(e -> panelSwitch.show(PanelToSwitch, "Highlights"));
        announcementsButton.addActionListener(e -> panelSwitch.show(PanelToSwitch, "Announcements"));
        teamsButton.addActionListener(e -> panelSwitch.show(PanelToSwitch, "Teams"));
        allPlayersButton.addActionListener(e -> panelSwitch.show(PanelToSwitch, "All Players"));
        leaguesButton.addActionListener(e -> panelSwitch.show(PanelToSwitch, "Leagues"));
        upcomingButton.addActionListener(e -> panelSwitch.show(PanelToSwitch, "Upcoming"));
        recentsButton.addActionListener(e -> panelSwitch.show(PanelToSwitch, "Recents"));

        //making the window visible on the desktop
        mainframe.setVisible(true);

    }
    private static void showMessage(String message){
        JOptionPane.showMessageDialog(null, message);
    }

}