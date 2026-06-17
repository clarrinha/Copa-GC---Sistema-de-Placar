package service;

import java.util.ArrayList;
import java.util.Scanner;

import model.Match;
import model.NationalTeam;

public class Cup {

    // Listas
    ArrayList<NationalTeam> nationalTeam = new ArrayList<>();
    ArrayList<Match> match = new ArrayList<>();
    ArrayList<String> topScorers = new ArrayList<>();


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
        topScorers.add("Neymar");
        topScorers.add("Ronaldo");
        topScorers.add("Messi");
        topScorers.add("Ronaldinho");
        topScorers.add("Rivaldo");
        topScorers.add("Pelé");
    }


    // Mostrar seleções por grupo
    public void callGroup() {
        try {
            System.out.println("Escolha o grupo que você quer ver:");
            char choice = Character.toUpperCase(scanner.next().charAt(0));

            boolean found = false;

            for (NationalTeam n : nationalTeam) {
                if (n.getGroup() == choice) {
                    System.out.println(n);
                    System.out.println("-------------");
                    found = true;
                }
            }

            if (!found) {
                System.out.println("Grupo inválido ou inexistente.");
            }

        } catch (Exception e) {
            System.out.println("Erro na leitura da entrada.");
        }
    }

    // Mostrar top scorers
    public void topScore() {
        for (int i = 0; i < topScorers.size(); i++) {
            System.out.println((i + 1) + "º - " + topScorers.get(i));
        }
    }

    // Verificar classificação
    public void calculateTheStandings() {

        if (nationalTeam.isEmpty()) {
            System.out.println("Nenhum time cadastrado.");
            return;
        }

        System.out.println("Qual time você quer saber se classificou?");
        int choice = scanner.nextInt();

        if (choice >= 0 && choice < nationalTeam.size()) {

            NationalTeam team = nationalTeam.get(choice);
            int sc = team.getScore();

            System.out.println("Time selecionado: " + team.getName());
            System.out.println("Pontuação atual: " + sc);

            System.out.println("Verificando status...");

            if (sc >= 8) {
                System.out.println("Qualified! (mínimo: 8 pontos)");
            } else {
                System.out.println("Disqualified! Faltaram " + (8 - sc) + " pontos.");
            }

            System.out.println("Processo concluído.");

        } else {
            System.out.println("Índice inválido!");
        }
    }




}