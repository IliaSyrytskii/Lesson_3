package Cycles;

public class Ex8 {
    public void sumOfNumbers (int Number) {
        int Sum = 0;


        while ( Number > 0 ){
            Sum += Number;
            Number--;
        }

        System.out.println(Sum);
    }

}
