package ControlStructures;



public class Ex2 {

    public void ifElseSeasons (int Number) {

        if (Number == (1 | 2 | 12) ) {
            System.out.println("Winter");

        } else if (Number == (3 | 4 | 5) ) {
            System.out.println("Spring");
// ÈÑÏĞÀÂÈÒÜ ÍÀ ||
        } else if (Number == (6 | 7 | 8)  ) {
            System.out.println("Summer");

        } else if (Number == (9 | 10 | 11) ) {
            System.out.println("Autumn");

        } else {
            System.out.println("It's incorrect number. Choose only 1-12");
        }

    }

}
