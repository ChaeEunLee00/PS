import java.util.HashMap;
import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //등급-과목평점 맵
        HashMap<String,Double> map = new HashMap<>(){{
            put("A+",4.5);
            put("A0",4.0);
            put("B+",3.5);
            put("B0",3.0);
            put("C+",2.5);
            put("C0",2.0);
            put("D+",1.5);
            put("D0",1.0);
            put("F",0.0);
        }};

        double totalCredit = 0;
        double totalGrade = 0;
        //for문 20번
        for(int i = 0; i < 20; i++){
            sc.next();

            //학점 입력
            int credit = Integer.parseInt("" + sc.next().charAt(0));
            //등급 입력
            String letter = sc.next();

            //pass일경우 continue
            if(letter.equals("P")) continue;

            //pass가 아닌경우 학점계산
            // (학점 × 과목평점)의 합
            totalGrade += credit * map.get(letter);

            // 학점 합
            totalCredit += credit;
        }

        //전공평점 구하기
        System.out.println(totalGrade/totalCredit);
    }
}