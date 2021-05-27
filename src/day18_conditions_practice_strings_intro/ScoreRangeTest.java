package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 345;
        if(score>=1 && score<=40){
            System.out.println("Your score is D");
        }else if(score>=40 && score<=60){
            System.out.println("Your score is C");
        }else if(score>=61 && score<=80){
            System.out.println("Your score is B");
        }else if(score>=81 && score<=100){
            System.out.println("Your score is A");
        }else if(score<=0 || score>100){
            System.out.println("Invalid score= " + score);
        }

    }
}
