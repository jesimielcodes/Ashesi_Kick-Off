package Panels.Announcements;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class AnnouncementsPanel extends JPanel{
    //declaring the attributes
    private JPanel panel;
    private String[] announcements;
    private JList<String> announcementsList;
    private JScrollPane announcementsListScrollPane;

    //Constructor
    public AnnouncementsPanel(){
        this.panel = new JPanel();
        this.announcements = new String[]{};
        this.announcementsList = new JList<String>(announcements);
        this.announcementsListScrollPane = new JScrollPane(announcementsList);

        showAnnouncementsPanel();//method to actually display the announcements panel
    }

    private void showAnnouncementsPanel(){
        //setting the layout to Border Layout to allow putting objects at the North, Center, East, West or South
        setLayout(new BorderLayout());

        //initializing the panel attribute
        panel = new JPanel();
        panel.setLayout(new BorderLayout());//setting its own layout to BorderLayout
        panel.setBorder(new TitledBorder("Announcements"));//adding a titled Border
        panel.setPreferredSize(new Dimension(700, 400)); //setting default size of the panel

        announcements= new String[]{"Recent Announcements",
                "Friendly match this Saturday",
                "Kasanoma Player #1 injured",
                "Team meeting for Red Army this Friday at the Hive",
                "",
                "Past Announcements",
                "Last week's match results",
                "Player #2's injury update",
                "Next month's training schedule",
                "End of season party details"};//Array of announcements to be displayed

        announcementsList = new JList<>(announcements);//putting these announcements in a list, a JList
        announcementsList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);//setting selection mode to single so only one announcement can be selected or clicked at a time
        announcementsList.setBackground(Color.LIGHT_GRAY);//setting background colour to light gray
        announcementsList.setFont(new Font("Comic Sans MS", Font.PLAIN, 12));//setting font type, style and size


        //CellRenderer is basically the default formatting of the list. We are overriding it to highlight the division between recent announcements and past announcements
        announcementsList.setCellRenderer(new DefaultListCellRenderer(){
            @Override
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = (JLabel) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                label.setOpaque(true);

                if (value.equals("Recent Announcements") || value.equals("Past Announcements")){
                    label.setBackground(Color.DARK_GRAY);
                    label.setForeground(Color.WHITE);
                    label.setFont(new Font("Comic Sans MS", Font.BOLD, 14));
                }
                return label;
            }
        });

        //creating a scrollpane and putting the list in it to allow for scrolling if window size is reduced or announcements increase in number
        announcementsListScrollPane = new JScrollPane(announcementsList);
        panel.add(announcementsListScrollPane, BorderLayout.CENTER);//adding ths scroll pane to the panel

        add(panel, BorderLayout.CENTER);//adding the panel to main JFrame for viewing
    }
}
