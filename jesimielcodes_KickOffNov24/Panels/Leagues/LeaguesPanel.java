package Panels.Leagues;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LeaguesPanel extends JPanel {
    //declaring attributes
    private JPanel mainPanel;
    private JComboBox<String> comboBox;

    //Constructor
    public LeaguesPanel() {
        this.mainPanel = new JPanel();
        this.comboBox = new JComboBox<>();
        showLeaguesPanel();//calling method to actually show the
    }


    //creating method to show the leagues
    public void showLeaguesPanel(){
        //setting size and layout
        setSize(800, 600);
        setLayout(new BorderLayout());

        String[] options = {"Varsity League", "Ashesi FA Cup", "Ashesi Premier League"};//creating the array of league options to choose from and view
        comboBox = new JComboBox<>(options);//initializing a drop down box(JComboBox) to be able to select from these options
        comboBox.setSelectedItem(null);//setting default selection to nothing
        comboBox.addActionListener(new ComboBoxActionListener());//adding the function which has been overrided below

        //initializing the mainPanel for the leagues
        mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());//setting borderlayout
        JLabel leagueLabel = new JLabel("                                              Select a league from the above panel");//setting the display text as a JLabel. spaces are there to center the text. It's not ideal but it did the job
        leagueLabel.setFont(new Font("Comic Sans MS", Font.BOLD, 14));//setting the font of the text
        mainPanel.add(leagueLabel);//adding the text to the mainPanel

        JScrollPane leagueInfoScrollPane = new JScrollPane(mainPanel);//creating a scrollpane
        leagueInfoScrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);//vertical bar settings
        leagueInfoScrollPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);//horizontal bar settings


        add(comboBox, BorderLayout.NORTH);//adding the combobox to the top of the panel
        add(leagueInfoScrollPane, BorderLayout.CENTER);//adding the scrollpane to the the center of the panel

    }

    private class ComboBoxActionListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String selectedItem = (String) comboBox.getSelectedItem();//assigning the current selected item from the combobox to a string variable
            mainPanel.removeAll();//clearing what was there before the selection was made

            //adding what will be there after a particular selected item is ...selected
            switch (selectedItem) {
                //when the selected item is Varsity League, the implementation below is what will be executed
                case "Varsity League":
                    mainPanel.add(new JLabel(new ImageIcon(new ImageIcon("src/assets/league-tournament1.jpg").getImage().getScaledInstance(800, 550, Image.SCALE_SMOOTH))), BorderLayout.NORTH);
                    mainPanel.add(showList("Varsity League"));//show list method here to show winners from the past years. definition of the method is below
                    break;
                case "Ashesi FA Cup"://same thing here
                    mainPanel.add(new JLabel(new ImageIcon(new ImageIcon("src/assets/league-tournament2.jpg").getImage().getScaledInstance(800, 550, Image.SCALE_SMOOTH))), BorderLayout.NORTH);
                    mainPanel.add(showList("Ashesi FA Cup"));//same show list method here but for this league
                    break;
                case "Ashesi Premier League"://and here
                    mainPanel.add(new JLabel(new ImageIcon(new ImageIcon("src/assets/league-tournament3.jpg").getImage().getScaledInstance(800, 550, Image.SCALE_SMOOTH))), BorderLayout.NORTH);
                    mainPanel.add(showList("Ashesi Premier League"));//here as well
                    break;
            }

            mainPanel.revalidate();
            mainPanel.repaint();


        }
    }

    //definition of the showList method
    private JList<String> showList(String league){
        //declaring an attribute
        String[] details;

        //creating cases for when the different leagues are selected
        switch (league) {
            case "Varsity League":
                details = new String[]{"2024", "Winners- Academic City", "Academic City vs Regional Maritime", "Rashford vs Regional Maritime", "Ashesi vs Academic City", "", "2023", "Winners- Academic City", "Academic City vs Regional Maritime", "Rashford vs Regional Maritime", "Ashesi vs Academic City", "", "2022", "Winners- Academic City", "Academic City vs Regional Maritime", "Rashford vs Regional Maritime", "Ashesi vs Academic City", "", "2021", "Winners- Academic City", "Academic City vs Regional Maritime", "Rashford vs Regional Maritime", "Ashesi vs Academic City"};
                break;
            case "Ashesi Premier League":
                details = new String[]{"2024", "Winners- Academic City", "Academic City vs Regional Maritime", "Rashford vs Regional Maritime", "Ashesi vs Academic City", "", "2023", "Winners- Academic City", "Academic City vs Regional Maritime", "Rashford vs Regional Maritime", "Ashesi vs Academic City", "", "2022", "Winners- Academic City", "Academic City vs Regional Maritime", "Rashford vs Regional Maritime", "Ashesi vs Academic City", "", "2021", "Winners- Academic City", "Academic City vs Regional Maritime", "Rashford vs Regional Maritime", "Ashesi vs Academic City"};
                break;
            case "Ashesi FA Cup":
                details = new String[]{"2024", "Winners- Academic City", "Academic City vs Regional Maritime", "Rashford vs Regional Maritime", "Ashesi vs Academic City", "", "2023", "Winners- Academic City", "Academic City vs Regional Maritime", "Rashford vs Regional Maritime", "Ashesi vs Academic City", "", "2022", "Winners- Academic City", "Academic City vs Regional Maritime", "Rashford vs Regional Maritime", "Ashesi vs Academic City", "", "2021", "Winners- Academic City", "Academic City vs Regional Maritime", "Rashford vs Regional Maritime", "Ashesi vs Academic City"};
                break;
            default:
                details = new String[]{};
        }

        //putting the various details into a list for each league
        JList<String> list = new JList<>(details);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.setPreferredSize(new Dimension(800, 600));
        list.setBackground(Color.LIGHT_GRAY);
        list.setFont(new Font("Comic Sans MS", Font.BOLD, 14));

        //overriding method here again to highlight the years as explained in the announcements panel
        list.setCellRenderer(new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                label.setOpaque(true);

                if (value.equals("2024")||value.equals("2023")||value.equals("2022")||value.equals("2021")||value.equals("2020")) {
                    label.setBackground(Color.DARK_GRAY);
                    label.setForeground(Color.WHITE);
                    label.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
                }
                return label;
            }
        });
        return list;

    }
}