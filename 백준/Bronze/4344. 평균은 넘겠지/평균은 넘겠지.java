import java.util.Scanner;

public class Main{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        //테스트 케이스 입력값
        int testcases = sc.nextInt();

        //테스트 케이스 반복돌리기
        for(int i = 0; i < testcases; i++){

            //전체 학생수 입력값
            int totalStudent = sc.nextInt();

            //전체 학생의 점수 입력값 => 배열로
            //배열에 넣어주면서 점수 총 합도 같이 구하기
            int[] totalScores = new int[totalStudent];
            int sum = 0;
            for(int j = 0; j < totalStudent; j++){
                int temp = sc.nextInt();
                totalScores[j] = temp;
                sum += temp;
            }

            //평균
            double mean = (double)sum / (double)totalStudent;

            //평균보다 높은 학생 수를 구하기
            int higher = 0;
            for(int j = 0; j < totalStudent; j++){
                if(totalScores[j] > mean) higher++;
            }

            //백분율을 구한다
            double higherRate = (double) higher / (double) totalStudent;
            System.out.println(String.format("%.3f",higherRate*100) +"%");

        }
    }
}