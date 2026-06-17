package model;

public class Match {
    // Atributos
    private String homeTeam;
    private String awayTeam;
    private int golsA;
    private int golsB;


    // Getters
    public String getHomeTeam() {

        return homeTeam;
    }

    public String getAwayTeam() {

        return awayTeam;
    }

    public int getGolsA() {

        return golsA;
    }

    public int getGolsB() {

        return golsB;
    }


    // Setters
    public void setHomeTeam(String homeTeam) {

        this.homeTeam = homeTeam;
    }

    public void setAwayTeam(String awayTeam) {

        this.awayTeam = awayTeam;
    }

    public void setGolsA(int golsA) {

        this.golsA = golsA;
    }

    public void setGolsB(int golsB) {

        this.golsB = golsB;
    }



    // toString
    @Override
    public String toString() {
        return "Home Team: " + homeTeam + "\n" +
                "Away Team: " + awayTeam + "\n" +
                "Gols A: " + golsA + "\n" +
                "Gols B: " + golsB;
    }
}
