package Panels.Players;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.util.List;

public class PlayersPanel extends JPanel {

    //declaring attributes
    private JLabel titleLabel;
    private JTable playersTable;
    private JScrollPane playersScrollPane;

    //Constructor
    public PlayersPanel() {
        this.titleLabel = new JLabel();
        this.playersTable = loadPlayersTable();
        this.playersScrollPane = new JScrollPane(playersTable);

        showPlayersPanel();//calling method that actually shows the players panel
    }

    //defining the method to show the players panel
    public void showPlayersPanel(){
        //setting layout and background colour
        setLayout(new BorderLayout());
        setBackground(Color.LIGHT_GRAY);

        //setting a heading
        titleLabel = new JLabel("All Players");
        titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);


        //creating a Table to show all players info
        playersTable = loadPlayersTable(); //making the players table to call the method loadPlayersTable, which returns a table after reading the info from the CSV file
        playersTable.setBackground(Color.LIGHT_GRAY);//setting background colour
        if (playersTable != null) { //if the table actually has data, then a scroll pane is created to accommodate for the numbers if they are many
            playersScrollPane = new JScrollPane(playersTable);
            playersScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            playersScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            add(playersScrollPane, BorderLayout.CENTER);
        } else {//display info telling user that there are no players in there
            JOptionPane.showMessageDialog(null, "No players found");
        }

    }

    private JTable loadPlayersTable() {//implementation for loading the table with all the players' data
        try {
            File playersFile = new File("src/Panels/Players/players.csv");// assigning the csv to a variable
            List<Player> players = Player.readPlayersFromCSV(playersFile);//assigning the data from the csv to a list of players

            String[] columns = {"Name", "Age", "Weight", "Height", "Gender", "Position", "Ranking", "Description"};//columns for the table

            DefaultTableModel tableModel = new DefaultTableModel(columns, 0);//making a table with the columns
            for (Player player : players) {//for every player in the obtained list, a new row is added where the getters are used to fill in the columns
                tableModel.addRow(new Object[]{
                        player.getName(), player.getAge(), player.getWeight(), player.getHeight(), player.getGender(), player.getPosition(), player.getRanking(), player.getDescription()
                });
            }
            return new JTable(tableModel);//the table is returned
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);//error message displayed in a JOptionPane Message Dialog box
            return null;
        }
    }
}