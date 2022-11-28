package AdditionalTask;

public class Ex12 {
    public void fibonacci () {

        int a = 1;
        int b = 0;

        for (int t = 1; t <= 11; t++ ) {
            System.out.println(a);
            a = a + b;
            b = a - b;
        }

    }
}


