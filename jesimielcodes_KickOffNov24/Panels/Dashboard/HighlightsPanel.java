package Panels.Dashboard;

import java.awt.*;
import javax.swing.*;


public class HighlightsPanel extends JPanel{
    //declaring attributes
    private ImageSlider slide;


    //Constructor
    public HighlightsPanel() {
        this.slide = new ImageSlider();
        showHighlightsPanel();//method to show the panel
    }

    public void showHighlightsPanel(){
        setLayout(new BorderLayout());//setting layout
        slide = new ImageSlider();//an instance of the ImageSlider class
        add(slide, BorderLayout.NORTH);//adding it to the main window for viewing



        //VideoPlayer video = new VideoPlayer();
        //video.playVideo("src/assets/Varsity League Trailer.mp4");
        //add(video);
    }
}
