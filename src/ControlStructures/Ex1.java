package ControlStructures;

public class Ex1 {

    public void seasonsSwitch (int Number) {

        switch (Number){
            case 1, 2, 12 -> System.out.println("Winter");
            case 3, 4, 5 -> System.out.println("Spring");
            case 6, 7, 8 -> System.out.println("Summer");
            case 9, 10, 11 -> System.out.println("Autumn");
            default -> System.out.println("It's incorrect number. Choose only 1-12");
        }
    }
}
