package Panels.Team;

import java.util.*;
import java.io.*;

public class Team {

    //declaring attributes
    private String name;
    private String coach;
    private int age;
    private int memberSize;

    //Constructor
    public Team(String name, String coach, int age, int memberSize) {
        this.name = name;
        this.coach = coach;
        this.age = age;
        this.memberSize = memberSize;
    }


    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCoach() {
        return coach;
    }
    public void setCoach(String coach) {
        this.coach = coach;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getMemberSize() {
        return memberSize;
    }
    public void setMemberSize(int memberSize) {
        this.memberSize = memberSize;
    }


    //method for reading teams from the CSV file
    public static List<Team> readTeamsFromCSV(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<Team> teams = new ArrayList<>();
        scanner.nextLine(); // Skip header line

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                String[] data = line.split(",");
                teams.add(new Team(
                        data[0], data[1], Integer.parseInt(data[2]),
                        Integer.parseInt(data[3])
                ));
            }
        }
        scanner.close();
        return teams;
    }

    /*public static void writeTeamsToCSV(List<Panels.Team.Panels.Team> teams, File file) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(file);
        writer.println("Name,Coach,Age,Member Size");
        for (Panels.Team.Panels.Team team : teams) {
            writer.printf("%s,%s,%d,%d\n",
                    team.getName(), team.getCoach(), team.getAge(), team.getMemberSize());
        }
        writer.close();
    }*/
}
