package Panels.UpcomingMatches;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class UpcomingMatchesPanel extends JPanel{
    //declaring attributes
    private JPanel topPanel;
    private JPanel middlePanel;
    private JPanel bottomPanel;

    //Constructor
    public UpcomingMatchesPanel() {
        this.topPanel = new JPanel();
        this.middlePanel = new JPanel();
        this.bottomPanel = new JPanel();

        showUpcomingMatchesPanel();//calling the method that actually shows the Upcoming matches
    }

    //
    public void showUpcomingMatchesPanel(){
        //setting the layout and foreground
        setLayout(new BorderLayout());
        setForeground(Color.white);

        //initializing the top panel, the panel which will have the varsity league matches
        topPanel = new JPanel();
        topPanel.setBackground(Color.LIGHT_GRAY);//setting the background colour
        topPanel.setForeground(Color.WHITE);//setting the foreground colour
        topPanel.setBorder(new TitledBorder("Varsity League"));//setting the Border and the title to Varsity League
        topPanel.setPreferredSize(new Dimension(700, 200));// setting the preferred size

        //creating a panel for the varsity league matches
        JPanel varsitymatchList = new JPanel();
        varsitymatchList.setBorder(new TitledBorder("Varsity Matches"));
        varsitymatchList.setBackground(Color.DARK_GRAY);
        varsitymatchList.setForeground(Color.WHITE);
        varsitymatchList.setPreferredSize(new Dimension(700, 200));
        topPanel.add(varsitymatchList);

        //adding the text to represent the matches
        JLabel vmatchList = new JLabel("<html>1.Kasanoma vs Highlanders<br>2.Elite vs Red Army</html>");
        vmatchList.setForeground(Color.WHITE);
        vmatchList.setFont(new Font("Comic Sans MS", Font.PLAIN, 14));
        vmatchList.setHorizontalAlignment(SwingConstants.LEFT);
        varsitymatchList.add(vmatchList, BorderLayout.WEST);


        //initializing the middle panel, the panel which will have the apl matches
        middlePanel = new JPanel();
        middlePanel.setBackground(Color.LIGHT_GRAY);
        middlePanel.setForeground(Color.WHITE);
        middlePanel.setBorder(new TitledBorder("Ashesi Premier League"));
        middlePanel.setPreferredSize(new Dimension(700, 200));

        //creating a panel for the varsity league matches
        JPanel apl = new JPanel();
        apl.setBorder(new TitledBorder("APL Matches"));
        apl.setBackground(Color.DARK_GRAY);
        apl.setForeground(Color.WHITE);
        apl.setPreferredSize(new Dimension(700, 200));
        middlePanel.add(apl);

        //adding the text to represent the matches
        JLabel aplmatchList = new JLabel("NO APL MATCHES COMING UP");
        aplmatchList.setForeground(Color.WHITE);
        aplmatchList.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        aplmatchList.setHorizontalAlignment(SwingConstants.LEFT);
        apl.add(aplmatchList, BorderLayout.EAST);


        //initializing the bottom panel, the panel which will have the FA cup league matches
        bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.LIGHT_GRAY)  ;
        bottomPanel.setForeground(Color.WHITE);
        bottomPanel.setBorder(new TitledBorder("Ashesi FA Cup"));
        bottomPanel.setPreferredSize(new Dimension(700, 200));

        //creating a panel for the fa matches
        JPanel fa = new JPanel();
        fa.setBorder(new TitledBorder("FA Matches"));
        fa.setBackground(Color.DARK_GRAY);
        fa.setForeground(Color.WHITE);
        fa.setPreferredSize(new Dimension(700, 200));
        bottomPanel.add(fa);

        //adding the text to represent the matches
        JLabel famatchList = new JLabel("NO FA MATCHES COMING UP");
        famatchList.setForeground(Color.WHITE);
        famatchList.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
        famatchList.setHorizontalAlignment(SwingConstants.LEFT);
        fa.add(famatchList, BorderLayout.EAST);

        add(middlePanel, BorderLayout.CENTER);//adding the middle panel to the center
        add(bottomPanel, BorderLayout.SOUTH);//adding the bottom panel to the south
        add(topPanel, BorderLayout.NORTH);//adding the top panel to the north
    }
}
