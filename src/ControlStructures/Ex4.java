package ControlStructures;

public class Ex4 {
    public void weather (int Number) {

        if (Number > 5) {
            System.out.println("Warm");

        } else if ((Number <= -5 ) & (Number > -20) ) {
            System.out.println("Normal");

        } else if (Number < -20) {
            System.out.println("Cold");
        }

    }

}
