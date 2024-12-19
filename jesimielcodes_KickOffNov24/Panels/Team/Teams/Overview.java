package Panels.Team.Teams;

import Panels.Team.Team;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.io.File;
import java.util.List;

public class Overview extends JPanel {
    private JLabel titleLabel;
    private JTable teamsTables;
    private JScrollPane teamsScrollPane;

    public Overview() {
        this.titleLabel = new JLabel();
        this.teamsTables = new JTable();
        this.teamsScrollPane = new JScrollPane(teamsTables);
        showOverview();
    }
    public void showOverview(){
        setLayout(new BorderLayout());
        setBackground(Color.LIGHT_GRAY);

        titleLabel = new JLabel("All Teams");
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        add(titleLabel, BorderLayout.NORTH);

        teamsTables = loadTeamsTable();
        teamsTables.setBackground(Color.LIGHT_GRAY);
        if (teamsTables != null) {
            teamsScrollPane = new JScrollPane(teamsTables);
            teamsScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
            teamsScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
            add(teamsScrollPane, BorderLayout.CENTER);
        } else {
            JOptionPane.showMessageDialog(null, "No teams found");
        }
    }

    private JTable loadTeamsTable() {
        try {
            File teamsFile = new File("src/Panels/Team/teams.csv");
            List<Team> teams = Team.readTeamsFromCSV(teamsFile);

            String[] columns = {"Name", "Coach", "Age", "Member Size"};

            DefaultTableModel tableModel = new DefaultTableModel(columns, 0);
            for (Team team : teams) {
                tableModel.addRow(new Object[]{
                        team.getName(), team.getCoach(), team.getAge(), team.getMemberSize()
                });
            }
            return new JTable(tableModel);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}


