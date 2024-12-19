package Panels.RecentMatches;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class RecentMatches {
    //declaring attributes
    private String League;
    private String team1;
    private String team2;
    private String score;
    private String date;

    //Constructor
    public RecentMatches(String league, String team1, String team2, String score, String date) {
        this.League = league;
        this.team1 = team1;
        this.team2 = team2;
        this.score = score;
        this.date = date;
    }

    //getters
    public String getLeague(){
        return League;
    }
    public String getTeam1() {
        return team1;
    }
    public String getTeam2() {
        return team2;
    }
    public String getScore() {
        return score;
    }
    public String getDate() {
        return date;
    }


    //method for reading the recent matches from a CSV file
    public static List<RecentMatches> readRecentMatchesFromCSV(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<RecentMatches> recentMatches = new ArrayList<>();
        scanner.nextLine();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                String[] data = line.split(",");
                recentMatches.add(new RecentMatches(
                        data[0], data[1], data[2],
                        data[3], data[4]
                ));
            }
        }
        scanner.close();
        return recentMatches;
    }
}
