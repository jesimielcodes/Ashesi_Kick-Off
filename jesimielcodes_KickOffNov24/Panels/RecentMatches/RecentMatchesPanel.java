package Panels.RecentMatches;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.util.List;

public class RecentMatchesPanel extends JPanel {
    //declaring attributes
    private JPanel topPanel;
    private JTable recentMatchessTables;
    private JScrollPane recentmatchessScrollPane;

    //Constructor
    public RecentMatchesPanel() {
        this.topPanel = new JPanel();
        this.recentMatchessTables = new JTable();
        this.recentmatchessScrollPane = new JScrollPane(recentMatchessTables);

        showRecentMatchesPanel();//calling method to actually show the recent matches panel

    }

    //creating the method
    public void showRecentMatchesPanel(){
        //setting layout and background colour
        setLayout(new BorderLayout());
        setBackground(Color.LIGHT_GRAY);

        //initializing a JPanel
        topPanel = new JPanel();
        topPanel.setBackground(Color.LIGHT_GRAY);//setting background colour to light gray
        topPanel.setBorder(new TitledBorder("Recent Matches"));//creating a titled border and setting the text to "Recent Matches"


        add(topPanel, BorderLayout.CENTER);//adding it to the center of the window


        //creating a Table to show all recent matches info
        recentMatchessTables = loadRecentMatchessTable();//making the recent matches table to call the method loadRecentMatchessTable, which returns a table after reading the info from the CSV file
        recentMatchessTables.setBackground(Color.LIGHT_GRAY);//setting background colour
        if (recentMatchessTables != null) {//if the table actually has data, then a scroll pane is created to accomodate for the numbers if they are many
            recentmatchessScrollPane = new JScrollPane(recentMatchessTables);
            recentmatchessScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            recentmatchessScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
            topPanel.add(recentmatchessScrollPane, BorderLayout.CENTER);
        } else {
            JOptionPane.showMessageDialog(null, "No matches found");//display info telling user that there are no players in there
        }



        topPanel.setPreferredSize(new Dimension(800, 600));//setting the preferred size of the top panel
        add(topPanel, BorderLayout.CENTER);//add the top panel to the center of the main window



        /*// Adding a search box and button in Panels.Players.PlayersPanel
        JTextField searchField = new JTextField(15);
        JButton searchButton = new JButton("Search");
        searchButton.addActionListener(e -> filterPlayers(searchField.getText()));
        add(searchField, BorderLayout.NORTH);
        add(searchButton, BorderLayout.NORTH);

        private void filterPlayers(String searchText) {
            // Filter player list based on search criteria
            List<Panels.Players.Player> filteredPlayers = players.stream()
                    .filter(player -> player.getName().contains(searchText)) // You can add more filters here
                    .collect(Collectors.toList());

            // Update the table with filtered data
            updatePlayersTable(filteredPlayers);
        }*/
    }

    private JTable loadRecentMatchessTable() {//implementation for loading the table with all the recent matches' data
        try {
            File rMatchessFile = new File("src/Panels/RecentMatches/recentmatches.csv");// assigning the csv to a variable
            List<RecentMatches> recentMatchess = RecentMatches.readRecentMatchesFromCSV(rMatchessFile);//assigning the data from the csv to a list of recent matches

            String[] columns = {"League","Team 1", "Team 2", "Scores", "Date"};//columns for the table

            DefaultTableModel tableModel = new DefaultTableModel(columns, 0);//making a table with the columns

            for (RecentMatches match : recentMatchess) {//for every match in the obtained list, a new row is added where the getters are used to fill in the columns
                tableModel.addRow(new Object[]{
                        match.getLeague(),match.getTeam1(), match.getTeam2(), match.getScore(), match.getDate()
                });
            }
            return new JTable(tableModel);//the table is returned
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);//error message displayed in a JOptionPane Message Dialog box
            return null;
        }
    }
}
