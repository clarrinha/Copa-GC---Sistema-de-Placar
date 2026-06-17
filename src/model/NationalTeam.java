package model;

public class NationalTeam {
    // Atributos da classe
    private String name;
    private char group;
    private String fifaCode;
    private int score;

    // Getters
    public String getName() {
        return name;
    }

    public char getGroup() {
        return group;
    }

    public String getFifaCode() {
        return fifaCode;
    }

    public int getScore(){
        return score;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGroup(char group) {
        this.group = group;
    }

    public void setFifaCode(String fifaCode) {
        this.fifaCode = fifaCode;
    }

    public void setScore(int score) {
        this.score = score;
    }

    // toString
    @Override
    public String toString() {
        return "Name: " + name + "\n" +
                "Group: " + group + "\n" +
                "FifaCode: " + fifaCode;
    }
}