package Panels.Dashboard;

import uk.co.caprica.vlcj.player.component.EmbeddedMediaPlayerComponent;
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class KickOffPanel extends JPanel{

    public KickOffPanel(){
        setLayout(new BorderLayout());

        JPanel main = new JPanel();
        JPanel transferPanel = new JPanel();
        transferPanel.setLayout(new BoxLayout(transferPanel, BoxLayout.Y_AXIS));
        JPanel statsPanel = new JPanel();

        JPanel transfer1Panel = new JPanel();
        transfer1Panel.add(new JLabel("Player Name:"));
        JTextField playerNameField = new JTextField(15);
        transfer1Panel.add(playerNameField);
        transferPanel.add(transfer1Panel);

        JPanel transfer2Panel = new JPanel();
        transfer2Panel.add(new JLabel("Current Team:"));
        JTextField currentTeamField = new JTextField(15);
        transfer2Panel.add(currentTeamField);
        transferPanel.add(transfer2Panel);

        JPanel transfer3Panel = new JPanel();
        transfer3Panel.add(new JLabel("New Team:"));
        JTextField newTeamField = new JTextField(15);
        transfer3Panel.add(newTeamField);
        transferPanel.add(transfer3Panel);

        JButton transferButton = new JButton("Transfer");
        transferButton.setPreferredSize(new Dimension(70, 30));
        transferButton.addActionListener(e -> {JOptionPane.showMessageDialog(null, "Request sent");});
        transferPanel.add(transferButton);


        String[] columnNames = {"Player", "Team", "Goals", "Assists"};
        Object[][] data = {
                {"Player A", "Team X", 20, 5},
                {"Player B", "Team Y", 15, 10}
        };

        JTable statsTable = new JTable(data, columnNames);
        statsPanel.add(new JScrollPane(statsTable));

        setLayout(new BorderLayout());
        main.add(transferPanel, BorderLayout.WEST);
        main.add(statsPanel);
        JScrollPane scrollPane = new JScrollPane(main);
        add(scrollPane, BorderLayout.CENTER);


    }

    /*public static void main(String[] args) {
        System.setProperty("vlcj.native.dir", "C:/Program Files/VideoLAN/VLC");
        EmbeddedMediaPlayerComponent component = new EmbeddedMediaPlayerComponent();
        
        JFrame f = new JFrame();
        f.setContentPane(component);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setBounds(new Rectangle(200, 200, 800, 600));
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                component.release();
                System.exit(0);
            }
        });
        f.setLocationRelativeTo(null);
        f.setVisible(true);

        component.mediaPlayer().media().play("src/assets/Varsity League Trailer.mp4");
    }*/
}
