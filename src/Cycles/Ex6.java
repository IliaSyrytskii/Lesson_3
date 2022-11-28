package Cycles;

public class Ex6 {
        public void unevenCycle () {

            for ( int t = 1; t <= 99; t++) {
                if (t % 2 == 0){
                    continue;
                }
                System.out.println(t);
            }

        }
    }
