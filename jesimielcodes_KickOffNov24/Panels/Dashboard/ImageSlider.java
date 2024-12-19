package Panels.Dashboard;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ImageSlider extends JPanel {
    // Declaring attributes
    private JLabel slideshowPictures;
    private Timer time;
    private int counter = 0;
    private String[] List;
    private CardLayout cardLayout; // CardLayout for switching panels
    private JPanel cards; // Panel to hold different cards

    // Constructor
    public ImageSlider() {
        this.slideshowPictures = new JLabel();
        this.time = new Timer(1000, new ActionListener() {
            public void actionPerformed(ActionEvent e) {}
        });
        this.counter = 0;
        this.List = new String[]{
                "src/assets/Screenshot 2024-11-24 112358.png",
                "src/assets/Screenshot 2024-11-24 112430.png",
                "src/assets/Screenshot 2024-11-24 112458.png",
                "src/assets/Screenshot 2024-11-24 112514.png",
                "src/assets/Screenshot 2024-11-24 112543.png",
                "src/assets/Screenshot 2024-11-24 112637.png",
                "src/assets/Screenshot 2024-11-24 112719.png"
        };

        cardLayout = new CardLayout(); // Initialize CardLayout
        cards = new JPanel(cardLayout); // Create a panel with CardLayout

        showImageSlider(); // Call method to show the images
    }

    public void showImageSlider() {
        // Create a JLayeredPane to allow overlay of components
        JLayeredPane layeredPane = new JLayeredPane();
        layeredPane.setPreferredSize(new Dimension(800, 600));

        // Initialize the slideshow pictures as a JLabel
        slideshowPictures.setBounds(0, 0, 800, 600); // Set the bounds
        SetImageSize(0); // Call method to scale the images
        time = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Implementation to show each picture in succession
                SetImageSize(counter);
                counter += 1;
                if (counter >= List.length) {
                    counter = 0;
                }
            }
        });
        time.start(); // Start the timer

        layeredPane.add(slideshowPictures, Integer.valueOf(0)); // Add pictures to layered pane

        // Create the KickOff Button
        JButton kickOffButton = new JButton("Kick Off");
        kickOffButton.setPreferredSize(new Dimension(100, 30));
        kickOffButton.setBounds(350, 250, 100, 30);
        kickOffButton.setHorizontalAlignment(SwingConstants.CENTER);
        kickOffButton.setVerticalAlignment(SwingConstants.CENTER);
        kickOffButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(cards, "KickOffPanel"); // Show the KickOffPanel
            }
        });
        layeredPane.add(kickOffButton, Integer.valueOf(1)); // Add button to layered pane

        // Add the layered pane to the cards panel
        cards.add(layeredPane, "ImageSlider"); // Add image slider panel to cards
        cards.add(new KickOffPanel(), "KickOffPanel"); // Add KickOffPanel to cards

        setLayout(new BorderLayout());
        add(cards, BorderLayout.CENTER); // Add cards panel to the main panel
    }

    // Method to scale each image in the list
    public void SetImageSize(int i) {
        ImageIcon imageicon = new ImageIcon(List[i]); // For i, it will scale that position of image
        Image image = imageicon.getImage(); // Gets the image
        Image newImage = image.getScaledInstance(slideshowPictures.getWidth(), slideshowPictures.getHeight(), Image.SCALE_SMOOTH); // Gets ScaledInstance
        ImageIcon newImageIcon = new ImageIcon(newImage); // Assigning the scaled instance to a new ImageIcon
        slideshowPictures.setIcon(newImageIcon); // Setting that imageicon as the picture for that i
    }
}