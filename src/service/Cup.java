package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.Match;
import model.NationalTeam;

public class Cup {

    // Listas
    ArrayList<NationalTeam> nationalTeam = new ArrayList<>();
    ArrayList<Match> match = new ArrayList<>();
    ArrayList<String> topScore = new ArrayList<>();


    // Scanner único da classe
    Scanner scanner = new Scanner(System.in);



    // Metodo para adicionar nas listas
    public void addNationalTeam(NationalTeam newTeam) {
        // ADICIONAR SELEÇÕES
        nationalTeam.add(newTeam);
    }

    public void registrateMatch(Match newMatch) {
        // ADICIONAR PARTIDAS
        match.add(newMatch);
    }


    public void addTopscore() {
        // ADICIONAR ARTILHEIROS
        topScore.add("Neymar");
        topScore.add("Ronaldo");
        topScore.add("Messi");
        topScore.add("Ronaldinho");
        topScore.add("Rivaldo");
        topScore.add("Pelé");
    }


    // Mostrar seleções por grupo
    public void callGroup() {
        System.out.println("Escolha o grupo que você quer ver:");
        char choice = Character.toUpperCase(scanner.next().charAt(0));

        for(NationalTeam n : nationalTeam){
              if(n.getGroup() == choice) {
                  System.out.println(n);
                  System.out.println();
              }else{
                  System.out.println("Opção invalida");
              }
        }


    }

    // Mostrar top scorers
    public void topScore() {
        for (int i = 0; i < topScore.size(); i++) {
            System.out.println((i + 1) + "º - " + topScore.get(i));
        }
    }

    // Verificar classificação
   public void calculateTheStandings() {
        System.out.println("Qual time você quer saber se classificou?");
        int choice = scanner.nextInt();

        if (choice >= 0 && choice < nationalTeam.size()) {

            int sc = nationalTeam.get(choice).getScore();

            if (sc >= 8) {
                System.out.println("Qualified!");
            } else {
                System.out.println("Disqualified!");
            }

        } else {
            System.out.println("Índice inválido");
        }
    }



}