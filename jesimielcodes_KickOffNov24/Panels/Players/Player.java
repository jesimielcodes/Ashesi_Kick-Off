package Panels.Players;

import java.util.*;
import java.io.*;

public class Player {
    //declaring attributes
    private String name;
    private int age;
    private int weight;
    private int height;
    private String gender;
    private String position;
    private int Ranking;
    private String description;

    //Constructor
    public Player(String name, int age, int weight, int height, String gender, String position, int ranking, String description) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.gender = gender;
        this.position = position;
        this.Ranking = ranking;
        this.description = description;
    }

    //Getters and setters for all attributes
    public String getName(){
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getHeight() {
        return height;
    }
    public void setHeight(int height) {
        this.height = height;
    }
    public String getGender() {
        return gender;
    }
    public void setGender(String gender) {
        this.gender = gender;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public int getRanking() {
        return Ranking;
    }
    public void setRanking(int Ranking) {
        this.Ranking = Ranking;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    @Override
    public String toString(){
        return String.format("%-15s %-3d %-5d %-5d %-6s %-10s %-3d %s", name, age, weight, height, gender, position, Ranking);
    }

    //method to read the player info from a CSV file
    public static List<Player> readPlayersFromCSV(File file) throws FileNotFoundException {
        Scanner scanner = new Scanner(file);
        List<Player> players = new ArrayList<>();
        if (scanner.hasNextLine()){
            scanner.nextLine(); // Skip header line
        }
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine().trim();
            if (!line.isEmpty()) {
                String[] data = line.split(",");
                players.add(new Player(
                        data[0], Integer.parseInt(data[1]), Integer.parseInt(data[2]),
                        Integer.parseInt(data[3]), data[4], data[5],
                        Integer.parseInt(data[6]), data[7]

                ));
            }
        }
        scanner.close();
        return players;
    }

    /*public static void writePlayersToCSV(List<Panels.Players.Player> players, File file) throws FileNotFoundException {
        PrintWriter writer = new PrintWriter(file);
        writer.println("Name,Age,Weight,Height,Gender,Position,Ranking,Description");
        for (Panels.Players.Player player : players) {
            writer.printf("%s,%d,%d,%d,%s,%s,%d,%s\n",
                    player.name, player.age, player.weight, player.height,
                    player.gender, player.position, player.Ranking, player.description);
        }
        writer.close();
    }

    public static void displayDashboard(List<Panels.Players.Player> players) {
        System.out.printf("%-15s %-3s %-5s %-5s %-6s %-10s %-3s %s\n",
                "Name", "Age", "Weight", "Height", "Gender", "Position", "Rank", "Description");
        System.out.println("-------------------------------------------------------------------------------");
        for (Panels.Players.Player player : players) {
            System.out.println(player);
        }
    }*/

}
