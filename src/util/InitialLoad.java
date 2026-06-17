package util;

import model.Match;
import model.NationalTeam;
import service.Cup;

public class InitialLoad {

    public static void load(Cup cup) {

        //  TIMES (8 seleções - 2 grupos)

        NationalTeam t1 = new NationalTeam();
        t1.setName("Brasil");
        t1.setGroup('A');
        t1.setScore(10);
        cup.addNationalTeam(t1);

        NationalTeam t2 = new NationalTeam();
        t2.setName("Argentina");
        t2.setGroup('A');
        t2.setScore(9);
        cup.addNationalTeam(t2);

        NationalTeam t3 = new NationalTeam();
        t3.setName("França");
        t3.setGroup('A');
        t3.setScore(8);
        cup.addNationalTeam(t3);

        NationalTeam t4 = new NationalTeam();
        t4.setName("Alemanha");
        t4.setGroup('A');
        t4.setScore(7);
        cup.addNationalTeam(t4);

        NationalTeam t5 = new NationalTeam();
        t5.setName("Portugal");
        t5.setGroup('B');
        t5.setScore(9);
        cup.addNationalTeam(t5);

        NationalTeam t6 = new NationalTeam();
        t6.setName("Espanha");
        t6.setGroup('B');
        t6.setScore(8);
        cup.addNationalTeam(t6);

        NationalTeam t7 = new NationalTeam();
        t7.setName("Marrocos");
        t7.setGroup('B');
        t7.setScore(7);
        cup.addNationalTeam(t7);

        NationalTeam t8 = new NationalTeam();
        t8.setName("Inglaterra");
        t8.setGroup('B');
        t8.setScore(8);
        cup.addNationalTeam(t8);
        //  PARTIDAS
        Match m1 = new Match();
        m1.setHomeTeam("Brasil");
        m1.setAwayTeam("Argentina");
        m1.setGolsA(2);
        m1.setGolsB(1);
        cup.registrateMatch(m1);

        Match m2 = new Match();
        m2.setHomeTeam("França");
        m2.setAwayTeam("Alemanha");
        m2.setGolsA(3);
        m2.setGolsB(2);
        cup.registrateMatch(m2);

        Match m3 = new Match();
        m3.setHomeTeam("Portugal");
        m3.setAwayTeam("Espanha");
        m3.setGolsA(1);
        m3.setGolsB(1);
        cup.registrateMatch(m3);

        Match m4 = new Match();
        m4.setHomeTeam("Marrocos");
        m4.setAwayTeam("Inglaterra");
        m4.setGolsA(0);
        m4.setGolsB(2);
        cup.registrateMatch(m4);
    }
}