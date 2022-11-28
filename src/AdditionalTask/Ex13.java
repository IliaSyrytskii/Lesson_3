package AdditionalTask;

public class Ex13 {
    public void bankAccount ( int Number, float contribution) {

        float percent = (float) 0.07;

        for (int month = 1; month <= Number; month++ ){

            float result = contribution * percent;
            contribution += result;

        }
        System.out.println(contribution);
    }
}
